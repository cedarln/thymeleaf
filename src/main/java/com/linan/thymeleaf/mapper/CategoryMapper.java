package com.linan.thymeleaf.mapper;

import com.linan.thymeleaf.pojo.Category;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CategoryMapper {
    @Select("select * from category_ ")
    List<Category> findAll();

    @Insert("insert into category (name) values(#{name}")
    int save(Category category);

    @Delete("delete from category where id=#{id}")
    void delete(int id);

    @Select("select * from category_ where id=#{id}")
    Category get(int id);

    @Update("update category set name=#{name} where id=#{id}")
    int update(Category category);
}
