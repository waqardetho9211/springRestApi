package de.kfw.citycatalog.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import de.kfw.citycatalog.entity.City;

@Repository
public class CityRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public City add(City city) {
        return this.entityManager.merge(city);
    }

    @Transactional
    public void update(City city) {
        this.entityManager.persist(city);
    }

    public List<City> findAll() {
        Query query = entityManager.createQuery("SELECT c FROM City c");
        return (List<City>)query.getResultList();
    }

    public City findById(Long id) {
        return this.entityManager.find(City.class, id);
    }

    @Transactional
    public void delete(Long id) {
        City city = this.findById(id);
        this.entityManager.remove(city);
    }
}
