package com.xl.service.impl;

import com.xl.dao.ItemsDAo;
import com.xl.pojo.Items;
import com.xl.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDAo itemsDao;

    /***
     * 集合查询
     * @return
     */
    public List<Items> findAll() {
        return itemsDao.findAll();
    }

    /***
     * 增加商品测试事务
     * @param items
     * @return
     */
    public int save(Items items) {
        int acount = itemsDao.save(items);

        System.out.println("acount:"+acount);

        //测试事务，如果出错，是否回滚
        //int q=10/0;

        return acount;
    }
}
