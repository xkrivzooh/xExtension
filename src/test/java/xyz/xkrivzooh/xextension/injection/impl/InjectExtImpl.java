package xyz.xkrivzooh.xextension.injection.impl;


import xyz.xkrivzooh.xextension.DisableInject;
import xyz.xkrivzooh.xextension.ext1.SimpleExt;
import xyz.xkrivzooh.xextension.injection.InjectExt;

public class InjectExtImpl implements InjectExt {

    private SimpleExt simpleExt;

    private SimpleExt simpleExt1;

    private Object genericType;

    public void setSimpleExt(SimpleExt simpleExt) {
        this.simpleExt = simpleExt;
    }

    @DisableInject
    public void setSimpleExt1(SimpleExt simpleExt1) {
        this.simpleExt1 = simpleExt1;
    }

    public void setGenericType(Object genericType) {
        this.genericType = genericType;
    }

    @Override
    public String echo(String msg) {
        return null;
    }

    public SimpleExt getSimpleExt() {
        return simpleExt;
    }

    public SimpleExt getSimpleExt1() {
        return simpleExt1;
    }

    public Object getGenericType() {
        return genericType;
    }
}
