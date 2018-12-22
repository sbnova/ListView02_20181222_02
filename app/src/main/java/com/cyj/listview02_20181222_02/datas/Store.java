package com.cyj.listview02_20181222_02.datas;

import java.io.Serializable;

public class Store implements Serializable {
//    클래스 : 변수 + 메소드 (+생성자)의 조합.

//    필요한 변수들을 모두 private으로 생성
//    변수에 직접 접근을 막음. => 접근허용메소드 getter/setter
    private String logImage; // 로고 이미지도 이번엔 사용안함.
    private String name;
    private String address;
    private int avgRating; //별점 평균(정수)
    private boolean menuOk; //메뉴 제공하는지? 이번에는 사용안함.
    private String openAndCloseTime; // 열고 닫는 시간
    private String phoneNum; //전화번호.

//        생성자
    public Store(String name, String address, int avgRating, String openAndCloseTime, String phoneNum){
//        재료로 받은 변수들을 내가 가진 변수에 대입
        this.name = name;
        this.address = address;
        this.avgRating = avgRating;
        this.openAndCloseTime = openAndCloseTime;
        this.phoneNum = phoneNum;
    }

//    getter & setter 생성. Alt + Insert 기본 메소드 작성.
    public String getLogImage() {
        return logImage;
    }

    public void setLogImage(String logImage) {
        this.logImage = logImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }

    public boolean isMenuOk() {
        return menuOk;
    }

    public void setMenuOk(boolean menuOk) {
        this.menuOk = menuOk;
    }

    public String getOpenAndCloseTime() {
        return openAndCloseTime;
    }

    public void setOpenAndCloseTime(String openAndCloseTime) {
        this.openAndCloseTime = openAndCloseTime;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
