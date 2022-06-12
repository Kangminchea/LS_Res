package com.Please.test;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Data { //public : 외부에 자신을 공개(다른 클래스에 공개)
    public String num;
    public String name;
    public String password;




    public Data() { }
    public Data(String num, String name, String password) {
        this.num = num;
        this.name = name;
        this.password = password;

    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Data{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
