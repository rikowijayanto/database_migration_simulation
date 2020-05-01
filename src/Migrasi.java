
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Migrasi extends javax.swing.JFrame {
    private static Connection c,a, con;
    private Statement stat;
    String z [];
    String z1[][];
    String z3[];
    String x[];
    String local1;
    String data1;
    String isian[][];
    int recordrow, recordcol;
    String z2 [];
    int mouse;
    String primkey;
    int jumlah2=0;
    int jumlahrow2=0;

    private static final String driverName = "oracle.jdbc.driver.OracleDriver"; //letak driver oracle
    private static final String jdbc = "jdbc:oracle:thin:";
    private static final String host = "@localhost:";
    private static final String port = "1521:";
    private static final String SID = "XE";
    private static final String database = "system"; //nama database anda
    private static final String url = jdbc + host + port + SID;
    private String username; //username database anda
    private String password; // password database anda
    private String DriveName = "net.sourceforge.jtds.jdbc.Driver";
    private String JDBC = "jdbc:jtds:sqlserver://";
    private String HOST = "localhost:";
    private String PORT ="1433";
    private final String URL = JDBC + HOST + PORT + database;
    
    boolean hasilkoneksi1 = false;
    boolean hasilkoneksi2 = false;
    boolean hasilkoneksi3 = false;
    public ResultSet rs, result;
   
    //KONEKSI MYSQL
    public void getKoneksisql() {
        
        local1 = usersql.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdl",""+local1+"","");
        connect_act.setText(connect_act.getText()+"\nConnecting................");
        connect_act.setText(connect_act.getText()+"\nMySQL Connection succes");
        hasilkoneksi1 = true;
        } catch (Exception ex) {
            connect_act.setText(connect_act.getText()+"\nMySQL Connection failed");
        }
    }
    
    
    //KONEKSI ORACLE
    public void getKoneksioracle() throws SQLException {
         
            username = userora.getText();
            password = passora1.getText();
            hasilkoneksi2 = false;
            try {
                Class.forName(driverName);
                try {
                    a = DriverManager.getConnection(url, username, password);
                    connect_act.setText(connect_act.getText()+"\nConnecting..... "
                            + "\nOracle Connection succes");
                    hasilkoneksi2 = true;
                } catch (SQLException se) {
                    connect_act.setText(connect_act.getText()+"\nOracle connection failed ");
                    
                }
            } catch (ClassNotFoundException cnfe) {
                
            }
        
}
    //KONEKSI SQL SERVER
    public void getKoneksisqlserver () throws ClassNotFoundException, SQLException {      
       String user = userserv.getText();
       String pass = passserv.getText();
        try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                JOptionPane.showMessageDialog(null, "tes");
                try {
                    String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=sbdl;username="+user+";password="+pass+";";
                    con = DriverManager.getConnection(connectionUrl);
                    connect_act.setText(connect_act.getText()+"\nConnecting...\nMicrosoft SQL Server connection succes");
                    hasilkoneksi3 = true;
                } catch (SQLException se) {
                    connect_act.setText(connect_act.getText()+"\nMicrosoft SQL Server connection failed \n" + se);
                    
                }
            } catch (ClassNotFoundException cnfe) {
                JOptionPane.showMessageDialog(null, "tus");
            }
    }
    
    
    public Migrasi() {
        initComponents();
        ratatengah();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenu2 = new javax.swing.JMenu();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        usersql = new javax.swing.JTextField();
        loginsql = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel21 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        userora = new javax.swing.JTextField();
        loginora = new javax.swing.JButton();
        passora1 = new javax.swing.JPasswordField();
        jPanel22 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        userserv = new javax.swing.JTextField();
        loginserv = new javax.swing.JButton();
        passserv = new javax.swing.JPasswordField();
        connect_act = new java.awt.TextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        tabellist1 = new javax.swing.JComboBox<>();
        migrate1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        database3 = new javax.swing.JTable();
        cek2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        database4 = new javax.swing.JTable();
        kolomlist3 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        delete = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        tabellist2 = new javax.swing.JComboBox<>();
        kolomlist1 = new javax.swing.JComboBox<>();
        tes1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        migrate2 = new javax.swing.JButton();
        tabeltarget = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        penampungan = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        checkboxtarget = new javax.swing.JCheckBox();
        hasilkolom = new javax.swing.JTextField();
        hasiltuple = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        tabellist3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        migrate3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        database2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        source = new javax.swing.JComboBox<>();
        target = new javax.swing.JComboBox<>();
        scan = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jLabel2.setText("Source");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Localhost");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu2.setText("jMenu2");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database Migration Program");
        setBackground(new java.awt.Color(255, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255), 2));

        jPanel20.setBackground(new java.awt.Color(0, 204, 102));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "MySQL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Username");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Password");

        loginsql.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        loginsql.setText("TEST CONNECTION");
        loginsql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginsqlActionPerformed(evt);
            }
        });

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginsql)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usersql, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(jPasswordField1))))
                .addGap(35, 35, 35))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(usersql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(loginsql)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(0, 204, 102));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Oracle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Username");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Password");

        loginora.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        loginora.setText("TEST CONNECTION");
        loginora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginoraActionPerformed(evt);
            }
        });

        passora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passora1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passora1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(userora))
                .addGap(41, 41, 41))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(userora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(passora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(loginora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(0, 204, 102));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "SQL Server", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Username");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Password");

        userserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userservActionPerformed(evt);
            }
        });

        loginserv.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        loginserv.setText("TEST CONNECTION");
        loginserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginservActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginserv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userserv, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(passserv))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(userserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(passserv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginserv)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        connect_act.setBackground(new java.awt.Color(153, 204, 255));
        connect_act.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("LOG ACTIVITIES");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\SBDL\\build\\gambar\\user-icon-png-pnglogocom.png")); // NOI18N

        jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 153, 204));
        jLabel27.setText("You have to log in with your special username first");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton2.setText("SAVE LOG");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(connect_act, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap(31, Short.MAX_VALUE)
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)))
                .addGap(43, 43, 43)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(jLabel10)
                .addGap(5, 5, 5)
                .addComponent(connect_act, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Connection", jPanel14);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255), 2));

        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabellist1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tabellist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabellist1ActionPerformed(evt);
            }
        });

        migrate1.setBackground(new java.awt.Color(0, 153, 255));
        migrate1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        migrate1.setText("MIGRATE");
        migrate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                migrate1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Table");

        database3.setBackground(new java.awt.Color(102, 204, 255));
        database3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        database3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(database3);

        cek2.setBackground(new java.awt.Color(0, 153, 255));
        cek2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cek2.setText("CHECK");
        cek2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cek2ActionPerformed(evt);
            }
        });

        database4.setBackground(new java.awt.Color(102, 204, 255));
        database4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        database4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(database4);

        kolomlist3.setBackground(new java.awt.Color(153, 255, 153));
        kolomlist3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kolomlist3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kolomlist3FocusGained(evt);
            }
        });
        kolomlist3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomlist3ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Coloumn");

        delete.setBackground(new java.awt.Color(0, 204, 102));
        delete.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete Source");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(migrate1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(tabellist1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cek2))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(kolomlist3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tabellist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cek2)
                    .addComponent(kolomlist3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(migrate1)
                    .addComponent(delete))
                .addGap(17, 17, 17))
        );

        jTabbedPane2.addTab("Full Migration", jPanel4);

        jPanel7.setBackground(new java.awt.Color(0, 204, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabellist2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tabellist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabellist2ActionPerformed(evt);
            }
        });

        kolomlist1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kolomlist1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NULL" }));
        kolomlist1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                kolomlist1ItemStateChanged(evt);
            }
        });
        kolomlist1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kolomlist1FocusGained(evt);
            }
        });
        kolomlist1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                kolomlist1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        kolomlist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kolomlist1MousePressed(evt);
            }
        });
        kolomlist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kolomlist1ActionPerformed(evt);
            }
        });
        kolomlist1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                kolomlist1PropertyChange(evt);
            }
        });

        tes1.setBackground(new java.awt.Color(0, 153, 255));
        tes1.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        tes1.setText("=>");
        tes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tes1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Table Source");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Colomn Source");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Data Type");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Tuple");

        migrate2.setBackground(new java.awt.Color(0, 153, 255));
        migrate2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        migrate2.setText("MIGRATE");
        migrate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                migrate2ActionPerformed(evt);
            }
        });

        tabeltarget.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tabeltarget.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NULL" }));
        tabeltarget.setSelectedIndex(-1);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Table Target");

        penampungan.setBackground(new java.awt.Color(102, 204, 255));
        penampungan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        penampungan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        penampungan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        penampungan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                penampunganMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(penampungan);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        penampungan.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Column Content");

        checkboxtarget.setBackground(new java.awt.Color(0, 204, 102));
        checkboxtarget.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkboxtarget.setForeground(new java.awt.Color(255, 255, 255));
        checkboxtarget.setText("Certain Table");

        hasilkolom.setEditable(false);
        hasilkolom.setBackground(new java.awt.Color(255, 255, 51));
        hasilkolom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hasilkolom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hasilkolom.setBorder(null);
        hasilkolom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilkolomActionPerformed(evt);
            }
        });

        hasiltuple.setBackground(new java.awt.Color(255, 255, 0));
        hasiltuple.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hasiltuple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hasiltuple.setBorder(null);
        hasiltuple.setRequestFocusEnabled(false);
        hasiltuple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasiltupleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(tabellist2, javax.swing.GroupLayout.Alignment.LEADING, 0, 157, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(tes1))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel23)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21)
                            .addComponent(kolomlist1, 0, 123, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel20)
                            .addComponent(hasilkolom)
                            .addComponent(hasiltuple))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addComponent(tabeltarget, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(checkboxtarget)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(migrate2)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tabellist2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kolomlist1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tes1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(checkboxtarget)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(migrate2))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tabeltarget, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(hasilkolom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasiltuple, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(106, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("Partial Migration", jPanel7);

        jPanel12.setBackground(new java.awt.Color(0, 204, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabellist3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tabellist3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabellist3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("CHECK TABLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        migrate3.setBackground(new java.awt.Color(51, 153, 255));
        migrate3.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        migrate3.setText("MIGRATE");
        migrate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                migrate3ActionPerformed(evt);
            }
        });

        database2.setBackground(new java.awt.Color(102, 204, 255));
        database2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        database2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                database2ComponentAdded(evt);
            }
        });
        database2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                database2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(database2);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(tabellist3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(274, 274, 274))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(migrate3)
                .addGap(42, 42, 42))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tabellist3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(migrate3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Custom Migration", jPanel12);

        jPanel6.setBackground(new java.awt.Color(0, 204, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "DBMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Source");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Target");

        source.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oracle", "MySql", "MsServer" }));
        source.setBorder(null);

        target.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        target.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oracle", "MySql", "MsServer" }));
        target.setBorder(null);

        scan.setBackground(new java.awt.Color(255, 0, 204));
        scan.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        scan.setText("Scan");
        scan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(target, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scan)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(target, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 102, 153));
        jLabel24.setText("MIGRATION PANEL");

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 153));
        jLabel25.setText("Developt by Department of Information System RhA Product@");

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\SBDL\\build\\gambar\\educational-objects_23-2147512027.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Migration", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204), 2));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 153, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("   \nFor paying attention to all users that :\n\n   1. This program has been ran using NetBeans IDE\n\n   2. This program has been ran using Oracle, MySQL, and Microsoft SQL Server as the Database\n\n    Management System (DBMS)\n\n   3. The main DBMS is a Oracle, so that the Database Enginer made a limitation that is \"USER CAN\n\n     MIGRATE FROM ORACLE TO ANOTHER BACK UP DBMS, BUT USER CAN NOT MIGRATE \n\n     FROM ANOTHER DBMS TO ORACLE (ACTUALLY)\" to avoid the uncompletely process.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 204));
        jLabel28.setText("CAUTION");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel28)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel28)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Caution", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\SBDL\\build\\gambar\\lambang-its-png-v1.png")); // NOI18N

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Copyright by :\n\nRiko Wijayanto (06111540000010)\nAyu Ni'matul \t  (06111540000013)\n\nMathematics Department\nFaculty of Mathematics, Computing,\nand Data Science\nSepuluh Nopember Institute of\nTechnology\nSURABAYA\n2018");
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jScrollPane5.setViewportView(jTextArea2);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\SBDL\\build\\gambar\\AAAAAAAAAAAA.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       this.getContentPane().setBackground(Color.WHITE);
    }//GEN-LAST:event_formComponentShown

    private void scanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanActionPerformed
        tabellist1.removeAllItems();
        tabellist2.removeAllItems();
        tabellist3.removeAllItems();
        kolomlist1.removeAllItems();

        tabeltarget.removeAllItems();

        if (source.getSelectedItem() == "MySql" && hasilkoneksi1 == false) {
            JOptionPane.showMessageDialog(null, "MySQL Connection is interupted");
            connect_act.setText(connect_act.getText()+"\nMySQL Connection is interupted");
        } else if (source.getSelectedItem() == "Oracle" && hasilkoneksi2 == false ) {
            JOptionPane.showMessageDialog(null, "Oracle Connection is interupted");
            connect_act.setText(connect_act.getText()+"\nOracle Connection is interupted");
        } else if (source.getSelectedItem() == "SQLServer" && hasilkoneksi3 == false ) {
            JOptionPane.showMessageDialog(null, "Microsoft SQL Server Connection is interupted");
            connect_act.setText(connect_act.getText()+"\nMicrosoft SQL Server Connection is interupted");
        } else {

            if(source.getSelectedItem() == "MySql") {
                try {
                    getKoneksisql();
                    Statement stat = c.createStatement();
                    String kode = (String) tabellist1.getSelectedItem();
                    DefaultTableModel tabel = new DefaultTableModel ();
                    ResultSet res = stat.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE table_schema='sbdl' and TABLE_TYPE='BASE TABLE'");
                    while (res.next()) {
                        tabellist1.addItem(res.getString(1));
                        tabellist2.addItem(res.getString(1));
                        tabellist3.addItem(res.getString(1));
                    }
                }
                catch (Exception e) {
                }
            }

            else if (source.getSelectedItem() == "Oracle")   {
                try {
                    getKoneksioracle();
                    Statement stat = a.createStatement();
                    ResultSet res = stat.executeQuery("SELECT table_name FROM user_tables");
                    while (res.next()) {
                        tabellist1.addItem(res.getString(1));
                        tabellist2.addItem(res.getString(1));
                        tabellist3.addItem(res.getString(1));
                    }
                }
                catch (Exception e) {
                }
            } else if (source.getSelectedItem() == "MsServer" )   {
                try {
                    getKoneksisqlserver();
                    Statement stat = con.createStatement();
                    ResultSet res = stat.executeQuery("SELECT name FROM sbdl.sys.tables");
                    while (res.next()) {
                        tabellist1.addItem(res.getString(1));
                        tabellist2.addItem(res.getString(1));
                        tabellist3.addItem(res.getString(1));
                    }
                }
                catch (Exception e) {
                }
            }

            if(target.getSelectedItem() == "MySql") {
                try {
                    getKoneksisql();
                    Statement stat = c.createStatement();
                    String kode = (String) tabellist1.getSelectedItem();
                    DefaultTableModel tabel = new DefaultTableModel ();
                    ResultSet res = stat.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE table_schema='sbdl' and TABLE_TYPE='BASE TABLE'");

                    while (res.next()) {
                        tabeltarget.addItem(res.getString(1));
                    }
                }
                catch (Exception e) {
                }
            }

            else if (target.getSelectedItem() == "Oracle")   {
                try {
                    getKoneksioracle();
                    Statement stat = a.createStatement();
                    ResultSet res = stat.executeQuery("SELECT table_name FROM user_tables");
                    while (res.next()) {
                        tabeltarget.addItem(res.getString(1));
                    }
                }
                catch (Exception e) {
                }
            } 
            
            
            else if (target.getSelectedItem() == "MsServer" )   {
                try {
                    getKoneksisqlserver();
                    Statement stat = con.createStatement();
                    ResultSet res = stat.executeQuery("SELECT name FROM sbdl.sys.tables");
                    while (res.next()) {
                        tabeltarget.addItem(res.getString(1));
                    }
                }
                catch (Exception e) {
                }
            }
            
            connect_act.setText(connect_act.getText()+"\nScanning process is running.....\nScanning process finish");
        }
    }//GEN-LAST:event_scanActionPerformed

    private void database2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_database2MouseClicked
        mouse = database2.getSelectedRow();
        JOptionPane.showMessageDialog(null, "This data has been saved");
    }//GEN-LAST:event_database2MouseClicked

    private void database2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_database2ComponentAdded

    }//GEN-LAST:event_database2ComponentAdded

    private void migrate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_migrate3ActionPerformed
        int jumlah = 0;
        int jumlahrow = 0;

        String kode = (String) tabellist3.getSelectedItem();
        String kode1 = kode;

        if(source.getSelectedItem()=="MySql" && target.getSelectedItem()=="MsServer"){
            try {
                Statement stat = c.createStatement();
                ResultSet set = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+kode1+"'");
                while (set.next()) {
                    jumlah++;

                }

                z2 = new String [jumlah];

                for (int x=0; x<jumlah ; x++) {
                    z2[x] = database2.getColumnName(x);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Statement stut = con.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stut.execute("CREATE TABLE [dbo].["+kode1+"] (["+z2[i]+"] [VARCHAR](255))");

                    } else {

                        stut.execute("ALTER TABLE [dbo].["+kode1+"] ADD ["+z2[i]+"] VARCHAR(255)");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }

            try {

                Statement stut = con.createStatement();
                stut.execute("INSERT INTO "+kode1+" ("+z2[0]+") VALUES ('"+database2.getValueAt(mouse, 0)+"')");
                for(int j=0; j< jumlah-1; j++) {
                    stut = con.createStatement();
                    stut.execute("UPDATE "+kode1+" SET "+z2[j+1]+"= '"+database2.getValueAt(mouse, j+1)+"' "
                            + "WHERE "+z2[0]+"= '"+database2.getValueAt(mouse, 0)+"'");
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed" );
                e.printStackTrace();
                
            }
        }

        //MSSERVER KE MYSQL
        else if(source.getSelectedItem()=="MsServer" && target.getSelectedItem()=="MySql"){
            try {
                Statement stat = con.createStatement();
                ResultSet set = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME like '"+kode1+"'");
                while (set.next()) {
                    jumlah++;

                }

                z2 = new String [jumlah];

                for (int x=0; x<jumlah ; x++) {
                    z2[x] = database2.getColumnName(x);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Statement stut = c.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {

                        stut.execute("CREATE TABLE `"+kode1+"` (`"+z2[i]+"` VARCHAR(255))");

                    } else {
                        stut.execute("ALTER TABLE `"+kode1+"` ADD (`"+z2[i]+"` VARCHAR(255))");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }

            try {
                Statement stut = c.createStatement();
                stut.execute("INSERT INTO `"+kode1+"` ("+z2[0]+") VALUES (\""+database2.getValueAt(mouse, 0)+"\")");
                for(int j=0; j< jumlah-1; j++) {
                    stut = c.createStatement();
                    stut.execute("UPDATE `"+kode1+"` SET "+z2[j+1]+"= \""+database2.getValueAt(mouse, j+1)+"\" WHERE "+z2[0]+"= '"+database2.getValueAt(mouse, 0)+"'");
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed"+e);
            }
        }

        //ORACLE KE MYSQL
        else if(source.getSelectedItem()=="Oracle" && target.getSelectedItem()=="MySql"){
            try {
                Statement stat = a.createStatement();
                ResultSet set = stat.executeQuery("SELECT column_name FROM all_tab_cols WHERE table_name like '"+kode1+"'");
                while (set.next()) {
                    jumlah++;

                }

                z2 = new String [jumlah];

                for (int x=0; x<jumlah ; x++) {
                    z2[x] = database2.getColumnName(x);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Statement stut = c.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stut.execute("CREATE TABLE `"+kode1+"` (`"+z2[i]+"` VARCHAR(255))");

                    } else {
                        stut.execute("ALTER TABLE `"+kode1+"` ADD (`"+z2[i]+"` VARCHAR(255))");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }

            try {

                Statement stut = c.createStatement();
                stut.execute("INSERT INTO `"+kode1+"` (`"+z2[0]+"`) VALUES (\""+database2.getValueAt(mouse, 0)+"\")");
                for(int j=0; j< jumlah-1; j++) {
                    stut = c.createStatement();
                    stut.execute("UPDATE `"+kode1+"` SET "+z2[j+1]+"= \""+database2.getValueAt(mouse, j+1)+"\""
                            + " WHERE "+z2[0]+"= '"+database2.getValueAt(mouse, 0)+"'");
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
            }
        }

        else if(source.getSelectedItem()=="Oracle" && target.getSelectedItem()=="MsServer"){
            try {
                Statement stat = a.createStatement();
                ResultSet set = stat.executeQuery("SELECT column_name FROM all_tab_cols WHERE table_name like '"+kode1+"'");
                while (set.next()) {
                    jumlah++;

                }

                z2 = new String [jumlah];

                for (int x=0; x<jumlah ; x++) {
                    z2[x] = database2.getColumnName(x);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                Statement stut = con.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stut.execute("CREATE TABLE [dbo].["+kode1+"] (["+z2[i]+"] [VARCHAR](255))");

                    } else {

                        stut.execute("ALTER TABLE [dbo].["+kode1+"] ADD ["+z2[i]+"] VARCHAR(255)");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }

            try {

                Statement stut = con.createStatement();
                stut.execute("INSERT INTO "+kode1+" ("+z2[0]+") VALUES ('"+database2.getValueAt(mouse, 0)+"')");
                for(int j=0; j< jumlah-1; j++) {
                    stut = con.createStatement();
                    stut.execute("UPDATE "+kode1+" SET "+z2[j+1]+"= '"+database2.getValueAt(mouse, j+1)+"' WHERE "+z2[0]+"= '"+database2.getValueAt(mouse, 0)+"'");
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed" );
                e.printStackTrace();
                
            }
        }
        else if (source.getSelectedItem() == "MsServer" && target.getSelectedItem() == "Oracle" ){
            try {
                Statement stat = con.createStatement();
                ResultSet set = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME like '"+kode1+"'");
                while (set.next()) {
                    jumlah++;

                }

                z2 = new String [jumlah];

                for (int x=0; x<jumlah ; x++) {
                    z2[x] = database2.getColumnName(x);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
             
            try {
                Statement stut = a.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stut.execute("CREATE TABLE \""+kode1+"\" (\""+z2[i]+"\" VARCHAR2(255))");

                    } else {
                        stut.execute( "ALTER TABLE \""+kode1+"\" ADD \""+z2[i]+"\" VARCHAR2(255)");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }
     try {

                Statement stut = a.createStatement();
                stut.execute("INSERT INTO "+kode1+" ("+z2[0]+") VALUES ('"+database2.getValueAt(mouse, 0)+"')");
                for(int j=0; j< jumlah-1; j++) {
                    stut = a.createStatement();
                    stut.execute("UPDATE "+kode1+" SET "+z2[j+1]+"= '"+database2.getValueAt(mouse, j+1)+"' WHERE "+z2[0]+"='"+database2.getValueAt(mouse, 0)+"'");
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
            }
            
        } else if(source.getSelectedItem() == "MySql" && target.getSelectedItem() == "Oracle") {
             try {
                Statement stat = c.createStatement();
                ResultSet set = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+kode1+"'");
                while (set.next()) {
                    jumlah++;

                }

                z2 = new String [jumlah];

                for (int x=0; x<jumlah ; x++) {
                    z2[x] = database2.getColumnName(x);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
            }
             
            
            try {
                Statement stut = a.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stut.execute("CREATE TABLE \""+kode1+"\" (\""+z2[i]+"\" VARCHAR2(255))");

                    } else {
                        stut.execute( "ALTER TABLE \""+kode1+"\" ADD \""+z2[i]+"\" VARCHAR2(255)");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }
     try {

                Statement stut = a.createStatement();
                stut.execute("INSERT INTO "+kode1+" ("+z2[0]+") VALUES ('"+database2.getValueAt(mouse, 0)+"')");
                for(int j=0; j< jumlah-1; j++) {
                    stut = a.createStatement();
                    stut.execute("UPDATE "+kode1+" SET "+z2[j+1]+"= '"+database2.getValueAt(mouse, j+1)+"' WHERE "+z2[0]+"='"+database2.getValueAt(mouse, 0)+"'");
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
            }
        }
    }//GEN-LAST:event_migrate3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        database2.removeAll();
        
        if(source.getSelectedItem() == "MySql"){
            try {
                kolomlist1.removeAllItems();
                Statement stat = c.createStatement();
                String kode = (String)tabellist3.getSelectedItem();
                ResultSet res = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+kode+"'");

            }
            catch (Exception e) {
            }

            try {

                getKoneksisql();
                Statement stat = c.createStatement();
                DefaultTableModel tabel = new DefaultTableModel();
                String kode = (String) tabellist3.getSelectedItem();
                ResultSet set = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+kode+"'");

                while (set.next()) {
                    tabel.addColumn(set.getString(1));
                    jumlah2++;
                }

                ResultSet res = stat.executeQuery("SELECT * FROM "+kode+"");
                while (res.next()) {
                    jumlahrow2++;
                }
                
                ResultSet res3 = stat.executeQuery("SELECT * FROM "+kode+"");
                while (res3.next()) {
                if (jumlah2 == 1) {  
                    tabel.addRow(new String [] {res3.getString(1)});
                }  else if ( jumlah2 == 2) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2)});
                }  else if ( jumlah2 == 3) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3)});
                }  else if ( jumlah2 == 4) {
                    tabel.addRow(new String []{res3.getString(1),res3.getString(2),res3.getString(3),res3.getString(4)}); 
                }  else if (jumlah2 == 5) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5)});
                }  else if ( jumlah2 == 6) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5), res3.getString(6)});
                }  else {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5), res3.getString(6), res3.getString(7)});              
                }     
                }
                database2.setModel(tabel);

            }
            catch (Exception e) {
            }
        }

        else if (source.getSelectedItem()=="Oracle") {
            try {

                getKoneksioracle();
                Statement stat = a.createStatement();
                String kode = (String)tabellist3.getSelectedItem();
                ResultSet res = stat.executeQuery("SELECT column_name FROM all_tab_cols WHERE table_name like '"+kode+"'");

            }
            catch (Exception e) {
            }

            try {
                Statement stat = a.createStatement();
                DefaultTableModel tabel = new DefaultTableModel();
                String kode = (String) tabellist3.getSelectedItem();
                ResultSet set = stat.executeQuery("SELECT column_name FROM all_tab_cols WHERE table_name like '"+kode+"'");

                while (set.next()) {
                    tabel.addColumn(set.getString(1));
                    jumlah2++;
                }

                ResultSet res = stat.executeQuery("SELECT * FROM "+kode+"");
                while (res.next()) {
                    jumlahrow2++;
                }
                
              ResultSet res3 = stat.executeQuery("SELECT * FROM "+kode+"");
                while (res3.next()) {
                if (jumlah2 == 1) {  
                    tabel.addRow(new String [] {res3.getString(1)});
                }  else if ( jumlah2 == 2) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2)});
                }  else if ( jumlah2 == 3) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3)});
                }  else if ( jumlah2 == 4) {
                    tabel.addRow(new String []{res3.getString(1),res3.getString(2),res3.getString(3),res3.getString(4)}); 
                }  else if (jumlah2 == 5) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5)});
                }  else if ( jumlah2 == 6) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5), res3.getString(6)});
                }  else {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5), res3.getString(6), res3.getString(7)});              
                }     
                }
                
                database2.setModel(tabel);

            }
            catch (Exception e) {
            }
        }
        else if(source.getSelectedItem() == "MsServer"){
            try {
                kolomlist1.removeAllItems();
       
                Statement stat = con.createStatement();
                String kode = (String)tabellist3.getSelectedItem();
                ResultSet res = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME like '"+kode+"'");
            }
            catch (Exception e) {
            }

            try {

                getKoneksisql();
                Statement stat = con.createStatement();
                DefaultTableModel tabel = new DefaultTableModel();
                String kode = (String) tabellist3.getSelectedItem();
                ResultSet set = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME like '"+kode+"'");

                while (set.next()) {
                    tabel.addColumn(set.getString(1));
                    jumlah2++;
                }

                ResultSet res = stat.executeQuery("SELECT * FROM "+kode+"");
                while (res.next()) {
                    jumlahrow2++;
                }
                
                ResultSet res3 = stat.executeQuery("SELECT * FROM "+kode+"");
                while (res3.next()) {
                if (jumlah2 == 1) {  
                    tabel.addRow(new String [] {res3.getString(1)});
                }  else if ( jumlah2 == 2) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2)});
                }  else if ( jumlah2 == 3) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3)});
                }  else if ( jumlah2 == 4) {
                    tabel.addRow(new String []{res3.getString(1),res3.getString(2),res3.getString(3),res3.getString(4)}); 
                }  else if (jumlah2 == 5) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5)});
                }  else if ( jumlah2 == 6) {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5), res3.getString(6)});
                }  else {
                    tabel.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5), res3.getString(6), res3.getString(7)});              
                }     
                }
                database2.setModel(tabel);

            }
            catch (Exception e) {
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabellist3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabellist3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabellist3ActionPerformed

    private void penampunganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penampunganMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_penampunganMouseClicked

    private void migrate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_migrate2ActionPerformed

        int jumlah = Integer.parseInt(hasiltuple.getText());
        JOptionPane.showMessageDialog(null, jumlah+3);
        String asal = (String) source.getSelectedItem();
        String tujuan = (String) target.getSelectedItem();
        String kode = (String) tabeltarget.getSelectedItem();
        String kode1 = kode;
        String kol = (String)kolomlist1.getSelectedItem();
        String kol1 = kol;

        //MYSQL KE MSSERVER
        if(asal == "MySql" && tujuan == "MsServer") {
            try {
                Statement stat = con.createStatement();
                if (checkboxtarget.isSelected() == false) {
                    stat.execute("CREATE TABLE [dbo].["+kol1+"] (["+kol1+"] [VARCHAR](255))");
                } else {
                    stat.execute("ALTER TABLE [dbo].["+kode+"] ADD ["+kol1+"] VARCHAR(255)");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            try {

                if(checkboxtarget.isSelected()==false) {
                    for(int i=0; i<jumlah; i++) {
                        Statement stut = con.createStatement();
                        stut.execute("INSERT INTO "+kol1+" ("+kol1+") VALUES ('"+penampungan.getValueAt(i, 0)+"')");

                    }
                } else {
                    for(int i=0; i<jumlah ; i++) {
                        Statement stut = con.createStatement();
                        stut.execute("INSERT INTO "+kode+" ("+kol1+") VALUES ('"+penampungan.getValueAt(i, 0)+"')");
                    }
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
            }

        }
        //ORACLE KE MYSQL
        else if (asal == "Oracle" && tujuan == "MySql") {
            try {

                Statement stat = c.createStatement();
                if (checkboxtarget.isSelected() == false) {
                    stat.execute("CREATE TABLE `"+kol1+"` (`"+kol1+"` VARCHAR(255))");
                } else {
                    stat.execute("ALTER TABLE `"+kode+"` ADD (`"+kol1+"` VARCHAR(255))");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            try {
                    if(checkboxtarget.isSelected()==false) {
                    for(int i=0; i<jumlah; i++) {
                        Statement stut = c.createStatement();
                        stut.execute("INSERT INTO `"+kol1+"` (`"+kol1+"`) "
                                + "VALUES (\""+penampungan.getValueAt(i, 0)+"\")");

                    }
                } else {
                    for(int i=0; i<jumlah ; i++) {
                        Statement stut = c.createStatement();
                        stut.execute("INSERT INTO `"+kode+"` (`"+kol1+"`) "
                                + "VALUES (\""+penampungan.getValueAt(i, 0)+"\")");

                    }
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
                System.out.println(e);
            }
        }

        //ORACLE KE MSSERVER
        else if(asal == "Oracle" && tujuan == "MsServer") {

            try {

                Statement stat = con.createStatement();
                if (checkboxtarget.isSelected() == false) {
                    stat.execute("CREATE TABLE [dbo].["+kol1+"] (["+kol1+"] [VARCHAR](255))");
                } else {
                    stat.execute("ALTER TABLE [dbo].["+kode+"] ADD ["+kol1+"] VARCHAR(255)");
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }

            try {

                if(checkboxtarget.isSelected()==false) {
                    for(int i=0; i<jumlah; i++) {
                        Statement stut = con.createStatement();
                        stut.execute("INSERT INTO "+kol1+" ("+kol1+") VALUES ('"+penampungan.getValueAt(i, 0)+"')");

                    }
                } else {
                    for(int i=0; i<jumlah ; i++) {
                        Statement stut = con.createStatement();
                        stut.execute("INSERT INTO "+kode+" ("+kol1+") VALUES ('"+penampungan.getValueAt(i, 0)+"')");
                    }
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
            }
        }
        
           else if(asal == "MsServer" && tujuan == "MySql") {

               try {

                Statement stat = c.createStatement();
                if (checkboxtarget.isSelected() == false) {
                    stat.execute("CREATE TABLE `"+kol1+"` (`"+kol1+"` VARCHAR(255))");
                } else {
                    stat.execute("ALTER TABLE `"+kode+"` ADD (`"+kol1+"` VARCHAR(255))");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            try {
                    if(checkboxtarget.isSelected()==false) {
                    for(int i=0; i<jumlah; i++) {
                        Statement stut = c.createStatement();
                        stut.execute("INSERT INTO `"+kol1+"` (`"+kol1+"`) VALUES (\""+penampungan.getValueAt(i, 0)+"\")");

                    }
                } else {
                    for(int i=0; i<jumlah ; i++) {
                        Statement stut = c.createStatement();
                        stut.execute("INSERT INTO `"+kode+"` (`"+kol1+"`) VALUES (\""+penampungan.getValueAt(i, 0)+"\")");

                    }
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
            }

            }
            
           else if (asal == "MsServer" && tujuan == "Oracle") {
               
            try {      
                Statement stat = a.createStatement();
                if (checkboxtarget.isSelected() == false) {
                    stat.execute("CREATE TABLE \""+kode+"\" (\""+kol1+"\" VARCHAR(255))");
                } else {
                    stat.execute("ALTER TABLE \""+kode+"\" ADD (\""+kol1+"\" VARCHAR(255))");
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            try {
                
                if(checkboxtarget.isSelected()==false) {
                    for(int i=0; i<jumlah; i++) {
                        Statement stut = a.createStatement();
                        stut.execute("INSERT INTO "+kol1+" ("+kol1+") VALUES ('"+penampungan.getValueAt(i, 0)+"')");

                    }
                } else {
                    for(int i=0; i<jumlah ; i++) {
                        Statement stut = a.createStatement();
                        stut.execute("INSERT INTO "+kode+" ("+kol1+") VALUES ('"+penampungan.getValueAt(i, 0)+"')");

                    }
                }

                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
            }
           }
        
    }//GEN-LAST:event_migrate2ActionPerformed

    private void tes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tes1ActionPerformed
        if(source.getSelectedItem() == "MySql") {
            try {
                kolomlist1.removeAllItems();
                getKoneksisql();
                Statement stat = c.createStatement();
                String kode = (String)tabellist2.getSelectedItem();
                ResultSet res = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+kode+"'");

                while (res.next()) {
                    kolomlist1.addItem(res.getString(1));

                }

            }
            catch (Exception e) {
            }
        } else if (source.getSelectedItem() == "Oracle") {
            try {
                kolomlist1.removeAllItems();
                getKoneksioracle();
                Statement stat = a.createStatement();
                String kode = (String)tabellist2.getSelectedItem();
                ResultSet res = stat.executeQuery("SELECT column_name FROM all_tab_cols WHERE table_name like '"+kode+"'");

                while (res.next()) {
                    kolomlist1.addItem(res.getString(1));

                }
            }
            catch (Exception e) {
            }
        }

        else if (source.getSelectedItem() == "MsServer") {
            try {
                kolomlist1.removeAllItems();
                getKoneksisqlserver();
                Statement stat = con.createStatement();
                String kode = (String)tabellist2.getSelectedItem();
                ResultSet res = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME like '"+kode+"'");

                while (res.next()) {
                    kolomlist1.addItem(res.getString(1));

                }
            }
            catch (Exception e) {
            }
        }
    }//GEN-LAST:event_tes1ActionPerformed

    private void kolomlist1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_kolomlist1PropertyChange

    }//GEN-LAST:event_kolomlist1PropertyChange

    private void kolomlist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomlist1ActionPerformed

    }//GEN-LAST:event_kolomlist1ActionPerformed

    private void kolomlist1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kolomlist1MousePressed

    }//GEN-LAST:event_kolomlist1MousePressed

    private void kolomlist1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_kolomlist1PopupMenuWillBecomeInvisible
        penampungan.removeAll();
        int jumlah =0;

        if(source.getSelectedItem() == "MySql") {
            try {
                Statement stat = c.createStatement();
                DefaultTableModel tampung = new DefaultTableModel ();
                String tab = (String)tabellist2.getSelectedItem();
                String kol = (String)kolomlist1.getSelectedItem();

                ResultSet res = stat.executeQuery("SELECT COLUMN_TYPE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME ='"+tab+"' AND COLUMN_NAME='"+kol+"'");

                while (res.next()) {
                    hasilkolom.setText(res.getString(1));
                }

                tampung.addColumn(kol);
                ResultSet res1 = stat.executeQuery("SELECT "+kol+" FROM "+tab);
                while (res1.next()) {
                    jumlah++;
                    tampung.addRow(new String [] {res1.getString(1)});
                }

                penampungan.setModel(tampung);
                hasiltuple.setText(Integer.toString(jumlah));
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        else if (source.getSelectedItem()=="Oracle"){
            try {
                Statement stat = a.createStatement();
                DefaultTableModel tampung = new DefaultTableModel ();
                String tab = (String)tabellist2.getSelectedItem();
                String kol = (String)kolomlist1.getSelectedItem();

                ResultSet res = stat.executeQuery("SELECT data_type FROM all_tab_cols WHERE table_name like '"+tab+"' and column_name like '"+kol+"'");

                while (res.next()) {
                    hasilkolom.setText(res.getString(1));
                }

                tampung.addColumn(kol);
                ResultSet res1 = stat.executeQuery("SELECT "+kol+" FROM "+tab);
                while (res1.next()) {
                    jumlah++;
                    tampung.addRow(new String [] {res1.getString(1)});
                }

                penampungan.setModel(tampung);
                hasiltuple.setText(Integer.toString(jumlah));
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        else if (source.getSelectedItem()=="MsServer"){
            try {
                Statement stat = con.createStatement();
                DefaultTableModel tampung = new DefaultTableModel ();
                String tab = (String)tabellist2.getSelectedItem();
                String kol = (String)kolomlist1.getSelectedItem();

                ResultSet res = stat.executeQuery("SELECT DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME like '"+tab+"' and COLUMN_NAME like '"+kol+"'");

                while (res.next()) {
                    hasilkolom.setText(res.getString(1));
                }

                tampung.addColumn(kol);
                ResultSet res1 = stat.executeQuery("SELECT "+kol+" FROM "+tab);
                while (res1.next()) {
                    jumlah++;
                    tampung.addRow(new String [] {res1.getString(1)});
                }

                penampungan.setModel(tampung);
                hasiltuple.setText(Integer.toString(jumlah));
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_kolomlist1PopupMenuWillBecomeInvisible

    private void kolomlist1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kolomlist1FocusGained

    }//GEN-LAST:event_kolomlist1FocusGained

    private void kolomlist1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_kolomlist1ItemStateChanged

    }//GEN-LAST:event_kolomlist1ItemStateChanged

    private void tabellist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabellist2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabellist2ActionPerformed

    private void kolomlist3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kolomlist3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kolomlist3ActionPerformed

    private void kolomlist3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kolomlist3FocusGained

    }//GEN-LAST:event_kolomlist3FocusGained

    private void cek2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cek2ActionPerformed
        kolomlist3.removeAllItems();
        database3.removeAll();
        database4.removeAll();
        recordcol=0;
        recordrow=0;

        //MENAMPILKAN SOURCE MYSQL
        if(source.getSelectedItem() == "MySql"){
            try {

                DefaultTableModel tabel1 = new DefaultTableModel();
                DefaultTableModel tabel2 = new DefaultTableModel();
                Statement stat = c.createStatement();
                String kode = (String)tabellist1.getSelectedItem();
                ResultSet res = stat.executeQuery("SELECT COLUMN_NAME FROM "
                        + "INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+kode+"'");

                while (res.next()) {
                    tabel1.addColumn(res.getString(1));
                    kolomlist3.addItem(res.getString(1));
                    recordcol++;
                }

                ResultSet res1 = stat.executeQuery("SELECT * FROM "+kode+"");               
                while (res1.next()) {
                    recordrow++;
                }
                ResultSet res3 = stat.executeQuery("SELECT * FROM "+kode+"");
                while (res3.next()) {
                if (recordcol == 1) {  
                    tabel1.addRow(new String [] {res3.getString(1)});
                }  else if ( recordcol == 2) {
                    tabel1.addRow(new String [] {res3.getString(1), res3.getString(2)});
                }  else if ( recordcol == 3) {
                    tabel1.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3)});
                }  else if ( recordcol == 4) {
                    tabel1.addRow(new String []{res3.getString(1),res3.getString(2),res3.getString(3),res3.getString(4)}); 
                }  else if (recordcol == 5) {
                    tabel1.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5)});
                }  else if ( recordcol == 6) {
                    tabel1.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5), res3.getString(6)});
                }  else {
                    tabel1.addRow(new String [] {res3.getString(1), res3.getString(2), res3.getString(3), res3.getString(4), res3.getString(5), res3.getString(6), res3.getString(7)});              
                }     
                }
                database3.setModel(tabel1);

                tabel2.addColumn("Column Name");
                tabel2.addColumn("Data Type");
            
            

                ResultSet res2 = stat.executeQuery("SELECT COLUMN_NAME, COLUMN_TYPE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+kode+"'");

                while (res2.next()) {
                    tabel2.addRow(new String []{res2.getString(1),res2.getString(2) });

                }
                database4.setModel(tabel2);

            }
            catch (Exception e) {
                connect_act.setText(connect_act.getText()+"\n"+e);
                e.printStackTrace();
            }
        }

        //MENAMPILKAN SOURCE ORACLE
        else if (source.getSelectedItem() == "Oracle") {
            try {

                DefaultTableModel tabel3 = new DefaultTableModel();
                DefaultTableModel tabel4 = new DefaultTableModel();
                Statement stat = a.createStatement();
                String kode = (String)tabellist1.getSelectedItem();
                ResultSet res = stat.executeQuery("SELECT column_name FROM all_tab_cols "
                        + "WHERE table_name like '"+kode+"'");
                
             
                while (res.next()) {
                    
                    kolomlist3.addItem(res.getString(1));
                    tabel3.addColumn(res.getString(1));
                    recordcol++;
                }
               // JOptionPane.showMessageDialog(null, recordcol);

                ResultSet res0 = stat.executeQuery("SELECT * FROM "+kode+"");
                while (res0.next()) {
                    recordrow++;
                }
                
                ResultSet res10 = stat.executeQuery("SELECT * FROM "+kode+"");
                while (res10.next()) {
                if (recordcol == 1) {  
                    tabel3.addRow(new String [] {res10.getString(1)});
                }  else if ( recordcol == 2) {
                    tabel3.addRow(new String [] {res10.getString(1), res10.getString(2)});
                }  else if ( recordcol == 3) {
                    tabel3.addRow(new String [] {res10.getString(1), res10.getString(2), res10.getString(3)});
                }  else if ( recordcol == 4) {
                    tabel3.addRow(new String [] {res10.getString(1), res10.getString(2), res10.getString(3), res10.getString(4)});
                }  else if (recordcol == 5) {
                    tabel3.addRow(new String [] {res10.getString(1), res10.getString(2), res10.getString(3), res10.getString(4), res10.getString(5)});
                }  else if ( recordcol == 6) {
                    tabel3.addRow(new String [] {res10.getString(1), res10.getString(2), res10.getString(3), res10.getString(4), res10.getString(5), res10.getString(6)});
                }  else {
                    tabel3.addRow(new String [] {res10.getString(1), res10.getString(2), res10.getString(3), res10.getString(4), res10.getString(5), res10.getString(6), res10.getString(7)});              
                }     
                }
                               
                database3.setModel(tabel3);

                tabel4.addColumn("Column Name");
                tabel4.addColumn("Data Type");

                ResultSet res2 = stat.executeQuery("SELECT column_name, data_type FROM all_tab_cols WHERE table_name like '"+kode+"'");

                while (res2.next()) {
                    tabel4.addRow(new String []{res2.getString(1),res2.getString(2)});

                }

                database4.setModel(tabel4);

            }
            catch (Exception e) {
                connect_act.setText(connect_act.getText()+"\n"+e);
            }

            //MENAMPILKAN SOURCE MSSRVER
        } else if (source.getSelectedItem() == "MsServer") {
            try {

                DefaultTableModel tabel5 = new DefaultTableModel();
                DefaultTableModel tabel6 = new DefaultTableModel();
                Statement stat2 = con.createStatement();
                String kode = (String)tabellist1.getSelectedItem();
                ResultSet res = stat2.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS "
                        + "WHERE TABLE_NAME like '"+kode+"'");
                while (res.next()) {
                    kolomlist3.addItem(res.getString(1));
                    tabel5.addColumn(res.getString(1));
                    recordcol++;
                }

                ResultSet res7 = stat2.executeQuery("SELECT * FROM "+kode+"");

                while (res7.next()) {
                    recordrow++;
                }
                
               ResultSet res8 = stat2.executeQuery("SELECT * FROM "+kode+"");
               while (res8.next()) {
                if (recordcol == 1) {
                    tabel5.addRow(new String [] {res8.getString(1)});
                }  else if ( recordcol == 2) { 
                    tabel5.addRow(new String [] {res8.getString(1), res8.getString(2)}); 
                }  else if ( recordcol == 3) { 
                    tabel5.addRow(new String [] {res8.getString(1), res8.getString(2), res8.getString(3)}); 
                }  else if ( recordcol == 4) { 
                    tabel5.addRow(new String [] {res8.getString(1), res8.getString(2), res8.getString(3), res8.getString(4)}); 
                }  else if (recordcol == 5) {
                    tabel5.addRow(new String [] {res8.getString(1), res8.getString(2), res8.getString(3), res8.getString(4), res8.getString(5)});
                }  else if ( recordcol == 6) {
                    tabel5.addRow(new String [] {res8.getString(1), res8.getString(2), res8.getString(3), res8.getString(4), res8.getString(5), res8.getString(6)});
                }  else {
                    tabel5.addRow(new String [] {res8.getString(1), res8.getString(2), res8.getString(3), res8.getString(4), res8.getString(5), res8.getString(6), res8.getString(7)});              
                }     
                
               }
                database3.setModel(tabel5);

                tabel6.addColumn("Column Name");
                tabel6.addColumn("Data Type");

                ResultSet res2 = stat2.executeQuery("SELECT COLUMN_NAME, DATA_TYPE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME like '"+kode+"'");

                while (res2.next()) {
                    tabel6.addRow(new String []{res2.getString(1),res2.getString(2)});
                }
                database4.setModel(tabel6);

            }
            catch (Exception e) {
                connect_act.setText(connect_act.getText()+"\n"+e);
            }
        }
        
        connect_act.setText(connect_act.getText()+"\nChecked tab is running...\nChecked table information succes");
    }//GEN-LAST:event_cek2ActionPerformed

    private void migrate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_migrate1ActionPerformed

        int jumlah =0;
        String asal = (String) source.getSelectedItem();
        String tujuan = (String) target.getSelectedItem();
        String kode = (String) tabellist1.getSelectedItem();
        String kode1 = kode;
       
        //mysql ke oracle
        if(asal == "MySql" && tujuan == "Oracle") {
            connect_act.setText(connect_act.getText()+"\nMigration MySQL to Oracle is being started....");
            try {
                Statement stat = c.createStatement();
                ResultSet set = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+kode+"'");
                

                z = new String [jumlah];
                z1 = new String [jumlah][2];
                for(int i=0; i<jumlah;i++) {
                    z[i] = database3.getColumnName(i);
                }
            }
            catch (Exception e) {

            }
                  
             try {
                Statement stat1 = a.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stat1.execute("CREATE TABLE \""+kode+"\" (\""+z[i]+"\" VARCHAR2(255))");

                    } else {

                        stat1.executeQuery("ALTER TABLE \""+kode+"\" ADD (\""+z[i]+"\" VARCHAR2(255))");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }
            
             try {
                for(int i=0; i<recordrow; i++) {

                    Statement stut1 = a.createStatement();
                    stut1.execute("INSERT INTO "+kode+" ("+z[0]+") VALUES ('"+database3.getValueAt(i, 0)+"')");
                        for(int j=0; j< recordcol-1; j++) {
                        stut1 = a.createStatement();
                        stut1.execute("UPDATE "+kode+" SET "+z[j+1]+"= '"+database3.getValueAt(i, j+1)+"'"
                                + " WHERE "+z[0]+"= '"+database3.getValueAt(i, 0)+"'");
                    }
                }
                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
                connect_act.setText(connect_act.getText()+"\nMigration MySQL to Oracle succes");
            }
            catch (Exception e) {
                
               connect_act.setText(connect_act.getText()+"\nMigration MySQL to Oracle failed");
            }
             
            if (delete.isSelected()) {
                try {
                    Statement stat = c.createStatement();
                    stat.execute("DROP TABLE `"+kode+"`");
                } catch (SQLException ex) {
                    Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             
        }
        
        //MSSERVER KE ORACLE
        else if(asal == "MsServer" && tujuan == "Oracle") {
            connect_act.setText(connect_act.getText()+"\nMigration Microsoft SQL Server to Oracle is being started...");
            try {
                Statement stat = con.createStatement();
                ResultSet set = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME like '"+kode+"'");
                while (set.next()) {
                    jumlah++;
                }

                z = new String [jumlah];
                for(int i=0; i<jumlah;i++) {
                    z[i] = database3.getColumnName(i);
                }
            }
            catch (Exception e) {

            }
            
            try {
                Statement stat = a.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stat.execute("CREATE TABLE \""+kode+"\" (\""+z[i]+"\" VARCHAR2(255))");

                    } else {

                        stat.execute("ALTER TABLE \""+kode+"\" ADD (\""+z[i]+"\" VARCHAR2(255))");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }
            
            try {
                for(int i=0; i<recordrow; i++) {

                    Statement stut5 = a.createStatement();
                    stut5.execute("INSERT INTO "+kode+" ("+z[0]+") VALUES ('"+database3.getValueAt(i, 0)+"')");
                        for(int j=0; j< recordcol-1; j++) {
                        stut5 = a.createStatement();
                        stut5.execute("UPDATE "+kode+" SET "+z[j+1]+"= '"+database3.getValueAt(i, j+1)+"' WHERE "+z[0]+"= '"+database3.getValueAt(i, 0)+"'");
                    }
                }
                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
                connect_act.setText(connect_act.getText()+"\nMigration Microsoft SQL Server to Oracle succes");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
               connect_act.setText(connect_act.getText()+"\nMigration Microsoft SQL Server to Oracle succes");
            }
            
            if (delete.isSelected()) {
                try {
                    Statement stat = con.createStatement();
                    stat.execute("DROP TABLE "+kode);
                } catch (SQLException ex) {
                    Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //MIGRASI ORACLE KE MYSQL
        else if(asal == "Oracle" && tujuan == "MySql") {
            connect_act.setText(connect_act.getText()+"\nMigration Oracle to MySQL is being started....");
            try {
                Statement stat = a.createStatement();
                ResultSet set = stat.executeQuery("SELECT DISTINCT column_name FROM all_tab_cols "
                        + "WHERE table_name like '"+kode+"'");
               while (set.next()) {
                    jumlah++;
                }               
                z = new String [jumlah];
                for(int i=0; i<jumlah;i++) {
                    z[i] = database3.getColumnName(i);
                }
            }
            catch (Exception e) {
            }

            try {
                Statement stat = c.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stat.execute("CREATE TABLE `"+kode+"` (`"+z[i]+"` VARCHAR(255))");

                    } else {

                        stat.execute("ALTER TABLE `"+kode+"` ADD (`"+z[i]+"` VARCHAR(255))");
                    }
                }
                
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            
            try {
                for(int i=0; i<recordrow; i++) {

                    Statement stut = c.createStatement();
                    stut.execute("INSERT INTO `"+kode+"` (`"+z[0]+"`) VALUES (\""+database3.getValueAt(i, 0)+"\")");
                    for(int j=0; j< recordcol-1; j++) {
                        stut = c.createStatement();
                        stut.execute("UPDATE `"+kode+"` SET "+z[j+1]+"= \""+database3.getValueAt(i, j+1)+"\""
                                + " WHERE "+z[0]+"= '"+database3.getValueAt(i, 0)+"'");
                    }
                }
                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
                connect_act.setText(connect_act.getText()+"\nMigration Oracle to MySQL succes");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
                connect_act.setText(connect_act.getText()+"\nMigration Oracle to MySQL failed\n"+e);
            }
            
            if (delete.isSelected()) {
                try {
                    Statement stat = a.createStatement();
                    stat.execute("DROP TABLE \""+kode+"\"");
                } catch (SQLException ex) {
                    Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
                }

         }
        }

        //MYSQL KE MSSERVER
        else if(asal == "MySql" && tujuan == "MsServer") {
            connect_act.setText(connect_act.getText()+"\nMigration MySQL to Microsoft SQL Server is being started....");
            try {
                Statement stat = c.createStatement();
                ResultSet set = stat.executeQuery("SELECT COLUMN_NAME, COLUMN_TYPE FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = '"+kode+"'");
                while (set.next()) {
                    jumlah++;
                }
                z = new String [jumlah];

                
                for(int i=0; i<jumlah;i++) {
                    z[i] = database3.getColumnName(i);                   
                }
            }
            catch (Exception e) {

            }
            
            try {
                Statement stat = con.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stat.execute("CREATE TABLE [dbo].["+kode+"] (["+z[i]+"] VARCHAR(255))");
                        
                    } else {
                        stat.execute("ALTER TABLE [dbo].["+kode+"] ADD ["+z[i]+"] VARCHAR(255)");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }

            try {
                for(int i=0; i<recordrow; i++) {

                    Statement stut = con.createStatement();
                    stut.execute("INSERT INTO "+kode+" ("+z[0]+") VALUES ('"+database3.getValueAt(i, 0)+"')");
                    for(int j=0; j< recordcol-1; j++) {
                        stut = con.createStatement();
                        stut.execute("UPDATE "+kode+" SET "+z[j+1]+"= '"+database3.getValueAt(i, j+1)+"'"
                                + " WHERE "+z[0]+"= '"+database3.getValueAt(i, 0)+"'");
                    }
                }
                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
               
                connect_act.setText(connect_act.getText()+"\nMigration MySQL to Microsoft SQL Server succes");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
                connect_act.setText(connect_act.getText()+"\nMigration MySQL to Microsoft SQL Server failes\n"+e);
            }
            
            if (delete.isSelected()) {
                try {
                    Statement stat = c.createStatement();
                    stat.execute("DROP TABLE `"+kode+"`");
                } catch (SQLException ex) {
                    Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }

        //MSSERVER KE SQL
        else if(asal == "MsServer" && tujuan == "MySql") {
            connect_act.setText(connect_act.getText()+"\nMigration Microsoft SQL Server to MySql is being started...");
            try {
                Statement stat = con.createStatement();
                ResultSet set = stat.executeQuery("SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME like '"+kode+"'");
                while (set.next()) {
                    jumlah++;
                }

                z = new String [jumlah];
                for(int i=0; i<jumlah;i++) {
                    z[i] = database3.getColumnName(i);
                }
            }
            catch (Exception e) {

            }

            try {
                Statement stat = c.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stat.execute("CREATE TABLE `"+kode+"` (`"+z[i]+"` VARCHAR(255))");

                    } else {

                        stat.execute("ALTER TABLE `"+kode+"` ADD (`"+z[i]+"` VARCHAR(255))");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }

            try {
                for(int i=0; i<recordrow; i++) {

                    Statement stut = c.createStatement();
                    stut.execute("INSERT INTO `"+kode+"` (`"+z[0]+"`) VALUES (\""+database3.getValueAt(i, 0)+"\")");
                    for(int j=0; j< recordcol-1; j++) {
                        stut = c.createStatement();
                        stut.execute("UPDATE `"+kode+"` SET "+z[j+1]+"= \""+database3.getValueAt(i, j+1)+"\" WHERE "+z[0]+"= '"+database3.getValueAt(i, 0)+"'");
                    }
                }
                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
                connect_act.setText(connect_act.getText()+"\nMigration Microsoft SQL Server to MySQL Server succes");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Fully Completed\n");
                connect_act.setText(connect_act.getText()+"\nMigration Microsoft SQL Server to MySQL Server failed"+e);
            }
            
            if (delete.isSelected()) {
                try {
                    Statement stat = con.createStatement();
                    stat.execute("DROP TABLE "+kode);
                } catch (SQLException ex) {
                    Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
        //ORACLE KE MSSERVER
        else if(asal == "Oracle" && tujuan == "MsServer") {
            connect_act.setText(connect_act.getText()+"\nMigration Oracle to Microsoft SQL Server Server is being started");
            try {
                Statement stat = a.createStatement();
                ResultSet set = stat.executeQuery("SELECT column_name FROM all_tab_cols WHERE table_name like '"+kode+"'");
                while (set.next()) {
                    jumlah++;
                }

                z = new String [jumlah];
                z1 = new String [jumlah][2];
                for(int i=0; i<jumlah;i++) {
                    z[i] = database3.getColumnName(i);
                }
            }
            catch (Exception e) {
            }

            try {
                Statement stat = con.createStatement();
                for (int i=0 ; i<jumlah; i++) {
                    if(i==0) {
                        stat.execute("CREATE TABLE [dbo].["+kode+"] (["+z[i]+"] [VARCHAR](255))");

                    } else {

                        stat.execute("ALTER TABLE [dbo].["+kode+"] ADD ["+z[i]+"] VARCHAR(255)");
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();

            }

            try {
                for(int i=0; i<recordrow; i++) {

                    Statement stut = con.createStatement();
                    stut.execute("INSERT INTO "+kode+" ("+z[0]+") VALUES ('"+database3.getValueAt(i, 0)+"')");
                    for(int j=0; j< recordcol-1; j++) {
                        stut = con.createStatement();
                        stut.execute("UPDATE "+kode+" SET "+z[j+1]+"= '"+database3.getValueAt(i, j+1)+"' WHERE "+z[0]+"= '"+database3.getValueAt(i, 0)+"'");
                    }
                }
                JOptionPane.showMessageDialog(null, "Migration Fully Completed");
                connect_act.setText(connect_act.getText()+"\nMigration Oracle to Microsoft SQL Server succes");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Migration Failed");
                connect_act.setText(connect_act.getText()+"\nMigration Oracle to Microsoft SQL Server failed\n"+e);
            }
            
            if (delete.isSelected()) {
                try {
                    Statement stat = a.createStatement();
                    stat.execute("DROP TABLE "+kode);
                } catch (SQLException ex) {
                    Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
     }
    }//GEN-LAST:event_migrate1ActionPerformed

    private void tabellist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabellist1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabellist1ActionPerformed

    private void loginservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginservActionPerformed
        try {
            getKoneksisqlserver();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginservActionPerformed

    private void userservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userservActionPerformed

    private void passora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passora1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passora1ActionPerformed

    private void loginoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginoraActionPerformed
        try {
            getKoneksioracle();
        } catch (SQLException ex) {
            Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginoraActionPerformed

    private void loginsqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginsqlActionPerformed
        getKoneksisql();
    }//GEN-LAST:event_loginsqlActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void hasilkolomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilkolomActionPerformed
        
    }//GEN-LAST:event_hasilkolomActionPerformed

    private void hasiltupleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasiltupleActionPerformed

    }//GEN-LAST:event_hasiltupleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i =0;
        String text = connect_act.getText();
       File log = new File ("Log activities ("+(++i)+").txt");
        try {
            if (log.exists() == false) {
                JOptionPane.showMessageDialog(null, "Log activities saved succesfully");
                log.createNewFile();
            }
            
            PrintWriter out = new PrintWriter(new FileWriter (log, true));
            out.append(text).println();
            
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(Migrasi.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Failed to load the log activities");
        }
    }//GEN-LAST:event_jButton2ActionPerformed
  
  private void ratatengah() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
    
    for(int i=0; i<recordcol; i++) {
        database3.getColumnModel().getColumn(i).setCellRenderer(centerRenderer); 
    }
    
//    for(int i=0; i<1; i++) {
//        database4.getColumnModel().getColumn(i).setCellRenderer(centerRenderer); 
//    }
    
    
    penampungan.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    
    
    for(int i=0; i<jumlah2; i++) {
         database2.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
      
    
    
    
    }
    
   int i=0; 
    
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        } finally{
            //new Migrasi().setVisible(true);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Migrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cek2;
    private javax.swing.JCheckBox checkboxtarget;
    private java.awt.TextArea connect_act;
    private javax.swing.JTable database2;
    private javax.swing.JTable database3;
    private javax.swing.JTable database4;
    private javax.swing.JCheckBox delete;
    private javax.swing.JTextField hasilkolom;
    private javax.swing.JTextField hasiltuple;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JComboBox<String> kolomlist1;
    private javax.swing.JComboBox<String> kolomlist3;
    private javax.swing.JButton loginora;
    private javax.swing.JButton loginserv;
    private javax.swing.JButton loginsql;
    private javax.swing.JButton migrate1;
    private javax.swing.JButton migrate2;
    private javax.swing.JButton migrate3;
    private javax.swing.JPasswordField passora1;
    private javax.swing.JPasswordField passserv;
    private javax.swing.JTable penampungan;
    private javax.swing.JButton scan;
    private javax.swing.JComboBox<String> source;
    private javax.swing.JComboBox<String> tabellist1;
    private javax.swing.JComboBox<String> tabellist2;
    private javax.swing.JComboBox<String> tabellist3;
    private javax.swing.JComboBox<String> tabeltarget;
    private javax.swing.JComboBox<String> target;
    private javax.swing.JButton tes1;
    private javax.swing.JTextField userora;
    private javax.swing.JTextField userserv;
    private javax.swing.JTextField usersql;
    // End of variables declaration//GEN-END:variables
}
