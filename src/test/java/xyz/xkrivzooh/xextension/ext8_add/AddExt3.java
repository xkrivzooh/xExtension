package xyz.xkrivzooh.xextension.ext8_add;


import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.SPI;
import xyz.xkrivzooh.xextension.URL;

/**
 * show add extension pragmatically. use for test replaceAdaptive success
 */
@SPI("impl1")
public interface AddExt3 {
    @Adaptive
    String echo(URL url, String s);
}
