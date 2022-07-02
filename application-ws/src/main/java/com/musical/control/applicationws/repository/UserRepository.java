package com.musical.control.applicationws.repository;

import com.musical.control.applicationws.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
