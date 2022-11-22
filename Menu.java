package Home;

import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


/**
 *
 * @author fuku
 */
public class Menu extends javax.swing.JFrame {

  
    private PreparedStatement pst = null;
    private Connection con = null;
    private ResultSet rs = null;
    
    public Menu() {
        
        initComponents();
        setSize(950, 570);
        setLocation(500, 250);
        con=DBConnection.connectDB("events");
        leaveButton1.setVisible(false);
        leaveButton1.setEnabled(false);
        joinButton.setVisible(false);
        joinButton.setEnabled(false);
        deleteButton.setVisible(false);
        deleteButton.setEnabled(false);
        
        showEventsTable();
        eventEli();
    }
    
    public void eventEli() { 
        Date dt = new Date();
        SimpleDateFormat dateFormat;
        dateFormat = new SimpleDateFormat("MMMM dd, yyyy kk:mm");
        Connection dbconn = DBConnection.connectDB("events");
        try {
            String query = "delete from eventdetails where fullTime = ?";
            PreparedStatement preparedStmt = dbconn.prepareStatement(query);
            preparedStmt.setString(1, dateFormat.format(dt));

            // execute the preparedstatement
            int row = preparedStmt.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }
   
    public void showEventsTable(){
    //Use formats from database
    String sql = "select event from eventdetails";
    try {       
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery(sql);
        eventTable.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception e) {
        e.printStackTrace();
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        MenuBackground = new Home.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        eventTable = new javax.swing.JTable();
        panelRound3 = new Home.PanelRound();
        backButton = new javax.swing.JButton();
        panelRound4 = new Home.PanelRound();
        showMember = new javax.swing.JButton();
        panelRound5 = new Home.PanelRound();
        plusButton = new javax.swing.JButton();
        panelRound1 = new Home.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        panelRound2 = new Home.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtLeader = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtParticipant = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptArea = new javax.swing.JTextArea();
        panelRound9 = new Home.PanelRound();
        refreshButt = new javax.swing.JButton();
        panelRound10 = new Home.PanelRound();
        panelRound8 = new Home.PanelRound();
        joinButton = new javax.swing.JButton();
        panelRound11 = new Home.PanelRound();
        leaveButton1 = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("create your own event");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("events list");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(950, 570));
        setSize(new java.awt.Dimension(930, 460));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 550));

        MenuBackground.setBackground(new java.awt.Color(251, 221, 92));
        MenuBackground.setRoundBottomLeft(50);
        MenuBackground.setRoundBottomRight(50);
        MenuBackground.setRoundTopLeft(50);
        MenuBackground.setRoundTopRight(50);

