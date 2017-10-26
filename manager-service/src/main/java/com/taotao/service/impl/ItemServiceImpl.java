package com.taotao.service.impl;

import com.taotao.dao.ItemDao;
import com.taotao.pojo.Item;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 商品管理
 * User: wangpengbo
 * Date: 2017/9/13
 * Time: 下午11:04
 */
@Service("itemService")
public class ItemServiceImpl implements ItemService {

    private ItemDao itemDao;

    @Autowired
    public void setItemDao(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @Override
    public Item getItemById(Long itemId) {
        return itemDao.getItemById(itemId);
    }
}
