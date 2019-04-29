package xyz.xkrivzooh.xextension.ext2.impl;


import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext2.Ext2;
import xyz.xkrivzooh.xextension.ext2.UrlHolder;

public class Ext2Impl2 implements Ext2 {
    public String echo(UrlHolder holder, String s) {
        return "Ext2Impl2-echo";
    }

    public String bang(URL url, int i) {
        return "bang2";
    }

}
