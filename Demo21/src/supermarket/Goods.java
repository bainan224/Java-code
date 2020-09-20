package supermarket;

/**
 * 商品类
 * @author asus
 *
 */
public class Goods {
	
	private String gid; // 商品编号
	private String name; // 商品名字
	private double price; // 商品价格
	private int stock; // 商品库存
	
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
