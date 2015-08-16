package calci;
//importing GUI packages of java.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class aplt extends JApplet
{
	simple s;

	public void init()
	{
		Container maincntnr = this.getContentPane();
		maincntnr.setLayout(new BorderLayout());
		s=new simple();
		this.add(s,BorderLayout.CENTER);
	}
}