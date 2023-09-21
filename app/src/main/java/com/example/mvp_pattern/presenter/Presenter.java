package com.example.mvp_pattern.presenter;

public interface Presenter {

    void upAmericano();    //UI 갱신을 위한 아메리카노 수량 증가 정보 전달(추상화)
    void downAmericano();  //UI 갱신을 위한 아메리카노 수량 감소 정보 전달(추상화)
    void upLatte();  //UI 갱신을 위한 카페라떼 수량 증가 정보 전달(추상화)
    void downLatte();    //UI 갱신을 위한 카페라떼 수량 증가 정보 전달(추상화)
}
