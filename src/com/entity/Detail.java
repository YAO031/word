package com.entity;

public class Detail {

    private int bdid;//业务详情编号
  private int bid;//业务编号

    public int getBid() {
        return bid;
    }

    public void setBid(int  bid) {
        this.bid = bid;
    }

    private String  bdname;//业务性情名称
    private  String bdperson;//办理人

    public int getBdid() {
        return bdid;
    }

    public void setBdid(int bdid) {
        this.bdid = bdid;
    }

    public String getBdname() {
        return bdname;
    }

    public void setBdname(String bdname) {
        this.bdname = bdname;
    }

    public String getBdperson() {
        return bdperson;
    }

    public void setBdperson(String bdperson) {
        this.bdperson = bdperson;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "bdid=" + bdid +
                ", bid=" + bid +
                ", bdname='" + bdname + '\'' +
                ", bdperson='" + bdperson + '\'' +
                '}';
    }
}
