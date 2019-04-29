package xyz.xkrivzooh.xextension.ext6_inject.impl;

import java.util.List;

import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext6_inject.Ext6;

public class Ext6Impl2 implements Ext6 {
    List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String echo(URL url, String s) {
        throw new UnsupportedOperationException();
    }

}
