package com.huawater.hw.dto;

import lombok.Data;

/**
 * @Author: chuyong
 * @Date: 2020/2/22 17:30
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;

}
