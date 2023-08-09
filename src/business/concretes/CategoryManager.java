package business.concretes;

import business.abstracts.CategoryService;
import core.logging.abstracts.Logger;
import dataAcess.abstracts.DataAcessService;
import entites.concretes.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements CategoryService {

    DataAcessService dataAcessService;
    List<Logger> loggers;

    public CategoryManager(DataAcessService dataAcessService, List<Logger> loggers) {
        this.dataAcessService = dataAcessService;
        this.loggers = loggers;
    }

    ArrayList<Category> categories = new ArrayList<Category>();

    @Override
    public void addCategory(Category category) {
        //şart kontrollü ekleme yapıldı(Kategori ismi tekrar edemez)
        for(Category category1:categories){
            if(category1.getName().toLowerCase().matches(category.getName().toLowerCase())){
                System.out.println("Kategori eklenemedi (zaten bu kategori var)");
                listloger(category.getName() +" Adlı Kategori zaten olduğundan dolayı eklenemedi ");
                return;
            }
        }
        categories.add(category);
        dataAcessService.addCategory(category);
        listloger(category.getName() +" Adlı Kategori Eklendi.");
    }

    @Override
    public List<Category> getAllCategory() {
        listloger("Tüm kategoriler Listelendi");
        return dataAcessService.getAllCategory();
    }

    @Override
    public void deleteCategory(int id) {
        listloger(id +" id li kategori silindi ");
        dataAcessService.deleteCategory(id);
    }
    private void listloger(String data){
        for(Logger logger:loggers){
            logger.log(data);
        }
    }
}
