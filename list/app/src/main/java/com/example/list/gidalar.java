package com.example.list;

public class gidalar {

    private String isim;
    private Double fiyat;

    public gidalar(String mIsim,double mFiyat){
        isim=mIsim;
        fiyat=mFiyat;

    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }
}
