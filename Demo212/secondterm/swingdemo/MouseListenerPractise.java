package swingdemo;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MouseListenerPractise extends JFrame implements MouseListener, FocusListener {

	JTextField jtf = null;
	JButton jbgo = null;
	
	public MouseListenerPractise() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
	}

	public MouseListenerPractise(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
		jtf = new JTextField(40);
		jtf.setText("");
	
		jbgo = new JButton("按钮");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		Container jp = this.getContentPane();
		jp.setLayout(null);

		jp.add(jtf);
		jtf.setBounds(50, 250, 200, 50);

		jtf.addMouseListener(this);
		jtf.addFocusListener(this);

		jp.add(jbgo);
		jbgo.setBounds(50, 320, 100, 60);

		this.setSize(500, 500);

		this.setLocation(200, 100);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MouseListenerPractise("Focus及Mouse事件监听器\r\n" );

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		jtf.setText(jtf.getText() + "\n文本输入框失去焦点了！");
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
        jtf.setText(jtf.getText() + "\n鼠标移动：" + e.getX() + e.getY());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}