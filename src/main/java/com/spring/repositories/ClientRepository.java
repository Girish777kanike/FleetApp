package com.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.models.Client;



public interface ClientRepository extends JpaRepository<Client, Integer> {

}
