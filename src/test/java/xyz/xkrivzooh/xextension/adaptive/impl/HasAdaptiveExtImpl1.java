package xyz.xkrivzooh.xextension.adaptive.impl;

import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.adaptive.HasAdaptiveExt;

public class HasAdaptiveExtImpl1 implements HasAdaptiveExt {
    public String echo(URL url, String s) {
        return this.getClass().getSimpleName();
    }
}
