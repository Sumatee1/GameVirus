package javaapplication7;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
public class wingame extends JPanel{
	
	private ImageIcon win = new ImageIcon("BG9.jpg");
	//private ImageIcon exitover = new ImageIcon("exit.jpg");
	//private ImageIcon restart = new ImageIcon("Start.jpg");
	//public JButton BStartover = new JButton(restart);
	//public JButton BExitover  = new JButton(exitover);

	wingame(){
		
		this.setLayout(null);
		//BExitover.setBounds(500, 650, 150,90);
		//add(BExitover);
		//add(BStartover);
		//BStartover.setBounds(750,650,150,90);
               // add(BStartover);
		
	}
	public void paintComponent(Graphics g){
		  super.paintComponent(g);
		  g.drawImage(win.getImage(),0,0,1000,800,this);
		  
		  
	      
	  }
}
