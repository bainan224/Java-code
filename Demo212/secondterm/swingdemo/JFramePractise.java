package swingdemo;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFramePractise extends JFrame implements ActionListener{
	 private JLabel jl1=null;
	 private JTextField jtf1=null;
     
	 private JButton jb1=null;
	 private JLabel jl2=null;

	public JFramePractise() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
	}

	public JFramePractise(String title) throws HeadlessException {
		super("立方计算器");
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container container=this.getContentPane();
       
        container.setLayout(new FlowLayout());
      
        jl1=new JLabel("请输入一个整数：");
        jtf1=new JTextField(10);
      
        jb1=new JButton("计算");
        jl2=new JLabel("输出结果：");
        
        jb1.addActionListener(this);
        
        container.add(jl1);
        container.add(jtf1);
  
        container.add(jb1);
        container.add(jl2);
        
        this.setSize(300,200);
        this.setLocation(200, 200);
        this.setVisible(true);		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int total=Integer.parseInt(jtf1.getText());
		int value=total*total*total;
		jl2.setText("输出结果："+value);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new JFramePractise("立方计算器");
	}
}
