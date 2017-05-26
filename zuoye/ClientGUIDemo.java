package com.qqqunliao;
import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
//import java.sql.Date;

import javax.swing.*;

/**
 * @date ������
 * @author abc
 *
 */

public class ClientGUIDemo  {
    private Socket s;
    private static OutputStream out;
    private InputStream in;
    static String ipServer ;
    int deterCnt;
    int buttonCnt;

    public static JFrame signInFrame = new JFrame("QQ2035");
//  public static JFrame waitJFrame = new JFrame("QQ2035");
    public static JFrame ipFrame = new JFrame("QQ2035");
    public static JTextField ipText = new JTextField("127.0.0.1",15);
    public static void main(String[] args) {

        //���������ip����
        createIPFrame();
    }

    /**
     * ����ȫ���û����������
     * 
     */
    public static JTextField countText = new JTextField("QQ����/�ֻ�/����",15);
    public static JPasswordField pwdText = new JPasswordField(15);


    public static void createIPFrame(){
        //�������������IP����
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        panel2.setLayout( new GridLayout(2,1,8,8) );

        JButton ipButton = new JButton("              ��  ��              ");

        signInFrame.setLayout( new BorderLayout() );
        panel2.add(ipText);
        panel2.add(ipButton);

        panel.add( createTopLayout(),BorderLayout.NORTH );  
        panel.add( panel2,BorderLayout.CENTER );

        ipButton.addActionListener( new ActionListener(){
            //��ȡ����ip�¼�����    
            @Override
            public void actionPerformed(ActionEvent e) {
                ipServer = ipText.getText();
                ipFrame.dispose();
                createsignInFrame();
            }

        }); 

        ipFrame.setContentPane(panel);
        ipFrame.setSize(440,335);
        ipFrame.setVisible(true);   
    }

    public static void createsignInFrame(){
        JPanel panel = new JPanel();
        //panel.setLayout( new BorderLayout() );
        signInFrame.setLayout( new BorderLayout() );

        panel.add( createTopLayout(),BorderLayout.NORTH );  

        panel.add( createCenterLayout(),BorderLayout.CENTER );

        signInFrame.setContentPane(panel);
        signInFrame.setSize(440,335);
        signInFrame.setVisible(true);   
    }

    /*
     * ��������
     */
     public void open() throws IOException{
            s = new Socket(ipServer, 8000);

            //�ͻ��˵�in ���ӵ������out
            in = s.getInputStream();
            //�ͻ��˵�out���ӵ���������in
            out = s.getOutputStream();

            //�������д����Ӧ�ò��ý���һ���µ��̣߳��õ�����Ͱ�ť������
            //Reader�̸߳���: �ӿ���̨��ȡ��Ϣд�뵽��������out.
            // new Reader(out).start();


//          �����û��������� 
//          �û���������һ���ύ
            char[] password = pwdText.getPassword();
            System.out.print(countText.getText() + new String(password)  + "\n");
            out.write( ( countText.getText() + new String(password) + "\n").getBytes() );
            out.flush();
            new Writer(in).start();
          }

    public static void craetJFrameWait() {
        //��¼�ȴ�����
        JFrame waitFrame = new JFrame();
        JPanel waitPanel = new JPanel();
        waitFrame.setLayout( new BorderLayout() );
        waitFrame.setTitle("deng");

        waitPanel.add( createTopLayout(),BorderLayout.NORTH );  

        waitPanel.add( new JLabel("dsvfdf"),BorderLayout.CENTER );  

        waitFrame.setContentPane(waitPanel);
        waitFrame.setSize(440,335);
        waitFrame.setVisible(true);

        waitFrame.setVisible(false);    
    }
    public static JLabel createTopLayout(){
        Icon ic = new ImageIcon("G:\\java\\ico_pngForJava\\QQ.PNG");
        JLabel label1 = new JLabel(ic);
        return label1;
    }

    public static JPanel createCenterLayout(){

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout( new BorderLayout() );
        //icoHead.setBounds(100, 200, 300, 500);;
//      ͷ��
        Icon ic = new ImageIcon("G:\\java\\ico_pngForJava\\SginInHead.PNG");
        JLabel label1 = new JLabel(ic);

        centerPanel.add(label1,BorderLayout.WEST);

        centerPanel.add( createUserPwdOptionLayout(),BorderLayout.CENTER );


        centerPanel.add( createSignUpButtonLayout(),BorderLayout.SOUTH );

        return centerPanel;
    }


    public static JPanel createUserPwdOptionLayout(){
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout( new BorderLayout() );

        panelCenter.add( createUserPwdLayout(),BorderLayout.NORTH);
        panelCenter.add( createOptionLayout(),BorderLayout.CENTER);
        return panelCenter;
    }

    public static JPanel createUserPwdLayout(){
        JPanel userPwdLayout = new JPanel();
        userPwdLayout.setLayout( new GridLayout(2,1,3,4) );
        userPwdLayout.add( createUserLayout() );
        userPwdLayout.add( createPwdLayout() );

        return userPwdLayout;
    }

