/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.main;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.renderer.LineSeparatorRenderer;
import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;
import org.example.main.DBConnection.DBConnection;
import org.example.main.model.JobNoteDTO;
import org.example.main.model.Laptop;
import org.example.main.model.MyDataModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;


/**
 * @author Kawmal Kashmika
 */
public class MainForm extends javax.swing.JFrame {
    private ArrayList<Laptop> laptopList = new ArrayList<>();
    private MyDataModel model;
    private static JobNoteDTO jobNoteDTO = new JobNoteDTO();

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the label with the current date and time
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date now = new Date();
                lblDate.setText(dateFormat.format(now));
            }
        });
        timer.start(); // Start the timer


        model = new MyDataModel(laptopList);
        jTable1.setModel(model);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtModel = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFault = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        checkBattery = new javax.swing.JCheckBox();
        checkDvd = new javax.swing.JCheckBox();
        checkHard = new javax.swing.JCheckBox();
        checkCharger = new javax.swing.JCheckBox();
        checkRam = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setBackground(new java.awt.Color(102, 255, 51));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setText("+ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("CREATE JOB NOTE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Contact number");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Name");

        txtContactNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNumberActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Brand");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Model");

        txtBrand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandActionPerformed(evt);
            }
        });

        txtModel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 204, 0));
        jButton2.setText("+ADD JOB NOTE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtFault.setColumns(20);
        txtFault.setRows(5);
        jScrollPane1.setViewportView(txtFault);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Fault");

        checkBattery.setText("Battery");
        checkBattery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBatteryActionPerformed(evt);
            }
        });

        checkDvd.setText("DVD Writer");
        checkDvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDvdActionPerformed(evt);
            }
        });

        checkHard.setText("Hard Disk");
        checkHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHardActionPerformed(evt);
            }
        });

        checkCharger.setText("Charger");
        checkCharger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkChargerActionPerformed();
            }
        });

        checkRam.setText("RAM");
        checkRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRamActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null}
                },
                new String[]{
                        "Brand", "Model", "Fault", "Battery", "DVD", "Hard Disk", "Charger", "RAM"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(checkBattery, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(checkDvd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(checkHard, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(checkCharger, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(checkRam, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(48, 48, 48)))
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtModel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                                                        .addComponent(txtBrand)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton1)
                                                                .addGap(9, 9, 9))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(121, 121, 121)
                                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane2)
                                                .addContainerGap())))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(339, 339, 339))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(checkBattery)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(checkDvd)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(checkHard)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(checkCharger)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(checkRam, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2)
                                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRamActionPerformed

    private void checkChargerActionPerformed() {//GEN-FIRST:event_checkChargerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkChargerActionPerformed

    private void checkHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkHardActionPerformed

    private void checkDvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDvdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkDvdActionPerformed

    private void checkBatteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBatteryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBatteryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            Connection dbConnection = DBConnection.getDBConnection();
            String SQL1="INSERT INTO `pc_doctor`.`job_note` (`CUSTOMER_NAME`, `CUSTOMER_CONTACT_NUMBER`, `IS_ACTIVE`) VALUES ('"+ jobNoteDTO.getCustomerName()+"', '"+jobNoteDTO.getContactNumber()+"', '1');";
            int generatedId=-1;
            PreparedStatement preparedStatement1 = dbConnection.prepareStatement(SQL1,PreparedStatement.RETURN_GENERATED_KEYS);
            int i = preparedStatement1.executeUpdate();
            if(i==1){
                ResultSet generatedKeys = preparedStatement1.getGeneratedKeys();
                if(generatedKeys.next()){
                    generatedId=generatedKeys.getInt(1);
                }

            }

            if(!laptopList.isEmpty()){
                for(Laptop laptop:laptopList){
                    int battery=laptop.isBattery()?1:0;
                    int charger=laptop.isCharger()?1:0;
                    int dvd=laptop.isDvd()?1:0;
                    int hard=laptop.isHardDisk()?1:0;
                    int ram=laptop.isRam()?1:0;
                    String SQL2="INSERT INTO `pc_doctor`.`laptop` (`JOB_NOTE_ID`, `FAULT`, `BATTERY`, `CHARGER`, `DVD_ROM`, `HARD_DISK`, `RAM`) VALUES ('"+generatedId+"', '"+laptop.getFalult()+"', '"+battery+"', '"+charger+"', '"+dvd+"', '"+hard+"', '"+ram+"')";
                    PreparedStatement preparedStatement = dbConnection.prepareStatement(SQL2);
                    int i1 = preparedStatement.executeUpdate();
                    printJobNote(String.valueOf(generatedId));
                }
            }else{

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtName.getText() != null && txtContactNumber.getText() != null) {
            jobNoteDTO.setCustomerName(txtName.getText());
            jobNoteDTO.setContactNumber(txtContactNumber.getText());
        }


        Laptop laptop = new Laptop();
        laptop.setBrand(txtBrand.getText());
        laptop.setModel(txtModel.getText());
        laptop.setFalult(txtFault.getText());

        if (checkBattery.isSelected()) {
            laptop.setBattery(true);
        } else {
            laptop.setBattery(false);
        }

        if (checkDvd.isSelected()) {
            laptop.setDvd(true);
        } else {
            laptop.setDvd(false);
        }

        if (checkCharger.isSelected()) {
            laptop.setCharger(true);
        } else {
            laptop.setCharger(false);
        }

        if (checkHard.isSelected()) {
            laptop.setHardDisk(true);
        } else {
            laptop.setHardDisk(false);
        }

        if (checkRam.isSelected()) {
            laptop.setRam(true);
        } else {
            laptop.setRam(false);
        }


        if (!laptop.getBrand().equals("")) {
            laptopList.add(laptop);
        }


        txtBrand.setText("");
        txtModel.setText("");
        txtFault.setText("");
        checkBattery.setSelected(false);
        checkCharger.setSelected(false);
        checkDvd.setSelected(false);
        checkHard.setSelected(false);
        checkRam.setSelected(false);


        model.fireTableDataChanged();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void printJobNote(String JobNoteId) throws FileNotFoundException {
        String path = "Job_Note"+JobNoteId+".pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A5);
        com.itextpdf.layout.Document document = new com.itextpdf.layout.Document(pdfDocument);


        float colwidth = PageSize.A5.getWidth()/2;
        float twoColomnWidth[] = {colwidth,colwidth};

        Image logoImage = null;
        try {
            logoImage = new Image(ImageDataFactory.create("src/main/resources/logoBW.jpeg"));
        } catch (MalformedURLException e) {
            System.out.println("Image not found");
        }
        logoImage.setWidth(90);
        logoImage.setHeight(100);// Adjust the width of the image as needed

        Table table = new Table(twoColomnWidth);
        table.addCell(new Cell().add(logoImage).setBorderRight(Border.NO_BORDER));

        Paragraph headerParagraph = new Paragraph();

        Text headerText = new Text("PC DOCTOR\n");
        headerText.setFontSize(18);
        headerText.setBold();
        headerText.setTextAlignment(TextAlignment.CENTER);
        Text addressText = new Text("No:46,Siri Sandana Waththa,\nPanvila,\nKalutara South\n");
        addressText.setFontSize(10);
        addressText.setTextAlignment(TextAlignment.CENTER);
        Text contactText = new Text("+94(76)6896198");
        contactText.setFontSize(10);
        contactText.setTextAlignment(TextAlignment.CENTER);

        headerParagraph.add(headerText);
        headerParagraph.add(addressText);
        headerParagraph.add(contactText);
        headerParagraph.setTextAlignment(TextAlignment.CENTER);
        table.addCell(new Cell().add(headerParagraph).setBorderLeft(Border.NO_BORDER));

        float threeColumnWidth[]={colwidth,colwidth};
        Table table1=new Table(threeColumnWidth);
        Paragraph leftParagraph=new Paragraph();

        Text nameTopicText=new Text("Customer Name : ").setBold().setFontSize(10);
        Text nameText=new Text(jobNoteDTO.getCustomerName()+" \n").setFontSize(10);

        Text contacNumbertTopicText=new Text("Contact Number : ").setBold().setFontSize(10);
        Text contactNumberText=new Text(jobNoteDTO.getContactNumber()+"\n").setFontSize(10);

        leftParagraph.add(nameTopicText).add(nameText).add(contacNumbertTopicText).add(contactNumberText);

        Paragraph rightParagraph=new Paragraph();

        Text jobeNoteTopicText=new Text("Job Note Id : ").setBold().setFontSize(10);
        Text jobNoteText=new Text("PC54637\n").setFontSize(10);

        LocalDateTime currentDateTime = LocalDateTime.now();
        Text dateTopicText=new Text("Job Note Date : ").setBold().setFontSize(10);
        Text dateText=new Text(String.valueOf(currentDateTime.getDayOfMonth())+" "+String.valueOf(currentDateTime.getMonth())+" "+String.valueOf(currentDateTime.getYear())+"\n").setFontSize(10);

        rightParagraph.add(jobeNoteTopicText).add(jobNoteText).add(dateTopicText).add(dateText);


        table1.addCell(new Cell().add(leftParagraph).setBorder(Border.NO_BORDER));
        table1.addCell(new Cell().add(rightParagraph).setBorder(Border.NO_BORDER));

        Paragraph emptySpace = new Paragraph().setHeight(10);

        float eightColumnWidth[]={colwidth/4,colwidth/4,colwidth/4,colwidth/4};
        Table table2=new Table(eightColumnWidth);
        Paragraph TopicParagraph = new Paragraph(new Text("Job note").setFontSize(12)).setHeight(10);
        table2.addCell(new Cell().setBackgroundColor(Color.BLACK).add("Brand").setFontColor(Color.WHITE));
        table2.addCell(new Cell().setBackgroundColor(Color.BLACK).add("Model").setFontColor(Color.WHITE));
        table2.addCell(new Cell().setBackgroundColor(Color.BLACK).add("Fault").setFontColor(Color.WHITE));
        table2.addCell(new Cell().setBackgroundColor(Color.BLACK).add("Equipments").setFontColor(Color.WHITE));

        for (Laptop laptop:laptopList){
            table2.addCell(new Cell().add(laptop.getBrand()));
            table2.addCell(new Cell().add(laptop.getModel()));
            table2.addCell(new Cell().add(laptop.getFalult()));
            StringBuilder stringBuilder=new StringBuilder("");
            if(laptop.isHardDisk()){
                stringBuilder.append("Hard Disk ");
            }
            if(laptop.isDvd()){
                stringBuilder.append("DVD ROM ");
            }
            if(laptop.isRam()){
              stringBuilder.append("RAM ");
            }
            if(laptop.isBattery()){
               stringBuilder.append("Battery ");
            }
            if(laptop.isCharger()){
                stringBuilder.append("Charger ");
            }

            table2.addCell(new Cell().add(stringBuilder.toString()));

        }








        document.add(table);
        document.add(emptySpace);
        document.add(table1);
        document.add(emptySpace);
        document.add(table2);



        document.close();


    }


    private void connectionTest() {
        DBConnection.getDBConnection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBattery;
    private javax.swing.JCheckBox checkCharger;
    private javax.swing.JCheckBox checkDvd;
    private javax.swing.JCheckBox checkHard;
    private javax.swing.JCheckBox checkRam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextArea txtFault;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
