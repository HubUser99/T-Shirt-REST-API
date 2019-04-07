package fi.vamk.tka.tshirt;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the Order_item database table.
 * 
 */
@Entity
@NamedQuery(name="Model.findAll", query="SELECT o FROM Model o")
public class Model implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String model;

	private Double price;

	public Model() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}