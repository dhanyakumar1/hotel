package com.hotelapp.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity 
public class Hotel {
	@Id
	@GeneratedValue(generator = "hotel_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "hotel_id",sequenceName = "hotel_id")
private Integer hotelId;
private String hotelName;
private Address adress;
private Set<Menu> menu;
private Set<Delivery> delivery;
public Hotel() {
	super();
	// TODO Auto-generated constructor stub
}
public Hotel(String hotelName, Address adress, Set<Menu> menu, Set<Delivery> delivery) {
	super();
	this.hotelName = hotelName;
	@OneToOne
	this.adress = adress;
	@OneToMany
	this.menu = menu;
	@ManyToMany
	this.delivery = delivery;
}
public Integer getHotelId() {
	return hotelId;
}
public void setHotelId(Integer hotelId) {
	this.hotelId = hotelId;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public Address getAdress() {
	return adress;
}
public void setAdress(Address adress) {
	this.adress = adress;
}
public Set<Menu> getMenu() {
	return menu;
}
public void setMenu(Set<Menu> menu) {
	this.menu = menu;
}
public Set<Delivery> getDelivery() {
	return delivery;
}
public void setDelivery(Set<Delivery> delivery) {
	this.delivery = delivery;
}
@Override
public String toString() {
	return "Hotel [hotelName=" + hotelName + ", adress=" + adress + ", menu=" + menu + ", delivery=" + delivery + "]";
}
	
}
