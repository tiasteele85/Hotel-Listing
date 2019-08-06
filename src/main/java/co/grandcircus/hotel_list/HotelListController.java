package co.grandcircus.hotel_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.hotel_list.dao.HotelDao;
import co.grandcircus.hotel_list.dao.HotelRepository;
import co.grandcircus.hotel_list.entity.Hotel;


@Controller
public class HotelListController {
	
	@Autowired
	private HotelDao hDao; 
	@Autowired
	private HotelRepository hrDao;
	
	@RequestMapping("/")
	public ModelAndView showHome() {
		return new ModelAndView("/home");		
	}
	
	@PostMapping("/home")
	public ModelAndView collectDropDown(
			@RequestParam("city") String choice,
			@RequestParam("price") int maxPrice) {
		
		List<Hotel> result = hrDao.findAllByCityOrderByPricePerNight(choice);
		
		Predicate<Hotel> condition = hotel -> hotel.getPricePerNight() > maxPrice;
        result.removeIf(condition);
		return new ModelAndView("results", "hotels", result );
		
	}
	
	
	
	@RequestMapping("/results")
	public ModelAndView showResults() {
		return new ModelAndView("/result");
	}
	
	@RequestMapping("/details")
	public ModelAndView showDetails(Long id) {
		
		Hotel hotel = hDao.findById(id);		
		return new ModelAndView("details", "hotel", hotel);
	}
	
	
}
