package core3;

public class Test3 {
	public static void main(String[] args) {
		DiaChi p1 = new DiaChi("ThoSon", "ThiTranDoanHung", "DoanHung", "PhuTho");
		NhanVien p2 = new NhanVien("TranDinhDai", p1, "PhuTho", 'N');
		System.out.println("Thong tin nhan vien la: "+p2.toString());
	}
}
