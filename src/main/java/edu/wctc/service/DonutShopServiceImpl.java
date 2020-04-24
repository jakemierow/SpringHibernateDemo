package edu.wctc.service;

import edu.wctc.dao.DonutShopDAO;
import edu.wctc.entity.DonutShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DonutShopServiceImpl implements DonutShopService {

    @Autowired
    private DonutShopDAO donutShopDAO;


    @Override
    @Transactional
    public List<DonutShop> getDonutShops() {
        return donutShopDAO.getDonutShops();
    }

    @Override
    @Transactional
    public DonutShop getDonutShop(int id) {
        return donutShopDAO.getDonutShop(id);
    }
}