    public static JPanel createUserLayout(){
        JPanel userLayout = new JPanel();
        userLayout.setLayout( new BorderLayout() );

        JLabel singUp = new JLabel("    ע���ʺ�");

        //countText
        userLayout.add(countText,BorderLayout.WEST);
        userLayout.add(singUp,BorderLayout.CENTER);
        return userLayout;      
    }

    public static JPanel createPwdLayout(){
        JPanel pwdLayout = new JPanel();
        pwdLayout.setLayout( new BorderLayout() );

        JLabel findPwd = new JLabel("    �һ�����");

        pwdLayout.add(pwdText,BorderLayout.WEST);
        pwdLayout.add(findPwd,BorderLayout.CENTER);
        return pwdLayout;       
    }
    public static JPanel createOptionLayout(){
        JPanel optionLayout = new JPanel();

        JCheckBox rememberPwd = new JCheckBox("��ס����",false);
        JCheckBox autoSginIn = new JCheckBox("�Զ���¼",true);

        optionLayout.setLayout( new GridLayout(1,2,7,2) );

        optionLayout.add(rememberPwd);
        optionLayout.add(autoSginIn);
        return optionLayout;
    }

    public static JPanel createSignUpButtonLayout(){
        JPanel buttonLayout = new JPanel();
        JButton sginInButton = new JButton("              ��   ¼              ");
        buttonLayout.add(sginInButton);

        sginInButton.addActionListener( new ActionListener(){
            //��¼�¼�����    
            @Override
            public void actionPerformed(ActionEvent e) {        

//              ���ֹرշ���ֻ��ʹ�ô��ڲ��ɼ�,��Դ��û���ͷţ���ε���֮���ʹ��jvm��Դ�����˷�
//              signInFrame.setVisible(false);

//              �����ַ����رմ��ڿ����ͷ���Դ
                signInFrame.dispose();


//TODO ��¼������ʾ����  but û�ɹ� ,��¼���岻��������ʾ���п����о���2s����Գɹ���ת��������
//                  craetJFrameWait();          
//              //������������
                ClientGUIDemo client = new ClientGUIDemo();
                JFrame chatHouseFrame = chatHouse();        
                chatHouseFrame.setTitle("QQ������" + "����" + countText.getText() );

                try {
                    //��������
                    client.open();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });     
        return buttonLayout;
    }

    /**
     * �������
     * @return
     */
    public static JFrame chatHouse(){
         JFrame chatHouseFrame = new JFrame("QQ������");
         JPanel chatMainPanel = new JPanel();
         chatMainPanel.setLayout( new BorderLayout() );

         chatMainPanel.add( craeteChatArea(),BorderLayout.WEST);

         //��Ϣ��ʾ������ʾ֪ͨ����棬��Ա�ŵ���Ϣ
         chatMainPanel.add( createInfoArea(),BorderLayout.CENTER );

         chatHouseFrame.setContentPane(chatMainPanel);
         chatHouseFrame.setSize(700,505);
         chatHouseFrame.setVisible(true);
         return chatHouseFrame;
    }

    public static JPanel  craeteChatArea(){
        JPanel chatAreaPanel = new JPanel();
        chatAreaPanel.setLayout( new BorderLayout() );

        chatAreaPanel.add( createRecvArea(),BorderLayout.NORTH);
        chatAreaPanel.add( createSendArea(),BorderLayout.CENTER);
        chatAreaPanel.add( createSendButtonArea(),BorderLayout.SOUTH);
        return chatAreaPanel;
    }

    //������Ϣ��ʾ��
    public static JTextArea recviveArea = new JTextArea(20,40);
    //������Ϣ��ʾ��
    public static JTextArea sendArea = new JTextArea(5,40);
    //�����Ա��Ϣ��
    public static JTextArea infoOfMemberText = new JTextArea("����Ա:����\n"
                                                            + "����\n"
                                                            + "����\n"
                                                            + "����\n"
                                                            + "����\n"
                                                            + "����\n"
                                                            + "Ǯ��\n"
                                                            + "���\n",2,2);

    public static JPanel createRecvArea(){
        JPanel recviveAreaPanel = new JPanel();
        JScrollPane recviveScroll = new JScrollPane(recviveArea);

        //������Ϣ����ֱ�������Զ�����
        recviveScroll.setVerticalScrollBarPolicy( 
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
        recviveArea.setEditable(false);
        recviveArea.setLineWrap(true); //������ʾ�����Զ�����

        recviveAreaPanel.add(recviveScroll);
        return recviveAreaPanel;
    }

    public static JPanel createSendArea(){
        JPanel sendAreaPanel = new JPanel();
        JScrollPane sendScroll = new JScrollPane(sendArea);

        //������Ϣ����ֱ�������Զ�����
        sendScroll.setVerticalScrollBarPolicy( 
                        JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
        sendArea.setLineWrap(true); //������ʾ�����Զ�����
        sendAreaPanel.setLayout(new BorderLayout());

        sendAreaPanel.add( createAssLabel() ,BorderLayout.CENTER);
        sendAreaPanel.add(sendScroll,BorderLayout.SOUTH);
        return sendAreaPanel;   
    }

    public static JLabel createAssLabel(){
        Icon ic = new ImageIcon("G:\\java\\ico_pngForJava\\ass.PNG");
        JLabel assLabel = new JLabel(ic);
        return assLabel;
    }

    public static JPanel createSendButtonArea(){
        JPanel SendButtonAreaPanel = new JPanel();
        SendButtonAreaPanel.setLayout( new BorderLayout() );

        //��һ���Ӧ��QQ��������С�����
        SendButtonAreaPanel.add( new JLabel("CF�ϱ���������????????"),BorderLayout.WEST );
        SendButtonAreaPanel.add( craetSendButton(),BorderLayout.EAST );
        return SendButtonAreaPanel;
    }

    public static JPanel craetSendButton(){
        //�������رպͷ��Ͱ�ť���
        JPanel buttonPanel = new JPanel();
        JButton close = new JButton("�ر�(C)");
        JButton send = new JButton("����(S)");
        buttonPanel.add(close);
        buttonPanel.add(send);

        send.addActionListener( new ActionListener(){
            //�����¼�����    
            @Override
            public void actionPerformed(ActionEvent e) {


//              String sendContent = sendArea.getText();
//              String sendInit = new String();
//
//              int cntLength = 140 - sendContent.length();
//              for( int i = 0; i < cntLength;i++ ){
//                  sendInit = sendInit + "  ";
//              }
//              sendInit = sendInit + sendContent;

                try {
                    reader();
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
//              recviveArea.append(currentDate.format(new Date()) + "\r\n");
//              recviveArea.append( sendArea.getText() + "\r\n" + "\r\n" );
                sendArea.setText(null);
            }

        });

        close.addActionListener( new ActionListener(){
            //�ر��¼�����    
            @Override
            public void actionPerformed(ActionEvent e) {            
                System.exit(0);
            }

        });

        return buttonPanel; 
    }

    public static JPanel  createInfoArea(){
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout( new GridLayout(2,1) );

        Icon ic = new ImageIcon("G:\\java\\ico_pngForJava\\Advertisement.PNG");
        JLabel label1 = new JLabel(ic);
        infoPanel.add(label1);
        infoPanel.add( createInfoOfMemberArea() );

        return infoPanel;
    }

    public static JPanel createInfoOfMemberArea(){
        JPanel infoOfMemberPanel = new JPanel();
        infoOfMemberPanel.setLayout(new BorderLayout() );

        JScrollPane infoScroll = new JScrollPane(infoOfMemberText);
        infoScroll.setVerticalScrollBarPolicy( 
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        infoOfMemberText.setEditable(false);

        infoOfMemberPanel.add( new JLabel("�����Ա"),BorderLayout.NORTH);
        infoOfMemberPanel.add(infoScroll);
        return infoOfMemberPanel;
    }

//  public static JPanel memberArea(){
//      
//      
//      JScrollPane sendScroll = new JScrollPane(sendArea);
//      
//      //������Ϣ����ֱ�������Զ�����
//      sendScroll.setVerticalScrollBarPolicy( 
//                      JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//  }


    /**
     * ���Ͳ�Ӧ����Ϊһ���̣߳�����һ��������ͨ�����Ͱ�ť
     * ����¼���������.
     * @throws 
     */
//Reader�̸߳���: �ӿ���̨��ȡ��Ϣд�뵽��������out.   
//  private class Reader extends Thread{
//    OutputStream out;
//      //private Scanner console;
//    public Reader(OutputStream out ) {
//      this.out = out;
//    }
//    public void run(){
//     /*   �滻Ϊ��������ȡ
//      *  console = new Scanner(System.in);
//      */
//      while(true){
//        try{
//          String str = sendArea.getText();
//          out.write((str+"\n").getBytes());
//          out.flush();
//          if(str.startsWith("bye")){
//            break;
//          }
//        }catch(IOException e){
//          e.printStackTrace();
//          break;
//        }
//      }
//    }
//  }

    public static void reader() throws IOException{ 
//      final SimpleDateFormat currentDate = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");           
        String str = sendArea.getText();
        out.write((str + "\n").getBytes());
        out.flush();
    }


    //Writer�̸߳���: �ӷ�������inȡ��Ϣ��ʾ������̨.
    private class Writer extends Thread{
      InputStream in;
      public Writer(InputStream in) {
        this.in = in;
        setDaemon(true);
      }
      public void run(){
        try{
          int b;
          byte[] readByte = new byte[300];
          while(( b = in.read(readByte))!=-1){

            String str=new String(readByte,0,b,"UTF-8");
            recviveArea.append( str );
            System.out.print(str); 
            readByte = new byte[200];//�������
          }
        }catch(IOException e){
          e.printStackTrace();
        }
      }
    }
}