package edu.csust.xgen;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class View extends JFrame {

	private JPanel contentPane;
	JLabel firstLabel = new JLabel("0");
	JLabel secondLabel = new JLabel("0");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public View() {
		/**
		 * 创建界面
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		// setResizable(false);
		setTitle("计算器");

		/**
		 * 设置容器和布局
		 */
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setPreferredSize(new Dimension(350, 200));
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.NORTH);

		JPanel panel2 = new JPanel();
		contentPane.add(panel2, BorderLayout.CENTER);
		panel2.setLayout(new GridLayout(6, 4, 5, 5));

		/**
		 * 创建按钮并安装监听器
		 */
		String name[] = { "%", "√", "x²", "¹/x", "CE", "C", "←", "÷", "7", "8", "9", "×", "4", "5", "6", "－", "1", "2",
				"3", "+", "±", "0", ".", "=" };
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		secondLabel.setForeground(Color.GRAY);
		
		secondLabel.setFont(new Font("黑体", Font.PLAIN, 30));
		secondLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(secondLabel);
		firstLabel.setForeground(Color.BLACK);
		firstLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
				firstLabel.setFont(new Font("黑体", Font.PLAIN, 40));
				panel.add(firstLabel);
				BtnListener listener = new BtnListener(firstLabel, secondLabel);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton(name[i]);
			JLabel btnlabel = new JLabel();
			panel2.add(button);
			button.setActionCommand(name[i]);
			button.addActionListener(listener);
		}

	}
}
