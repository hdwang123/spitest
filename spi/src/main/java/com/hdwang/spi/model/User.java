package com.hdwang.spi.model;

/**
 * 用户
 *
 * @author wanghuidong
 * 时间： 2022/6/9 19:31
 */
public class User {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    public User() {

    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
