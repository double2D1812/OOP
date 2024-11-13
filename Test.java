
package core;

public class Test {

	public static void main(String[] args) {
		Person p = new Person("TranDinhDai", "18/12/2005", "PhuTho", 'M', "zingme6677028@gmail.com", "0869885906");
		System.out.println("Ten cua ban la " + p.getName());
		System.out.println("Ngay sinh cua ban la " + p.getDob());
		System.out.println("Noi sinh cua ban la " + p.getPob());
		System.out.println("Gioi tinh cua ban la " + p.getGender());
		System.out.println("Email cua ban la " + p.getEmail());
		System.out.println("Sdt cua ban la " + p.getPhone());
		p.setName("HoangQuynhDuyen");
		p.setDob("14/04/2004");
		p.setPob("HaNoi");
		p.setGender('F');
		p.setEmail("hqd1404@gmail.com");
		p.setPhone("0123456789");
		System.out.println("Ten cua ban la " + p.getName());
		System.out.println("Ngay sinh cua ban la " + p.getDob());
		System.out.println("Noi sinh cua ban la " + p.getPob());
		System.out.println("Gioi tinh cua ban la " + p.getGender());
		System.out.println("Email cua ban la " + p.getEmail());
		System.out.println("Sdt cua ban la " + p.getPhone());
		System.out.println("Thong tin cua ban la " + p.toString());
		;
	}

}
