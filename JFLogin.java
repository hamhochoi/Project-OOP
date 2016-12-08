/*
 * Created by JFormDesigner on Mon Dec 05 22:12:52 ICT 2016
 */

package tuan.login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;
import quang.view.manager.ManagerView;

import tuan.IO.IO;


/**
 * @author Tuan Do
 */
public class JFLogin extends JFrame implements ActionListener{
	public JFLogin() {
		initComponents();
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				pack();
				setLocationRelativeTo(null);
				setVisible(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Tuan Do
		panel1 = new JPanel();
		bt_login = new JButton();
		panel2 = new JPanel();
		cb_user = new JComboBox<>();
		label3 = new JLabel();
		panel3 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		panel4 = new JPanel();
		txt_username = new JTextField();
		pas_password = new JPasswordField();
		bt_exit = new JButton();
		label4 = new JLabel();
		label5 = new JLabel();

		//======== this ========
		setTitle("LOGIN");
		setFont(new Font("Consolas", Font.BOLD, 16));
		setForeground(new Color(102, 102, 102));
		Container contentPane = getContentPane();
		contentPane.setLayout(null);

		//======== panel1 ========
		{

			// JFormDesigner evaluation mark
			panel1.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			panel1.setLayout(null);

			//---- bt_login ----
			bt_login.setText("Login");
			bt_login.setIcon(new ImageIcon(getClass().getResource("/tuan/img/login.png")));
			bt_login.setForeground(new Color(102, 102, 102));
			bt_login.setFont(new Font("Tahoma", Font.BOLD, 14));
			bt_login.setBorder(new EtchedBorder(Color.darkGray, Color.lightGray));
			bt_login.setBackground(UIManager.getColor("Button.light"));
			panel1.add(bt_login);
			bt_login.setBounds(175, 275, 130, 40);

			//======== panel2 ========
			{
				panel2.setBorder(new TitledBorder(null, "Info", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION,
					new Font("Consolas", Font.PLAIN, 11), new Color(102, 102, 102)));
				panel2.setLayout(null);

				//---- cb_user ----
				cb_user.setFont(new Font("Tahoma", Font.PLAIN, 14));
				cb_user.setForeground(new Color(102, 102, 102));
				cb_user.setModel(new DefaultComboBoxModel<>(new String[] {
					"Nh\u00e2n vi\u00ean b\u00e1n h\u00e0ng",
					"Nh\u00e2n vi\u00ean kho",
					"Qu\u1ea3n l\u00fd"
				}));
				panel2.add(cb_user);
				cb_user.setBounds(100, 25, 185, 35);

				//---- label3 ----
				label3.setIcon(new ImageIcon(getClass().getResource("/tuan/img/user.png")));
				panel2.add(label3);
				label3.setBounds(5, 20, 48, 48);

				//======== panel3 ========
				{
					panel3.setLayout(new GridLayout(2, 1, 25, 25));

					//---- label1 ----
					label1.setText("Username:");
					label1.setFont(new Font("Tahoma", Font.BOLD, 14));
					label1.setForeground(new Color(102, 102, 102));
					panel3.add(label1);

					//---- label2 ----
					label2.setText("Password:");
					label2.setFont(new Font("Tahoma", Font.BOLD, 14));
					label2.setForeground(new Color(102, 102, 102));
					panel3.add(label2);
				}
				panel2.add(panel3);
				panel3.setBounds(5, 90, 95, 90);

				//======== panel4 ========
				{
					panel4.setLayout(new GridLayout(2, 1, 25, 25));

					//---- txt_username ----
					txt_username.setFont(new Font("Consolas", Font.PLAIN, 14));
					txt_username.setForeground(new Color(102, 102, 102));
					panel4.add(txt_username);

					//---- pas_password ----
					pas_password.setForeground(new Color(102, 102, 102));
					pas_password.setFont(new Font("Tahoma", Font.BOLD, 14));
					panel4.add(pas_password);
				}
				panel2.add(panel4);
				panel4.setBounds(100, 90, 185, 90);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < panel2.getComponentCount(); i++) {
						Rectangle bounds = panel2.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = panel2.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					panel2.setMinimumSize(preferredSize);
					panel2.setPreferredSize(preferredSize);
				}
			}
			panel1.add(panel2);
			panel2.setBounds(175, 75, 290, 185);

			//---- bt_exit ----
			bt_exit.setText("Exit");
			bt_exit.setIcon(new ImageIcon(getClass().getResource("/tuan/img/exit.png")));
			bt_exit.setFont(new Font("Tahoma", Font.BOLD, 14));
			bt_exit.setForeground(new Color(102, 102, 102));
			bt_exit.setBorder(new EtchedBorder(Color.darkGray, Color.lightGray));
			bt_exit.setBackground(UIManager.getColor("CheckBox.highlight"));
			panel1.add(bt_exit);
			bt_exit.setBounds(335, 275, 130, 40);

			//---- label4 ----
			label4.setIcon(new ImageIcon(getClass().getResource("/tuan/img/logo.png")));
			panel1.add(label4);
			label4.setBounds(20, 115, 128, 128);

			//---- label5 ----
			label5.setText("QU\u1ea2N L\u00dd B\u00c1N H\u00c0NG");
			label5.setFont(new Font("Arial Unicode MS", Font.BOLD, 24));
			label5.setHorizontalAlignment(SwingConstants.CENTER);
			label5.setForeground(new Color(102, 102, 102));
			panel1.add(label5);
			label5.setBounds(0, 0, 485, 75);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel1.getComponentCount(); i++) {
					Rectangle bounds = panel1.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel1.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel1.setMinimumSize(preferredSize);
				panel1.setPreferredSize(preferredSize);
			}
		}
		contentPane.add(panel1);
		panel1.setBounds(0, 0, 485, 335);

