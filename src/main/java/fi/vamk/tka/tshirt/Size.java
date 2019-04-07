package fi.vamk.tka.tshirt;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the Order_item database table.
 * 
 */
@Entity
@NamedQuery(name="Size.findAll", query="SELECT o FROM Size o")
public class Size implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String size;

	public Size() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}