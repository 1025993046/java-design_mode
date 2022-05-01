package 实验1.原型模式.simple;

/**
 * @author GuoZeWei
 * @date 2022/4/17  20:35
 */
public class Address {
	private String country;
	private String province;
	private String city;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Address(String country, String province, String city) {
		super();
		this.country = country;
		this.province = province;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", province="
				+ province + "]";
	}

}
