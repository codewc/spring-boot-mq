package com.fadu.springboot.service.interfaces;

import com.fadu.springboot.common.JsonData;

/**
 * 发送短信业务组件
 *
 * @Auther: wangchun
 * @Date: 2018/6/27 14:47
 */
public interface SMSService {

    String DEFAULT_SIGNNAME = "多问";

    /**
     * 发送手机短信
     *
     * @param mobile        手机号
     * @param templateCode  短信模板代码
     * @param templateParam 短信业务参数变量
     * @param signName      签名信息{@link #DEFAULT_SIGNNAME}
     * @return 发送结果
     */
    JsonData sendDayuSystemMsg(String mobile, String templateCode, String templateParam, String signName);


    /**
     * 发送手机短信{@link #sendDayuSystemMsg(String, String, String, String)}  }
     *
     * @param mobile
     * @param templateCode
     * @param templateParam
     * @return
     */
    JsonData sendDayuSystemMsg(String mobile, String templateCode, String templateParam);

    /**
     * 发送手机短信{@link #sendDayuSystemMsg(String, String, String, String)}  }
     *
     * @param mobile
     * @param templateCode
     * @return
     */
    JsonData sendDayuSystemMsg(String mobile, String templateCode);
}
