import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;


public class CarInput extends JPanel {
	String [] makeArray = {"","Ford", "Opel","Mazda","Hyundai"}; 
	String [] modelArray = {"","Mustang", "Vectra","5","I40"};
	String [] colourArray = {"","Red", "Black", "Silver", "Gold"};
	String [] EngineSizeArray = {"","2.0L","1.0L","1.6L","1.8L"};
	JComboBox engineSize;
	JComboBox make;
	JComboBox model;
	JComboBox colour;
	
	private JTextField textField;
	
	/**
	 * Create the panel.
	 */
	
		
	
	public CarInput() {
		
		setLayout(null);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setBounds(10, 11, 54, 21);
		add(lblMake);
		
		make = new JComboBox(makeArray);
		make.setBounds(122, 11, 123, 21);
		add(make);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(10, 43, 54, 21);
		add(lblModel);
		
		model = new JComboBox(modelArray);
		model.setBounds(122, 43, 123, 21);
		add(model);
		
		JLabel lblColour = new JLabel("Colour");
		lblColour.setBounds(10, 78, 54, 21);
		add(lblColour);
		
		colour = new JComboBox(colourArray);
		colour.setBounds(122, 75, 123, 21);
		add(colour);
		
		JLabel lblEngineSize = new JLabel("Engine Size");
		lblEngineSize.setBounds(10, 110, 54, 21);
		add(lblEngineSize);
		
		engineSize = new JComboBox(EngineSizeArray);
		engineSize.setBounds(122, 110, 123, 21);
		add(engineSize);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(10, 192, 366, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblYorCarDetails = new JLabel("Your Car Details");
		lblYorCarDetails.setBounds(10, 165, 246, 14);
		add(lblYorCarDetails);
		
		JButton printRecord = new JButton("Print Record");
		printRecord.setBounds(280, 11, 123, 33);
		printRecord.addActionListener(myActionListener);
		add(printRecord);
	}
	private ActionListener myActionListener = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			if(event.getSource() instanceof JButton){
				//JButton buttonPressed = (JButton)event.getSource();
				StringBuilder printRecord = new StringBuilder("");
				
				// add this code for all combo boxes
				int chosenMake = make.getSelectedIndex();
				printRecord.append("\nMake: "+ makeArray [chosenMake] + ",");
				
				int chosenModel = model.getSelectedIndex();
				printRecord.append("\nModel: "+ modelArray [chosenModel]+ ",");
				
				int chosencolour = colour.getSelectedIndex();
				printRecord.append("\nColour: "+ colourArray [chosencolour]+ ",");
				
				int chosenEngineSize = engineSize.getSelectedIndex();
				printRecord.append("\nEngine Size : "+ EngineSizeArray[chosenEngineSize]+ ",");
				
				
				textField.setText(printRecord.toString());
				
				//System.out.println("IM HERE" + chosenEngineSize);
			}
			
		}
		
	};
				
		
	}
	


