package com.itheima.service;

import com.itheima.domain.Items;

import java.util.List;

public interface ItemsService {

    List<Items> findAll();

    void updateItems(Items items);

    Items findById(Integer id);
}
