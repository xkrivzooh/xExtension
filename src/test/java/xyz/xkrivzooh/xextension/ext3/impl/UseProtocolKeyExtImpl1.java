package xyz.xkrivzooh.xextension.ext3.impl;


import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext3.UseProtocolKeyExt;

public class UseProtocolKeyExtImpl1 implements UseProtocolKeyExt {
    public String echo(URL url, String s) {
        return "Ext3Impl1-echo";
    }

    public String yell(URL url, String s) {
        return "Ext3Impl1-yell";
    }
}
