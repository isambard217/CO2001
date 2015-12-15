package elevenplus;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.net.URL;
import javax.swing.JButton;
import java.awt.Image;

public class pickAvatar extends JFrame{
		//ImageIcon image	
	
		Questions Q = new Questions();
		private JLabel item1;
		private JPanel menu;
		private URL imageURL = getClass().getResource("kakashi.png"); 
		private ImageIcon player = new ImageIcon(imageURL); //ImageIcon player or Image player 
		Container c= getContentPane(); //This is the white page section 
		
		
			
		public pickAvatar(){
			layout1();
		}
		
		public void layout1(){
			//c.setLayout(new FlowLayout());
			setTitle("The Eleven Plus game");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(275,180);
			setIconImage(player.getImage());
			setVisible(true);
			setResizable(false);
//			JButton submit = new JButton("Begin game");	
//			c.add(submit);
			item1 = new JLabel(player);
			item1.setBounds(0,0,166,256);
			this.add(item1);
//			this.getContentPane().add(item1);
			menu();
			
		}
		
		private JPanel menu(){
			 
			menu = new JPanel();
			add(menu);
			return menu;
		}
		
}


