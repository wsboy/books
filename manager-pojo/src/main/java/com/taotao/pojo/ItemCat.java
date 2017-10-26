package com.taotao.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * com.taotao.pojo.User: wangpengbo
 * Date: 2017/9/13
 * Time: 下午4:48
 */
@Getter
@Setter
public class ItemCat {

    private Long id;

    private Long parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Boolean isParent;

    private Date created;

    private Date updated;
}
