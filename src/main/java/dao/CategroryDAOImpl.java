package dao;

import entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategroryDAOImpl implements CategoryDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Category> getCategories() {
        Session session = sessionFactory.getCurrentSession();

        List<Category> list = session.createQuery("from Category", Category.class).getResultList();

        return list;
    }

    @Override
    public Category getCategory(int theId) {
        Session session = sessionFactory.getCurrentSession();

        Category aCategory = session.get(Category.class, theId);

        return aCategory;
    }
}
