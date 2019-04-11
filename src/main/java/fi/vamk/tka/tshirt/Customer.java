package fi.vamk.tka.tshirt;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	private String email;

	@ManyToOne
	@JoinColumn(name="countryid")
	private Country countryid;

	@ManyToOne
	@JoinColumn(name="cityid")
	private City cityid;

	private String address;

	private String mobile;

	public Customer() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the countryid
	 */
	public Country getCountryid() {
		return countryid;
	}

	/**
	 * @param countryid the countryid to set
	 */
	public void setCountryid(Country countryid) {
		this.countryid = countryid;
	}

	/**
	 * @return the cityid
	 */
	public City getCityid() {
		return cityid;
	}

	/**
	 * @param cityid the cityid to set
	 */
	public void setCityid(City cityid) {
		this.cityid = cityid;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



}