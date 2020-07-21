package com.spring.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
