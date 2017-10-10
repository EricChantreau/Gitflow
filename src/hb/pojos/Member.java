package hb.pojos;

import java.util.Arrays;

public class Member {

	private String lastname;
	private String firstname;
	private String eyeColor;
	private String hairColor;
	private String role;
	private String[] personalityTraits;

	public Member(String lastname, String firstname, String eyeColor, String hairColor, String role) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		this.role = role;
		this.personalityTraits = new String[0];
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String[] getPersonalityTraits() {
		return personalityTraits;
	}

	public void setPersonalityTraits(String[] personalityTraits) {
		this.personalityTraits = personalityTraits;
	}

	@Override
	public String toString() {
		return "Member [lastname=" + lastname + ", firstname=" + firstname + ", eyeColor=" + eyeColor + ", hairColor="
				+ hairColor + ", role=" + role + ", personalityTraits=" + Arrays.toString(personalityTraits) + "]";
	}
}
