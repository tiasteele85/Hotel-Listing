package co.grandcircus.hotel_list.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import co.grandcircus.hotel_list.entity.Hotel;

@Repository
@Transactional
public class HotelDao {

	@PersistenceContext
	EntityManager em;
	
	public List<Hotel> findAll(){
		
		 return em.createQuery("FROM Hotel", Hotel.class).getResultList();
	}
	
	public Hotel findById(Long id) {
		return em.find(Hotel.class, id);
	}
	
	public void create(Hotel hotel) {
		em.persist(hotel);
	}
	
	public void delete(Long id) {
		Hotel hotel = em.getReference(Hotel.class, id);
		em.remove(hotel);	
		
	}
	
	public List<Hotel> findByCity(String city){
		return em.createQuery("FROM Hotel WHERE LOWER(city) LIKE :regex", Hotel.class)
				.setParameter("regex", "%" + city.toLowerCase() + "%")
				.getResultList();
	}
}
