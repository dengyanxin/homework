package com.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Denglu extends JFrame{
	String b ="2385345185";
	String bb = "xin12345";
	public Denglu(){
		this.setLayout(null);
		//this.setLayout(new FlowLayout());//����������
		//ͼƬ1
		JLabel jlabe0 = new JLabel();
		jlabe0.setBounds(0, 0, 432, 153);
		ImageIcon img = new ImageIcon("src/com/gui/qq.jpg");
		jlabe0.setIcon(img);
		this.add(jlabe0);
		//ͼƬ2
		JLabel jlabe00 = new JLabel();
		jlabe00.setBounds(0, 170, 95, 82);
		ImageIcon  img1 = new ImageIcon("src/com/gui/qq2.jpg");
		jlabe00.setIcon(img1);
		this.add(jlabe00);
		
		//�����˺�
		JTextField jTextField= new JTextField();
		jTextField.setText("");
		jTextField.setBounds(100,170,200,30);
		this.add(jTextField);
		//��ǩ
		JLabel jlabel = new JLabel();
		jlabel.setText("�û���");
		jlabel.setBounds(320, 170, 100, 30);
		//jlabel.setBackground(Color.blue);
		this.add(jlabel);
		
		
		//��������
		JPasswordField jpasswordfield = new JPasswordField();
		jpasswordfield.setText("");
		jpasswordfield.setBounds(100,210,200,30);
		this.add(jpasswordfield);
		//��ǩ
		JLabel jlabel2 = new JLabel();
		jlabel2.setText("����");
		jlabel2.setBounds(320, 210, 100, 30);
		this.add(jlabel2);
		
		//��ѡ�򣨼�ס������Զ���¼��
		JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem();
		jCheckBoxMenuItem.setText("��ס����");
		jCheckBoxMenuItem.setBounds(105, 250, 100, 20);
		this.add(jCheckBoxMenuItem);
		JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem();
		jCheckBoxMenuItem2.setText("�Զ���¼");
		jCheckBoxMenuItem2.setBounds(255, 250, 100, 20);
		this.add(jCheckBoxMenuItem2);
		
		//��ʾ�Ƿ��½�ɹ�
		JLabel jlabel001 = new JLabel();
		jlabel001.setText("");
		jlabel001.setBounds(170, 310, 100, 50);
		this.add(jlabel001);
		
		//��½��ť
		JButton jButton = new JButton();
		jButton.setText("��ȫ��½");
		jButton.setBounds(100, 280, 200, 30);
		jButton.setBackground(Color.blue);
		jButton.setForeground(Color.white);
		//������
		jButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String a = jTextField.getText();
				String aa = jpasswordfield.getText();
				if((a.equals(b))&&(aa.equals(bb))){
					jlabel001.setText("��½�ɹ�");
				}else{
					jlabel001.setText("��½ʧ��");
				}
			}
		});
		this.add(jButton);
		
		//�ܴ���
		this.setBounds(200,200,435,500);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Denglu();
	}

}
