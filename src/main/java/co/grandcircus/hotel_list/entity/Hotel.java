package co.grandcircus.hotel_list.entity;

import javax.persistence.*;

@Entity
@Table(name = "hotel_listing")
public class Hotel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotel_id")
	private Long id; 
	@Column(name ="hotel_name")
	private String name; 
	
	private String city; 
	@Column(name ="price_per_night")
	private int pricePerNight;
	
	public Hotel() {}

	public Hotel(Long id, String name, String city, int pricePerNight) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", city=" + city + ", pricePerNight=" + pricePerNight + "]";
	}
	
	
	
}
