package xyz.xkrivzooh.xextension.ext1;


import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.SPI;
import xyz.xkrivzooh.xextension.URL;

/**
 * Simple extension, has no wrapper
 */
@SPI("impl1")
public interface SimpleExt {
    // @Adaptive example, do not specify a explicit key.
    @Adaptive
    String echo(URL url, String s);

    @Adaptive({"key1", "key2"})
    String yell(URL url, String s);

    // no @Adaptive
    String bang(URL url, int i);
}
