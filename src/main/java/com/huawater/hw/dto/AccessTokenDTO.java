package com.huawater.hw.dto;

import lombok.Data;

/**
 * @Author: chuyong
 * @Date: 2020/2/22 17:06
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
