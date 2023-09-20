package com.example.mvp_pattern.view;


//Presenter 가  UI 갱신 요청을 위해 View 를 호출할 때 필요한 동작을 OrderView interface 를 만들어 정의 한다.
//갱신할 UI는 아메리카노 수량과 합계 가격 두 가지 이다. Model 과는 직접적 으로 상호작용하지 않고 Presenter 가 연결 역할을 한다.
public interface MainView {
    void setAmericanoCounterText(int quantity); //아메리카노 수량 UI 반영(추상화)
    void setLatteCounterText(int quantity); //Latte 수량
    void setTotalPriceText(int totalPrice); //합계 가격 UI 반영(추상화)

}
