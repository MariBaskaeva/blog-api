package com.elbundo.blogapi.repository;

import com.elbundo.blogapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
