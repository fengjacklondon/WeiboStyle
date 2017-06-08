package fxh;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JpanelTemplate {
	
	public  static JPanel panel=new JPanel();
	private final int interval=300;
	
	JpanelTemplate(int j){
		
		int flag=0;
		  panel.setLayout(null);
	     for(int i=0;i<j;i++){
	    	 ++flag;
	    	 JLabel customerLabel = new JLabel("用户名称：");
		        customerLabel.setBounds(10+i*interval,20,80,50);
		        panel.add(customerLabel);

		        JTextField customerText = new JTextField(20);
		        customerText.setBounds(100+i*interval,20,165,50);
		        panel.add(customerText);
		        
		        JLabel answerdescLabel = new JLabel("用户问题描述：");
		        answerdescLabel.setBounds(10+i*interval,60,80,50);
		        panel.add(answerdescLabel);
		        JTextField answerDescText = new JTextField(20);
		        answerDescText.setBounds(100+i*interval,60,165,50);
		        panel.add(answerDescText);
		        
		        JLabel answerLabel = new JLabel("解决办法：");
		        answerLabel.setBounds(10+i*interval,100,80,50);
		        panel.add(answerLabel);

		        JTextField  answerText = new JTextField(20);
		        answerText.setBounds(100+i*interval,100,165,50);
		        panel.add(answerText);
		        
		        if(flag==1){
		        	  JLabel studyLabel = new JLabel("学习：");
		  	        studyLabel.setBounds(10,140,80,50);
		  	     
		  	        panel.add(studyLabel);

		  	        JTextField  studyText = new JTextField(20);
		  	        studyText.setBounds(100,140,165,50);
		  	      studyText.setText("1");
		  	        panel.add(studyText);
		  	        
		  	        JLabel developLabel = new JLabel("开发：");
		  	        developLabel.setBounds(10,180,80,50);
		  	        panel.add(developLabel);
		  	        JTextField  developText = new JTextField(20);
		  	        developText.setBounds(100,180,165,50);
		  	      developText.setText("1");
		  	        panel.add(developText);
		        }
		        
	     }
	   
	       
	}

}
