package xyz.xkrivzooh.xextension.ext2;


import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.SPI;
import xyz.xkrivzooh.xextension.URL;

/**
 * Has no default
 */
@SPI
public interface Ext2 {
    // one of the properties of an argument is an instance of URL.
    @Adaptive
    String echo(UrlHolder holder, String s);

    String bang(URL url, int i);
}
