package com.laboro.Home.repository;

import com.laboro.Home.model.Avaliacao;
import com.laboro.Home.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {
    
}
