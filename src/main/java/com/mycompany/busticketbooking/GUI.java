package com.mycompany.busticketbooking;

import java.util.List;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    private MetroSystem metroSystem;
    private List<MetroStation> path;
    private int currentIndex;
    private int currentStartTime;
    private int totalTravelTime;
    private int totalDistance;
    
    public GUI() {
        initComponents();
        initializeMetroSystem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        endCmb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        startCmb = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        timeTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        findBtn = new javax.swing.JButton();
        txtArea = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        trainCmb = new javax.swing.JComboBox<>();
        clearBTn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inter-City Metro Ticket Booking System");
        setBackground(new java.awt.Color(245, 245, 245));
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(102, 165, 209));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Destination Station");
        jLabel2.setOpaque(true);

        endCmb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        endCmb.setForeground(new java.awt.Color(51, 51, 51));
        endCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "A", "B", "C", "D", "E", "F" }));
        endCmb.setToolTipText("");

        jLabel3.setBackground(new java.awt.Color(102, 165, 209));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Starting Station");
        jLabel3.setOpaque(true);

        startCmb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startCmb.setForeground(new java.awt.Color(51, 51, 51));
        startCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "A", "B", "C", "D", "E", "F" }));
        startCmb.setToolTipText("");
        startCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startCmbActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 165, 209));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Starting Time (HH:MM)");
        jLabel4.setOpaque(true);

        timeTxt.setBackground(new java.awt.Color(255, 255, 255));
        timeTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timeTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timeTxt.setToolTipText("Enter Starting Time");
        timeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeTxtActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(58, 78, 143));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Inter-City Metro Ticket Booking System");
        jLabel5.setOpaque(true);

        findBtn.setBackground(new java.awt.Color(74, 144, 226));
        findBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        findBtn.setForeground(new java.awt.Color(255, 255, 255));
        findBtn.setText("CHECK TRAINS");
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        txtArea.setBackground(new java.awt.Color(255, 204, 204));

        TextArea.setBackground(new java.awt.Color(234, 243, 250));
        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TextArea.setForeground(new java.awt.Color(42, 42, 42));
        TextArea.setRows(10);
        txtArea.setViewportView(TextArea);

        trainCmb.setBackground(new java.awt.Color(74, 144, 226));
        trainCmb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        trainCmb.setForeground(new java.awt.Color(255, 255, 255));
        trainCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Train", " ", " " }));
        trainCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainCmbActionPerformed(evt);
            }
        });

        clearBTn.setBackground(new java.awt.Color(74, 144, 226));
        clearBTn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearBTn.setForeground(new java.awt.Color(255, 255, 255));
        clearBTn.setText("New");
        clearBTn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBTnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtArea)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(clearBTn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(trainCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(findBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(endCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(timeTxt)
                                .addComponent(startCmb, 0, 428, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startCmb, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(endCmb, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timeTxt)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(findBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtArea, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trainCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBTn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void startCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startCmbActionPerformed

    }//GEN-LAST:event_startCmbActionPerformed

    private void timeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeTxtActionPerformed

    private void clearBTnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBTnActionPerformed
        clearFields();
    }//GEN-LAST:event_clearBTnActionPerformed

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
        findAvailableTrains();
    }//GEN-LAST:event_findBtnActionPerformed

    private void trainCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainCmbActionPerformed
        if (trainCmb.getSelectedIndex() > 0) {
                    handleTrainSelection();
        }
    }//GEN-LAST:event_trainCmbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton clearBTn;
    private javax.swing.JComboBox<String> endCmb;
    private javax.swing.JButton findBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> startCmb;
    private javax.swing.JTextField timeTxt;
    private javax.swing.JComboBox<String> trainCmb;
    private javax.swing.JScrollPane txtArea;
    // End of variables declaration//GEN-END:variables

    private void initializeMetroSystem() {
        metroSystem = new MetroSystem();
        metroSystem.addStation("A");
        metroSystem.addStation("B");
        metroSystem.addStation("C");
        metroSystem.addStation("D");
        metroSystem.addStation("E");
        metroSystem.addStation("F");

        metroSystem.connectStations("A", "B", 10);
        metroSystem.connectStations("A", "C", 22);
        metroSystem.connectStations("A", "E", 8);
        metroSystem.connectStations("B", "C", 15);
        metroSystem.connectStations("B", "D", 9);
        metroSystem.connectStations("B", "F", 7);
        metroSystem.connectStations("C", "D", 9);
        metroSystem.connectStations("D", "E", 5);
        metroSystem.connectStations("D", "F", 12);
        metroSystem.connectStations("E", "F", 16);
    }

    private void findAvailableTrains() {
        String startStation = startCmb.getSelectedItem().toString();
        String endStation = endCmb.getSelectedItem().toString();
        String startTimeStr = timeTxt.getText();
        
        //Handle No Input
        if (startStation.equals("Choose") || endStation.equals("Choose") || startStation.equals(endStation)) {
            JOptionPane.showMessageDialog(this, "Please select valid starting and destination stations.");
            return;
        }
        
        //Check Time Format
        int startTime = MetroSystem.convertTimeToMinutes(startTimeStr);
        if (startTime < 0) {
            JOptionPane.showMessageDialog(this, "Invalid time format. Please enter in HH:mm format (24H format).");
            return;
        }
        int startOperatingMinutes = 0; 
        int endOperatingMinutes = 840;  // 8:00 PM in minutes from 6:00 AM

        if (startTime < startOperatingMinutes || startTime > endOperatingMinutes) {
            JOptionPane.showMessageDialog(this, "Error: The metro operates between 6:00 AM and 8:00 PM only. Please enter a time within this range.");
            return;
        }
        
        //Check if trip is possible between paths
        path = metroSystem.findShortestPath(startStation, endStation);
        if (path.size() < 2) {
            JOptionPane.showMessageDialog(this, "No valid path found.");
            return;
        }
        
        //Check if trip is possible within time limits
        int estimatedTotalTravelTime = calculateTotalTravelTime(path);
        if ((startTime + estimatedTotalTravelTime) > endOperatingMinutes) {
            JOptionPane.showMessageDialog(this, "Error: This journey cannot be completed by 8:00 PM. Please select an earlier start time.");
            return;
        }

        currentIndex = 0;
        currentStartTime = startTime;
        totalTravelTime = 0;
        totalDistance = metroSystem.getTotalPathDistance();
        TextArea.setText("Trip " + startStation + " -> " + endStation + "\n" +
                "Shortest Path: " + getPath() + "\n"+"------------------------\n");

        displayAvailableTrains();
    }

    private String getPath() {
        StringBuilder formattedPath = new StringBuilder();
        for (int i = 0; i < path.size(); i++) {
            formattedPath.append(path.get(i).name);
            if (i < path.size() - 1) formattedPath.append(" -> ");
        }
        return formattedPath.toString();
    }

    //Show all trains within hour
    private void displayAvailableTrains() {
        int endOperatingMinutes = 840; //Minutes From 6:00am
        if (currentIndex >= path.size() - 1) {
            displaySummary();
            return;
        }

        MetroStation fromStation = path.get(currentIndex);
        MetroStation toStation = path.get(currentIndex + 1);
        int distance = fromStation.connections.get(toStation);
        int travelTime = distance * 2;

        TextArea.append("Available Trains from " + fromStation.name + " to " + toStation.name + ":\n");
        trainCmb.removeAllItems();
        trainCmb.addItem("Select Train");

        boolean trainAvailable = false; // Check if any valid train is available
        int optionNumber = 1;

        // Generate train options within the next hour
        for (int j = currentStartTime; j <= currentStartTime + 60; j += 10) {
            int arrivalTime = j + travelTime;

            // Only show trains that can complete the journey before 8:00 PM
            if (arrivalTime > endOperatingMinutes) {
                continue; // Skip this train as it arrives past operating hours
            }

            String trainOption = optionNumber + ". Departure at: " + metroSystem.formatTime(j) + 
                                 " - Arrival at: " + metroSystem.formatTime(arrivalTime);
            trainCmb.addItem(trainOption);
            TextArea.append(trainOption + "\n");
            trainAvailable = true;
            optionNumber++;
        }

        // No train options are available within operating hours
        if (!trainAvailable) {
            TextArea.append("No trains available for this station that can arrive by 8:00 PM.\n");
        }
    }
    
    //Selecting train options
    private void handleTrainSelection() {
        int selectedOptionIndex = trainCmb.getSelectedIndex() - 1;
        String startStation = startCmb.getSelectedItem().toString();
        String endStation = endCmb.getSelectedItem().toString();
        if (selectedOptionIndex < 0){
            return;
        }

        int selectedTime = currentStartTime + selectedOptionIndex * 10;
        MetroStation fromStation = path.get(currentIndex);
        MetroStation toStation = path.get(currentIndex + 1);
        int travelTime = fromStation.connections.get(toStation) * 2;

        totalTravelTime += (selectedTime - currentStartTime) + travelTime + 10;
        currentIndex++;
        currentStartTime = selectedTime + travelTime + 10;
        TextArea.setText("");
        TextArea.setText("Trip " + startStation + " -> " + endStation + "\n" +
                "Shortest Path: " + getPath() + "\n"+"------------------------\n");
        displayAvailableTrains();
    }
    
    //Display Final summary at end
    private void displaySummary() {
        int totalHours = totalTravelTime / 60;
        int totalMinutes = totalTravelTime % 60;

        TextArea.setText("Trip " + path.get(0).name + " -> " + path.get(path.size() - 1).name + "\n");
        TextArea.append("Shortest Path: " + getPath() + "\n");
        TextArea.append("------------------------------\n");
        TextArea.append("Total Travel Time - " + totalTravelTime + " minutes (" + totalHours + " hours " + totalMinutes + " minutes)\n");
        TextArea.append("Total Distance - " + totalDistance + " Km\n");
    }
    
    //Clear the fields
    private void clearFields() {
        startCmb.setSelectedIndex(0);
        endCmb.setSelectedIndex(0);
        timeTxt.setText("");
        TextArea.setText("");
        trainCmb.removeAllItems();
        trainCmb.addItem("Select Train");
        path = null;
        currentIndex = 0;
        currentStartTime = 0;
        totalTravelTime = 0;
    }
    
    //Method to Check if the trip is possible beforehand
    private int calculateTotalTravelTime(List<MetroStation> path) {
        int totalTravelTime = 0;

        for (int i = 0; i < path.size() - 1; i++) {
            MetroStation from = path.get(i);
            MetroStation to = path.get(i + 1);
            int distance = from.connections.get(to);
            int travelTime = distance * 2; // Travel time at 30 km/h
            totalTravelTime += travelTime + 10; // Include stop time at each station
        }

        return totalTravelTime;
    }
}
