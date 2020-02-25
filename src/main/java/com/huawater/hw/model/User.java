package com.huawater.hw.model;

import lombok.Data;

/**
 * @Author: chuyong
 * @Date: 2020/2/23 1:32
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}


