package com.example.mvp_pattern.model;

public class TotalPrice {
    int totalPrice = 0;
    int americanoQuantity = 0;
    int latteQuantity = 0;


    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void Americano_increaseTotalPrice(int price) {
        americanoQuantity++;
        updateTotalPrice();
    }


    public void Americano_decreaseTotalPrice(int price) {
        if (americanoQuantity > 0) {
            americanoQuantity--;
            updateTotalPrice();
        }
    }

    public void increaseLatteQuantity() {
        latteQuantity++;
        updateTotalPrice();
    }

    public void decreaseLatteQuantity() {
        if (latteQuantity > 0) {
            latteQuantity--;
            updateTotalPrice();
        }
    }

    private void updateTotalPrice() {
        totalPrice = (americanoQuantity * Americano.PRICE) + (latteQuantity * CafeLatte.PRICE);
    }



//    public void Americano_decreaseTotalPrice(int price) {
//        totalPrice -= price;
//        if (totalPrice < 0){
//            totalPrice = 0;
//        }
//    }
//
//    public void Americano_increaseTotalPrice(int price) {
//        totalPrice += price;
//    }

}
