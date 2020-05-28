package dao;

import entity.Mini;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MiniDAOImpl implements MiniDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Mini> getMinis() {
        Session session = sessionFactory.getCurrentSession();

        List<Mini> list = session.createQuery("from Mini", Mini.class).getResultList();

        return list;
    }

    @Override
    public void saveMini(Mini theMini) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(theMini);
    }

    @Override
    public Mini getMini(int theId) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Mini.class, theId);
    }

    @Override
    public void deleteMini(int theId) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("delete from Mini where id = :doomedMini");

        query.setParameter("doomedMini", theId);

        query.executeUpdate();
    }

    @Override
    public List<Mini> getMinisByName(String searchTerm) {
        Session session = sessionFactory.getCurrentSession();

        searchTerm = "%" + searchTerm.toLowerCase() + "%";

        Query query = session.createQuery("from Mini where lower(name) like :search");

        query.setParameter("search", searchTerm);

        return query.getResultList();
    }
}
