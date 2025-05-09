package com.abin.mallchat.common.user.domain.vo.request.ws;

import lombok.Data;

/**
 * Description: websocket前端请求体
 */
@Data
public class WSBaseReq {
    /**
     * 请求类型 1.请求登录二维码，2心跳检测
     *
     * @see com.abin.mallchat.common.user.domain.enums.WSReqTypeEnum
     */
    private Integer type;

    /**
     * 每个请求包具体的数据，类型不同结果不同 string接收，后面转码
     */
    private String data;
}
