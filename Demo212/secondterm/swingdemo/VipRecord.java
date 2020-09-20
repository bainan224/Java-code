package swingdemo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VipRecord extends JFrame {

	public static void main(String[] args) {
		JFrame jf = new JFrame("��Ա�Ǽ�¼���");
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout(5, 0));

		JPanel jpTop = new JPanel();
		jpTop.setLayout(new FlowLayout());

		JPanel jpCenter = new JPanel();
		jpCenter.setLayout(new GridLayout(3, 2, 10, 10));

		JPanel jpBottom = new JPanel();
		jpBottom.setLayout(new GridLayout(1, 2, 5, 5));

		JLabel jl0 = new JLabel("��Ա�Ǽ�¼��");

		JLabel jl1 = new JLabel("��        ��");
		JTextField jtf1 = new JTextField("С����");

		JLabel jl2 = new JLabel("��        ��");
		JTextField jtf2 = new JTextField("Ů");

		JLabel jl3 = new JLabel("��ϵ�绰");
		JTextField jtf3 = new JTextField("1234567890");

		JLabel jl4 = new JLabel("��       ��");
		JTextField jtf4 = new JTextField("�����Ա");

		JLabel jl5 = new JLabel("��        ��");
		JTextField jtf5 = new JTextField("0.8");

		JLabel jl6 = new JLabel("�Ƿ��ʧ");
		JTextField jtf6 = new JTextField("��");

		JLabel jl7 = new JLabel("������λ");
		JTextField jtf7 = new JTextField("�Ϻ���ͨ���乫˾");

		jpTop.add(jl0);

		jpCenter.add(jl1);
		jpCenter.add(jtf1);
		jpCenter.add(jl2);
		jpCenter.add(jtf2);
		jpCenter.add(jl3);
		jpCenter.add(jtf3);
		jpCenter.add(jl4);
		jpCenter.add(jtf4);
		jpCenter.add(jl5);
		jpCenter.add(jtf5);
		jpCenter.add(jl6);
		jpCenter.add(jtf6);

		jpBottom.add(jl7);
		jpBottom.add(jtf7);

		jf.add(jp);
		jp.add(jpTop, BorderLayout.NORTH);
		jp.add(jpCenter, BorderLayout.CENTER);
		jp.add(jpBottom, BorderLayout.SOUTH);

		jf.setVisible(true);
		jf.setSize(500, 200);
		jf.setLocationRelativeTo(null);

	}

}
