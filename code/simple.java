package calci;
import javax.swing.*;
import java.awt.*;

public class simple extends JPanel
{
	display d1;
	keypad k1;

	public simple()
	{
		d1=new display();
		k1 = new keypad();
		
		this.setLayout(new BorderLayout());
		this.add(d1,BorderLayout.NORTH);
		this.add(k1,BorderLayout.CENTER);
	}
}