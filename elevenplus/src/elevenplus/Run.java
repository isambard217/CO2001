package elevenplus;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Run extends JFrame{
public static void main(String[]args){
	
		try{
			// This basically allows us to write the lines in the layout1 method
			// in any order. Without the try and catch then we would have to write the
			// code in a certain order
			SwingUtilities.invokeLater(new Runnable(){
			public void run(){
			  pickAvatar pickAvatar = new pickAvatar();
			}
		});
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		
		}
}

}
