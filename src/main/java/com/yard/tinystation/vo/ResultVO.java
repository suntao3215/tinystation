package com.yard.tinystation.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;

public class ResultVO implements Serializable {

    private static final long serialVersionUID = 1L;

    // 操作状态码
    private Integer msgStatus;

    // 操作信息
    @JSONField(serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private String msgText;

    // 结果数据
    @JSONField(serialzeFeatures = SerializerFeature.WriteMapNullValue)
    private Object obj;

    public Integer getMsgStatus() {
        return msgStatus == null ? 0 : msgStatus;
    }

    public void setMsgStatus(Integer msgStatus) {
        this.msgStatus = msgStatus;
    }

    public String getMsgText() {
        return msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
