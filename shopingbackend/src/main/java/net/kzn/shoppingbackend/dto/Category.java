package net.kzn.shoppingbackend.dto;

import javax.persistence.*;


@Entity(name ="category")
public class Category {

	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", imageURL=" + imageURL
				+ ", active=" + active + "]";
	}






	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String description;
	@Column(name="image_url")
	private String imageURL;
	@Column(name="is_active")
	private boolean active = true;
	
	
	
	
}
