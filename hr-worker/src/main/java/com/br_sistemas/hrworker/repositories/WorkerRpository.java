package com.br_sistemas.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br_sistemas.hrworker.entities.Worker;

public interface WorkerRpository extends JpaRepository<Worker, Long> {

}
