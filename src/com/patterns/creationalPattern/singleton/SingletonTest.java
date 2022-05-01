package com.patterns.creationalPattern.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        LoginForm loginForm = LoginForm.getInstance();
        loginForm = LoginForm.getInstance();
        loginForm = LoginForm.getInstance();
    }
}