		{ // compute preferred size
			Dimension preferredSize = new Dimension();
			for(int i = 0; i < contentPane.getComponentCount(); i++) {
				Rectangle bounds = contentPane.getComponent(i).getBounds();
				preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
				preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
			}
			Insets insets = contentPane.getInsets();
			preferredSize.width += insets.right;
			preferredSize.height += insets.bottom;
			contentPane.setMinimumSize(preferredSize);
			contentPane.setPreferredSize(preferredSize);
		}
		pack();
		setLocationRelativeTo(getOwner());
		
		this.bt_login.addActionListener(this);
		this.bt_exit.addActionListener(this);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Tuan Do
	private JPanel panel1;
	private JButton bt_login;
	private JPanel panel2;
	private JComboBox<String> cb_user;
	private JLabel label3;
	private JPanel panel3;
	private JLabel label1;
	private JLabel label2;
	private JPanel panel4;
	private JTextField txt_username;
	private JPasswordField pas_password;
	private JButton bt_exit;
	private JLabel label4;
	private JLabel label5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource() == this.bt_login){
			boolean login = false;
			String typeUser = this.cb_user.getSelectedItem().toString();
			String userName = this.txt_username.getText();
			String passWord = this.pas_password.getText();
			ArrayList<Account> AC = new ArrayList<Account>();
			IO io = new IO();
			try {
				AC = (ArrayList<Account>) io.ReadFile("Account.txt");
				for(int i = 0; i < AC.size(); i++){
					if(typeUser.contains(AC.get(i).getTypeUser().toString()) && userName.equals(AC.get(i).getUserName().toString()) && passWord.equals(AC.get(i).getPassWord().toString())){
						this.txt_username.setText("");
						this.pas_password.setText("");
//						Close();
						login = true;
						if(typeUser.contains("Nhân viên bán hàng")){
                                                    
						}
						else if(typeUser.contains("Nhân viên kho")){
							
						}
                                                else if (typeUser.contains("Quản lý") ){
                                                    new ManagerView();
						}
					}
				}
				if(login == false){
					JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại!");
					this.txt_username.setText("");
					this.pas_password.setText("");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		if(ev.getSource() == this.bt_exit){
			System.exit(1);
		}
                this.dispose();
	}
	
	public void Close(){
		WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
	}
}
