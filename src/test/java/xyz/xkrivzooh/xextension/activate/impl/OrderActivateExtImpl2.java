package xyz.xkrivzooh.xextension.activate.impl;

import xyz.xkrivzooh.xextension.Activate;
import xyz.xkrivzooh.xextension.activate.ActivateExt1;

@Activate(order = 2, group = {"order"})
public class OrderActivateExtImpl2 implements ActivateExt1 {

    public String echo(String msg) {
        return msg;
    }
}
