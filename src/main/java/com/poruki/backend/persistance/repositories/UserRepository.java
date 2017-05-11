package com.poruki.backend.persistance.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poruki.backend.persistance.domain.backend.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long>{

}
