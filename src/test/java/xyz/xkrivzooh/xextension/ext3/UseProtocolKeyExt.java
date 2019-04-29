package xyz.xkrivzooh.xextension.ext3;


import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.SPI;
import xyz.xkrivzooh.xextension.URL;

@SPI("impl1")
public interface UseProtocolKeyExt {
    // protocol key is the second
    @Adaptive({"key1", "protocol"})
    String echo(URL url, String s);

    // protocol key is the first
    @Adaptive({"protocol", "key2"})
    String yell(URL url, String s);
}
