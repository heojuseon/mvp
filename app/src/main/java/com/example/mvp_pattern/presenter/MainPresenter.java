package com.example.mvp_pattern.presenter;


import com.example.mvp_pattern.model.Americano;
import com.example.mvp_pattern.model.Beverage;
import com.example.mvp_pattern.model.CafeLatte;
import com.example.mvp_pattern.model.TotalPrice;
import com.example.mvp_pattern.view.MainView;

//Presenter 은 MVC 의 Controller 와 유사한 역할을 수행
//1. 메뉴(아메리카노) 수량 증감 요청(Model 에 요청)
//2. UI 갱신을 위한 수량 변경 정보 전달(View 에 전달)
//3. 수량 증감에 따른 합계 가격 증감 요청(Model 에 요청)
//4. UI 갱신을 위한 수량 변경에 따른 합계 가격 정보 전달(View 에 전달)
public class MainPresenter implements Presenter{    //View interface를 전달 받는다.
    MainView mainView;
    Beverage americanoModel, latteModel;
    TotalPrice totalModel;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        this.americanoModel = new Americano();
        this.latteModel = new CafeLatte();
        this.totalModel = new TotalPrice();
    }


    @Override
    public void upAmericano() { //아메리카노 수량 증가 버튼 입력이 들어왔을 때 View가 호출할 함수
        americanoModel.up();
        mainView.setAmericanoCounterText(americanoModel.getQuantity());
//        updateTotalPriceAdd(americanoModel.getPrice());
        updateTotalPrice();
    }


    @Override
    public void downAmericano() {   //아메리카노 수량 감소 버튼 입력이 들어왔을 때 View가 호출할 함수
        americanoModel.down();
        mainView.setAmericanoCounterText((americanoModel.getQuantity()));
//        updateTotalPriceSub(americanoModel.getPrice());
        updateTotalPrice();
    }

    @Override
    public void upLatte() {
        latteModel.up();
        mainView.setLatteCounterText(latteModel.getQuantity());
        updateTotalPrice();
    }

    @Override
    public void downLatte() {
        latteModel.down();
        mainView.setLatteCounterText(latteModel.getQuantity());
        updateTotalPrice();
    }


    private void updateTotalPrice() {
//        int total_result = americanoModel.calculateTotalPrice() + latteModel.calculateTotalPrice();
//        totalModel.setTotalPrice(total_result);
//        mainView.setTotalPriceText(totalModel.getTotalPrice());

        int americanoTotalPrice = americanoModel.calculateTotalPrice();
        int latteTotalPrice = latteModel.calculateTotalPrice();
        int total_result = americanoTotalPrice + latteTotalPrice;
        totalModel.setTotalPrice(total_result);
        mainView.setTotalPriceText(total_result);
    }




//    private void updateTotalPriceAdd(int price) {   //아메리카노,카페라떼 수량 증가 시 합계 가격 데이터 변경 및 UI 반영 요청을 위한 함수
//        totalModel.Americano_increaseTotalPrice(price);
//        mainView.setTotalPriceText(totalModel.getTotalPrice());
//    }
//    private void updateTotalPriceSub(int price) {   //아메리카노, 카페라떼 수량 감소 시 합계 가격 데이터 변경 및 UI 반영 요청을 위한 함수
//        totalModel.Americano_decreaseTotalPrice(price);
//        mainView.setTotalPriceText(totalModel.getTotalPrice());
//    }

}
