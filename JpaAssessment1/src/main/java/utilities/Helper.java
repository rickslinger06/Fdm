package utilities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Helper {
	
	public static final String PERSISTENCE_UNIT_NAME = "JpaAssessment2";
	
	
	public static final void close(EntityManager em) {
		if(em != null && em.isOpen()) {
			em.close(); // Defensive coding
		}
	}
	
	public static final void close(EntityManagerFactory emf) {
		if(emf != null && emf.isOpen()) {
			emf.close(); // Defensive coding
		}
	}

}
