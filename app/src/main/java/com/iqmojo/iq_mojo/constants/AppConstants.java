package com.iqmojo.iq_mojo.constants;


public interface AppConstants {

    int SPLASH_TIMEOUT = 3000;


//    Bundle Constants

    String DEVICES_EXTRAS = "devices_extras";
    String PRODUCT_DETAIL = "product_detail";

    //Intent keys
    String LOCATION = "fb_location";
    String EMAIL_ID = "email_id";
    String ID = "id";
    String MOBILE = "mobile";
    String DEVICE_TOKEN = "Device_Token";
    String SCREEN_NO = "screen_no";
    String GOOGLE_TOKEN = "google_token";

    //Toolbar Change

//    int DEFAULT = 0;
//    int HISTORY = 1;
//    int FILTER = 2;
//    int CROSS = 3;
//    int USER = 4;


    //Menu


    String WEBVIEW_URL = "webview_url";
    String WEBVIEW_HEADER = "webview_header";


    // Home tabs
    interface HomeTabKeys {
        int HOME = 0;
        int WINNER = 1;
        int CONTEST = 2;
        int FAQ = 3;
    }


    // My Account Dashboard Tabs
    interface MyAccountTabKeys {

        int MY_POINTS = 0;
        int MY_TRANSACTIONS = 1;
    }


    // Hamburger Menu options
    int My_Points=0;
    int My_Profile=1;
    int Transactions=2;
    int Referral=3;
    int Terms_And_Conditions=4;
    int Contact_Us=5;

    //Shared Preferences Keys
    String KEY_COINS = "coins";
    String KEY_USER_ID = "user_id";
    String KEY_NEW_USER = "new_user";
    String KEY_EMAIL_ID = "email_id";
    String KEY_OTP = "otp";
    String KEY_GCM_ID = "gcm_id";
    String KEY_DISPLAY_NAME = "display_name";
    String KEY_DISPLAY_PIC = "display_pic";


}
