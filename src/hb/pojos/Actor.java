package hb.pojos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Actor {

	private static final long serialVersionUID = 0;
	private String lastname;
	private String firstname;
	private char sex;
	private double height;
	private Date birthdate;
	private String cityBirth;
	private String role;

	public Actor(String lastname, String firstname, char sex, double height, Date birthdate, String cityBirth,
			String role) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.sex = sex;
		this.height = height;
		this.birthdate = birthdate;
		this.cityBirth = cityBirth;
		this.role = role;
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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCityBirth() {
		return cityBirth;
	}

	public void setCityBirth(String cityBirth) {
		this.cityBirth = cityBirth;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Actor [lastname=" + lastname + ", firstname=" + firstname + ", sex=" + sex + ", height=" + height
				+ ", birthdate=" + convertDateToString() + ", cityBirth=" + cityBirth + ", role=" + role + "]";
	}

	private String convertDateToString() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return df.format(birthdate);
	}
}
