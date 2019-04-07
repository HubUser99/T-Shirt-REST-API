package fi.vamk.tka.tshirt;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the Order_item database table.
 * 
 */
@Entity
@NamedQuery(name="Color.findAll", query="SELECT o FROM Color o")
public class Color implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String color;

	public Color() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}