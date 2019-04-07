package fi.vamk.tka.tshirt;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the Order_item database table.
 * 
 */
@Entity
@NamedQuery(name="Location1.findAll", query="SELECT o FROM Location1 o")
public class Location1 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String location1;

	public Location1() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation1() {
		return location1;
	}

	public void setLocation1(String location1) {
		this.location1 = location1;
	}
}