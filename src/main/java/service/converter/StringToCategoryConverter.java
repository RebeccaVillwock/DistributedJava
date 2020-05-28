package service.converter;

import entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import service.CategoryService;

public class StringToCategoryConverter implements Converter<String, Category> {

    @Autowired
    private CategoryService categoryService;

    @Override
    public Category convert(String categoryId) {
        int categoryIdNumber = Integer.parseInt(categoryId);
        Category theCategory = categoryService.getCategory(categoryIdNumber);
        return theCategory;
    }
}
