package xyz.xkrivzooh.xextension.ext6_wrap.impl;

import java.util.concurrent.atomic.AtomicInteger;

import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext6_wrap.WrappedExt;

public class Ext5Wrapper1 implements WrappedExt {
    public static AtomicInteger echoCount = new AtomicInteger();

    WrappedExt instance;

    public Ext5Wrapper1(WrappedExt instance) {
        this.instance = instance;
    }

    public String echo(URL url, String s) {
        echoCount.incrementAndGet();
        return instance.echo(url, s);
    }
}
