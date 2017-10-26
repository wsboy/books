package com.taotao.dao;

import com.taotao.pojo.Item;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: wangpengbo
 * Date: 2017/9/13
 * Time: 下午11:07
 */
@Repository
public interface ItemDao {

    Item getItemById(@Param("id") Long id);

    List<Item> getItemsByPrice(@Param("price") Long price);
}
