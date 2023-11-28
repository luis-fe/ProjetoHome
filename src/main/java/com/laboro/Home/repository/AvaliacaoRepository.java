package com.laboro.Home.repository;

import com.laboro.Home.model.Agenda;
import com.laboro.Home.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Long> {
    
}
