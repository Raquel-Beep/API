package org.serratec.raquel.repository;

import org.serratec.raquel.domain.PreferenciaAcessibilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferenciaAcessibilidadeRepository extends JpaRepository<PreferenciaAcessibilidade, Long> {
}