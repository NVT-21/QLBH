package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.NhanVienDAO;
import DAO.UserDAO;
import model.NhanVien;
import model.User;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class userNV extends javax.swing.JFrame {

    /**
     * Creates new form userNV
     */
    public userNV() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Sitka Text", Font.BOLD, 15));
        jLabel1.setForeground(new Color(255, 0, 0));
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtpassword1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		User user=new User();
        		String maNV=txtMaNV.getText();
        		String password=txtPassword.getText();
        		String confirm_password=txtpassword1.getText();
        		user.setUsername(txtTen.getText());
            	user.setPassword(password);
            	user.setPasswordConfirm(confirm_password);
            	 user.setMaNV(maNV);
            	 
            	 if (!password.equals(confirm_password)) {
            		 JOptionPane.showMessageDialog(userNV.this, "Mật khẩu nhập lại và mất khẩu không trùng nhau");
            	 }
            	 else if(!kiemtra(maNV)) {
            		 JOptionPane.showMessageDialog(userNV.this, "Mã Nhân Viên Không Tồn Tại");
            	 }
            	 else {
            		
                 	
                 	UserDAO.getInstance().insert(user);
                 	 JOptionPane.showMessageDialog(userNV.this, "Đăng Ký Thành Công");
            	 }
            	
        		
        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Đăng Ký ");

        jLabel2.setText("Tên Đăng Nhâp :");

        jLabel3.setText("Mật khẩu ");

        jLabel4.setText("Nhập lại mật khẩu ");

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã Nhân Viên :");

        jButton1.setText("Đăng Ký ");
        
        btnHome = new JButton();
        btnHome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Home home=new Home();
        		home.setVisible(true);
        	}
        });
        btnHome.setText("Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(127)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        						.addGap(78))
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        						.addPreferredGap(ComponentPlacement.RELATED)))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4))
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtMaNV, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        				.addComponent(txtPassword, 103, 103, 103)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(txtTen, 103, 103, 103)
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addComponent(txtpassword1, 103, 103, 103))
        			.addContainerGap(119, GroupLayout.PREFERRED_SIZE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(411, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
        			.addGap(32))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
        			.addGap(205))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(28)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3))
        					.addGap(26)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtpassword1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel4))
        					.addGap(30)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtMaNV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel5))
        					.addGap(18)
        					.addComponent(jButton1))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(btnHome, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(43, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(userNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtpassword1;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtMaNV;
    private JButton btnHome;
    // End of variables declaration 
    private boolean kiemtra(String ma) {
    	ArrayList<NhanVien> listNV=NhanVienDAO.getInstance().selectAll();
		NhanVien userCurr=new NhanVien();
		for(NhanVien nv:listNV) {
			if(nv.getMaNV().equals(ma)) {
				return true;
			}
		}
		return false;
    }
  
   

   

}