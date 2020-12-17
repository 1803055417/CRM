package com.powernode.contants;

/**
 * @ProjectName: crm
 * @Package: com.powernode.contants
 * @Description: 统一定义错误信息  枚举
 * @Author: 倪云锋
 * @CreateDate: 2020/12/17 19:56
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public enum  CrmException {
    LOGIN_ACCOUNT_EXCEPTION("001","用户名或密码错误!"),
    LOGIN_EXPIRE_EXCEPTION("001","账户已经失效！"),
    LOGIN_LOCK_EXCEPTION("001","账户被锁定，请联系管理员！"),
    LOGIN_IP_EXCEPTION("001","非法IP，无法登录!");

    private String code;

    CrmExceptionEnum(String code,String message){

    }
}
