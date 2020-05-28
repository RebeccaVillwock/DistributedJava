package dao;

import entity.MiniDescription;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MiniDescriptionDAOImpl implements MiniDescriptionDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveMiniDescription(MiniDescription theMiniDescription) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(theMiniDescription);
    }

    @Override
    public MiniDescription getMiniDescription(int theId) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(MiniDescription.class, theId);
    }

    @Override
    public void deleteMiniDescription(int theId) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("delete from MiniDescription where id = :doomedDescription");
        query.setParameter("doomedDescription", theId);

        query.executeUpdate();
    }
}
