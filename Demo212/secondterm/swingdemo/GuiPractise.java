package swingdemo;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

public class GuiPractise extends JFrame implements ActionListener {

	JComboBox<Phone> phones = null;
	JTextArea jta = null;

	public GuiPractise(String title) throws HeadlessException {

		Box boxv1 = Box.createVerticalBox();

		JRadioButton jrb1 = new JRadioButton("江苏无锡");
		jrb1.setActionCommand("江苏无锡");
		JRadioButton jrb2 = new JRadioButton("江苏南京");
		jrb2.setActionCommand("江苏南京");

		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);

		boxv1.add(new Label("籍贯:"));
		boxv1.add(jrb1);
		boxv1.add(jrb2);
		boxv1.add(Box.createVerticalStrut(100));
		jrb1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				jta.setText(jta.getText() + "\n籍贯：" + bg.getSelection().getActionCommand());
			}
		});

		Box boxv2 = Box.createVerticalBox();

		String[] strs = new String[] { "高数                        ", "英语                      ", "面向对象程序设计         ",
				"HTML          ", "传统文化                      " };
		JList<String> jl1 = new JList(strs);
		boxv2.add(new JScrollPane(jl1));
		jl1.setBorder(BorderFactory.createTitledBorder("请选择你的课程:"));
		jl1.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int[] indices = jl1.getSelectedIndices();
				List<String> list = jl1.getSelectedValuesList();
				for (int i = 0; i < list.size(); i++) {
					jta.setText(jta.getText() + "\n选修的课程:" + list.get(i));
				}
			}
		});
		boxv2.add(Box.createVerticalStrut(100));

		Box boxv3 = Box.createVerticalBox();
		Phone[] phs=new Phone[]{new Phone("小米", 1800),
	                new Phone("华为", 3000),
	                new Phone("iPhone", 5800),
	                new Phone("OPPO", 1500)};

		phones = new JComboBox<Phone>(phs);
		phones.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				jta.setText(jta.getText() + "\n手机品牌：" + phones.getSelectedItem());
			}
		});
		boxv3.add(phones);
		phones.setBorder(BorderFactory.createTitledBorder("手机品牌："));
		boxv3.add(Box.createVerticalStrut(100));

		Box boxh1 = Box.createHorizontalBox();
		boxh1.add(boxv1);
		boxh1.add(boxv2);
		boxh1.add(boxv3);
	
		Box boxh2 = Box.createHorizontalBox();
		jta = new JTextArea( 100, 100);
		boxh2.add(jta);

		Box boxh3 = Box.createVerticalBox();
		boxh3.add(boxh1);
		boxh3.add(boxh2);
		
        this.setContentPane(boxh3);
        
        this.pack();
        this.setLocation(200, 200);
       
        this.setVisible(true);	

	}

	public static void main(String[] args) {
		new GuiPractise("GUI练习");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}