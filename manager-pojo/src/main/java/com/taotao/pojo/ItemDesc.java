package com.taotao.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * com.taotao.pojo.User: wangpengbo
 * Date: 2017/9/13
 * Time: 下午4:49
 */
@Getter
@Setter
public class ItemDesc {

    private Long itemId;

    private Date created;

    private Date updated;

    private String itemDesc;
}
