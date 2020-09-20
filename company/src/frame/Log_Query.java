package frame;

import java.awt.EventQueue;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import kit.Unit;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log_Query 
{
	private JFrame frame;
	private JComboBox comboBox;
	private DefaultTableModel DTM;
	private String tableTitle[]={"��־����", "����ʱ��","�����û�","��������","��������","������Ϣ"};
	private JTable table;
	private JButton button;

	public Log_Query() 
	{
		initialize();
		frame.setVisible(true);
	}

	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 299);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "��ѯ��־", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 10, 539, 241);
		frame.getContentPane().add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 26, 519, 182);
		panel.add(scrollPane);
		
		JLabel label = new JLabel("��ѡ����־���ͣ�");
		label.setBounds(10, 216, 114, 15);
		panel.add(label);
		
		button = new JButton("��ѯ");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				refreshTable();
			}
		});
		button.setBounds(362, 212, 167, 23);
		panel.add(button);
		
		comboBox = new JComboBox();
		comboBox.addItem("������־");
		comboBox.addItem("ע����־");
		comboBox.addItem("��½��־");
		comboBox.addItem("�޸�����");
		
		comboBox.addItem("�����޸�");
		comboBox.addItem("�������");
		comboBox.addItem("��������");
		
		comboBox.addItem("Ա�����");
		comboBox.addItem("Ա���޸�");
		comboBox.addItem("Ա��ɾ��");
		comboBox.addItem("ְλ����");
		
		comboBox.addItem("���ʿ����");
		comboBox.addItem("���ʿ�ɾ��");
		comboBox.addItem("���ʿ�ʹ��");
		comboBox.setBounds(109, 212, 243, 22);
		panel.add(comboBox);
		
		table = new JTable();
		DTM=new DefaultTableModel(new Object[][] {},tableTitle);
		table.setModel(DTM);
		refreshTable();
		scrollPane.setViewportView(table);
	}

	private void refreshTable()
	{
		List list = Unit.logmysql.getAll();
		Object tableText[][] = new Object[list.size()][];
		int count = 0;
		for(int i=0;i<list.size();i++)
		{
			HashMap hm = (HashMap) list.get(i);
			Object temp[]=new Object[6];
			for(Object key:hm.keySet())
			{
				if(key.equals("date"))
				{
					temp[0]=hm.get(key);
				}
				if(key.equals("type"))
				{
					temp[1]=hm.get(key);
				}
				if(key.equals("userid"))
				{
					temp[2]=hm.get(key);
				}
				if(key.equals("itemid"))
				{
					temp[3]=hm.get(key);
				}
				if(key.equals("count"))
				{
					temp[4]=hm.get(key);
				}
				if(key.equals("note"))
				{
					temp[5]=hm.get(key);
				}
			}
			if(temp[1].equals(comboBox.getSelectedItem()))
			{
				tableText[count]=temp;
				count++;
			}
			else if(comboBox.getSelectedItem().equals("������־"))
			{
				tableText[i]=temp;
			}
		}
		count = 0;
		DTM.setDataVector(tableText,tableTitle);	
	}
}
