package com.hdwang.spiimpl1;

import com.hdwang.spi.UserSpi;
import com.hdwang.spi.model.User;

/**
 * 用户SPI接口实现 1
 *
 * @author wanghuidong
 * 时间： 2022/6/9 19:38
 */
public class UserSpiImpl1 implements UserSpi {
    @Override
    public User getUserById(Long id) {
        return new User(1L, "张三");
    }
}
