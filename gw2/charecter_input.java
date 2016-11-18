package gw2;

import java.util.Scanner;
//read filthy rich clients by Chet Haase, should be a book about using swing and implementing it for my program to make it look much nicer.
public class charecter_input {
	private String profession = "No info has been entered yet.";
	private String charecter_name = "No info has been entered yet.";
	private String power;
	private String precision;
	private String vitality;
	private String toughness;
	private String skill_1;
	private String skill_2;
	private String skill_3;
	private String skill_4;
	private String skill_5;
	private String skill_6;
	private String boon_duration;
	private String condition_damage;
	private String condition_duration;
	private String ferocity;
	private String healing_power;

	// Damage = Weapon strength * Power * Skill coefficient / Armor

	// Main getters and setters
	public String getProfession() {
		return profession;
	}

	public void setProfession(String _profession) {
		profession = _profession;
	}

	public String getCharecter_name() {
		return charecter_name;
	}

	public void setCharecter_name(String _charecter_name) {
		charecter_name = _charecter_name;
	}

	// Setters
	public void setPrimary_attributes(String _power, String _precision,
			String _vitality, String _toughness) {
		power = _power;
		precision = _precision;
		vitality = _vitality;
		toughness = _toughness;
	}

	public void setSecondary_attributes(String _boon_duration,
			String _condition_damage, String _condition_duration,
			String _ferocity, String _healing_power) {
		boon_duration = _boon_duration;
		condition_damage = _condition_damage;
		condition_duration = _condition_duration;
		ferocity = _ferocity;
		healing_power = _healing_power;
	}

	public void setSkills(String _skill_1, String _skill_2, String _skill_3,
			String _skill_4, String _skill_5, String _skill_6) {
		skill_1 = _skill_1;
		skill_2 = _skill_2;
		skill_3 = _skill_3;
		skill_4 = _skill_4;
		skill_5 = _skill_5;
		skill_6 = _skill_6;
	}

	// Getters for Secondary attributes
	public String getBoon_duration() {
		return boon_duration;
	}

	public String getCondition_damage() {
		return condition_damage;
	}

	public String getCondition_duration() {
		return condition_duration;
	}

	public String getFerocity() {
		return ferocity;
	}

	public String getHealing_power() {
		return healing_power;
	}

	// Getters for Skills
	public String getSkill_1() {
		return skill_1;
	}

	public String getSkill_2() {
		return skill_2;
	}

	public String getSkill_3() {
		return skill_3;
	}

	public String getSkill_4() {
		return skill_4;
	}

	public String getSkill_5() {
		return skill_5;
	}

	public String getSkill_6() {
		return skill_6;
	}

	// Getters for Primary attributes
	public String getPower() {
		return this.power;
	}

	public String getPrecision() {
		return this.precision;
	}

	public String getVitality() {
		return this.vitality;
	}

	public String getToughness() {
		return this.toughness;
	}

	public String toString() {
		StringBuilder retval = new StringBuilder();
		retval.append("Profession: " + profession + "\n");
		retval.append("Name: " + charecter_name + "\n");
		retval.append("==================================" + "\n");
		retval.append("\n");
		retval.append("Primary attributes" + "\n");
		retval.append("Power: " + power + "\n");
		retval.append("Precision: " + precision + "\n");
		retval.append("Vitality: " + vitality + "\n");
		retval.append("Toughness: " + toughness + "\n");
		retval.append("==================================" + "\n");
		retval.append("\n");
		retval.append("Secondary attributes" + "\n");
		retval.append("Boon Duration: " + boon_duration + "\n");
		retval.append("Condition Damage: " + condition_damage + "\n");
		retval.append("Condition Duration: " + condition_duration + "\n");
		retval.append("Ferocity: " + ferocity + "\n");
		retval.append("Healing Power: " + healing_power + "\n");
		retval.append("==================================" + "\n");
		retval.append("\n");
		retval.append("Skills" + "\n");
		retval.append("Skill 1: " + skill_1 + "\n");
		retval.append("Skill 2: " + skill_2 + "\n");
		retval.append("Skill 3: " + skill_3 + "\n");
		retval.append("Skill 4: " + skill_4 + "\n");
		retval.append("Skill 5: " + skill_5 + "\n");
		retval.append("Skill 6: " + skill_6 + "\n");
		return retval.toString();
	}

}
