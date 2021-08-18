package com.hsbc;

import com.hsbc.Mobile;

public class Android extends Mobile implements Music,Move{

    @Override
    public void move() {
        System.out.println("move....");
    }

    @Override
    public void music() {
        System.out.println("music....");
    }
}
