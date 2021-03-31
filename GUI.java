import javax.swing.*;
import java.awt.*;
public class GUI extends JFrame
{
	public GUI (String name){
		super(name);
		setLocation(300,100);
		setSize(700,500);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		GUI ucc=
			new GUI("This is a test GUI");
		ucc.setVisible(true);
	}
}
	
