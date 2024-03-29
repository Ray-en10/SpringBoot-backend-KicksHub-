package com.example.demo.service;

import com.example.demo.model.Category;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Primary
public interface categoryService {
    Category addCategory(Category c);

    // delete category
    void deleteCategory(int id);

    // update category

    Category updateCategory(Category c);

    // get category by id

    Category getCategoryById(int id);

    // get all categories

    List<Category> getAllCategories();

}
