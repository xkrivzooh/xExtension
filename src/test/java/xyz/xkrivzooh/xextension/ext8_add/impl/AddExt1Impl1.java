package xyz.xkrivzooh.xextension.ext8_add.impl;


import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext8_add.AddExt1;

public class AddExt1Impl1 implements AddExt1 {
    public String echo(URL url, String s) {
        return this.getClass().getSimpleName();
    }
}
