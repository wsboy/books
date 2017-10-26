package com.taotao.controller;

import com.taotao.pojo.Item;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: wangpengbo
 * Date: 2017/9/13
 * Time: 下午11:19
 */
@Controller
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public Item getItemById(@PathVariable Long itemId) {
        return itemService.getItemById(itemId);
    }

}
