package service;

import entity.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getCategories();

    Category getCategory(int theId);
}
