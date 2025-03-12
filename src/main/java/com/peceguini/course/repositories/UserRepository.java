package com.peceguini.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.peceguini.course.entites.User;

public interface  UserRepository extends JpaRepository<User, Long> {


}
