package com.taotao.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * com.taotao.pojo.User: wangpengbo
 * Date: 2017/9/13
 * Time: 下午5:52
 */
@Getter
@Setter
public class OrderShipping {

    private String orderId;

    private String receiverName;

    private String receiverPhone;

    private String receiverMobile;

    private String receiverState;

    private String receiverCity;

    private String receiverDistrict;

    private String receiverAddress;

    private String receiverZip;

    private Date created;

    private Date updated;
}
