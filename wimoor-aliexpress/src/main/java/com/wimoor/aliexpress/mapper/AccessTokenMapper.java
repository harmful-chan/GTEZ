package com.wimoor.aliexpress.mapper;



import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wimoor.aliexpress.pojo.entity.AccessToken;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author hans@globaltradeez.com
 * @since 2024-06-04
 */
@Mapper
public interface AccessTokenMapper extends  BaseMapper<AccessToken> {

    AccessToken selectByAccount(String acount);
}
