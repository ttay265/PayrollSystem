/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import DBUltilities.BusinessProcess;
import entities.Employee;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author ttay2
 */
public class EmployeeDetailForm extends javax.swing.JPanel {
    
    Employee displayedEmp = new Employee();
    JDatePickerImpl dpDoB = null;
    JDatePickerImpl dpVisa = null;
    JDatePickerImpl dpJD = null;
    boolean editable = false;

    /**
     * Creates new form EmployeeDetailForm
     */
    public EmployeeDetailForm() {
        initComponents();
        initDP();
    }
    
    private void initDP() {
        JFormattedTextField.AbstractFormatter af = new JFormattedTextField.AbstractFormatter() {
            private String datePattern = "dd-MMM-yyyy";
            private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);
            
            @Override
            public Object stringToValue(String string) throws ParseException {
                return dateFormatter.parseObject(string);
            }
            
            @Override
            public String valueToString(Object o) throws ParseException {
                if (o != null) {
                    Calendar cal = (Calendar) o;
                    return dateFormatter.format(cal.getTime());
                }
                return "";
            }
        };
        
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        dpDoB = new JDatePickerImpl(datePanel, af);
        dpDoB.setPreferredSize(new Dimension(195, 45));
        JFormattedTextField tf = dpDoB.getJFormattedTextField();
        tf.setPreferredSize(new Dimension(195, 30));
        Font font = new Font("Tahoma", 0, 16);
        tf.setFont(font);
        dpDoB.setShowYearButtons(false);
        dpDoB.setTextEditable(editable);
        panelDoB.add(dpDoB);
        
