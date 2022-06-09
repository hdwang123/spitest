package com.hdwang.test;

import com.hdwang.spi.UserSpi;
import com.hdwang.spi.model.User;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 测试类
 *
 * @author wanghuidong
 * 时间： 2022/6/9 19:46
 */
public class Test {

    public static void main(String[] args) {
        ServiceLoader<UserSpi> s = ServiceLoader.load(UserSpi.class);
        Iterator<UserSpi> iterator = s.iterator();
        while (iterator.hasNext()) {
            //如果存在多个实现类，则会遍历调用
            UserSpi userSpi = iterator.next();
            User user = userSpi.getUserById(1L);
            System.out.println(user);
        }

    }
}
