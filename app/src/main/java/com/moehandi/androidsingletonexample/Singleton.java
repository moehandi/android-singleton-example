package com.moehandi.androidsingletonexample;

/**
 * Created by moehandi on 12/10/15.
 */
public class Singleton {

    private static Singleton mInstance = null;

    private String mString;

    private Singleton(){
        mString = "Singleton String";
    }

    public static Singleton getInstance(){
        if(mInstance == null){
            mInstance = new Singleton();
        }
        return mInstance;
    }

    public String getString(){
        return this.mString;
    }

    public void setString(String value){
        mString = value;
    }
}

