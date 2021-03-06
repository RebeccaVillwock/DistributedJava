package dao;

import entity.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> getCategories();

    Category getCategory(int theId);
}
