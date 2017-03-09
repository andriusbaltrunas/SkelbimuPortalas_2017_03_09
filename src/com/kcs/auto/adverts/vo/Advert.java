package com.kcs.auto.adverts.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by andriusbaltrunas on 3/9/2017.
 */
public class Advert {
    private int id;
    private BigDecimal price;
    private String description;
    private Date insertTime;
    private String city;
    private Date activeTime;
    private String email;
    private String phone;
    private String shortDescription;

    public Advert(BigDecimal price, String description, Date insertTime, String city, Date activeTime, String email, String phone, String shortDescription) {
        this.price = price;
        this.description = description;
        this.insertTime = insertTime;
        this.city = city;
        this.activeTime = activeTime;
        this.email = email;
        this.phone = phone;
        this.shortDescription = shortDescription;
    }

    public Advert(int id, BigDecimal price, String description, Date insertTime, String city, Date activeTime, String email, String phone, String shortDescription) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.insertTime = insertTime;
        this.city = city;
        this.activeTime = activeTime;
        this.email = email;
        this.phone = phone;
        this.shortDescription = shortDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}
