package xyz.xkrivzooh.xextension.ext8_add;


import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.SPI;
import xyz.xkrivzooh.xextension.URL;

/**
 * show add extension pragmatically
 */
@SPI("impl1")
public interface AddExt1 {
    @Adaptive
    String echo(URL url, String s);
}
