package com.msb.test03;

import java.io.Serializable;

public class Book implements Serializable {// 书籍   加入implements serializable允许写入写出
    // 属性
    // 编号
    private int bNo;
    //名称
    private String bName;
    // 作者
    private String bAuthour;

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthour() {
        return bAuthour;
    }

    public void setbAuthour(String bAuthour) {
        this.bAuthour = bAuthour;
    }

    // 方便初始化，加入构造器
    public Book(int bNo, String bName, String bAuthour) {
        this.bNo = bNo;
        this.bName = bName;
        this.bAuthour = bAuthour;
    }

    public Book() {
    }
}
