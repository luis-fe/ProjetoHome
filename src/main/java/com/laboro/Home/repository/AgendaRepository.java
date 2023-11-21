package com.laboro.Home.repository;

import com.laboro.Home.model.Agenda;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long>{
}
