package com.llh.testcheck;

import android.widget.CheckBox;

/**
 * 项目名:    TestCheck
 * 包名:      com.llh.testcheck
 * 文件名:    CheckTest
 * 创建者:    LLH
 * 创建时间:  2019/8/5 20:07
 * 描述:      TODO
 */
public class CheckTest {
    private Boolean isCheck;
    private String checkText;
    //构造函数
    public CheckTest(Boolean isCheck,String checkText){
        this.isCheck = isCheck;
        this.checkText = checkText;
    }

    public Boolean getCheck() {
        return isCheck;
    }

    public void setCheck(Boolean check) {
        isCheck = check;
    }

    public String getCheckText() {
        return checkText;
    }

    public void setCheckText(String checkText) {
        this.checkText = checkText;
    }
}
