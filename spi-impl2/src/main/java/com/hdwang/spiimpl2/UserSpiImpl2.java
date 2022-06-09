package com.hdwang.spiimpl2;

import com.hdwang.spi.UserSpi;
import com.hdwang.spi.model.User;

/**
 * 用户SPI接口实现 2
 *
 * @author wanghuidong
 * 时间： 2022/6/9 19:40
 */
public class UserSpiImpl2 implements UserSpi {
    @Override
    public User getUserById(Long id) {
        return new User(2L, "李四");
    }
}
