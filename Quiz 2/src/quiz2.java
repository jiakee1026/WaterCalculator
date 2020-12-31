import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class quiz2 {

	private JFrame frmWaterCalculator;
	private JTextField textFieldNum1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quiz2 window = new quiz2();
					window.frmWaterCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWaterCalculator = new JFrame();
		frmWaterCalculator.setTitle("WATER CALCULATOR");
		frmWaterCalculator.setBounds(100, 100, 696, 449);
		frmWaterCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWaterCalculator.getContentPane().setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("How much water should I drink?");
		lblNewLabel1.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblNewLabel1.setBounds(198, 11, 297, 43);
		frmWaterCalculator.getContentPane().add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("My weight (kg) :");
		lblNewLabel2.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		lblNewLabel2.setBounds(211, 65, 117, 43);
		frmWaterCalculator.getContentPane().add(lblNewLabel2);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setFont(new Font("Sitka Small", Font.PLAIN, 14));
		textFieldNum1.setBounds(333, 65, 136, 43);
		frmWaterCalculator.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		JButton btnNewButton = new JButton("TELL ME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double ml = 0;
				double weight;
				int years = 0;
				
				try {
					weight = Integer.parseInt(textFieldNum1.getText());
					
					if(years < 30) {
						ml =  weight * 40;
					}
					
					else if(years >= 30 && years < 55) {
						ml =  weight * 35;
					}
					
					else if(years >= 55) {
						ml =  weight * 30;
					}
					JOptionPane.showMessageDialog(null, "Buddy, you should drink " + ml + " ml of a day!");
					
				} catch (Exception e){
					
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnNewButton.setBounds(265, 130, 174, 43);
		frmWaterCalculator.getContentPane().add(btnNewButton);
	}
}
