package com.poruki.backend.persistance.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.poruki.backend.persistance.domain.backend.Users;

@Repository
@Transactional(readOnly=true)
public interface UserRepository extends CrudRepository<Users, Long>{

	 Users findByUsername(String usename);
	 Users findByEmail(String email);
	 
	 @Modifying
	 @Query("update Users u set u.password = :password where u.id = :userId")
	 void updateUserPassword(@Param("userId") long userId, @Param("password") String password);
}
