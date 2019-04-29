package xyz.xkrivzooh.xextension.activate.impl;

import xyz.xkrivzooh.xextension.Activate;
import xyz.xkrivzooh.xextension.activate.ActivateExt1;

@Activate(group = {"group1", "group2"})
public class GroupActivateExtImpl implements ActivateExt1 {

    public String echo(String msg) {
        return msg;
    }
}
