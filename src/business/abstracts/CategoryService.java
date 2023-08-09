package business.abstracts;

import entites.concretes.Category;

import java.util.List;

public interface CategoryService {
    void addCategory(Category category);
    List<Category> getAllCategory();
    void deleteCategory(int id);
}
