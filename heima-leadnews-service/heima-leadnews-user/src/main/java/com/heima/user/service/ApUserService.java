package com.heima.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.user.dtos.LoginDto;
import com.heima.model.user.pojos.ApUser;

/**
 * @Author psikun
 * @Description ApUserService
 * @Date 2023/06/27/ 14:16
 */
public interface ApUserService extends IService<ApUser> {

    /**
     * app端登录功能
     *
     * @param loginDto
     * @return
     */
    ResponseResult<ApUser> login(LoginDto loginDto);
}
