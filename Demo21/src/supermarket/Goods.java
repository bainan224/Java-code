package supermarket;

/**
 * ��Ʒ��
 * @author asus
 *
 */
public class Goods {
	
	private String gid; // ��Ʒ���
	private String name; // ��Ʒ����
	private double price; // ��Ʒ�۸�
	private int stock; // ��Ʒ���
	
	public Goods() {
	}

	public Goods(String gid, String name, double price, int stock) {
		this.gid = gid;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
	
	
}
