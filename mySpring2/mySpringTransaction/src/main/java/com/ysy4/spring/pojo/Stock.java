package com.ysy4.spring.pojo;

public class Stock {
    private Integer id;
    private String code;
    private double hold_number;
    private double share_count;
    private double share_value;
    private double change_count;
    private double change_percent;

    public Stock() {
    }

    public Stock(Integer id, String code, double hold_number, double share_count, double share_value, double change_count, double change_percent) {
        this.id = id;
        this.code = code;
        this.hold_number = hold_number;
        this.share_count = share_count;
        this.share_value = share_value;
        this.change_count = change_count;
        this.change_percent = change_percent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getHold_number() {
        return hold_number;
    }

    public void setHold_number(double hold_number) {
        this.hold_number = hold_number;
    }

    public double getShare_count() {
        return share_count;
    }

    public void setShare_count(double share_count) {
        this.share_count = share_count;
    }

    public double getShare_value() {
        return share_value;
    }

    public void setShare_value(double share_value) {
        this.share_value = share_value;
    }

    public double getChange_count() {
        return change_count;
    }

    public void setChange_count(double change_count) {
        this.change_count = change_count;
    }

    public double getChange_percent() {
        return change_percent;
    }

    public void setChange_percent(double change_percent) {
        this.change_percent = change_percent;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", hold_number=" + hold_number +
                ", share_count=" + share_count +
                ", share_value=" + share_value +
                ", change_count=" + change_count +
                ", change_percent=" + change_percent +
                '}';
    }
}
