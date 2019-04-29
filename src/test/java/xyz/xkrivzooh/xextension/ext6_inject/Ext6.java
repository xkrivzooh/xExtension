package xyz.xkrivzooh.xextension.ext6_inject;

import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.SPI;
import xyz.xkrivzooh.xextension.URL;

/**
 * No default
 */
@SPI
public interface Ext6 {
    @Adaptive
    String echo(URL url, String s);
}
