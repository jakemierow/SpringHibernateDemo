package edu.wctc.service;


import edu.wctc.dao.DonutDAO;
import edu.wctc.entity.Donut;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DonutDAOImpl implements DonutDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Donut> getDonuts() {

        Session session = sessionFactory.getCurrentSession();


        List<Donut> list = session.createQuery("from Donut",Donut.class).getResultList();

        return list;
    }

    @Override
    public void saveDonut(Donut theDonut) {

        Session session = sessionFactory.getCurrentSession();

        session.save(theDonut);

    }







}


