package xyz.xkrivzooh.xextension.compatible.impl;

import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.compatible.CompatibleExt;

public class CompatibleExtImpl1 implements CompatibleExt {
    public String echo(URL url, String s) {
        return "Ext1Impl1-echo";
    }

    public String yell(URL url, String s) {
        return "Ext1Impl1-yell";
    }

    public String bang(URL url, int i) {
        return "bang1";
    }
}
