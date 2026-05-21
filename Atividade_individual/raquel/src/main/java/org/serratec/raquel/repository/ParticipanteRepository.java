package org.serratec.raquel.repository;

import org.hibernate.annotations.QueryCacheLayout;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipanteRepository extends BaseRepository<Participante, Long> {

    @Query("SELECT p FROM Participante p WHERE p.email = :email")
    Participante findByEmail(String email);

    
}