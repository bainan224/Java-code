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
    	  jm1=new JMenu("信息");
    	  jm2=new JMenu("更多");
    	  jm3=new JMenu("员工工资");
    	  jm4=new JMenu("员工考核");
    	  jm5=new JMenu("员工信息");
    	  jm6=new JMenu("职位管理");
    	  jm7=new JMenu("系统管理");
    	  jm8=new JMenu("程序使用说明");
    	  jm9=new JMenu("退出程序");
    	  jmi1=new JMenuItem("工资表");
    	  jmi2=new JMenuItem("工资加成");
    	  jmi3=new JMenuItem("周勤");
    	  jmi4=new JMenuItem("月迟");
    	  jmi5=new JMenuItem("查询");
    	  jmi6=new JMenuItem("增加");
    	  jmi7=new JMenuItem("删除");
    	  jmi8=new JMenuItem("职位信息");
    	  jmi9=new JMenuItem("升/降职");
    	  jmi10=new JMenuItem("用户密码管理"); 
    	  
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
    	  
    	  this.setTitle("企业人事管理员登录系统");
    	  this.setSize(500,400);
    	  this.setLocation(200,200);
    	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  this.setVisible(true);
    	  
    	  
      }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command=e.getActionCommand();
		if("退出程序".equals(command)) {
			System.exit(WindowConstants.EXIT_ON_CLOSE);
		}
		
	}
      
      
}

