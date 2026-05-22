package org.serratec.raquel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.serratec.raquel.domain.Organizador;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizadorRepository extends JpaRepository<Organizador, Long> {

    @Query("SELECT o FROM Organizador o WHERE o.email = :email")
    Organizador findByEmail(String email);

    
}
