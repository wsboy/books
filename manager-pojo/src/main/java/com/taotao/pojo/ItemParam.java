package com.taotao.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * com.taotao.pojo.User: wangpengbo
 * Date: 2017/9/13
 * Time: 下午5:48
 */
@Getter
@Setter
public class ItemParam {

    private Long id;

    private Long itemCatId;

    private Date created;

    private Date updated;

    private String paramData;
}
