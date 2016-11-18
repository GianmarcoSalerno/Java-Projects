package gw2;

import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.GenericArrayType;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GW2_GUI {

	private JFrame frame;
	private JTextField name_textField;
	private JTextField power_textField;
	private JTextField sec_att_textField;
	private JTextField skills_textField;
	private JTextField dps_textfield;
	private JTextField prof_textfield;
	private JTextField targ_arm_textField;
	private JTextField weap_textField;
	private final JButton calc_button = new JButton(
			new ImageIcon(
					ImageIO.read(new File(
							"C:\\Users\\Gianmarco\\workspace\\gw2\\src\\gw2\\button_blood.png"))));
	private final JButton find_button = new JButton(
			new ImageIcon(
					ImageIO.read(new File(
							"C:\\Users\\Gianmarco\\workspace\\gw2\\src\\gw2\\find_button.png"))));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GW2_GUI window = new GW2_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws IOException
	 */
	public GW2_GUI() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws IOException
	 */
	private void initialize() throws IOException {

		frame = new JFrame();
		frame.setBounds(100, 100, 650, 380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel(
				new ImageIcon(
						ImageIO.read(new File(
								"C:\\Users\\Gianmarco\\workspace\\gw2\\src\\gw2\\GW2Classes.jpg"))));
		frame.setContentPane(label);

		calc_button.setBackground(Color.ORANGE);
		calc_button.setBounds(410, 200, 140, 90);

		frame.getContentPane().add(calc_button);
		calc_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aActionEvent) {
				// if check to match the code from the question, but not really
				// needed
				if (aActionEvent.getSource() == calc_button) {
					System.out.println("calc_Button pressed");
					charecter_input b = new charecter_input();
					
					// Damage done = (Weapon strength) * Power * (skill-specific
					// coefficient) / (target's Armor)
					
					int Damage_done = 0;
					try {
						Damage_done = (Integer.parseInt(power_textField.getText())* Integer.parseInt(weap_textField.getText())/Integer.parseInt(targ_arm_textField.getText()));
						dps_textfield.setText(Integer.toString(Damage_done));
					}
					catch (Exception e){
						power_textField.setText("Numbers Only");
						weap_textField.setText("Numbers Only");
						targ_arm_textField.setText("Numbers Only");

					}
					
					
					b.setCharecter_name(name_textField.getText());
					b.setProfession(prof_textfield.getText());
					System.out.println(b.getPower());

				}
			}
		});

		

		/*name_textField = new JTextField();
		name_textField.setBounds(170, 110, 86, 20);
		frame.getContentPane().add(name_textField);
		name_textField.setColumns(10);*/

		/*prof_textfield = new JTextField();
		prof_textfield.setBounds(170, 140, 86, 20);
		frame.getContentPane().add(prof_textfield);
		prof_textfield.setColumns(10);*/

		power_textField = new JTextField(6);
		power_textField.setBounds(170, 170, 86, 20);
		frame.getContentPane().add(power_textField);
		power_textField.setColumns(10);

		
		
		
		
		
		
		// these are not actually needed for the damage
		/*
		 * sec_att_textField = new JTextField();
		 * sec_att_textField.setBounds(170, 200, 86, 20);
		 * frame.getContentPane().add(sec_att_textField);
		 * sec_att_textField.setColumns(10);
		 */

		/*
		 * skills_textField = new JTextField(); skills_textField.setBounds(170,
		 * 230, 86, 20); frame.getContentPane().add(skills_textField);
		 * skills_textField.setColumns(10);
		 */

		targ_arm_textField = new JTextField();
		targ_arm_textField.setBounds(170, 230, 86, 20);
		frame.getContentPane().add(targ_arm_textField);
		targ_arm_textField.setColumns(10);

		weap_textField = new JTextField();
		weap_textField.setBounds(170, 200, 86, 20);
		frame.getContentPane().add(weap_textField);
		weap_textField.setColumns(10);

		dps_textfield = new JTextField();
		dps_textfield.setBounds(410, 110, 86, 20);
		frame.getContentPane().add(dps_textfield);
		dps_textfield.setColumns(10);

		/*
		 * crit_textfield = new JTextField(); crit_textfield.setBounds(410, 140,
		 * 86, 20); frame.getContentPane().add(crit_textfield);
		 * crit_textfield.setColumns(10);
		 */

		/*JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(37, 110, 46, 14);
		frame.getContentPane().add(lblName);

		JLabel lblProfession = new JLabel("Profession");
		lblProfession.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProfession.setForeground(Color.WHITE);
		lblProfession.setBounds(37, 141, 75, 14);
		frame.getContentPane().add(lblProfession);*/

		JLabel lblPower = new JLabel("Power");
		lblPower.setForeground(Color.WHITE);
		lblPower.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPower.setBounds(37, 170, 120, 14);
		frame.getContentPane().add(lblPower);

		/*
		 * JLabel lblSecondaryAttributes = new JLabel("Secondary Attributes");
		 * lblSecondaryAttributes.setFont(new Font("Tahoma", Font.BOLD, 12));
		 * lblSecondaryAttributes.setForeground(Color.WHITE);
		 * lblSecondaryAttributes.setBounds(37, 203, 140, 14);
		 * frame.getContentPane().add(lblSecondaryAttributes);
		 */

		/*
		 * JLabel lblSkills = new JLabel("Skills"); lblSkills.setFont(new
		 * Font("Tahoma", Font.BOLD, 12)); lblSkills.setForeground(Color.WHITE);
		 * lblSkills.setBounds(37, 230, 66, 14);
		 * frame.getContentPane().add(lblSkills);
		 */

		JLabel lbltar_arm = new JLabel("Target Armor");
		lbltar_arm.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbltar_arm.setForeground(Color.WHITE);
		lbltar_arm.setBounds(37, 230, 90, 14);
		frame.getContentPane().add(lbltar_arm);

		JLabel lblweap_dmg = new JLabel("Weapon Damage");
		lblweap_dmg.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblweap_dmg.setForeground(Color.WHITE);
		lblweap_dmg.setBounds(37, 200, 110, 14);
		frame.getContentPane().add(lblweap_dmg);

		JLabel lblDps = new JLabel("DPS");
		lblDps.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDps.setForeground(Color.WHITE);
		lblDps.setBounds(350, 110, 46, 14);
		frame.getContentPane().add(lblDps);

		/*
		 * JLabel lblCrit = new JLabel("Crit damage/chance");
		 * lblCrit.setFont(new Font("Tahoma", Font.BOLD, 12));
		 * lblCrit.setForeground(Color.WHITE); lblCrit.setBounds(280, 140, 130,
		 * 14); frame.getContentPane().add(lblCrit);
		 */

		frame.setFocusTraversalPolicy(new FocusTraversalOnArray(
				new Component[] { name_textField, prof_textfield,
						power_textField, sec_att_textField,
						skills_textField, dps_textfield, targ_arm_textField,
						weap_textField, 
						lblPower, lblDps, label, lbltar_arm }));
	}
}
