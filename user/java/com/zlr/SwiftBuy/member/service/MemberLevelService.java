package com.zlr.SwiftBuy.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xunqi.common.utils.PageUtils;
import com.zlr.SwiftBuy.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

