package edu.wctc.service.converter;

import edu.wctc.entity.DonutShop;
import edu.wctc.service.DonutShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToDonutShopConverter implements Converter<String, DonutShop> {

    @Autowired
    private DonutShopService donutShopService;

    @Override
    public DonutShop convert(String shopId) {
        int shopIdNumber = Integer.parseInt(shopId);
        DonutShop theShop = donutShopService.getDonutShop(shopIdNumber);
        return theShop;
    }
}

