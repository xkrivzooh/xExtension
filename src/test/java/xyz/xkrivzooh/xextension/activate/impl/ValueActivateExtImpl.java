package xyz.xkrivzooh.xextension.activate.impl;

import xyz.xkrivzooh.xextension.Activate;
import xyz.xkrivzooh.xextension.activate.ActivateExt1;

@Activate(value = {"value"}, group = {"value"})
public class ValueActivateExtImpl implements ActivateExt1 {

    public String echo(String msg) {
        return msg;
    }
}
