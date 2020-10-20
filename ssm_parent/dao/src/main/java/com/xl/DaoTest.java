package com.xl;

import com.xl.dao.ItemsDAo;
import com.xl.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class DaoTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDAo itemsDAo = applicationContext.getBean(ItemsDAo.class);
        System.out.println("商品列表：：："+itemsDAo.findAll());

        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsDAo.save(items);
    }
}
