package gw2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnumTest {
	// this whole scehbang is to make sure only certain types os inputs are made
	public enum Input_types {
		num, let_num, let
	}

	
	Input_types input_types;

	public EnumTest(Input_types input_types) {
		this.input_types = input_types;
	}

	private String tellItLikeItIs() {// switch statement for the case of all
										// letter, all numbers, all letters
										// and numbers
		Scanner sc = new Scanner(System.in);
		switch (input_types) {

		case let:// string only
			try {
				String word_let = sc.nextLine();
				return word_let;
			} catch (InputMismatchException exception) {
				// Print "This is not an integer"
				// when user put other than integer
				System.out.println("This is not an integer");
			}
			return null;

		case let_num:// string and number
			while (!sc.hasNext("[A-Za-z1-9]+")) {
				System.out.println("Nope, that's not it!");
				sc.next();
			}
			String word_num_let = sc.nextLine();
			return word_num_let;

		case num:// number only
			try {
				int word_num = sc.nextInt();
				String.valueOf(word_num);
				return word_num + "";
			} catch (InputMismatchException exception) {
				// Print "This is not an integer"
				// when user put other than integer
				System.out.println("This is not an integer");
			}
		}
		return "null";
	}

	// our main that calls all of our methods
	public static void main(String args[]) {
		/*
		 * EnumTest firstDay = new EnumTest(Day.MONDAY);
		 * firstDay.tellItLikeItIs();
		 */
		// TODO Auto-generated method stub

		EnumTest use_enum_num = new EnumTest(Input_types.num);

		EnumTest use_enum_let = new EnumTest(Input_types.let);
		EnumTest use_enum_let_num = new EnumTest(Input_types.let_num);

		// now that we have initialized enum and made all of our methods, it is
		// time to use our setters and vault then print it out
		charecter_input c = new charecter_input();
		System.out
				.print("Please enter your charecter name: (enter strings or charecters) ");
		c.setCharecter_name(use_enum_let_num.tellItLikeItIs());// 1 entry
		System.out
				.print("Please enter your six charecter skills: (enter numbers less than 20 only)");
		c.setSkills(use_enum_num.tellItLikeItIs(),
				use_enum_num.tellItLikeItIs(), use_enum_num.tellItLikeItIs(),
				use_enum_num.tellItLikeItIs(), use_enum_num.tellItLikeItIs(),
				use_enum_num.tellItLikeItIs());// 6 entries
		System.out.print("Please enter your profession: (enter letters only)");
		c.setProfession(use_enum_let.tellItLikeItIs());// 1 entry
		System.out
				.print("Please enter your  four charecter's primary attributes: (enter numbers less than 10000 only)");
		c.setPrimary_attributes(use_enum_num.tellItLikeItIs(),
				use_enum_num.tellItLikeItIs(), use_enum_num.tellItLikeItIs(),
				use_enum_num.tellItLikeItIs());// 4 entries
		System.out
				.print("Please enter your charecter's five secondary attributes: (enter numbers less than 10000 only)");
		c.setSecondary_attributes(use_enum_num.tellItLikeItIs(),
				use_enum_num.tellItLikeItIs(), use_enum_num.tellItLikeItIs(),
				use_enum_num.tellItLikeItIs(), use_enum_num.tellItLikeItIs());// 5
																				// entries
		// total entries is 1+1+4+5+6=17
		// now we put it in the vault
		charecter_vault_bag d = new charecter_vault_bag();
		d.initVars(10);
		d.addElement(c);
		System.out.println(d.randomPick());
	}
}
