package com.patterns.creationalPattern.singleton;

public class LoginForm {

    private LoginForm(){}

    private static volatile LoginForm instance;

    public static LoginForm getInstance() {
        if (instance == null) {
            synchronized (LoginForm.class) {
                if (instance == null) {
                    instance = new LoginForm();
                    System.out.println("程序开始运行...");
                }
            }
        } else {
            System.out.println("程序已运行！");
        }
        return instance;
    }

}
