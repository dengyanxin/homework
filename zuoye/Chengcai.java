package com.yanxin;

import java.awt.*;  
import java.awt.event.*;  
import java.util.Random;  
public class Chengcai  
{  
    public static void main(String args[])  
    {  
        caipiao1 c=new caipiao1();  
    }  
}  
class caipiao1 extends Frame implements ActionListener  
{  
    TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;  
    Button b1,b2,b3;  
    Panel p;  
    Label l1,l2,l3;  
    static int m,count;  
    caipiao1()  
    {  
        super("彩票系统");  
        setVisible(true);  
        setLayout(null);  
        setSize(450,350);  
        p=new Panel();  
        p.setBounds(40, 50, 370, 250);  
        p.setBackground(Color.cyan);  
        p.setVisible(true);  
        add(p);  
        l1=new Label("本期中奖号码：");  
        l2=new Label("您的号码：        ");  
        l3=new Label("票数：                                                                                        ");  
        b1=new Button("我要写号码！");  
        b2=new Button("开奖！");  
        b3=new Button("再来一次");  
        t1=new TextField(1);  
        t2=new TextField(1);  
        t3=new TextField(1);  
        t4=new TextField(1);  
        t5=new TextField(1);  
        t6=new TextField(1);  
        t7=new TextField(1);  
        t8=new TextField(1);  
        t9=new TextField(1);  
        t10=new TextField(1);  
        t11=new TextField(1);  
        t12=new TextField(1);  
        t13=new TextField(1);  
        t14=new TextField(1);  
        t15=new TextField(1);  
        t1.setEditable(false);  
        t2.setEditable(false);  
        t3.setEditable(false);  
        t4.setEditable(false);  
        t5.setEditable(false);  
        t6.setEditable(false);  
        t7.setEditable(false);  
        t8.setEditable(false);  
        t9.setEditable(false);  
        t10.setEditable(false);  
        t11.setEditable(false);  
        t12.setEditable(false);  
        t13.setEditable(false);  
        t14.setEditable(false);  
        t15.setEditable(false);  
        p.add(l1);  
        p.add(t1);  
        p.add(t2);  
        p.add(t3);  
        p.add(t4);  
        p.add(t5);  
        p.add(t6);  
        p.add(t7);  
        p.add(l2);  
        p.add(t8);  
        p.add(t9);  
        p.add(t10);  
        p.add(t11);  
        p.add(t12);  
        p.add(t13);  
        p.add(t14);  
        p.add(l3);  
        p.add(t15);  
        p.add(b1);  
        p.add(b2);  
        p.add(b3);  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        b3.addActionListener(this);  
        addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b3)//这个部分是用来刷新的，可是没有起作用  
        {  
            t1.setText(" ");  
            t2.setText(" ");  
            t3.setText(" ");  
            t1.setText(" ");  
            t4.setText(" ");  
            t5.setText(" ");  
            t6.setText(" ");  
            t7.setText(" ");  
            t8.setText(" ");  
            t9.setText(" ");  
            t10.setText(" ");  
            t11.setText(" ");  
            t12.setText(" ");  
            t13.setText(" ");  
            t14.setText(" ");  
            t15.setText(" ");  
            t8.setBackground(Color.white);  
            t9.setBackground(Color.white);  
            t10.setBackground(Color.white);  
            t11.setBackground(Color.white);  
            t12.setBackground(Color.white);  
            t13.setBackground(Color.white);  
            t14.setBackground(Color.white);  
        }  
        if(e.getSource()==b1)  
        {  
            t8.setEditable(true);  
            t9.setEditable(true);  
            t10.setEditable(true);  
            t11.setEditable(true);  
            t12.setEditable(true);  
            t13.setEditable(true);  
            t14.setEditable(true);  
            t15.setEditable(true);  
        }  
        if(e.getSource()==b2)//这里是用Random来生成随机数  
        {  
            Random r=new Random();                  //随机生成一个数x  
            int x1=1+r.nextInt(30);  
            int x2=1+r.nextInt(30);  
            while(x2==x1)//判断是否重复，重复的话重新生成一个数  
            {  
                x2=1+r.nextInt(30);  
                if(x2!=x1) break;  
            }  
            int x3=1+r.nextInt(30);  
            while(x3==x1||x3==x2)  
            {  
                x3=1+r.nextInt(30);  
                if(x3!=x2&&x3!=x1) break;  
            }  
            int x4=1+r.nextInt(30);  
            while(x4==x3|x4==x2||x4==x1)  
            {  
                x4=1+r.nextInt(30);  
                if(x4!=x3&&x4!=x2&&x4!=x1) break;  
            }  
            int x5=1+r.nextInt(30);  
            while(x5==x4||x5==x3||x5==x2||x5==x1)  
            {  
                x5=1+r.nextInt(30);  
                if(x5!=x4&&x5!=x3&&x5!=x2&&x5!=x1) break;  
            }  
            int x6=1+r.nextInt(30);  
            while(x6==x5||x6==x4||x6==x3||x6==x2||x6==x1)  
            {  
                x6=1+r.nextInt(30);  
                if(x6!=x5&&x6!=x4&&x6!=x3&&x6!=x2&&x6!=x1) break;  
            }  
            int x7=1+r.nextInt(30);  
            while(x7==x6||x7==x5||x7==x4||x7==x3||x7==x2||x7==x1)  
            {  
                x7=1+r.nextInt(30);  
                if(x7!=x6&&x7!=x5&&x7!=x4&&x7!=x3&&x7!=x2&&x7!=x1) break;  
            }  
            String y1=Integer.toString(x1);//把生成的随机数放到文本框里  
            t1.setText(y1);  
            try {                                         //时间延迟  
                Thread.sleep(1000);  
                }  
                catch(InterruptedException ex){  
                ex.printStackTrace();  
                }  
            String y2=Integer.toString(x2);  
            t2.setText(y2);  
            try {                                         //时间延迟  
                Thread.sleep(1000);  
                }  
                catch(InterruptedException ex){  
                ex.printStackTrace();  
                }  
            String y3=Integer.toString(x3);  
            t3.setText(y3);  
            try {                                         //时间延迟  
                Thread.sleep(1000);  
                }  
                catch(InterruptedException ex){  
                ex.printStackTrace();  
                }  
            String y4=Integer.toString(x4);  
            t4.setText(y4);  
            try {                                         //时间延迟  
                Thread.sleep(1000);  
                }  
                catch(InterruptedException ex){  
                ex.printStackTrace();  
                }  
            String y5=Integer.toString(x5);  
            t5.setText(y5);  
            try {                                         //时间延迟  
                Thread.sleep(1000);  
                }  
                catch(InterruptedException ex){  
                ex.printStackTrace();  
                }  
            String y6=Integer.toString(x6);  
            t6.setText(y6);  
            try {                                         //时间延迟  
                Thread.sleep(1000);  
                }  
                catch(InterruptedException ex){  
                ex.printStackTrace();  
                }  
            String y7=Integer.toString(x7);  
            t7.setText(y7);  
            int z1=Integer.valueOf(t8.getText()).intValue();  
            int z2=Integer.valueOf(t9.getText()).intValue();  
            int z3=Integer.valueOf(t10.getText()).intValue();  
            int z4=Integer.valueOf(t11.getText()).intValue();  
            int z5=Integer.valueOf(t12.getText()).intValue();  
            int z6=Integer.valueOf(t13.getText()).intValue();  
            int z7=Integer.valueOf(t14.getText()).intValue();  
            int count=0;  
            if(x1==z1||x2==z1||x3==z1||x4==z1||x5==z1||x6==z1||x7==z1) //判断中了几个数  
                {  
                count++;  
                t8.setBackground(Color.green);  
                }  
            else t8.setBackground(Color.red);  
            if(x1==z2||x2==z2||x3==z2||x4==z2||x5==z2||x6==z2||x7==z2)   
                {  
                count++;  
                t9.setBackground(Color.green);  
                }  
            else t9.setBackground(Color.red);  
            if(x1==z3||x2==z3||x3==z3||x4==z3||x5==z3||x6==z3||x7==z3)  
                {  
                count++;  
                t10.setBackground(Color.green);  
                }  
            else t10.setBackground(Color.red);  
            if(x1==z4||x2==z4||x3==z4||x4==z4||x5==z4||x6==z4||x7==z4)   
                {  
                count++;  
                t11.setBackground(Color.green);  
                }  
            else t11.setBackground(Color.red);  
            if(x1==z5||x2==z5||x3==z5||x4==z5||x5==z5||x6==z5||x7==z5)   
                {  
                count++;  
                t12.setBackground(Color.green);  
                }  
            else t12.setBackground(Color.red);  
            if(x1==z6||x2==z6||x3==z6||x4==z6||x5==z6||x6==z6||x7==z6)   
                {  
                count++;  
                t13.setBackground(Color.green);  
                }  
            else t13.setBackground(Color.red);  
            if(x1==z7||x2==z7||x3==z7||x4==z7||x5==z7||x6==z7||x7==z7)  
                {  
                count++;  
                t14.setBackground(Color.green);  
                }  
            else t14.setBackground(Color.red);  
            int c=0;  
            if(count==3) c=50;  
            if(count==4) c=500;  
            if(count==5) c=10000;  
            if(count==6) c=200000;  
            if(count==7) c=5000000;  
            else c=0;  
            int cc=Integer.valueOf(t15.getText()).intValue();//弹出一个对话框来说明中奖信息  
            int money=cc*c;  
            String n1="您总共投注了";  
            String n2=Integer.toString(count);  
            String n3="张彩票，";  
            String n4="每张中了";  
            String n5="个号码，";  
            String m1="恭喜您获得";  
            String m2="元的奖励!!";  
            String m=Integer.toString(money);  
            String m3=n1+t15.getText()+n3+n4+n2+n5+m1+m+m2;  
            Dialog d=new Dialog(this,"获奖信息");  
            d.setVisible(true);  
            d.setSize(300, 250);  
            TextField f=new TextField(m3);  
            d.add(f);  
            d.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){setVisible(false);}});  
        }   
    }  
}  