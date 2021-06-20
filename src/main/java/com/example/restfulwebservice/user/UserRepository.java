package com.example.restfulwebservice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository //데이터 베이스에 관련된 bean임을 알림
public interface UserRepository extends JpaRepository<User,Integer/*ID가 INTEGER니까*/> {

    Optional<User> findByEmail(String email);
}
