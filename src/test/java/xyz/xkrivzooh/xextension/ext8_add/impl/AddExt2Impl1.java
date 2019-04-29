package xyz.xkrivzooh.xextension.ext8_add.impl;


import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext8_add.AddExt2;

public class AddExt2Impl1 implements AddExt2 {
    public String echo(URL url, String s) {
        return this.getClass().getSimpleName();
    }
}
