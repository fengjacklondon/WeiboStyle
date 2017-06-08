package fxh;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

	
public class WeiboApp   extends JFrame{
	private  List<String> content=new ArrayList<String>();
	private int count=0;
	public WeiboApp(){
		super();
		initUI();
	}
	
	private void initUI(){
	 new JpanelTemplate(5);
//	 JButton addButton = new JButton("添加：");
//     addButton.setBounds(100, 240, 80, 50);
//     JpanelTemplate.panel.add(addButton);
     
     JButton previewButton = new JButton("预览：");
     previewButton.setBounds(200, 240, 80, 50);
     JpanelTemplate.panel.add(previewButton);
     
     JButton exportButton = new JButton("导出txt");
     exportButton.setBounds(300, 240, 80, 50);
     JpanelTemplate.panel.add(exportButton);
     
     JTextArea  previewText = new JTextArea(500,100);
     previewText.setBounds(100,400,800, 400);
     JpanelTemplate.panel.add(previewText);
     
    // addButton.addActionListener(new AddBtnListener(++count,this));
     
  
        previewButton.addActionListener(new PreviewBtnListener(JpanelTemplate.panel));
//        exportButton.addActionListener(new PreviewBtnListener(exportButton));
        
        getContentPane().add( JpanelTemplate.panel);
		
	}

	public static void main(String[] args) {
		WeiboApp app=new WeiboApp();
		app.setTitle("WeiBOStyle");
		app.setSize(1500, 1000);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	
	
	    }


