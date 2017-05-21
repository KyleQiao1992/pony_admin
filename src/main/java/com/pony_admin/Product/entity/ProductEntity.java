package com.pony_admin.Product.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author: qiaoyi
 * @edit:
 * @created:17/3/2
 */
public class ProductEntity {
    private int id;
    //产品名
    private String productName;
    //促销价
    private double promotionPrice;
    //产品编号
    private String productNumber;
    //是否现货
    private int reservationId;
    //产品图标图片路径
    private String productIconUrl;
    //是否促销
    private int promotionType;
    //排名权重
    private int weight;
    //长
    private int productLength;
    //高
    private int productHigh;
    //宽
    private int productWidth;
    //促销开始时间
    private Date promotionBeginTime;
    //促销结束时间
    private Date promotionEndTime;
    //ID限购量
    private int idRestrictionNumber;
    //限购信用分数
    private int creditScore;
    //参与促销数量
    private int promotionNumber;
    //参与促销原始数量
    private int promotionNumberOriginal;
    //产品图片链表
    private List<ProductPictureEntity> productPictures;
    //产品原价
    private double originalPrice;
    //预约图片URL
    private String reservationPicUrl;
    //预约图片高
    private int reservationPicHeight;
    //预约图片宽
    private int reservationPicWidth;
    //产品一级类目代码
    private String categoryCodeOne;
    //产品二级类目代码
    private String categoryCodeTwo;
    //产品三级类目代码
    private String categoryCodeThree;
    //产品单位
    private String unit;
    //月销量
    private int monthlySales;
    //告警值
    private int alertNumber;

    //setter and getter


    public int getAlertNumber() {
        return alertNumber;
    }

    public void setAlertNumber(int alertNumber) {
        this.alertNumber = alertNumber;
    }

    public int getPromotionNumberOriginal() {
        return promotionNumberOriginal;
    }

    public void setPromotionNumberOriginal(int promotionNumberOriginal) {
        this.promotionNumberOriginal = promotionNumberOriginal;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public int getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(int promotionType) {
        this.promotionType = promotionType;
    }

    public String getReservationPicUrl() {
        return reservationPicUrl;
    }

    public void setReservationPicUrl(String reservationPicUrl) {
        this.reservationPicUrl = reservationPicUrl;
    }

    public int getReservationPicHeight() {
        return reservationPicHeight;
    }

    public void setReservationPicHeight(int reservationPicHeight) {
        this.reservationPicHeight = reservationPicHeight;
    }

    public int getReservationPicWidth() {
        return reservationPicWidth;
    }

    public void setReservationPicWidth(int reservationPicWidth) {
        this.reservationPicWidth = reservationPicWidth;
    }

    public int getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(int monthlySales) {
        this.monthlySales = monthlySales;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getCategoryCodeOne() {
        return categoryCodeOne;
    }

    public void setCategoryCodeOne(String categoryCodeOne) {
        this.categoryCodeOne = categoryCodeOne;
    }

    public String getCategoryCodeTwo() {
        return categoryCodeTwo;
    }

    public void setCategoryCodeTwo(String categoryCodeTwo) {
        this.categoryCodeTwo = categoryCodeTwo;
    }

    public String getCategoryCodeThree() {
        return categoryCodeThree;
    }

    public void setCategoryCodeThree(String categoryCodeThree) {
        this.categoryCodeThree = categoryCodeThree;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public List<ProductPictureEntity> getProductPictures() {
        return productPictures;
    }

    public void setProductPictures(List<ProductPictureEntity> productPictures) {
        this.productPictures = productPictures;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(double promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductIconUrl() {
        return productIconUrl;
    }

    public void setProductIconUrl(String productIconUrl) {
        this.productIconUrl = productIconUrl;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getProductLength() {
        return productLength;
    }

    public void setProductLength(int productLength) {
        this.productLength = productLength;
    }

    public int getProductHigh() {
        return productHigh;
    }

    public void setProductHigh(int productHigh) {
        this.productHigh = productHigh;
    }

    public int getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(int productWidth) {
        this.productWidth = productWidth;
    }

    public Date getPromotionBeginTime() {
        return promotionBeginTime;
    }

    public void setPromotionBeginTime(String promotionBeginTime) {

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.promotionBeginTime = format.parse(promotionBeginTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(String promotionEndTime) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.promotionEndTime = format.parse(promotionEndTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getIdRestrictionNumber() {
        return idRestrictionNumber;
    }

    public void setIdRestrictionNumber(int idRestrictionNumber) {
        this.idRestrictionNumber = idRestrictionNumber;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getPromotionNumber() {
        return promotionNumber;
    }

    public void setPromotionNumber(int promotionNumber) {
        this.promotionNumber = promotionNumber;
    }

//    @Override
//    public String toString() {
//        return "ProductEntity{" +
//                "id=" + id +
//                ", productName='" + productName + '\'' +
//                ", promotionPrice=" + promotionPrice +
//                ", productNumber='" + productNumber + '\'' +
//                ", isSpot=" + isSpot +
//                ", productIconUrl='" + productIconUrl + '\'' +
//                ", promotion=" + promotion +
//                ", weight=" + weight +
//                ", length=" + length +
//                ", high=" + high +
//                ", width=" + width +
//                ", promotionBeginTime=" + promotionBeginTime +
//                ", promotionEndTime=" + promotionEndTime +
//                ", idRestrictionNumber=" + idRestrictionNumber +
//                ", creditScore=" + creditScore +
//                ", promotionNumber=" + promotionNumber +
//                ", originalPrice=" + originalPrice +
//                ", categoryCodeOne='" + categoryCodeOne + '\'' +
//                ", categoryCodetTwo='" + categoryCodetTwo + '\'' +
//                ", categoryCodeThree='" + categoryCodeThree + '\'' +
//                ", reservation='" + reservation + '\'' +
//                ", alertNumber=" + alertNumber +
//                ", unit='" + unit + '\'' +
//                '}';
//    }unit
}