        jScrollPane1.setBackground(new java.awt.Color(255, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        eventTable.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        eventTable.setForeground(new java.awt.Color(102, 102, 102));
        eventTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        eventTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(eventTable);

        panelRound3.setBackground(new java.awt.Color(144, 210, 235));
        panelRound3.setPreferredSize(new java.awt.Dimension(50, 50));
        panelRound3.setRoundBottomLeft(50);
        panelRound3.setRoundBottomRight(50);
        panelRound3.setRoundTopLeft(50);
        panelRound3.setRoundTopRight(50);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home_png/LogRe.png"))); // NOI18N
        backButton.setAutoscrolls(true);
        backButton.setBackground(new java.awt.Color(144, 210, 235));
        backButton.setBorder(null);
        backButton.setContentAreaFilled(false);
        backButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setMaximumSize(new java.awt.Dimension(50, 50));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelRound4.setBackground(new java.awt.Color(144, 210, 235));
        panelRound4.setMinimumSize(new java.awt.Dimension(20, 20));
        panelRound4.setRoundBottomLeft(50);
        panelRound4.setRoundBottomRight(50);
        panelRound4.setRoundTopLeft(50);
        panelRound4.setRoundTopRight(50);

        showMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home_png/membersRe.png"))); // NOI18N
        showMember.setAutoscrolls(true);
        showMember.setBackground(new java.awt.Color(144, 210, 235));
        showMember.setBorder(null);
        showMember.setBorderPainted(false);
        showMember.setContentAreaFilled(false);
        showMember.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        showMember.setForeground(new java.awt.Color(255, 255, 255));
        showMember.setMaximumSize(new java.awt.Dimension(50, 50));
        showMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showMember, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(showMember, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelRound5.setBackground(new java.awt.Color(144, 210, 235));
        panelRound5.setForeground(new java.awt.Color(255, 255, 255));
        panelRound5.setPreferredSize(new java.awt.Dimension(60, 60));
        panelRound5.setRoundBottomLeft(60);
        panelRound5.setRoundBottomRight(60);
        panelRound5.setRoundTopLeft(60);
        panelRound5.setRoundTopRight(60);

        plusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home_png/plusRe.png"))); // NOI18N
        plusButton.setBackground(new java.awt.Color(144, 210, 235));
        plusButton.setBorder(null);
        plusButton.setBorderPainted(false);
        plusButton.setContentAreaFilled(false);
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(plusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout MenuBackgroundLayout = new javax.swing.GroupLayout(MenuBackground);
        MenuBackground.setLayout(MenuBackgroundLayout);
        MenuBackgroundLayout.setHorizontalGroup(
            MenuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBackgroundLayout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(MenuBackgroundLayout.createSequentialGroup()
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MenuBackgroundLayout.setVerticalGroup(
            MenuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuBackgroundLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MenuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelRound1.setBackground(new java.awt.Color(144, 210, 235));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundTopLeft(30);

        jLabel7.setText("EVENT DETAILS");
        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRound2.setBackground(new java.awt.Color(144, 210, 235));
        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundTopLeft(30);

        jLabel8.setText("leader");
        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("location");
        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("date");
        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("time");
        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("discription");
        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("participants");
        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));

        txtLeader.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtLeader.setForeground(new java.awt.Color(102, 102, 102));
        txtLeader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLeaderActionPerformed(evt);
            }
        });

        txtLocation.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtLocation.setForeground(new java.awt.Color(102, 102, 102));

        txtDate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtDate.setForeground(new java.awt.Color(102, 102, 102));

        txtTime.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtTime.setForeground(new java.awt.Color(102, 102, 102));

        txtParticipant.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtParticipant.setForeground(new java.awt.Color(102, 102, 102));

        descriptArea.setColumns(20);
        descriptArea.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        descriptArea.setForeground(new java.awt.Color(102, 102, 102));
        descriptArea.setRows(5);
        jScrollPane2.setViewportView(descriptArea);

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelRound2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLeader, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel11)))
                .addGap(16, 16, 16))
        );

        panelRound9.setBackground(new java.awt.Color(251, 221, 92));
        panelRound9.setMinimumSize(new java.awt.Dimension(40, 40));
        panelRound9.setPreferredSize(new java.awt.Dimension(40, 40));
        panelRound9.setRoundBottomLeft(40);
        panelRound9.setRoundBottomRight(40);
        panelRound9.setRoundTopLeft(40);
        panelRound9.setRoundTopRight(40);

        refreshButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home_png/refreshRe.png"))); // NOI18N
        refreshButt.setBorder(null);
        refreshButt.setBorderPainted(false);
        refreshButt.setContentAreaFilled(false);
        refreshButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(panelRound9);
        panelRound9.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshButt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound9Layout.setVerticalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refreshButt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRound10.setBackground(new java.awt.Color(144, 210, 235));
        panelRound10.setPreferredSize(new java.awt.Dimension(203, 71));
        panelRound10.setRoundBottomLeft(20);
        panelRound10.setRoundBottomRight(20);
        panelRound10.setRoundTopLeft(20);
        panelRound10.setRoundTopRight(20);

        panelRound8.setBackground(new java.awt.Color(144, 210, 235));
        panelRound8.setPreferredSize(new java.awt.Dimension(203, 71));
        panelRound8.setRoundBottomLeft(20);
        panelRound8.setRoundBottomRight(20);
        panelRound8.setRoundTopLeft(20);
        panelRound8.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        joinButton.setText("JOIN");
        joinButton.setBackground(new java.awt.Color(144, 210, 235));
        joinButton.setBorder(null);
        joinButton.setBorderPainted(false);
        joinButton.setContentAreaFilled(false);
        joinButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        joinButton.setForeground(new java.awt.Color(255, 255, 255));
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });

        panelRound11.setBackground(new java.awt.Color(144, 210, 235));
        panelRound11.setPreferredSize(new java.awt.Dimension(203, 71));
        panelRound11.setRoundBottomLeft(20);
        panelRound11.setRoundBottomRight(20);
        panelRound11.setRoundTopLeft(20);
        panelRound11.setRoundTopRight(20);

        javax.swing.GroupLayout panelRound11Layout = new javax.swing.GroupLayout(panelRound11);
        panelRound11.setLayout(panelRound11Layout);
        panelRound11Layout.setHorizontalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        panelRound11Layout.setVerticalGroup(
            panelRound11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        leaveButton1.setText("LEAVE");
        leaveButton1.setBackground(new java.awt.Color(144, 210, 235));
        leaveButton1.setBorder(null);
        leaveButton1.setBorderPainted(false);
        leaveButton1.setContentAreaFilled(false);
        leaveButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        leaveButton1.setForeground(new java.awt.Color(255, 255, 255));
        leaveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveButton1ActionPerformed(evt);
            }
        });

        deleteButton.setText("DELETE");
        deleteButton.setBackground(new java.awt.Color(144, 210, 235));
        deleteButton.setBorder(null);
        deleteButton.setBorderPainted(false);
        deleteButton.setContentAreaFilled(false);
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound10Layout = new javax.swing.GroupLayout(panelRound10);
        panelRound10.setLayout(panelRound10Layout);
        panelRound10Layout.setHorizontalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leaveButton1)
                    .addComponent(joinButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound10Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );
        panelRound10Layout.setVerticalGroup(
            panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound11, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addGroup(panelRound10Layout.createSequentialGroup()
                .addComponent(leaveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(joinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelRound10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelRound10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(MenuBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MenuBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Would You Like to Log Out", "Warning", dialogButton);
        if (dialogResult == 0) {
            Login_Form l = new Login_Form();
            dispose();
            setLocationRelativeTo(null);
            l.setVisible(true);
        }
    }                                          
    
    private void eventTableMouseClicked(java.awt.event.MouseEvent evt) {                                        
        try {
    // TODO add your handling code here:
            int row = eventTable.getSelectedRow();
            String selectedEvent = eventTable.getValueAt(row, 0).toString();
            String sql = "select * from eventdetails where event = '"+selectedEvent+"'";
            ChoseButton();

            pst=con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()){
                String add1  =rs.getString("leader");
                String add2  =rs.getString("location");
                String add3  =rs.getString("date");
                String add4  =rs.getString("time");
                String add5  =rs.getString("description");
                String add6  =rs.getString("participant");
                txtLeader.setText(add1);
                txtLocation.setText(add2);
                txtDate.setText(add3);
                txtTime.setText(add4);
                //txtDescript.setText(add5);
                descriptArea.setText(add5);
                txtParticipant.setText(add6);                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
    }                                       
    
    private String PreviousMember() {  
        String add6 = new String() ;
        try {
            // TODO add your handling code here:
            int row = eventTable.getSelectedRow();
            String selectedEvent = eventTable.getValueAt(row, 0).toString();
            String sql = "select * from eventdetails where event = '" + selectedEvent + "' ";

            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next())
                add6 = rs.getString("members") + "\n";

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return add6 ;
    }

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        user_extended u = new user_extended();
        String user_Fname = u.users.get(0).Fname;
        String l = PreviousMember();
        String together = l + user_Fname;
//      
        int row = eventTable.getSelectedRow();
        String selectedEvent = eventTable.getValueAt(row, 0).toString();
        System.out.print(selectedEvent);

        try {
            PreparedStatement st = DBConnection.connectDB("events").prepareStatement("UPDATE eventdetails SET members='" + together + "'  WHERE event = '" + selectedEvent + "' ");

            st.executeUpdate();

            JOptionPane.showMessageDialog(this, "Updated");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "update not successful");
        }
        
    }                                          

    private void txtLeaderActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void showMemberActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        ShowMembers sm = new ShowMembers();

        dispose();
        setLocationRelativeTo(null);
        sm.setVisible(true);
    }                                          

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        EventCreator ev = new EventCreator();

        dispose();
        setLocationRelativeTo(null);
        ev.setVisible(true);
    }                                          

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        int row = eventTable.getSelectedRow();
        String selectedEvent = eventTable.getValueAt(row, 0).toString();
        System.out.print(selectedEvent);

        try {
            PreparedStatement st = DBConnection.connectDB("events").prepareStatement("DELETE from eventdetails WHERE event = '" + selectedEvent + "' ");

            st.executeUpdate();

            JOptionPane.showMessageDialog(this, "EVENT DELETED");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "DELETE not successful");
        }
    }                                            

    private void leaveButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        user_extended u = new user_extended();
        String name = u.users.get(0).Fname;
        String pre_mem = new String();
        int row = eventTable.getSelectedRow();
        String selectedEvent = eventTable.getValueAt(row, 0).toString();

        try {
            // TODO add your handling code here:
            String sql = "select * from eventdetails where event = '" + selectedEvent + "' ";

            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                pre_mem = rs.getString("members") + "\n";
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(pre_mem.split("\n")));

        for (String auto : words) {
            System.out.println(auto);
        }

        String updated_mem = new String();
        for (int i = 0; i <= words.size() - 1; i++) {
            if (name.compareTo(words.get(i)) == 0) {
                ;
            } else {
                updated_mem += words.get(i); 
            }
        }

        try {
            System.out.println("error here ");
            PreparedStatement st = DBConnection.connectDB("events").prepareStatement("UPDATE eventdetails SET members='" + updated_mem + "'  WHERE event = '" + selectedEvent + "' ");

            st.executeUpdate();

            JOptionPane.showMessageDialog(this, "Leave!");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Leave not successful");
        }
    }                                            

    private void refreshButtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Menu m = new Menu();

        dispose();
        setLocationRelativeTo(null);
        m.setVisible(true);
    }                                           
    public void ChoseButton() {
        user_extended u = new user_extended();
        String name = u.users.get(0).Fname;
        String mem = new String();
        int row = eventTable.getSelectedRow();
        String selectedEvent = eventTable.getValueAt(row, 0).toString();
        try {
            // TODO add your handling code here:

            String sql = "select * from eventdetails where event = '" + selectedEvent + "' ";

            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            if (rs.next()) {
                mem = rs.getString("members") + "\n";
            }
            System.out.println("mem");
            ArrayList <String> words =  new ArrayList<String>(Arrays.asList(mem.split("\n")))  ;
            for (String auto : words) {
                System.out.println(auto);
            }
            for (int i = 0; i <= words.size()-1; i++) {
                System.out.println("in fir loop: " +words.get(0));
                if (name.compareTo(words.get(0)) == 0) {
                    System.out.println(words.get(0));
                    System.out.println(name);
                    
                    leaveButton1.setVisible(false);
                    leaveButton1.setEnabled(false);
                    joinButton.setVisible(false);
                    joinButton.setEnabled(false);
                    deleteButton.setVisible(true);
                    deleteButton.setEnabled(true);
                    System.out.print("case 1");
                    break;

                } else if (name.compareTo(words.get(i)) == 0) { 
//                    System.out.println(words.get(i));
//                    System.out.println(name);
                    leaveButton1.setVisible(true);
                    leaveButton1.setEnabled(true);
                    joinButton.setVisible(false);
                    joinButton.setEnabled(false);
                    deleteButton.setVisible(false);
                    deleteButton.setEnabled(false); 
                    System.out.print("case 2");
                    break;
                }  
                else if (i==words.size()-1) {
             
                leaveButton1.setVisible(false);
                leaveButton1.setEnabled(false);
                joinButton.setVisible(true);
                joinButton.setEnabled(true);
                deleteButton.setVisible(false);
                deleteButton.setEnabled(false);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
           

    // Variables declaration - do not modify                     
    private Home.PanelRound MenuBackground;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextArea descriptArea;
    public static javax.swing.JTable eventTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton joinButton;
    private javax.swing.JButton leaveButton1;
    private Home.PanelRound panelRound1;
    private Home.PanelRound panelRound10;
    private Home.PanelRound panelRound11;
    private Home.PanelRound panelRound2;
    private Home.PanelRound panelRound3;
    private Home.PanelRound panelRound4;
    private Home.PanelRound panelRound5;
    private Home.PanelRound panelRound8;
    private Home.PanelRound panelRound9;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton refreshButt;
    private javax.swing.JButton showMember;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtLeader;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtParticipant;
    private javax.swing.JTextField txtTime;
    // End of variables declaration                   
}
