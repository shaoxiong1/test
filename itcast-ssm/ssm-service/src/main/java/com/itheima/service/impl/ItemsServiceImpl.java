package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("itemsService")
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    @Override
    public void updateItems(Items items) {
        itemsDao.updateItems(items);
    }

    @Override
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
