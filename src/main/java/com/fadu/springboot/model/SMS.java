package com.fadu.springboot.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 发送短信
 *
 * @Auther: wangchun
 * @Date: 2018/6/27 13:32
 */
@Getter
@Setter
@ToString
public class SMS implements Serializable {

    /**
     * 发送手机号
     */
    private String phone;

    /**
     * 短信模板接口代码
     */
    private String templateCode;
    /**
     * 短信模板使用参数
     */
    private String templateParam;

}
