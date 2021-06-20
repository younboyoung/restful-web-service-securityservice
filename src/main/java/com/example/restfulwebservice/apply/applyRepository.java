package com.example.restfulwebservice.apply;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository //데이터 베이스에 관련된 bean임을 알림
public interface applyRepository extends JpaRepository<apply,Integer/*ID가 INTEGER니까*/> {

    apply findByTitle(String Title);

    List<apply> findByCelId(String celId);

}
