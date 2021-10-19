package com.linan.thymeleaf.service;

import com.linan.thymeleaf.pojo.Hero;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroService {
    int add(Hero hero);

    void delete(int id);

    Hero get(int id);

    int update(Hero hero);

    List<Hero> list();
}
