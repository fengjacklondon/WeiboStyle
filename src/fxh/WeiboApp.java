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
		 /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);

        // 创建 JLabel
        JLabel customerLabel = new JLabel("客户名称：");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        customerLabel.setBounds(10,20,80,50);
        panel.add(customerLabel);

        /* 
         * 创建文本域用于用户输入
         */
        JTextField customerText = new JTextField(20);
        customerText.setBounds(100,20,165,50);
        panel.add(customerText);

        // 创建 JLabel
        JLabel answerdescLabel = new JLabel("问题描述：");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        answerdescLabel.setBounds(10,60,80,50);
        panel.add(answerdescLabel);

        /* 
         * 创建文本域用于用户输入
         */
        JTextField answerDescText = new JTextField(20);
        answerDescText.setBounds(100,60,165,50);
        panel.add(answerDescText);
        
        
        
        // 创建 JLabel
        JLabel answerLabel = new JLabel("解决办法：");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        answerLabel.setBounds(10,100,80,50);
        panel.add(answerLabel);

        /* 
         * 创建文本域用于用户输入
         */
        JTextField  answerText = new JTextField(20);
        answerText.setBounds(100,100,165,50);
        panel.add(answerText);
        
        
        // 创建 JLabel
        JLabel studyLabel = new JLabel("学习内容：");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        studyLabel.setBounds(10,140,80,50);
        panel.add(studyLabel);

        /* 
         * 创建文本域用于用户输入
         */
        JTextField  studyText = new JTextField(20);
        studyText.setBounds(100,140,165,50);
        panel.add(studyText);
        
        
        
        // 创建 JLabel
        JLabel developLabel = new JLabel("开发内容：");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        developLabel.setBounds(10,180,80,50);
        panel.add(developLabel);

        /* 
         * 创建文本域用于用户输入
         */
        JTextField  developText = new JTextField(20);
        developText.setBounds(100,180,165,50);
        panel.add(developText);


        JButton previewButton = new JButton("预览");
        previewButton.setBounds(200, 240, 80, 50);
        panel.add(previewButton);
        
        JButton exportButton = new JButton("导出txt");
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


