package com.xl.dao;

import com.xl.pojo.Items;

import java.util.List;

public interface ItemsDAo {
    List<Items> findAll();

    int save(Items items);
}
