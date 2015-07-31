import javax.swing.JApplet;
import javax.swing.SwingUtilities;


public class CarGui extends JApplet {

	/**
	 * Create the applet.
	 */
	public CarGui() {
		CarInput inputInfo = new CarInput();
		setContentPane (inputInfo);

	}
	// the following code is used to kick off the applet
	public void init(){
		setSize(430,230);// all you need is this within the init() method. and not all the try/catch stuff below
		
		// this code is used for starting the GUI, must be within the init method
		/*try{
			SwingUtilities.invokeAndWait(new Runnable(){
				public void run(){
					new CarGui();
				}
			});	
		}catch(Exception e){
			e.printStackTrace();
		}	*/	
	}
	
	
	
}
