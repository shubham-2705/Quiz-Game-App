package com.iqmojo.iq_mojo.models.response;

/**
 * Created by himanshu on 12/9/17.
 */

public class LoginResponse {

    private Long userId;
    private Boolean loginStatus;
    private Long coins;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Long getCoins() {
        return coins;
    }

    public void setCoins(Long coins) {
        this.coins = coins;
    }
}
