package co.grandcircus.hotel_list.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.hotel_list.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long>{

	List<Hotel> findAllByCityOrderByPricePerNight(String city);
	
	
}
