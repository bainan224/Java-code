package swingdemo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class Demo02 extends JFrame implements ActionListener{
      JMenuBar jmb;
      JMenu jm1,jm2;
      JMenu jm3,jm4,jm5,jm6,jm7,jm8,jm9;
      JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5,jmi6,jmi7,jmi8,jmi9,jmi10;
      public static void main(String[] args) {
    	  Demo02 demo02=new Demo02();
    	  
      }
      public Demo02() {
    	  jmb=new JMenuBar();
    	  jm1=new JMenu("��Ϣ");
    	  jm2=new JMenu("����");
    	  jm3=new JMenu("Ա������");
    	  jm4=new JMenu("Ա������");
    	  jm5=new JMenu("Ա����Ϣ");
    	  jm6=new JMenu("ְλ����");
    	  jm7=new JMenu("ϵͳ����");
    	  jm8=new JMenu("����ʹ��˵��");
    	  jm9=new JMenu("�˳�����");
    	  jmi1=new JMenuItem("���ʱ�");
    	  jmi2=new JMenuItem("���ʼӳ�");
    	  jmi3=new JMenuItem("����");
    	  jmi4=new JMenuItem("�³�");
    	  jmi5=new JMenuItem("��ѯ");
    	  jmi6=new JMenuItem("����");
    	  jmi7=new JMenuItem("ɾ��");
    	  jmi8=new JMenuItem("ְλ��Ϣ");
    	  jmi9=new JMenuItem("��/��ְ");
    	  jmi10=new JMenuItem("�û��������"); 
    	  
    	  jm3.add(jmi1);
    	  jm3.add(jmi2);
    	  
    	  jm4.add(jmi3);
    	  jm4.add(jmi4);
    	  
    	  jm5.add(jmi5);
    	  jm5.add(jmi6);
    	  jm5.add(jmi7);
    	  
    	  jm6.add(jmi8);
    	  jm6.add(jmi9);
    	  
    	  jm7.add(jmi10);
    	  
    	  jm1.add(jm3);
    	  jm1.add(jm4);
    	  jm1.add(jm5);
    	  jm1.add(jm6);
    	  jm1.add(jm7);
    	  
    	  jm2.add(jm8);
    	  jm2.add(jm9);
    	  
    	  jmb.add(jm1);
    	  jmb.add(jm2);
    	  
    	  this.add(jmb,BorderLayout.NORTH);
    	  
    	  this.setTitle("��ҵ���¹���Ա��¼ϵͳ");
    	  this.setSize(500,400);
    	  this.setLocation(200,200);
    	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  this.setVisible(true);
    	  
    	  
      }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command=e.getActionCommand();
		if("�˳�����".equals(command)) {
			System.exit(WindowConstants.EXIT_ON_CLOSE);
		}
		
	}
      
      
}

