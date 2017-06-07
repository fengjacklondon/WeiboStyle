package fxh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PreviewBtnListener implements ActionListener {

	
	private JButton previewBtn;
	
	private JTextField textField;
	
	
	public  PreviewBtnListener() {
		super();
	}
	
	public  PreviewBtnListener(JTextField textField){
		this();
		this.textField=textField;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String info="you click "+textField.getText();
		JOptionPane.showMessageDialog(null,info, "click btn warn",JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	

}
