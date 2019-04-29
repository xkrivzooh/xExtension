package xyz.xkrivzooh.xextension.adaptive;

import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.SPI;
import xyz.xkrivzooh.xextension.URL;

@SPI
public interface HasAdaptiveExt {
    @Adaptive
    String echo(URL url, String s);
}
