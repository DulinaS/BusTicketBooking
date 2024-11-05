package com.mycompany.busticketbooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class MetroSystem {
    private int totalPathDistance = 0;
    Map<String, MetroStation> stations = new HashMap<>();

    public void addStation(String name) {
        stations.put(name, new MetroStation(name));
    }

    public void connectStations(String from, String to, int distance) {
        if (distance > 0) {
            MetroStation fromStation = stations.get(from);
            MetroStation toStation = stations.get(to);
            fromStation.addConnection(toStation, distance);
            toStation.addConnection(fromStation, distance); // Assuming bidirectional connection
        }
    }

    public List<MetroStation> findShortestPath(String start, String end) {
        // Dijkstra's algorithm for shortest path
        Map<MetroStation, Integer> distances = new HashMap<>();
        Map<MetroStation, MetroStation> previous = new HashMap<>();
        PriorityQueue<MetroStation> queue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (MetroStation station : stations.values()) {
            distances.put(station, Integer.MAX_VALUE);
            previous.put(station, null);
        }
        MetroStation startStation = stations.get(start);
        distances.put(startStation, 0);
        queue.add(startStation);

        while (!queue.isEmpty()) {
            MetroStation current = queue.poll();
            if (current.name.equals(end)) break;

            for (Map.Entry<MetroStation, Integer> entry : current.connections.entrySet()) {
                MetroStation neighbor = entry.getKey();
                int newDist = distances.get(current) + entry.getValue();
                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    previous.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        List<MetroStation> path = new ArrayList<>();
        totalPathDistance = 0; 
        for (MetroStation at = stations.get(end); at != null; at = previous.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);
        
        // Calculate total distance for the shortest path
        for (int i = 0; i < path.size() - 1; i++) {
            MetroStation from = path.get(i);
            MetroStation to = path.get(i + 1);
            totalPathDistance += from.connections.get(to); // Accumulate distance for each leg
        }
        return path;
    }
    public int getTotalPathDistance() {
        return totalPathDistance;
    }

    public List<String> getTrainOptionsForSegment(int currentTime, int travelTime) {
        List<String> options = new ArrayList<>();
        int optionNumber = 1;
        for (int j = currentTime; j <= currentTime + 60; j += 10) {
            String departureArrivalTime = optionNumber + ". Departure at: " + formatTime(j) + " - Arrival at: " + formatTime(j + travelTime);
            options.add(departureArrivalTime);
            optionNumber++;
        }
        return options;
    }


    String formatTime(int minutes) {
        int hours = (minutes / 60) + 6;
        int mins = minutes % 60;
        return String.format("%02d:%02d", hours, mins);
    }
    public static int convertTimeToMinutes(String timeStr) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        timeFormat.setLenient(false);
        try {
            Date inputTime = timeFormat.parse(timeStr);

            Calendar baseTime = Calendar.getInstance();
            baseTime.set(Calendar.HOUR_OF_DAY, 6);
            baseTime.set(Calendar.MINUTE, 0);
            baseTime.set(Calendar.SECOND, 0);
            baseTime.set(Calendar.MILLISECOND, 0);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(inputTime);
            calendar.set(Calendar.YEAR, baseTime.get(Calendar.YEAR));
            calendar.set(Calendar.MONTH, baseTime.get(Calendar.MONTH));
            calendar.set(Calendar.DAY_OF_MONTH, baseTime.get(Calendar.DAY_OF_MONTH));
            
            long difference = calendar.getTimeInMillis() - baseTime.getTimeInMillis();
            int minutesFrom6AM =  (int) (difference / (1000 * 60));
            
            return minutesFrom6AM;

        } catch (ParseException e) {
            System.out.println("Invalid time format. Please enter time in HH:mm format (24-hour).");
            return -1; // Indicates invalid time format
        }
    }
}
