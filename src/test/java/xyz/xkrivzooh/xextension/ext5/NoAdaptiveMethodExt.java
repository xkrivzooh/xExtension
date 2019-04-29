package xyz.xkrivzooh.xextension.ext5;


import xyz.xkrivzooh.xextension.SPI;
import xyz.xkrivzooh.xextension.URL;

/**
 * No Adaptive Method!!
 */
@SPI("impl1")
public interface NoAdaptiveMethodExt {
    String echo(URL url, String s);
}
