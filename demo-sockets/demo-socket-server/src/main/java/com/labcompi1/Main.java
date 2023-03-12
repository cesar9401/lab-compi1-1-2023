package com.labcompi1;

import com.labcompi1.listener.Listener;

public class Main {
    public static void main(String[] args) {
        var listener = new Listener(9090);
        listener.start();
    }
}