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
        //设置大小  
        setSize(550, 550);  
        //设置位置  
        setLocation(0, 0);  
        //背景图片的路径。（相对路径或者绝对路径。本例图片放于"java项目名"的文件下）  
        String path = "src/com/wuziqi/1.jpg";  
        // 背景图片  
        ImageIcon background = new ImageIcon(path);  
        // 把背景图片显示在一个标签里面  
        JLabel label = new JLabel(background);  
        // 把标签的大小位置设置为图片刚好填充整个面板  
        label.setBounds(0, 0, this.getWidth(), this.getHeight());  
        // 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明  
        JPanel imagePanel = (JPanel) this.getContentPane();  
        imagePanel.setOpaque(false);  
        // 把背景图片添加到分层窗格的最底层作为背景  
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
  
		this.setLayout(null);
		TestPaint testPaint = new TestPaint();
		testPaint.setBounds(0, 0, 550, 600);
		this.add(testPaint);
		this.setTitle("五子棋");
		this.setBounds(200, 100,700, 630);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//重新开始
        JButton jButton = new JButton();
        jButton.setBounds(570, 150, 100, 30);
        jButton.setText("重新开始");
        jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				testPaint.isWinNow = false;
				testPaint.pointList.clear();
				testPaint.isHei=true;
				testPaint.repaint();
			}
		});
        this.add(jButton);
        //悔棋
        JButton jt2 = new JButton("悔棋");	
		jt2.setBounds(570,250,100,30);
		jt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(testPaint.kk=true){ //只能悔棋一次,当再次点击鼠标时可以悔棋
				if(testPaint.ks=true){	//当没有胜方时,可以悔棋;有胜方时,不可以悔棋
					testPaint.kk=false;//只能悔一次棋
				int a = testPaint.pointList.size();//返回集合列表中的元素数
				testPaint.pointList.remove(a-1);//移除集合中指定位置的元素(元素从0开始)
				//悔棋的棋子是黑子时,让下一次绘制的是黑子
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
		//退出
		JButton jButton2 = new JButton();
		jButton2.setText("退出");
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
