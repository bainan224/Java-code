package frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;

import kit.Unit;
import entity.*;
import daoimpl.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;

public class User_RePassword implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label_1;
	private JTextField textField_2;
	private JLabel label_2;
	private JTextField textField_3;
	private JLabel label_3;
	private JComboBox comboBox;
	private JButton btnNewButton;

	/**�������ݿ��������**/
	private Userimpl usermysql = new Userimpl();
	
	public User_RePassword() 
	{
		initialize();
		frame.setVisible(true);
	}


	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 215, 330);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "�޸�����", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 179, 271);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("�û��˻���");
		label.setBounds(10, 21, 159, 15);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(10, 40, 159, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 87, 159, 22);
		panel.add(textField_1);
		
		label_1 = new JLabel("ԭʼ���룺");
		label_1.setBounds(10, 68, 159, 15);
		panel.add(label_1);
		
		textField_2 = new JPasswordField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 134, 159, 22);
		panel.add(textField_2);
		
		label_2 = new JLabel("�����룺");
		label_2.setBounds(10, 115, 159, 15);
		panel.add(label_2);
		
		textField_3 = new JPasswordField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 181, 159, 22);
		panel.add(textField_3);
		
		label_3 = new JLabel("�ٴ����������룺");
		label_3.setBounds(10, 162, 159, 15);
		panel.add(label_3);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ա��", "����Ա"}));
		comboBox.setBounds(80, 209, 89, 18);
		panel.add(comboBox);
		
		JLabel label_4 = new JLabel("�û�Ȩ�ޣ�");
		label_4.setBounds(10, 209, 68, 15);
		panel.add(label_4);
		
		btnNewButton = new JButton("�޸�����(Enter)");
		btnNewButton.registerKeyboardAction(this, KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0),JComponent.WHEN_IN_FOCUSED_WINDOW);
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"�뽫��Ϣ��д����","��ʾ��Ϣ", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					if(textField_2.getText().equals(textField_3.getText()))
					{
						User user = new User();
						user.setUser(textField.getText());
						user.setPassword(textField_1.getText());
						user.setAdmin((String)comboBox.getSelectedItem());
						user=usermysql.login(user);
						if(user==null)
						{
							JOptionPane.showMessageDialog(null,"�޸�ʧ�ܣ������û������������","������ʾ", JOptionPane.INFORMATION_MESSAGE);
						}
						else
						{
							usermysql.rePassword(user, textField_2.getText());
							JOptionPane.showMessageDialog(null,"�޸�����ɹ��������������½��","������ʾ", JOptionPane.INFORMATION_MESSAGE);
							user.setPassword(textField_2.getText());
							Unit.nowUser=usermysql.login(user);
							Unit.logmysql.rePassword(Unit.log.setLog("��", 0,user.getPassword()));
							frame.dispose();
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"�������������벻һ��","��ʾ��Ϣ", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
		});
		btnNewButton.setBounds(10, 238, 159, 25);
		panel.add(btnNewButton);
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btnNewButton)
		{
			if(textField.getText().equals("")||textField_1.getText().equals("")||textField_2.getText().equals("")||textField_3.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"�뽫��Ϣ��д����","��ʾ��Ϣ", JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				if(textField_2.getText().equals(textField_3.getText()))
				{
					User user = new User();
					user.setUser(textField.getText());
					user.setPassword(textField_1.getText());
					user.setAdmin((String)comboBox.getSelectedItem());
					user=usermysql.login(user);
					if(user==null)
					{
						JOptionPane.showMessageDialog(null,"�޸�ʧ�ܣ������û������������","������ʾ", JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						usermysql.rePassword(user, textField_2.getText());
						JOptionPane.showMessageDialog(null,"�޸�����ɹ��������������½��","������ʾ", JOptionPane.INFORMATION_MESSAGE);
						user.setPassword(textField_2.getText());
						Unit.nowUser=usermysql.login(user);
						Unit.logmysql.rePassword(Unit.log.setLog("��", 0,user.getPassword()));
						frame.dispose();
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"�������������벻һ��","��ʾ��Ϣ", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}
}
