package fxh;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class WeiboApp   extends JFrame{
	
	public WeiboApp(){
		super();
		initUI();
	}
	
	private void initUI(){
		JPanel panel=new JPanel();
		 /* ���ֲ���������߲���������
         * ������ò���Ϊ null
         */
        panel.setLayout(null);

        // ���� JLabel
        JLabel customerLabel = new JLabel("�ͻ����ƣ�");
        /* ������������������λ�á�
         * setBounds(x, y, width, height)
         * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
         */
        customerLabel.setBounds(10,20,80,50);
        panel.add(customerLabel);

        /* 
         * �����ı��������û�����
         */
        JTextField customerText = new JTextField(20);
        customerText.setBounds(100,20,165,50);
        panel.add(customerText);

        // ���� JLabel
        JLabel answerdescLabel = new JLabel("����������");
        /* ������������������λ�á�
         * setBounds(x, y, width, height)
         * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
         */
        answerdescLabel.setBounds(10,60,80,50);
        panel.add(answerdescLabel);

        /* 
         * �����ı��������û�����
         */
        JTextField answerDescText = new JTextField(20);
        answerDescText.setBounds(100,60,165,50);
        panel.add(answerDescText);
        
        
        
        // ���� JLabel
        JLabel answerLabel = new JLabel("����취��");
        /* ������������������λ�á�
         * setBounds(x, y, width, height)
         * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
         */
        answerLabel.setBounds(10,100,80,50);
        panel.add(answerLabel);

        /* 
         * �����ı��������û�����
         */
        JTextField  answerText = new JTextField(20);
        answerText.setBounds(100,100,165,50);
        panel.add(answerText);
        
        
        // ���� JLabel
        JLabel studyLabel = new JLabel("ѧϰ���ݣ�");
        /* ������������������λ�á�
         * setBounds(x, y, width, height)
         * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
         */
        studyLabel.setBounds(10,140,80,50);
        panel.add(studyLabel);

        /* 
         * �����ı��������û�����
         */
        JTextField  studyText = new JTextField(20);
        studyText.setBounds(100,140,165,50);
        panel.add(studyText);
        
        
        
        // ���� JLabel
        JLabel developLabel = new JLabel("�������ݣ�");
        /* ������������������λ�á�
         * setBounds(x, y, width, height)
         * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
         */
        developLabel.setBounds(10,180,80,50);
        panel.add(developLabel);

        /* 
         * �����ı��������û�����
         */
        JTextField  developText = new JTextField(20);
        developText.setBounds(100,180,165,50);
        panel.add(developText);


        JButton previewButton = new JButton("Ԥ��");
        previewButton.setBounds(200, 240, 80, 50);
        panel.add(previewButton);
        
        JButton exportButton = new JButton("����txt");
        exportButton.setBounds(300, 240, 80, 50);
        panel.add(exportButton);
        
        
        JTextField  previewText = new JTextField(20);
        previewText.setBounds(100,280,180, 150);
        panel.add(previewText);
        getContentPane().add(panel);
		
	}
	
	public static void main(String[] args) {
		WeiboApp app=new WeiboApp();
		app.setTitle("WeiBOStyle");
		app.setSize(800, 500);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	
	
	    }


