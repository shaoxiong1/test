package com.itheima.dao;

import com.itheima.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ItemsDao {

    @Select("select * from items")
    List<Items> findAll();
    @Update("update items set name=#{name} ,price=#{price},pic=#{pic},createtime=#{createtime},detail=#{detail} where id=#{id}")
    void updateItems(Items items);

    @Select("select * from items where id=#{id}")
    Items findById(Integer id);
}
