package com.hua.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/25.
 */

public class SettingsBean implements Serializable {


    /**
     * AboutAika : 艾卡记忆是艾卡(北京)科技有限公司开发的一款高效辅助记忆软件.
     * SystemVoice : false
     * answerButtonSize : 100
     * automaticSyncMode : false
     * backupMax : 8
     * browserEditorFont : 0
     * cardZoom : 100
     * centerVertically : false
     * convertFenText : false
     * dayOffset : 20
     * deckreader : true
     * decktests : true
     * defaultFont : 0
     * fullscreenMode : 0
     * homePageStyle : 0
     * imageZoom : 100
     * keepScreenOn : false
     * language : 0
     * learnCutoff : 20
     * minimumCardsDueForNotification : 0
     * newSpread : 0
     * overrideFontBehavior : 0
     * relativeCardBrowserFontSize : 100
     * reportErrorMode : 2
     * showEstimates : false
     * syncFetchesMedia : true
     * themeIndex : 1
     * timeLimit : 0
     * tts : false
     * useCurrent : 0
     * widgetBlink : false
     * widgetVibrate : false
     */

    /** 关于 **/
    private String AboutAika = "艾卡记忆是艾卡(北京)科技有限公司开发的一款高效辅助记忆软件.";
    /** 声音 **/
    private boolean SystemVoice = false;
    /** 显示答案按钮大小 **/
    private int answerButtonSize = 100;
    /** 自动同步 **/
    private boolean automaticSyncMode = false;
    /** 最大备份数量 **/
    private int backupMax = 8;
    /** 浏览器和编辑器字体 **/
    private int browserEditorFont = 0;
    /** 卡片缩放 **/
    private int cardZoom = 100;
    /** 居中对齐 **/
    private boolean centerVertically = false;
    /** 启用象棋国际插件 **/
    private boolean convertFenText = false;
    /** 下一天开始时间 **/
    private int dayOffset = 20;
    /** 启用阅读制卡插件 **/
    private boolean deckreader = true;
    /** 启用模拟考试制卡插件 **/
    private boolean decktests = true;
    /** 默认字体 **/
    private int defaultFont = 0;
    /** 全屏显示 **/
    private int fullscreenMode = 0;
    /** 主界面功能 **/
    private int homePageStyle = 0;
    /** 图片缩放 **/
    private int imageZoom = 100;
    /** 保持屏幕常亮 **/
    private boolean keepScreenOn = false;
    /** 语言 **/
    private int language = 0;
    /** 提前学习的限制 **/
    private int learnCutoff = 20;
    /** 通知类型 **/
    private int minimumCardsDueForNotification = 0;
    /** 新卡片位置 **/
    private int newSpread = 0;
    /** 默认字体适用范围 **/
    private int overrideFontBehavior = 0;
    /** 卡片浏览器字体缩放 **/
    private int relativeCardBrowserFontSize = 100;
    /** 错误报告 **/
    private int reportErrorMode = 2;
    /** 显示按扭时间 **/
    private boolean showEstimates = false;
    /** 获取媒体文件 **/
    private boolean syncFetchesMedia = true;
    /** 主题标志位   0:灰色主题    1:蓝色主题 **/
    private int themeIndex = 1;
    /** 时间盒时间限制 **/
    private int timeLimit = 0;
    /** 文本转语音 **/
    private boolean tts = false;
    /** 新牌组  **/
    private int useCurrent = 0;
    /** 呼吸灯 **/
    private boolean widgetBlink = false;
    /** 震动 **/
    private boolean widgetVibrate = false;

    
}
