package fxh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class AddBtnListener  implements ActionListener{
	private int i;
	private JFrame jframe;
	 public AddBtnListener(int i,JFrame jframe) {
		this.i=i;
		this.jframe=jframe;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		new JpanelTemplate(i);
	
		jframe.getContentPane().add( JpanelTemplate.panel);
	}

}
