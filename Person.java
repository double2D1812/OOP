package core;

public class Person {
	private String name;
	private String dob;
	private String pob;
	private char gender;
	private String email;
	private String phone;

	/**
	 * 
	 */
	public Person() {
	}

	/**
	 * @param name
	 * @param dob
	 * @param pob
	 * @param gender
	 * @param email
	 * @param phone
	 */
	public Person(String name, String dob, String pob, char gender, String email, String phone) {
		;
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param pob the pob to set
	 */
	public void setPob(String pob) {
		this.pob = pob;
	}

	/**
	 * @return the pob
	 */
	public String getPob() {
		return pob;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}
