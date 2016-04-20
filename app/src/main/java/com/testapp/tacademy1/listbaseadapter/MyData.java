package com.testapp.tacademy1.listbaseadapter;

/**
 * Created by Tacademy on 2016-04-20.
 */
public class MyData {
    private int image;
    private String name;
    private String tel;
    private String email;

    public MyData(int image, String name, String tel, String email){
        this.image = image;
        this.name = name;
        this.tel = tel;
        this.email = email;
    }
    public int getImage() {
        return image;
    }
    public String getName() {
        return name;
    }
    public String getTel() {
        return tel;
    }
    public String getEmail() {
        return email;
    }

}
