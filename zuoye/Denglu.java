package com.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Denglu extends JFrame{
	String b ="2385345185";
	String bb = "xin12345";
	public Denglu(){
		this.setLayout(null);
		//this.setLayout(new FlowLayout());//界面依次排
		//图片1
		JLabel jlabe0 = new JLabel();
		jlabe0.setBounds(0, 0, 432, 153);
		ImageIcon img = new ImageIcon("src/com/gui/qq.jpg");
		jlabe0.setIcon(img);
		this.add(jlabe0);
		//图片2
		JLabel jlabe00 = new JLabel();
		jlabe00.setBounds(0, 170, 95, 82);
		ImageIcon  img1 = new ImageIcon("src/com/gui/qq2.jpg");
		jlabe00.setIcon(img1);
		this.add(jlabe00);
		
		//输入账号
		JTextField jTextField= new JTextField();
		jTextField.setText("");
		jTextField.setBounds(100,170,200,30);
		this.add(jTextField);
		//标签
		JLabel jlabel = new JLabel();
		jlabel.setText("用户名");
		jlabel.setBounds(320, 170, 100, 30);
		//jlabel.setBackground(Color.blue);
		this.add(jlabel);
		
		
		//输入密码
		JPasswordField jpasswordfield = new JPasswordField();
		jpasswordfield.setText("");
		jpasswordfield.setBounds(100,210,200,30);
		this.add(jpasswordfield);
		//标签
		JLabel jlabel2 = new JLabel();
		jlabel2.setText("密码");
		jlabel2.setBounds(320, 210, 100, 30);
		this.add(jlabel2);
		
		//多选框（记住密码和自动登录）
		JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem();
		jCheckBoxMenuItem.setText("记住密码");
		jCheckBoxMenuItem.setBounds(105, 250, 100, 20);
		this.add(jCheckBoxMenuItem);
		JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem();
		jCheckBoxMenuItem2.setText("自动登录");
		jCheckBoxMenuItem2.setBounds(255, 250, 100, 20);
		this.add(jCheckBoxMenuItem2);
		
		//显示是否登陆成功
		JLabel jlabel001 = new JLabel();
		jlabel001.setText("");
		jlabel001.setBounds(170, 310, 100, 50);
		this.add(jlabel001);
		
		//登陆按钮
		JButton jButton = new JButton();
		jButton.setText("安全登陆");
		jButton.setBounds(100, 280, 200, 30);
		jButton.setBackground(Color.blue);
		jButton.setForeground(Color.white);
		//监听器
		jButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String a = jTextField.getText();
				String aa = jpasswordfield.getText();
				if((a.equals(b))&&(aa.equals(bb))){
					jlabel001.setText("登陆成功");
				}else{
					jlabel001.setText("登陆失败");
				}
			}
		});
		this.add(jButton);
		
		//总窗口
		this.setBounds(200,200,435,500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Denglu();
	}

}
