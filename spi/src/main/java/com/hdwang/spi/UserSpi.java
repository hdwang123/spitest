package com.hdwang.spi;

import com.hdwang.spi.model.User;

/**
 * 用户SPI接口
 *
 * @author wanghuidong
 * 时间： 2022/6/9 19:31
 */
public interface UserSpi {

    /**
     * 获取用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    User getUserById(Long id);
}
