package com.xunqi.gulimall.product.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 *


       06-19 18:17
 **/

@Data
@ToString
public class SkuItemSaleAttrVo {

    private Long attrId;

    private String attrName;

    private List<AttrValueWithSkuIdVo> attrValues;

}
