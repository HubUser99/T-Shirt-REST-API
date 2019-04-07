package fi.vamk.tka.tshirt;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the Order_item database table.
 * 
 */
@Entity
@NamedQuery(name= "Order_line.findAll", query="SELECT o FROM Order_line o")
public class Order_line implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name="location1id")
	private Location1 location1id;

	@ManyToOne
	@JoinColumn(name="location2id")
	private Location2 location2id;

	@ManyToOne
	@JoinColumn(name="location3id")
	private Location3 location3id;

	@ManyToOne
	@JoinColumn(name="sizeid")
	private Size sizeid;

	@ManyToOne
	@JoinColumn(name="colorid")
	private Color colorid;

	@ManyToOne
	@JoinColumn(name="modelid")
	private Model modelid;

	@ManyToOne
	@JoinColumn(name="imageid")
	private Image imageid;

	private String text;

	@ManyToOne
	@JoinColumn(name="orderid")
	private Order_item orderid;

	public Order_line() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Location1 getLocation1id() {
		return location1id;
	}

	public void setLocation1id(Location1 location1id) {
		this.location1id = location1id;
	}

	public Location2 getLocation2id() {
		return location2id;
	}

	public void setLocation2id(Location2 location2id) {
		this.location2id = location2id;
	}

	public Location3 getLocation3id() {
		return location3id;
	}

	public void setLocation3id(Location3 location3id) {
		this.location3id = location3id;
	}

	public Size getSizeid() {
		return sizeid;
	}

	public void setSizeid(Size sizeid) {
		this.sizeid = sizeid;
	}

	public Color getColorid() {
		return colorid;
	}

	public void setColorid(Color colorid) {
		this.colorid = colorid;
	}

	public Model getModelid() {
		return modelid;
	}

	public void setModelid(Model modelid) {
		this.modelid = modelid;
	}

	public Image getImageid() {
		return imageid;
	}

	public void setImageid(Image imageid) {
		this.imageid = imageid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Order_item getOrderid() {
		return orderid;
	}

	public void setOrderid(Order_item orderid) {
		this.orderid = orderid;
	}
}