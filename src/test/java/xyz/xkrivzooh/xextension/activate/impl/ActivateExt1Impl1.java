package xyz.xkrivzooh.xextension.activate.impl;

import xyz.xkrivzooh.xextension.Activate;
import xyz.xkrivzooh.xextension.activate.ActivateExt1;

@Activate(group = {"default_group"})
public class ActivateExt1Impl1 implements ActivateExt1 {
    public String echo(String msg) {
        return msg;
    }
}
