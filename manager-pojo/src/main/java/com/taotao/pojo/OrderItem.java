package com.taotao.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * com.taotao.pojo.User: wangpengbo
 * Date: 2017/9/13
 * Time: 下午5:51
 */
@Getter
@Setter
public class OrderItem {

    private String id;

    private String itemId;

    private String orderId;

    private Integer num;

    private String title;

    private Long price;

    private Long totalFee;

    private String picPath;
}
