package edu.wctc.dao;
import edu.wctc.entity.DonutShop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DonutShopDAOImpl implements DonutShopDAO
{
@Autowired
private SessionFactory  sessionFactory;


    @Override
    public List<DonutShop> getDonutShops() {
        Session session = sessionFactory.getCurrentSession();

        List<DonutShop> list = session.createQuery("from DonutShop", DonutShop.class).getResultList();

        return list;
    }

    @Override
    public DonutShop getDonutShop(int id) {
        Session session = sessionFactory.getCurrentSession();

        DonutShop aShop = session.get(DonutShop.class, id);

        return aShop;
    }
}
