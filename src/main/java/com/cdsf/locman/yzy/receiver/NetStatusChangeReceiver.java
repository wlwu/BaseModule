package com.cdsf.locman.yzy.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.text.TextUtils;


import com.cdsf.locman.yzy.Bean.LocManNotifyBean;
import com.cdsf.locman.yzy.util.LocManNotifyType;
import com.cdsf.locman.yzy.util.NetUtil;

import de.greenrobot.event.EventBus;


public class NetStatusChangeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if(TextUtils.equals(action, ConnectivityManager.CONNECTIVITY_ACTION)){
            boolean connect= NetUtil.isConnectToNet(context);
            LocManNotifyBean notifyBean=new LocManNotifyBean();
            notifyBean.setNotifyTyp(LocManNotifyType.NOTIFY_NETWORK_STATUS_CHANGE);
            notifyBean.setNotifyData(connect);
            EventBus.getDefault().post(notifyBean);
        }
    }
}