        UtilDateModel model2 = new UtilDateModel();
        JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p);
        dpJD = new JDatePickerImpl(datePanel2, af);
        dpJD.setPreferredSize(new Dimension(195, 45));
        tf = dpJD.getJFormattedTextField();
        tf.setPreferredSize(new Dimension(195, 30));
        tf.setFont(font);
        dpJD.setShowYearButtons(false);
        dpJD.setTextEditable(editable);
        panelJoinDate.add(dpJD);
        
        UtilDateModel model3 = new UtilDateModel();
        JDatePanelImpl datePanel3 = new JDatePanelImpl(model3, p);
        dpVisa = new JDatePickerImpl(datePanel3, af);
        dpVisa.setPreferredSize(new Dimension(195, 45));
        tf = dpVisa.getJFormattedTextField();
        tf.setPreferredSize(new Dimension(195, 30));
        tf.setFont(font);
        dpVisa.setShowYearButtons(false);
        dpVisa.setTextEditable(editable);
        panelVisa.add(dpVisa);
    }
    
    private void displayEmpData(Employee emp) {
        txtEmpId.setText(emp.getEmpId() + "");
        txtFullName.setText(emp.getFullName());
        txtUaeId.setText(emp.getUaeId());
        Calendar cal = Calendar.getInstance();
        Date visaRenew = emp.getVisaRenew();
        cal.setTime(visaRenew);
        dpVisa.getModel().setDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        txtCell1.setText(emp.getCell1());
        txtCell2.setText(emp.getCell2());
        txtCell3.setText(emp.getCell3());
        txtCardNo.setText(emp.getBankCardNo());
        Date dob = emp.getDOB();
        cal.setTime(dob);
        dpDoB.getModel().setDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        txtPassportNo.setText(emp.getPassportNo());
        txtSalary.setText(emp.getSalary());
        txtWPS.setText(emp.getWPS());
        Date jd = emp.getJoinDate();
        cal.setTime(jd);
        dpJD.getModel().setDate(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH));
        txtMMName.setText(emp.getMMName());
        txtRemark.setText(emp.getRemarks());
        txtDesignation.setText(emp.getDesignation());
    }
    
    private void clearEmpDetailForm() {
        txtEmpId.setText("");
        txtFullName.setText("");
        txtUaeId.setText("");
        Calendar cal = Calendar.getInstance();
        Date visaRenew = new Date();
        cal.setTime(visaRenew);
        dpVisa.getJFormattedTextField().setText("");
        txtCell1.setText("");
        txtCell2.setText("");
        txtCell3.setText("");
        txtCardNo.setText("");
        Date dob = new Date();
        cal.setTime(dob);
        dpDoB.getJFormattedTextField().setText("");
        txtPassportNo.setText("");
        txtSalary.setText("");
        txtWPS.setText("");
        Date jd = new Date();
        cal.setTime(jd);
        dpJD.getJFormattedTextField().setText("");
        txtMMName.setText("");
        txtRemark.setText("");
        txtDesignation.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        panelDoB = new javax.swing.JPanel();
        txtCell1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCell2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCell3 = new javax.swing.JTextField();
        txtPassportNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelVisa = new javax.swing.JPanel();
        panelJoinDate = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtUaeId = new javax.swing.JTextField();
        txtMMName = new javax.swing.JTextField();
        txtDesignation = new javax.swing.JTextField();
        txtCardNo = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtWPS = new javax.swing.JTextField();
        txtRemark = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Employee ID/Name");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setVisible(false);
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Employee ID");

        txtEmpId.setEditable(false);
        txtEmpId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtEmpId.setPreferredSize(new java.awt.Dimension(50, 35));
        txtEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");

        txtFullName.setEditable(false);
        txtFullName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtFullName.setPreferredSize(new java.awt.Dimension(50, 35));
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Date of Birth");

        panelDoB.setFocusable(false);

        txtCell1.setEditable(false);
        txtCell1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCell1.setPreferredSize(new java.awt.Dimension(50, 35));
        txtCell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCell1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Cellphone 1");

        txtCell2.setEditable(false);
        txtCell2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCell2.setPreferredSize(new java.awt.Dimension(50, 35));
        txtCell2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCell2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Cellphone 2");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Cellphone 3");

        txtCell3.setEditable(false);
        txtCell3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCell3.setPreferredSize(new java.awt.Dimension(50, 35));
        txtCell3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCell3ActionPerformed(evt);
            }
        });

        txtPassportNo.setEditable(false);
        txtPassportNo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPassportNo.setPreferredSize(new java.awt.Dimension(50, 35));
        txtPassportNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassportNoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Passport No.");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Visa Renew");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Joining Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPassportNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(panelVisa, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(panelJoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtCell1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtCell2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCell3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(1, 1, 1)
                        .addComponent(panelDoB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCell1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCell2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCell3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(42, 42, 42)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassportNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelVisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelJoinDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Uae ID");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Bank Card No.");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Designation");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Remark");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Salary");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("MM Name");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Basic Salary");

        txtUaeId.setEditable(false);
        txtUaeId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtUaeId.setPreferredSize(new java.awt.Dimension(50, 35));
        txtUaeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUaeIdActionPerformed(evt);
            }
        });

        txtMMName.setEditable(false);
        txtMMName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMMName.setPreferredSize(new java.awt.Dimension(50, 35));
        txtMMName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMMNameActionPerformed(evt);
            }
        });

        txtDesignation.setEditable(false);
        txtDesignation.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtDesignation.setPreferredSize(new java.awt.Dimension(50, 35));
        txtDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesignationActionPerformed(evt);
            }
        });

        txtCardNo.setEditable(false);
        txtCardNo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCardNo.setPreferredSize(new java.awt.Dimension(50, 35));
        txtCardNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCardNoActionPerformed(evt);
            }
        });

        txtSalary.setEditable(false);
        txtSalary.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtSalary.setPreferredSize(new java.awt.Dimension(200, 35));
        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });

        txtWPS.setEditable(false);
        txtWPS.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtWPS.setPreferredSize(new java.awt.Dimension(50, 35));
        txtWPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWPSActionPerformed(evt);
            }
        });

        txtRemark.setEditable(false);
        txtRemark.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtRemark.setPreferredSize(new java.awt.Dimension(50, 35));
        txtRemark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemarkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(221, 221, 221))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtUaeId, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(221, 221, 221))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtMMName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(250, 250, 250)
                                .addComponent(jLabel18)
                                .addGap(211, 211, 211))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtWPS, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesignation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRemark, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtWPS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMMName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel14))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUaeId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(0, 0, 0)
                .addComponent(txtRemark, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String searchValue = txtSearch.getText();
        try {
            Employee emp = BusinessProcess.getEmpById(Integer.parseInt(searchValue));
            if (emp != null) {
                displayEmpData(emp);
                jButton2.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "No Employee found!!!");
                jButton2.setVisible(false);
                editable = false;
                clearEmpDetailForm();
                changeEditState(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getLocalizedMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpIdActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void txtCell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCell1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCell1ActionPerformed

    private void txtCell2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCell2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCell2ActionPerformed

    private void txtCell3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCell3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCell3ActionPerformed

    private void txtPassportNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassportNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassportNoActionPerformed

    private void txtUaeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUaeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUaeIdActionPerformed

    private void txtMMNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMMNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMMNameActionPerformed

    private void txtDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignationActionPerformed

    private void txtCardNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCardNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCardNoActionPerformed

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void txtWPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWPSActionPerformed

    private void txtRemarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemarkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        changeEditState(editable);
        editable = !editable;

    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void changeEditState(boolean editting) {
        txtEmpId.setEditable(!editting);
        txtFullName.setEditable(!editting);
        txtUaeId.setEditable(!editting);
        Calendar cal = Calendar.getInstance();
        Date visaRenew = new Date();
        cal.setTime(visaRenew);
        dpVisa.getJFormattedTextField().setEditable(!editting);
        txtCell1.setEditable(!editting);
        txtCell2.setEditable(!editting);
        txtCell3.setEditable(!editting);
        txtCardNo.setEditable(!editting);
        Date dob = new Date();
        cal.setTime(dob);
        dpDoB.getJFormattedTextField().setEditable(!editting);
        txtPassportNo.setEditable(!editting);
        txtSalary.setEditable(!editting);
        txtWPS.setEditable(!editting);
        Date jd = new Date();
        cal.setTime(jd);
        dpJD.getJFormattedTextField().setEditable(!editting);
        txtMMName.setEditable(!editting);
        txtRemark.setEditable(!editting);
        txtDesignation.setEditable(!editting);
        if (!editting) {
            jButton2.setText("Save");
        } else {
            jButton2.setText("Edit");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel panelDoB;
    private javax.swing.JPanel panelJoinDate;
    private javax.swing.JPanel panelVisa;
    private javax.swing.JTextField txtCardNo;
    private javax.swing.JTextField txtCell1;
    private javax.swing.JTextField txtCell2;
    private javax.swing.JTextField txtCell3;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtMMName;
    private javax.swing.JTextField txtPassportNo;
    private javax.swing.JTextField txtRemark;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUaeId;
    private javax.swing.JTextField txtWPS;
    // End of variables declaration//GEN-END:variables
}
