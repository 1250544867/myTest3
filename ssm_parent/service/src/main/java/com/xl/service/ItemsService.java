package com.xl.service;

import com.xl.pojo.Items;

import java.util.List;

public interface ItemsService {

    List<Items> findAll();

    int save(Items items);
}
