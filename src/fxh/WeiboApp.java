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
        panel.setLayout(null);

        JLabel customerLabel = new JLabel("用户名称：");
        customerLabel.setBounds(10,20,80,50);
        panel.add(customerLabel);

        JTextField customerText = new JTextField(20);
        customerText.setBounds(100,20,165,50);
        panel.add(customerText);

        JLabel answerdescLabel = new JLabel("用户问题描述：");
        answerdescLabel.setBounds(10,60,80,50);
        panel.add(answerdescLabel);

        /* 
         * 中国
         */
        JTextField answerDescText = new JTextField(20);
        answerDescText.setBounds(100,60,165,50);
        panel.add(answerDescText);
        
        
        
        JLabel answerLabel = new JLabel("解决办法：");
       
        answerLabel.setBounds(10,100,80,50);
        panel.add(answerLabel);

        JTextField  answerText = new JTextField(20);
        answerText.setBounds(100,100,165,50);
        panel.add(answerText);
        
        
        JLabel studyLabel = new JLabel("学习：");
        studyLabel.setBounds(10,140,80,50);
        panel.add(studyLabel);

        JTextField  studyText = new JTextField(20);
        studyText.setBounds(100,140,165,50);
        panel.add(studyText);
        
        
        JLabel developLabel = new JLabel("开发：");
        developLabel.setBounds(10,180,80,50);
        panel.add(developLabel);
        JTextField  developText = new JTextField(20);
        developText.setBounds(100,180,165,50);
        panel.add(developText);


        JButton previewButton = new JButton("预览：");
        previewButton.setBounds(200, 240, 80, 50);
        panel.add(previewButton);
        
        JButton exportButton = new JButton("导出txt");
        exportButton.setBounds(300, 240, 80, 50);
        panel.add(exportButton);
        
        
        JTextField  previewText = new JTextField(20);
        previewText.setBounds(100,280,180, 150);
        panel.add(previewText);
        getContentPane().add(panel);
        
        previewButton.addActionListener(new PreviewBtnListener(customerText));
//        exportButton.addActionListener(new PreviewBtnListener(exportButton));
		
	}
	
	
	
	
	public static void main(String[] args) {
		WeiboApp app=new WeiboApp();
		app.setTitle("WeiBOStyle");
		app.setSize(800, 500);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	
	
	    }


