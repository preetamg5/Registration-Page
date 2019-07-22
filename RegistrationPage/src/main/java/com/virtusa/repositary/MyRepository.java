package com.virtusa.repositary;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.pojo.User;

@Repository
public interface MyRepository extends JpaRepository<User, Serializable> {

}
