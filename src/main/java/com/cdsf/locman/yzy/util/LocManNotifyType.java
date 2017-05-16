package com.cdsf.locman.yzy.util;

/**
 * Created by Administrator on 2016/7/5.
 * LocMan通知类型
 */
public class LocManNotifyType {
    public static final String NOTIFY_COME_TO_ORDER_STATUS = "nttify_come_to_order_status";//通知进入工单状态   需传入进入哪类型工单
    public static final String NOTIFY_SELECTED_INFO = "nttify_selected_info";//通知已选择的设施信息
    public static final String NOTIFY_SELECTED_INFO_CALLBACK = "nttify_selected_info_callback";//通知改变已选择的设施
    public static final String NOTIFY_CREATE_SEARCH_KEYWORD = "notify_create_search_keyword";//通知搜索关键字
    public static final String NOTIFY_CREATE_STEP = "notify_create_step";//通知地图创建步骤
    public static final String NOTIFY_CAREATE_SEARCH_MODE="notify_create_search_mode";//创建工单时 搜索模式

    //显示单个设备在地图上的信息
    public static final String NOTIFY_SHOW_SINGLE_FACILITY_MAP="notify_show_single_facility_map";


    //针对于工单的信息
    public static final String NOTIFY_CHANGE_TO_SHOW_ORDER = "notify_change_to_show_order";//去显示工单列表


    //针对于搜索的设备 这里需要显示
    public static final String NOTIFY_DEVICE_SEARCH_MAP_SHOW = "notify_device_search_map_show";

    //选中的所有的设备
    public static final String NOTIFY_CREATE_REGION_SELECT_DEVICE = "notify_create_region_select_device";


    //需要进行导航
    public static final String NOTIFY_START_NAV = "notify_start_nav";//开始导航

    //针对于创建工单时候 筛选 显示隐藏
    public static final String NOTIFY_CREATE_ORDER_FILTER_SHOW_HIDE="notify_create_order_filter_show_hide";//是否显示或者隐藏创建工单的时候筛选按钮


    //通知消息发送
    public static final String NOTIFY_ORDER_NOTIFICATION_FROM_JPUSH="notify_order_notification_from_jpush";//从jpush推送来的消息

    //网络变化
    public static final String NOTIFY_NETWORK_STATUS_CHANGE="notify_network_status_change";//通知网络变化

    //离线地图
    public static final String NOTIFY_OFFLINE_SCROLL_TO_DOWNLOAD="notify_offline_scroll_to_download";//跳转到下载界面

    //巡检设备
    public static final String NOTIFY_POLLING_DEVICE_CHANGE="notify_polling_device_change";//巡检设备

}
