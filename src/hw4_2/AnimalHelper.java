package hw4_2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

class AnimalHelper {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public AnimalHelper() {
        entityManagerFactory = Persistence.createEntityManagerFactory("zoo");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void add(Animal animal) {
        entityManager.getTransaction().begin();
        entityManager.merge(animal);
        entityManager.getTransaction().commit();

    }

    public void remove(int id) {
        entityManager.getTransaction().begin();
        Animal animal = entityManager.find(Animal.class, id);
        entityManager.remove(animal);
        entityManager.getTransaction().commit();

    }

    public List<Animal> getAll() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select animals from Animal animals");
        List<Animal> animals = query.getResultList();
        entityManager.getTransaction().commit();
        return animals;
    }

    public Animal getById(int id) {
        entityManager.getTransaction().begin();
        Animal animal = entityManager.find(Animal.class, id);
        entityManager.getTransaction().commit();
        return animal;
    }

 }
