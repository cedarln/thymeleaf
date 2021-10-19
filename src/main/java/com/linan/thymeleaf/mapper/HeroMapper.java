package com.linan.thymeleaf.mapper;

import com.linan.thymeleaf.pojo.Hero;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HeroMapper {
    int add(Hero hero);

    void delete(int id);

    Hero get(int id);

    int update(Hero hero);

    List<Hero> list();
}
