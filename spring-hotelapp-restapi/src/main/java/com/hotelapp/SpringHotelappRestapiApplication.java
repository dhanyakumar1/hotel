package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.Address;
import com.hotelapp.model.Delivery;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Menu;
import com.hotelapp.service.IHotelService;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}
	 @Autowired
	 IHotelService hotelService;
	@Override
	public void run(String... args) throws Exception {
		Address address = new Address("lalbhag", "bangalore", 573106, "karnataka");
		Menu menu1 = new Menu("veg", 01);
		Menu menu2 = new Menu("nonVej", 02);
		Set<Menu> menuList = new HashSet<>(Arrays.asList(menu1,menu2));
		Delivery delivery1 = new Delivery("swiggy", 100);
		Delivery delivery2 = new Delivery("zomato", 200);
		Set<Delivery> deliverieList = new HashSet<>(Arrays.asList(delivery1,delivery2));
		Hotel hotel = new Hotel("shelton", address, menuList, deliverieList);
		hotelService.addHotel(hotel);
		
	}

}
