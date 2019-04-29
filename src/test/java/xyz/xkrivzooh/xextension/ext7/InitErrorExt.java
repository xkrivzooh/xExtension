package xyz.xkrivzooh.xextension.ext7;


import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.SPI;
import xyz.xkrivzooh.xextension.URL;


@SPI
public interface InitErrorExt {
    @Adaptive
    String echo(URL url, String s);
}
