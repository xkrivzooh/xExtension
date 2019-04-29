package xyz.xkrivzooh.xextension.ext6_inject.impl;

import org.junit.jupiter.api.Assertions;
import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext1.SimpleExt;
import xyz.xkrivzooh.xextension.ext6_inject.Dao;
import xyz.xkrivzooh.xextension.ext6_inject.Ext6;

public class Ext6Impl1 implements Ext6 {
    public Dao obj;

    SimpleExt ext1;

    public void setDao(Dao obj) {
        Assertions.assertNotNull(obj, "inject extension instance can not be null");
        Assertions.fail();
    }

    public void setExt1(SimpleExt ext1) {
        this.ext1 = ext1;
    }

    public String echo(URL url, String s) {
        return "Ext6Impl1-echo-" + ext1.echo(url, s);
    }

}
