package com.rhinoceros.mall.core.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rhinoceros.mall.core.enumeration.Gender;
import com.rhinoceros.mall.core.enumeration.UserStatus;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体
 */
@Data
public class User implements Serializable{
    /**
     * 用户id
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    @JsonIgnore
    private String password;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 昵称
     */
    private String nickname;
    /**
     * 性别
     */
    private Gender gender;
    /**
     * 电话号码
     */
    private String telephone;
    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 头像url
     */
    private String avatar;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 上次登录时间
     */
    private Date lastLoginAt;

    /**
     * 上次登录ip
     */
    private String lastLoginIp;

    /**
     * 用户状态
     */
    @JsonIgnore
    private UserStatus status;

}
