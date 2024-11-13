package core2;

public class DiaChi {
	private String thon;
	private String xa;
	private String huyen;
	private String tinh;
	/**
	 * 
	 */
	public DiaChi() { 
	}
	/**
	 * @param thon
	 * @param xa
	 * @param huyen
	 * @param tinh
	 */
	public DiaChi(String thon, String xa, String huyen, String tinh) {
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}
	/**
	 * @param thon the thon to set
	 */
	public void setThon(String thon) {
		this.thon = thon;
	}
	/**
	 * @return the thon
	 */
	public String getThon() {
		return thon;
	}
	/**
	 * @param xa the xa to set
	 */
	public void setXa(String xa) {
		this.xa = xa;
	}
	/**
	 * @return the xa
	 */
	public String getXa() {
		return xa;
	}
	/**
	 * @param huyen the huyen to set
	 */
	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}
	/**
	 * @return the huyen
	 */
	public String getHuyen() {
		return huyen;
	}
	/**
	 * @param tinh the tinh to set
	 */
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	/**
	 * @return the tinh
	 */
	public String getTinh() {
		return tinh;
	}
	@Override
	public String toString() {
		return "DiaChi [thon=" + thon + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + "]";
	}
}
