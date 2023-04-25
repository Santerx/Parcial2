package com.example.parciall;

import java.io.Serializable;

public class numero implements Serializable {
    private String num;

    public numero(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }
}
