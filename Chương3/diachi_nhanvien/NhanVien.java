package core3;

import core3.DiaChi;

public class NhanVien {
private String name;
private DiaChi address;
private String dob;
private char gender;
/**
 * 
 */
public NhanVien() {
}
/**
 * @param name
 * @param address
 * @param dob
 * @param gender
 */
public NhanVien(String name, DiaChi address, String dob, char gender) {
	this.name = name;
	this.address = address;
	this.dob = dob;
	this.gender = gender;
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
 * @param address the address to set
 */
public void setAddress(DiaChi address) {
	this.address = address;
}
/**
 * @return the address
 */
public DiaChi getAddress() {
	return address;
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
@Override
public String toString() {
	return "NhanVien [name=" + name + ", address=" + address + ", dob=" + dob + ", gender=" + gender + "]";
}


}
