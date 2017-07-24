package com.mau.test;


import com.mau.test.dummy.Dummy2Api;

public class Dummy3Api {

    private Dummy2Api dummy2Api;

    public String dummy3() {
        return dummy2Api.dummy2() + " dummy3";
    }
}
