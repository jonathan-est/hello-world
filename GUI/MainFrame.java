package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame implements ActionListener{

	
		// TODO �Զ����ɵķ������
	public MainFrame() {
		setTitle("��¼ϵͳ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();//��ȡ�����
		c.setLayout(new GridLayout(5,1));//���ָ�ʽ��5��1��
		JPanel jp = new JPanel();//�����
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		jp4.setBorder(new EmptyBorder(0,5,5,5));//���ñ߽����
		jp4.setLayout(new GridLayout(1,2,10,0));//��ť��岼��
		/*�����*/
		JLabel name = new JLabel("������");
		jp.add(name);
		JTextField xm = new JTextField(20);
		jp.add(xm);
		JLabel stuNO = new JLabel("�˺ţ�");
		jp1.add(stuNO);
		JTextField xh = new JTextField(20);
		jp1.add(xh);
		JLabel password = new JLabel("���룺");
		jp2.add(password);
		JPasswordField mm = new JPasswordField(20);
		jp2.add(mm);
		/* ��ѡ��*/
		JCheckBox jc = new JCheckBox("��ס����");
		jp3.add(jc);
		JCheckBox jc1 = new JCheckBox("�Զ���¼");
		jp3.add(jc1);
		FocusListener f1 = new TFLisener(xm);//�۽��¼�����
		FocusListener f2 = new TFLisener(xh);
		FocusListener f3 = new TFLisener(mm);
		xm.addFocusListener(f1);
		xh.addFocusListener(f2);
		mm.addFocusListener(f3);
		
		// JPanel jp1 = new JPanel();
		JButton b1 = new JButton("��¼");//��ť
		JButton b2 = new JButton("ע��");
		b1.addActionListener(this);
		jp4.add(b1);
		jp4.add(b2);
		c.add(jp);
		c.add(jp1);
		c.add(jp2);
		c.add(jp3);
		c.add(jp4);
		
	}
	public static void main(String[] args) {
		MainFrame f = new MainFrame();
		f.setBounds(450, 200, 350, 250);
		f.setVisible(true);
}



class TFLisener implements FocusListener {
	JTextField jt;

	public TFLisener(JTextField j) {
		jt = j;
	}

	@Override
	public void focusGained(FocusEvent e) {
		// TODO �Զ����ɵķ������
		jt.setBackground(Color.yellow);
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO �Զ����ɵķ������
		jt.setBackground(Color.WHITE);
	}

}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO �Զ����ɵķ������
		setVisible(false);
		FristPage fs = new FristPage();
	}
}
    