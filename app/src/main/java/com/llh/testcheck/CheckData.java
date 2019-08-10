package com.llh.testcheck;

/**
 * 项目名:    TestCheck
 * 包名:      com.llh.testcheck
 * 文件名:    CheckData
 * 创建者:    LLH
 * 创建时间:  2019/8/7 14:43
 * 描述:      TODO
 */
public class CheckData {
    //单例模式
    //创建静态的类对象
    public static CheckData checkData;
    public boolean checkStatus;
    //构造函数私有化
    private CheckData(){
        //给状态值赋值
        checkStatus = false;
    }
    //单例模式
    public static CheckData getInstance(){
        if(checkData == null){
            checkData = new CheckData();
        }
        return checkData;
    }
}
