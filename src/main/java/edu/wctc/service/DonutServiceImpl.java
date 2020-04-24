package edu.wctc.service;


import edu.wctc.dao.DonutDAO;
import edu.wctc.entity.Donut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
public class DonutServiceImpl implements DonutService
{

  @Autowired
  private DonutDAO donutDAO;

   @Override
   @Transactional
   public List<Donut> getDonuts() {
       return donutDAO.getDonuts();
    }

    @Override
    @Transactional
    public void saveDonut(Donut theDonut) {
        if(theDonut.getDateAdded() == null)
            theDonut.setDateAdded(LocalDate.now());
            donutDAO.saveDonut(theDonut);
    }
}
