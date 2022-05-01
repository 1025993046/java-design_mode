package 实验1.原型模式.simple;

/**
 * @author GuoZeWei
 * @date 2022/4/17  20:35
 */
public class Customer implements Cloneable{
	private String name;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [address=" + address + ", name=" + name + "]";
	}
	@Override
    public Customer clone(){
		Customer clone=null;
		try {
			clone=(Customer) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}


}
