package be.intecbrussel.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMFProvider {

    private static EntityManagerFactory entityManagerFactory;

    private EMFProvider(){}

    public static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null){
            entityManagerFactory = Persistence.createEntityManagerFactory("mysql");
        }
        return entityManagerFactory;
    }
}
