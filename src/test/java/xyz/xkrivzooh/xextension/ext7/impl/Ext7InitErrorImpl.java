package xyz.xkrivzooh.xextension.ext7.impl;


import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext7.InitErrorExt;

public class Ext7InitErrorImpl implements InitErrorExt {

    static {
        if (true) {
            throw new RuntimeException("intended!");
        }
    }

    public String echo(URL url, String s) {
        return "";
    }

}
