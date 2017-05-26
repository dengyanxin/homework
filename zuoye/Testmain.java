package com.wuziqi;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Testmain extends JFrame{
	//private static final JTextArea Label = null;
	static Socket socket;
	static{
		try {
		 socket = new Socket("192.168.199.216",9610);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Testmain(Socket socket){
        //���ô�С  
        setSize(550, 550);  
        //����λ��  
        setLocation(0, 0);  
        //����ͼƬ��·���������·�����߾���·��������ͼƬ����"java��Ŀ��"���ļ��£�  
        String path = "src/com/wuziqi/1.jpg";  
        // ����ͼƬ  
        ImageIcon background = new ImageIcon(path);  
        // �ѱ���ͼƬ��ʾ��һ����ǩ����  
        JLabel label = new JLabel(background);  
        // �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������  
        label.setBounds(0, 0, this.getWidth(), this.getHeight());  
        // �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��  
        JPanel imagePanel = (JPanel) this.getContentPane();  
        imagePanel.setOpaque(false);  
        // �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����  
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
  
		this.setLayout(null);
		TestPaint testPaint = new TestPaint();
		testPaint.setBounds(0, 0, 550, 600);
		this.add(testPaint);
		this.setTitle("������");
		this.setBounds(200, 100,700, 630);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//���¿�ʼ
        JButton jButton = new JButton();
        jButton.setBounds(570, 150, 100, 30);
        jButton.setText("���¿�ʼ");
        jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testPaint.isWinNow = false;
				testPaint.pointList.clear();
				testPaint.isHei=true;
				testPaint.repaint();
			}
		});
        this.add(jButton);
        //����
        JButton jt2 = new JButton("����");	
		jt2.setBounds(570,250,100,30);
		jt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(testPaint.kk=true){ //ֻ�ܻ���һ��,���ٴε�����ʱ���Ի���
				if(testPaint.ks=true){	//��û��ʤ��ʱ,���Ի���;��ʤ��ʱ,�����Ի���
					testPaint.kk=false;//ֻ�ܻ�һ����
				int a = testPaint.pointList.size();//���ؼ����б��е�Ԫ����
				testPaint.pointList.remove(a-1);//�Ƴ�������ָ��λ�õ�Ԫ��(Ԫ�ش�0��ʼ)
				//����������Ǻ���ʱ,����һ�λ��Ƶ��Ǻ���
					if(testPaint.isHei==false){
						testPaint.isHei=true;
					}else if(testPaint.isHei==true){
						testPaint.isHei=false;
					}
					testPaint.repaint();//
					}
				}
			}
		});
		this.add(jt2);
		//�˳�
		JButton jButton2 = new JButton();
		jButton2.setText("�˳�");
		jButton2.setBounds(570, 350, 100, 30);
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.add(jButton2);
	}
	public static void main(String[] args){
//		 try {
//			 Socket socket = new Socket("192.168.199.216",9610);
			 new Testmain(socket);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}
}
