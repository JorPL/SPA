package com.example.joplagne.spa;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by joplagne on 29/09/17.
 */

public class Code implements Serializable{

    private Image image;
    private String type;
    private Date date;
    private String code;
    private ArrayList<String> informations = new ArrayList<>();

    public Code(Image image, String type, Date date, String code, ArrayList<String> informations) {
        this.image = image;
        this.type = type;
        this.date = date;
        this.code = code;
        this.informations = informations;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<String> getInformations() {
        return informations;
    }

    public void setInformations(ArrayList<String> informations) {
        this.informations = informations;
    }

    /*public String getBackgroundGentillesse(int gentillesse){
        switch (gentillesse){
            case 0:
                return "lvl1";
            case 1:
                return "lvl2";
            case 2:
                return "lvl3";
            case 3:
                return "lvl4";
            default:
                return "blanc";
        }
    }*/
}
