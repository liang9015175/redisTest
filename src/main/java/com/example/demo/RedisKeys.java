package com.example.demo;

/**
 * Created by yelo on 2015/10/28.
 */
public enum RedisKeys {

    USER_TOKEN_INFO("user:token:info:"),
    USER_PHONE_TOKEN("user:phone:token:"),
    USER_CAPTCHA_FORGET_PWD("user:captcha:forget_pwd:"),
    USER_CAPTCHA_FORGET_CPWD("user:captcha:forget_cpwd:"),
    USER_CAPTCHA_MODIFY_PHONE("user:captcha:modify_phone:"),
    USER_CAPTCHA_LOGIN("user:captcha:login:"),
    USER_REGISTER_VALIDATED("user:register:validated:"),
    USER_CAPTCHA_REGISTER("user:captcha:register:"),
    USER_CAPTCHA_MACADDRESS("user:captcha:mac_address:"),
    USER_RISK_WTOKEN("user:disk:wtoken:"),
    USER_RISK_MACADDRESS("user:risk:macAddress:"),
    USER_DISABLE_FAILED_IMG_CAPTCHA("user:disable:failed:img_captcha:"),// 图形验证码错误次数
    USER_DISABLE_FAILED_SMS("user:disable:failed:sms:"),// 短信验证码错误次数
    USER_DISABLE_FAILED_LOGIN("user:disable:failed:login:"), // 登录密错误次数
    USER_DISBALE_FAILED_PAY("user:disable:failed:pay:"), // 支付密码错误次数
    PRE_TREADING("preTrading"),
    PURCHASE_LOCK("purchaseLock"),
    CONTRACT_ADDRESS("contractAddressKey"),
    CHAIN_KEY("blockchain_txlist");

    private String path;

    RedisKeys(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public String toString() {
        return path;
    }
}
