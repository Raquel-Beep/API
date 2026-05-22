package org.serratec.raquel.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrganizadorRepository extends JpaRepository<Organizador, Long> {

    @Query("SELECT o FROM Organizador o WHERE o.email = :email")
    Organizador findByEmail(String email);

    
}
