package com.hotelapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;

@Service
public interface IHotelService {
void addHotel(Hotel hotel);
void updateHotel(Hotel hotel);
void deleteHotel(int hotelId);
Hotel getHotelById(int hotelId);

List<Hotel> getHotelByCity(String city);
List<Hotel> getHotelByLocation(String location);
List<Hotel> getHotelByMenu(String menu);
List<Hotel> getHotelByDelivery(String partnerName);
List<Hotel> getHotelByLocationAndName(String location, String menuName);
}
