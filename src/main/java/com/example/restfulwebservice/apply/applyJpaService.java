package com.example.restfulwebservice.apply;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class applyJpaService {

    @Autowired
    applyRepository applyRepository;

    public void updateApply(String title, String code){

        apply apply = applyRepository.findByTitle(title);
        apply.setCode(code);
        applyRepository.save(apply);

    }
}
