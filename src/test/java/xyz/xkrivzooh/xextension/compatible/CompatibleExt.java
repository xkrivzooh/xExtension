package xyz.xkrivzooh.xextension.compatible;

import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.SPI;
import xyz.xkrivzooh.xextension.URL;

@SPI("impl1")
public interface CompatibleExt {
    @Adaptive
    String echo(URL url, String s);
}
