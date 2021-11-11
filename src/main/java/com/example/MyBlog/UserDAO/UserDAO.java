package com.example.MyBlog.UserDAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.MyBlog.model.UserDetails;
@Repository
public interface UserDAO extends CrudRepository<UserDetails, Integer> {

}
