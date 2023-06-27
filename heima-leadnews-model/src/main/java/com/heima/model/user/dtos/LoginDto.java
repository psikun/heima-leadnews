package com.heima.model.user.dtos;

import lombok.Data;

/**
 * @Author psikun
 * @Description LoginDto
 * @Date 2023/06/27/ 14:11
 */

@Data
public class LoginDto {


    /**
     * 手机号
     */
    private String phone;

    /**
     * 密码
     */
    private String password;

}
