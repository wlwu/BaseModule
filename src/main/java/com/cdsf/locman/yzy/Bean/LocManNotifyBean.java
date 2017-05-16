package com.cdsf.locman.yzy.Bean;

/**
 * Created by Administrator on 2016/7/5.
 */
public class LocManNotifyBean {
    private String notifyTyp;//通知的类型
    private Object notifyData;//通知的数据
    public LocManNotifyBean(){

    }
    public LocManNotifyBean(String type, Object data){
        notifyTyp=type;
        notifyData=data;
    }
    public String getNotifyTyp() {
        return notifyTyp;
    }

    public void setNotifyTyp(String notifyTyp) {
        this.notifyTyp = notifyTyp;
    }

    public Object getNotifyData() {
        return notifyData;
    }

    public void setNotifyData(Object notifyData) {
        this.notifyData = notifyData;
    }
}