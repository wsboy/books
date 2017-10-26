package com.taotao.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * com.taotao.pojo.User: wangpengbo
 * Date: 2017/9/13
 * Time: 下午5:49
 */
@Getter
@Setter
public class ItemParamItem {

    private Long id;

    private Long itemId;

    private Date created;

    private Date updated;

    private String paramData;
}
