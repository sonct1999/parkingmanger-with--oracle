/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybaixe;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView;
import sun.security.ssl.Record;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;




/**
 *
 * @author Admin
 */
public class MainForm extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
  
    
    /**
     * Creates new form MainForm
     */
    private String Manv;
    public MainForm(String Manv) {
        initComponents();
        this.Manv = Manv;
        this.txtmanv.setText(Manv);     
    }

    private MainForm() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbienso = new javax.swing.JTextField();
        txtloaixe = new javax.swing.JTextField();
        cbloaive = new javax.swing.JComboBox<>();
        txtgiatien = new javax.swing.JTextField();
        btnxevao = new javax.swing.JButton();
        btnxera = new javax.swing.JButton();
        btnthongke = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbxetrongbai = new javax.swing.JTable();
        btnxemds = new javax.swing.JButton();
        txtsearchxe = new javax.swing.JTextField();
        dcngayra = new com.toedter.calendar.JDateChooser();
        dcngayvao = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtsoluongxe = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Biển Số");

        jLabel2.setText("Loại xe");

        jLabel3.setText("Ngày vào");

        jLabel4.setText("Ngày ra");

        jLabel5.setText("Giá tiền");

        jLabel6.setText("Loại vé");

        cbloaive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", " " }));

        btnxevao.setText("Xe Vào");
        btnxevao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxevaoActionPerformed(evt);
            }
        });

        btnxera.setText("Xe ra");
        btnxera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxeraActionPerformed(evt);
            }
        });

        btnthongke.setText("Xem thống kê");
        btnthongke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthongkeActionPerformed(evt);
            }
        });

        jLabel7.setText("Mã NV");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Tìm xe trong bãi");

        tbxetrongbai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Biển số", "Loại xe", "Loai ve", "Ngày vào"
            }
        ));
        tbxetrongbai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbxetrongbaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbxetrongbai);

        btnxemds.setText("Xem danh sách còn trong bãi");
        btnxemds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxemdsActionPerformed(evt);
            }
        });

        txtsearchxe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtsearchxeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchxeKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Số lượng xe trong bãi");

        txtsoluongxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsoluongxeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbienso)
                            .addComponent(txtloaixe)
                            .addComponent(cbloaive, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtgiatien)
                            .addComponent(dcngayra, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(dcngayvao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnthongke)
                            .addComponent(btnxemds)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnxera, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnxevao)
                                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsearchxe, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(txtsoluongxe))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtbienso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtloaixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbloaive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnxevao))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcngayvao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(btnxera))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(dcngayra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtgiatien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnthongke))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtsearchxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnxemds)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsoluongxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnxevaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxevaoActionPerformed
     
        try
        {
            
            String sql = "insert into vexe(bienso, loaixe, malv, ngayvao, giatien, manv) values(?,  ?, ?, ?, ?, ?)";      
            con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-6RQTKBGK:1521:orcl","son","son");
            pst = con.prepareStatement(sql);         
            pst.setString(1, txtbienso.getText());
            pst.setString(2, txtloaixe.getText());
            pst.setString(3, (String)cbloaive.getSelectedItem());
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            String ngayvao = sdf.format(dcngayvao.getDate());
//            String ngayra = sdf.format(dcngayra.getDate());
            pst.setString(4, ngayvao);
            pst.setString(5, null);
            pst.setString(6, txtmanv.getText());                    
            pst.executeUpdate();
                       
                JOptionPane.showMessageDialog(null, "Thành Công");
                
                txtbienso.setText("");
                txtloaixe.setText("");
                txtgiatien.setText("");
           
        } catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }
  
         try
        {
            String sql = "select * from xetrongbai";
             con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-6RQTKBGK:1521:orcl","son","son");
             
             pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(); 
           
            DefaultTableModel model = (DefaultTableModel) tbxetrongbai.getModel();
            model.setRowCount(0);  
            if(rs!=null){
            while (rs.next()) {
            Object objectList[] = {              
                rs.getString("bienso"), rs.getString("loaixe"),rs.getString("malv"), rs.getDate("ngayvao")
            };         
            model.addRow(objectList); 
//            pst.executeUpdate(sql);
        
            }  
            }
        } catch(Exception ex)
        {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "loi o day");
        }
          try {
            String sql = "select count(*) as soluongxetrongbai from xetrongbai";
            con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-6RQTKBGK:1521:orcl","son","son");
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs.next();
//            System.out.print(rs.getString("soluongxetrongbai"));
           txtsoluongxe.setText(rs.getString("soluongxetrongbai"));
         
                   
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_btnxevaoActionPerformed

   
    private void btnxeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxeraActionPerformed
         try
        {
           
           String search = txtsearchxe.getText().trim();
            String sql = "update vexe set bienso=?, loaixe= ?, malv = ?, ngayvao= ?, ngayra= ?, giatien= ? where bienso=?";
            con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-6RQTKBGK:1521:orcl","son","son");
           pst = con.prepareStatement(sql);
           pst.setString(1, txtbienso.getText());
           pst.setString(2, txtloaixe.getText());
           pst.setString(3, (String)cbloaive.getSelectedItem());
           SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            String ngayvao = sdf.format(dcngayvao.getDate());           
            pst.setString(4, ngayvao);
            String ngayra  = sdf.format(dcngayra.getDate());
            pst.setString(5, ngayra);
        
            pst.setString(6, txtgiatien.getText());
            pst.setString(7, txtbienso.getText());
          
            if(pst.executeUpdate()>0){
                JOptionPane.showMessageDialog(null, "Xe đã ra khỏi bãi");
            txtbienso.setText("");
            txtloaixe.setText("");
            txtgiatien.setText("");
            txtgiatien.setText("");
           
            }
           
            
           /*txtbienso.setText( tbxetrongbai.getValueAt(SelectRow,0).toString());
        txtloaixe.setText(Recordtb.getValueAt(SelectRow, 1).toString());
        cbloaive.setSelectedItem(Recordtb.getValueAt(SelectRow, 2).toString());
 
        dcngayvao.setDateFormatString( Recordtb.getValueAt(SelectRow,3).toString()); */
        } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
          try {
            String sql = "select count(*) as soluongxetrongbai from xetrongbai";
            con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-6RQTKBGK:1521:orcl","son","son");
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs.next();
           txtsoluongxe.setText(rs.getString("soluongxetrongbai"));
      
        } catch (Exception e) {
            e.printStackTrace();
            
        }
           try
        {
            String sql = "select * from xetrongbai";
             con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-6RQTKBGK:1521:orcl","son","son");
             
             pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(); 
           
            DefaultTableModel model = (DefaultTableModel) tbxetrongbai.getModel();
            model.setRowCount(0);  
            if(rs!=null){
            while (rs.next()) {
            Object objectList[] = {              
                rs.getString("bienso"), rs.getString("loaixe"),rs.getString("malv"), rs.getDate("ngayvao")
            };         
            model.addRow(objectList); 
//            pst.executeUpdate(sql);
        
            }  
            }
        } catch(Exception ex)
        {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "loi o day");
        }
    }//GEN-LAST:event_btnxeraActionPerformed

    private void btnxemdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxemdsActionPerformed
    
            
        try
        {
            String sql = "select * from xetrongbai";
             con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-6RQTKBGK:1521:orcl","son","son");
             
             pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(); 
           
            DefaultTableModel model = (DefaultTableModel) tbxetrongbai.getModel();
            model.setRowCount(0);  
            if(rs!=null){
            while (rs.next()) {
            Object objectList[] = {              
                rs.getString("bienso"), rs.getString("loaixe"),rs.getString("malv"), rs.getDate("ngayvao")
            };         
            model.addRow(objectList); 
//            pst.executeUpdate(sql);
        
            }  
            }
        } catch(Exception ex)
        {
            ex.printStackTrace();
            //JOptionPane.showMessageDialog(null, "loi o day");
        }
        try {
            String sql = "select count(*) as soluongxetrongbai from xetrongbai";
            con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-6RQTKBGK:1521:orcl","son","son");
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            rs.next();
//            System.out.print(rs.getString("soluongxetrongbai"));
           txtsoluongxe.setText(rs.getString("soluongxetrongbai"));
         
                   
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_btnxemdsActionPerformed

    private void txtsearchxeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchxeKeyPressed
        DefaultTableModel model = (DefaultTableModel) tbxetrongbai.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tbxetrongbai.setRowSorter(tr);
        tr.setRowFilter(javax.swing.RowFilter.regexFilter(txtsearchxe.getText().trim()));
        
    }//GEN-LAST:event_txtsearchxeKeyPressed

    private void txtsearchxeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchxeKeyReleased
        
    
    }//GEN-LAST:event_txtsearchxeKeyReleased

    private void btnthongkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthongkeActionPerformed
       LichSuVeXe lsv = new  LichSuVeXe();
                lsv.setVisible(true);
    }//GEN-LAST:event_btnthongkeActionPerformed

    private void tbxetrongbaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbxetrongbaiMouseClicked
        DefaultTableModel Recordtb = (DefaultTableModel) tbxetrongbai.getModel();
        int SelectRow = tbxetrongbai.getSelectedRow();
        txtbienso.setText( tbxetrongbai.getValueAt(SelectRow,0).toString());
        txtloaixe.setText(Recordtb.getValueAt(SelectRow, 1).toString());
        cbloaive.setSelectedItem(Recordtb.getValueAt(SelectRow, 2).toString());
        
        dcngayvao.setDateFormatString( Recordtb.getValueAt(SelectRow,3).toString());      
       
     
    }//GEN-LAST:event_tbxetrongbaiMouseClicked

    private void txtsoluongxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsoluongxeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsoluongxeActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnthongke;
    private javax.swing.JButton btnxemds;
    private javax.swing.JButton btnxera;
    private javax.swing.JButton btnxevao;
    private javax.swing.JComboBox<String> cbloaive;
    private com.toedter.calendar.JDateChooser dcngayra;
    private com.toedter.calendar.JDateChooser dcngayvao;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbxetrongbai;
    private javax.swing.JTextField txtbienso;
    private javax.swing.JTextField txtgiatien;
    private javax.swing.JTextField txtloaixe;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtsearchxe;
    private javax.swing.JTextField txtsoluongxe;
    // End of variables declaration//GEN-END:variables

    
    
    
}
