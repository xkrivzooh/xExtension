package xyz.xkrivzooh.xextension.ext1.impl;

import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext1.SimpleExt;

public class SimpleExtImpl2 implements SimpleExt {
    public String echo(URL url, String s) {
        return "Ext1Impl2-echo";
    }

    public String yell(URL url, String s) {
        return "Ext1Impl2-yell";
    }

    public String bang(URL url, int i) {
        return "bang2";
    }

}
