package com.xunqi.gulimall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

      
       07-04 23:19
 **/

@Data
public class FareVo {

    private MemberAddressVo address;

    private BigDecimal fare;

}
