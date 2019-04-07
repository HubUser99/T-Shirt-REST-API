package fi.vamk.tka.tshirt;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Order_item database table.
 * 
 */
@Entity
@NamedQuery(name="Order_item.findAll", query="SELECT o FROM Order_item o")
public class Order_item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name="statusid")
	private Status statusid;

	private int orderquantity;

	@ManyToOne
	@JoinColumn(name="customerid")
	private Customer customerid;

	private java.sql.Date orderdate;

	public Order_item() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Status getStatusid() {
		return statusid;
	}

	public void setStatusid(Status statusid) {
		this.statusid = statusid;
	}

	public int getOrderquantity() {
		return orderquantity;
	}

	public void setOrderquantity(int orderquantity) {
		this.orderquantity = orderquantity;
	}

	public Customer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Customer customerid) {
		this.customerid = customerid;
	}

	public java.sql.Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(java.sql.Date orderdate) {
		this.orderdate = orderdate;
	}



}