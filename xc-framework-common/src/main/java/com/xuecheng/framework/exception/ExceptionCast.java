package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * @program: XcEduCode
 * @description: 异常抛出类
 * @author: zzy
 * @create: 2019-06-01 11:16
 **/
public class ExceptionCast {
    //使用此静态方法抛出自定义异常
    public static void cast(ResultCode resultCode){
        throw new CustomException(resultCode);
    }
}
