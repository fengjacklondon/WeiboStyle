package fxh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PreviewBtnListener implements ActionListener {

	private List<String> content;
	private JButton previewBtn;
	private JPanel panel;
	private JTextField textField;
	
	
	public  PreviewBtnListener() {
		super();
	}
	
	public  PreviewBtnListener(JPanel panel){
		this();
		this.panel=panel;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String text="";
	
		for(int i=0;i<panel.getComponentCount();i++){
			Object item=panel.getComponent(i);
			
			if(item instanceof JTextField &&((JTextField) item).getText().length()==0){
				break;
			}else{
				if(item instanceof JLabel){
					text+=((JLabel) item).getText().trim(); 
				}else if(item instanceof JTextField){
					text+=((JTextField) item).getText().trim()+"\n";
				}
			}
			
			
		}
		System.out.println(text);
//		String info="内容如下："+"\n"+text;
		((JTextArea)panel.getComponent(panel.getComponentCount()-1)).setText(text);
		//JOptionPane.showMessageDialog(null,info, "click btn warn",JOptionPane.INFORMATION_MESSAGE);
	}
	

	
	
	

}
