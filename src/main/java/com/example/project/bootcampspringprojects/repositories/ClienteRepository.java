package com.example.project.bootcampspringprojects.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.project.bootcampspringprojects.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
