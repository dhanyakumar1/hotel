package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
import com.hotelapp.repository.HotelRepository;
@Service
public class HotelServiceImpl implements IHotelService {
@Autowired
HotelRepository hotelRepository;
	@Override
	public void addHotel(Hotel hotel) {
		hotelRepository.save(hotel);
	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepository.save(hotel);
	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);
	}

	@Override
	public Hotel getHotelById(int hotelId) {
		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public List<Hotel> getHotelByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelByMenu(String menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelByDelivery(String partnerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelByLocationAndName(String location, String menuName) {
		// TODO Auto-generated method stub
		return null;
	}

}
