package com.linan.thymeleaf.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.linan.thymeleaf.mapper.CategoryMapper;
import com.linan.thymeleaf.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    CategoryMapper mapper;

    @RequestMapping("/addCategory")
    public String listCategory(Category category) throws Exception {
        mapper.save(category);
        return "redirect:listCategory";
    }

    @RequestMapping("/deleteCategory")
    public String deleteCategory(Category category) throws Exception {
        mapper.delete(category.getId());
        return "redirect:listCategory";
    }

    @RequestMapping("/updateCategory")
    public String updateCategory(Category category) throws Exception {
        mapper.update(category);
        return "redirect:listCategory";
    }

    @RequestMapping("/editCategory")
    public String editCategory(int id, Model m) throws Exception {
        Category category = mapper.get(id);
        m.addAttribute("c", category);
        return "editCategory";
    }

    @RequestMapping("/listCategory")
    public String listCategory(Model m,
                               @RequestParam(value = "start", defaultValue = "0") int start,
                               @RequestParam(value = "size", defaultValue = "5")int size
    ) throws Exception {
        PageHelper.startPage(start, size, "id desc");
        List<Category> cs = mapper.findAll();
        PageInfo<Category> page = new PageInfo<Category>(cs);
        m.addAttribute("page", page);
        return "listCategory";
    }
}
