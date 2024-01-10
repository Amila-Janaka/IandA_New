package frames;

import classes.Customer;
import classes.DBConnection;
import classes.Employee;
import classes.Item;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class AfterAdminLogin extends javax.swing.JFrame {

    Connection con = new DBConnection().dbConn();
    DefaultTableModel itemTBL = new DefaultTableModel(new String[]{"Item ID", "Item Name", "Supplier Name", "Supplier Address", "Supplier Mobile"}, 0);
    DefaultTableModel empTBL = new DefaultTableModel(new String[]{"Employee ID", "Employee Name", "Employee Mobile", "Employee Email", "Employee Address", "Employee Gender"}, 0);
    DefaultTableModel customerTBL = new DefaultTableModel(new String[]{"Customer ID", "Customer Name", "Customer Mobile"}, 0);

    public AfterAdminLogin() {
        initComponents();
        jTable1.setModel(itemTBL);
        jTable2.setModel(empTBL);
        jTable3.setModel(customerTBL);
        setDefaults();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EmpGenderBTN = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemID = new javax.swing.JTextField();
        itemName = new javax.swing.JTextField();
        supName = new javax.swing.JTextField();
        supAddress = new javax.swing.JTextField();
        supMobile = new javax.swing.JTextField();
        btnItemAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        itemCombo = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        empID = new javax.swing.JTextField();
        empName = new javax.swing.JTextField();
        empEmail = new javax.swing.JTextField();
        empAddress = new javax.swing.JTextField();
        empMobile = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        empPass = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        empCombo = new javax.swing.JComboBox<>();
        empTXT = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cusID = new javax.swing.JTextField();
        cusName = new javax.swing.JTextField();
        cusMobile = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        cusCombo = new javax.swing.JComboBox<>();
        cusTXT = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel1.setText("Item ID");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel2.setText("Item Name");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel3.setText("Supplier Name");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel4.setText("Supplir Address");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jLabel5.setText("Mobile Number");

        itemID.setEditable(false);

        btnItemAdd.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        btnItemAdd.setText("Add");
        btnItemAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemAddActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemID)
                            .addComponent(itemName)
                            .addComponent(supName)
                            .addComponent(supAddress)
                            .addComponent(supMobile)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnItemAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(supName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(supAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(supMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnItemAdd)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        itemCombo.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        itemCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "itemID ", "itemName", "supplierName", "supplierAddress", "supplierMobile\t" }));

        jTextField6.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField6CaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(itemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Item", jPanel2);

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Emp ID");

        jLabel7.setText("Emp Name");

        jLabel8.setText("Password");

        jLabel9.setText("Email");

        jLabel10.setText("Address");

        jLabel11.setText("Mobile Number");

        jLabel12.setText("Gender");

        empID.setEditable(false);

        EmpGenderBTN.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Male");

        EmpGenderBTN.add(jRadioButton2);
        jRadioButton2.setText("Female");

        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Reset");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Delete");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empID)
                            .addComponent(empName)
                            .addComponent(empEmail)
                            .addComponent(empAddress)
                            .addComponent(empMobile)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(empPass)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(empID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(empName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(empPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(empEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(empAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(empMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        empCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "empID", "empName", "empMobile", "empEmail", "empAddress", "empGender" }));

        empTXT.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                empTXTCaretUpdate(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(empCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empTXT)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add Employee", jPanel3);

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setText("Customer ID");

        jLabel14.setText("Customer Name");

        jLabel15.setText("Mobile Number");

        cusID.setEditable(false);

        jButton9.setText("Add");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Update");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Reset");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Delete");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cusID)
                            .addComponent(cusName)
                            .addComponent(cusMobile)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cusID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cusName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cusMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        cusCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cusID ", "cusName", "cusMobile" }));

        cusTXT.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cusTXTCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(cusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cusTXT)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cusTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Add customer", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // Display confirmation dialog
        int choice = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to update?",
                "Update Confirmation", JOptionPane.YES_NO_OPTION);

        // Check user's choice
        if (choice == JOptionPane.YES_OPTION) {
            // Perform the update action
            if (isCusValidated()) {

                String cusID = this.cusID.getText();
                String cusName = this.cusName.getText();
                String cusMobile = this.cusMobile.getText();

                try {
//                    UPDATE your_table
//                    SET column_to_update = 'new_value'
//                    WHERE id = your_target_id;

                    String query = "UPDATE customer SET cusName = ?,cusMobile = ? WHERE cusID = ?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, cusName);
                    pst.setString(2, cusMobile);
                    pst.setString(3, cusID);
                    pst.execute();
                    JOptionPane.showMessageDialog(this, "Successfully Updated");
                    setCusTableData("SELECT * FROM customer");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
                }
            }
        } else {
            // Do nothing or handle the "No" case
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnItemAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemAddActionPerformed
        if (isItemValidated()) {

            String itemName = this.itemName.getText();
            String supplierName = supName.getText();
            String supplierAddress = supAddress.getText();
            String supplierMobile = supMobile.getText();

            try {
                String query = "INSERT INTO item VALUES(Null,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, itemName);
                pst.setString(2, supplierName);
                pst.setString(3, supplierAddress);
                pst.setString(4, supplierMobile);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully Inserted");
                setItemTableData("SELECT * FROM item");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnItemAddActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String empName = this.empName.getText();
        String empMobile = this.empMobile.getText();
        String empEmail = this.empEmail.getText();
        String empAddress = this.empAddress.getText();
        String empPassword = empPass.getText();
        String empGender = (jRadioButton1.isSelected()) ? "Male" : "Female";

        try {
            String query = "INSERT INTO employee VALUES(Null,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, empName);
            pst.setString(2, empMobile);
            pst.setString(3, empEmail);
            pst.setString(4, empAddress);
            pst.setString(5, empPassword);
            pst.setString(6, empGender);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Successfully Inserted");
            setEmpTableData("SELECT * FROM employee");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField6CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField6CaretUpdate
        if (jTextField6.getText().isEmpty()) {
            setItemTableData("SELECT * FROM item");
        } else {
//        "SELECT * FROM table WHERE column LIKE '%data%'"
            String column = itemCombo.getSelectedItem().toString();
            String search = jTextField6.getText();
            setItemTableData("SELECT * FROM item WHERE " + column + " LIKE '%" + search + "%'");
        }
    }//GEN-LAST:event_jTextField6CaretUpdate

    private void empTXTCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_empTXTCaretUpdate
        if (empTXT.getText().isEmpty()) {
            setEmpTableData("SELECT * FROM employee");
        } else {
//        "SELECT * FROM table WHERE column LIKE '%data%'"
            String column = empCombo.getSelectedItem().toString();
            String search = empTXT.getText();
            setEmpTableData("SELECT * FROM employee WHERE " + column + " LIKE '%" + search + "%'");
        }
    }//GEN-LAST:event_empTXTCaretUpdate

    private void cusTXTCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cusTXTCaretUpdate
        if (cusTXT.getText().isEmpty()) {
            setCusTableData("SELECT * FROM customer");
        } else {
//        "SELECT * FROM table WHERE column LIKE '%data%'"
            String column = cusCombo.getSelectedItem().toString();
            String search = cusTXT.getText();
            setCusTableData("SELECT * FROM customer WHERE " + column + " LIKE '%" + search + "%'");
        }
    }//GEN-LAST:event_cusTXTCaretUpdate

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (isCusValidated()) {

            String cusName = this.cusName.getText();
            String cusMobile = this.cusMobile.getText();

            try {
                String query = "INSERT INTO customer VALUES(Null,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, cusName);
                pst.setString(2, cusMobile);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully Inserted");
                setCusTableData("SELECT * FROM customer");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (jTable1.getSelectedRowCount() == 1) {
            clearItem();
            int index = jTable1.getSelectedRow();
            itemID.setText(itemTBL.getValueAt(index, 0).toString());
            itemName.setText(itemTBL.getValueAt(index, 1).toString());
            supName.setText(itemTBL.getValueAt(index, 2).toString());
            supAddress.setText(itemTBL.getValueAt(index, 3).toString());
            supMobile.setText(itemTBL.getValueAt(index, 4).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearItem();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void clearItem() {
        itemID.setText("");
        itemName.setText("");
        supName.setText("");
        supAddress.setText("");
        supMobile.setText("");
    }
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        if (jTable2.getSelectedRowCount() == 1) {
            clearEmp();
            int index = jTable2.getSelectedRow();
            empID.setText(empTBL.getValueAt(index, 0).toString());
            empName.setText(empTBL.getValueAt(index, 1).toString());
            empEmail.setText(empTBL.getValueAt(index, 2).toString());
            empAddress.setText(empTBL.getValueAt(index, 3).toString());
            empMobile.setText(empTBL.getValueAt(index, 4).toString());
            if (empTBL.getValueAt(index, 5).toString().equals("Male")) {
                jRadioButton1.setSelected(true);
            } else {
                jRadioButton2.setSelected(true);
            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        clearEmp();
    }//GEN-LAST:event_jButton7ActionPerformed
    private void clearEmp() {
        empID.setText("");
        empName.setText("");
        empPass.setText("");
        empEmail.setText("");
        empAddress.setText("");
        empMobile.setText("");
        jRadioButton1.setSelected(true);
    }
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        if (jTable3.getSelectedRowCount() == 1) {
            clearCustom();
            int index = jTable3.getSelectedRow();
            cusID.setText(customerTBL.getValueAt(index, 0).toString());
            cusName.setText(customerTBL.getValueAt(index, 1).toString());
            cusMobile.setText(customerTBL.getValueAt(index, 2).toString());
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        clearCustom();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "are you sure DELETE course details", "Conform", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if (jTable1.getSelectedRowCount() == 1) {
                int index = jTable1.getSelectedRow();
                try {
                    String query = "DELETE FROM item WHERE itemID=?";
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, itemTBL.getValueAt(index, 0).toString());
                    pst.execute();
                    JOptionPane.showMessageDialog(this, "Successfully Deleted");
                    setItemTableData("SELECT * FROM item");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
                }

            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (jTable2.getSelectedRowCount() == 1) {
            int index = jTable2.getSelectedRow();
            try {
                String query = "DELETE FROM employee WHERE empID =?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, empTBL.getValueAt(index, 0).toString());
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully Deleted");
                setEmpTableData("SELECT * FROM employee");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
            }

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (jTable3.getSelectedRowCount() == 1) {
            int index = jTable3.getSelectedRow();
            try {
                String query = "DELETE FROM customer WHERE cusID =?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, customerTBL.getValueAt(index, 0).toString());
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully Deleted");
                setCusTableData("SELECT * FROM customer");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
            }

        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Display confirmation dialog
        int choice = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to update?",
                "Update Confirmation", JOptionPane.YES_NO_OPTION);

        // Check user's choice
        if (choice == JOptionPane.YES_OPTION) {
            // Perform the update action
            if (isItemValidated()) {

                String iID = this.itemID.getText();
                String iName = this.itemName.getText();
                String sName = this.supName.getText();
                String sAddress = this.supAddress.getText();
                String sMobile = this.supMobile.getText();

                try {
//                    UPDATE your_table
//                    SET column_to_update = 'new_value'
//                    WHERE id = your_target_id;

                    String query = "UPDATE item SET itemName = ?,supplierName = ?,supplierAddress = ?,supplierMobile = ? WHERE itemID  = ?";
                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, iName);
                    pst.setString(2, sName);
                    pst.setString(3, sAddress);
                    pst.setString(4, sMobile);
                    pst.setString(5, iID);
                    pst.execute();
                    JOptionPane.showMessageDialog(this, "Successfully Updated");
                    setItemTableData("SELECT * FROM item");
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
                }
            }
        } else {
            // Do nothing or handle the "No" case
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Display confirmation dialog
        int choice = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to update?",
                "Update Confirmation", JOptionPane.YES_NO_OPTION);

        // Check user's choice
        if (choice == JOptionPane.YES_OPTION) {
            // Perform the update action

            String empID = this.empID.getText();
            String empName = this.empName.getText();
            String empMobile = this.empMobile.getText();
            String empEmail = this.empEmail.getText();
            String empAddress = this.empAddress.getText();
//                String empPassword = empPass.getName();
            String empGender = (jRadioButton1.isSelected()) ? "Male" : "Female";

            try {
//                    UPDATE your_table
//                    SET column_to_update = 'new_value'
//                    WHERE id = your_target_id;

                String query = "UPDATE employee SET empName = ?,empMobile = ?, empEmail = ?, empAddress = ?, empGender = ? WHERE empID = ?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, empName);
                pst.setString(2, empMobile);
                pst.setString(3, empEmail);
                pst.setString(4, empAddress);
                pst.setString(5, empGender);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Successfully Updated");
                setCusTableData("SELECT * FROM employee");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error : " + e.getMessage());
            }
        } else {
            // Do nothing or handle the "No" case
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    private void clearCustom() {
        cusID.setText("");
        cusName.setText("");
        cusMobile.setText("");
    }

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(() -> {
            new AfterAdminLogin().setVisible(true);
        });
    }

    private void setDefaults() {
        setItemTableData("SELECT * FROM item");
        setEmpTableData("SELECT * FROM employee");
        setCusTableData("SELECT * FROM customer");
    }

    private ArrayList<Item> getItemList(String query) {
        //create array list
        ArrayList<Item> datalist = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Item item;
            while (rs.next()) {
                item = new Item(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                datalist.add(item);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error " + e.getMessage());
        }
        return datalist;
    }

    private ArrayList<Employee> getEmployeeList(String query) {
        //create array list
        ArrayList<Employee> datalist = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Employee employee;
            while (rs.next()) {
                employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                datalist.add(employee);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error " + e.getMessage());
        }
        return datalist;
    }

    private ArrayList<Customer> getCustomerList(String query) {
        //create array list
        ArrayList<Customer> datalist = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Customer customer;
            while (rs.next()) {
                customer = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3));
                datalist.add(customer);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error " + e.getMessage());
        }
        return datalist;
    }

    private void setItemTableData(String query) {
        itemTBL.setRowCount(0);
        ArrayList<Item> temp = getItemList(query);
        for (int i = 0; i < temp.size(); i++) {
            int itemID = temp.get(i).getItemID();
            String itemName = temp.get(i).getItemName();
            String supplierName = temp.get(i).getSupplierName();
            String supplierAddress = temp.get(i).getSupplierAddress();
            String supplierMobile = temp.get(i).getSupplierMobile();
            itemTBL.addRow(new Object[]{itemID, itemName, supplierName, supplierAddress, supplierMobile});
        }
    }

    private void setEmpTableData(String query) {
        empTBL.setRowCount(0);
        ArrayList<Employee> temp = getEmployeeList(query);
        for (int i = 0; i < temp.size(); i++) {
            int empID = temp.get(i).getEmpID();
            String empName = temp.get(i).getEmpName();
            String empMobile = temp.get(i).getEmpMobile();
            String empEmail = temp.get(i).getEmpEmail();
            String empAddress = temp.get(i).getEmpAddress();
            String empGender = temp.get(i).getEmpGender();
            empTBL.addRow(new Object[]{empID, empName, empMobile, empEmail, empAddress, empGender});
        }
    }

    private void setCusTableData(String query) {
        customerTBL.setRowCount(0);
        ArrayList<Customer> temp = getCustomerList(query);
        for (int i = 0; i < temp.size(); i++) {
            int cusID = temp.get(i).getCusID();
            String cusName = temp.get(i).getCusName();
            String cusMobile = temp.get(i).getCusMobile();
            customerTBL.addRow(new Object[]{cusID, cusName, cusMobile});
        }
    }

    private boolean isItemValidated() {
        if (!Pattern.matches("[A-Z a-z]{1,300}", itemName.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Item Name Please Check");
            return false;
        }
        if (!Pattern.matches("[A-Z a-z]{1,300}", supName.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Supplier Name Please Check");
            return false;
        }
        if (!Pattern.matches("[A-Z a-z 0-9 / ,]{1,300}", supAddress.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Supplier Address Please Check");
            return false;
        }
        if (!Pattern.matches("[0-9]{10}", supMobile.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Supplier Mobile Please Check");
            return false;
        }

        return true;
    }

    private boolean isCusValidated() {
        if (!Pattern.matches("[A-Z a-z]{1,300}", cusName.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Customer Name Please Check");
            return false;
        }
        if (!Pattern.matches("[0-9]{10}", cusMobile.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Customer Mobile Please Check");
            return false;
        }

        return true;
    }

//    private boolean isEmpValidated() {
//        if (!Pattern.matches("[A-Z a-z]{1,300}", empName.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Name Please Check");
//            return false;
//        }
//        if (!Pattern.matches("[A-Z a-z]{1,300}", empPass.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee password Please Check");
//            return false;
//        }
//        if (!Pattern.matches("[a-z0-9].{1,150}[@][a-z0-9]{1,30}.[a-z][1,18]", empEmail.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Email Please Check");
//            return false;
//        }
//        if (!Pattern.matches("[A-Z a-z 0-9 / ,]{1,300}", empAddress.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Address Please Check");
//            return false;
//        }
//        if (!Pattern.matches("[0-9]{10}", empMobile.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Mobile Please Check");
//            return false;
//        }
//
//        return true;
//    }
//    private boolean isEmpValidated() {
//    if (!Pattern.matches("[A-Za-z ]{1,300}", empName.getText())) {
//        JOptionPane.showMessageDialog(this, "Invalid Employee Name. Please check.");
//        return false;
//    }
//
//    if (!Pattern.matches(".{1,300}", empPass.getText())) {
//        JOptionPane.showMessageDialog(this, "Invalid Employee Password. Please check.");
//        return false;
//    }
//
//    // Improved email validation regex
//    String emailRegex = "^[A-Za-z0-9_+&*-]+(?:\\.[A-Za-z0-9_+&*-]+)*@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,7}$";
//    if (!Pattern.matches(emailRegex, empEmail.getText())) {
//        JOptionPane.showMessageDialog(this, "Invalid Employee Email. Please check.");
//        return false;
//    }
//
//    if (!Pattern.matches("[A-Za-z0-9/ ,]{1,300}", empAddress.getText())) {
//        JOptionPane.showMessageDialog(this, "Invalid Employee Address. Please check.");
//        return false;
//    }
//
//    if (!Pattern.matches("\\d{10}", empMobile.getText())) {
//        JOptionPane.showMessageDialog(this, "Invalid Employee Mobile. Please check.");
//        return false;
//    }
//
//    return true;
//}
//    private boolean isEmpValidated() {
//        if (!Pattern.matches("[A-Za-z ]{1,300}", empName.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Name. Please check.");
//            return false;
//        }
//
//        if (!Pattern.matches("^(?=.*[0-9]).{8,}$", empPass.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Password. Please check.");
//            return false;
//        }
//
//        if (!Pattern.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Z|a-z]{2,}$", empEmail.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Email. Please check.");
//            return false;
//        }
//
//        if (!Pattern.matches("[A-Za-z0-9/ ,]{1,300}", empAddress.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Address. Please check.");
//            return false;
//        }
//
//        if (!Pattern.matches("\\d{10}", empMobile.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Mobile. Please check.");
//            return false;
//        }
//
//        return true;
//    }
//    private boolean isValidEmail(String email) {
//        // Simple email validation, adjust as needed
//        return email.matches("^[A-Za-z0-9_+&*-]+(?:\\.[A-Za-z0-9_+&*-]+)*@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,7}$");
//    }
//
//    private boolean isEmpValidationforUpdate() {
//        if (!Pattern.matches("[A-Z a-z]{1,300}", empName.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Name Please Check");
//            return false;
//        }
////        if (!Pattern.matches("[A-Z a-z]{1,300}", empPass.getText())) {
////            JOptionPane.showMessageDialog(this, "Invalid Employee password Please Check");
////            return false;
////        }
//        if (!Pattern.matches("[a-z0-9].{1,150}[@][a-z0-9]{1,30}.[a-z][1,18]", empEmail.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Email Please Check");
//            return false;
//        }
//        if (!Pattern.matches("[A-Z a-z 0-9 / ,]{1,300}", empAddress.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Address Please Check");
//            return false;
//        }
//        if (!Pattern.matches("[0-9]{10}", empMobile.getText())) {
//            JOptionPane.showMessageDialog(this, "Invalid Employee Mobile Please Check");
//            return false;
//        }
//
//        return true;
//    }
    public final void close() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MainFrame mainObj = new MainFrame();
                mainObj.show();
                dispose();
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup EmpGenderBTN;
    private javax.swing.JButton btnItemAdd;
    private javax.swing.JComboBox<String> cusCombo;
    private javax.swing.JTextField cusID;
    private javax.swing.JTextField cusMobile;
    private javax.swing.JTextField cusName;
    private javax.swing.JTextField cusTXT;
    private javax.swing.JTextField empAddress;
    private javax.swing.JComboBox<String> empCombo;
    private javax.swing.JTextField empEmail;
    private javax.swing.JTextField empID;
    private javax.swing.JTextField empMobile;
    private javax.swing.JTextField empName;
    private javax.swing.JPasswordField empPass;
    private javax.swing.JTextField empTXT;
    private javax.swing.JComboBox<String> itemCombo;
    private javax.swing.JTextField itemID;
    private javax.swing.JTextField itemName;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField supAddress;
    private javax.swing.JTextField supMobile;
    private javax.swing.JTextField supName;
    // End of variables declaration//GEN-END:variables
}
