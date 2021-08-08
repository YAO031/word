package com.entity;

public class Business {

    private Integer bid;//业务
    private String bnum;//排队号
    private String  btype;//业务类型
    private String bmark;//备注

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBnum() {
        return bnum;
    }

    public void setBnum(String bnum) {
        this.bnum = bnum;
    }

    public String getBtype() {
        return btype;
    }

    public void setBtype(String btype) {
        this.btype = btype;
    }

    public String getBmark() {
        return bmark;
    }

    public void setBmark(String bmark) {
        this.bmark = bmark;
    }

    @Override
    public String toString() {
        return "Business{" +
                "bid=" + bid +
                ", bnum='" + bnum + '\'' +
                ", btype='" + btype + '\'' +
                ", bmark='" + bmark + '\'' +
                '}';
    }
}
