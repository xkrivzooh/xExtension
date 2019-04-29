package xyz.xkrivzooh.xextension;

/**
 * Has no SPI annotation
 */
public interface NoSpiExt {
    @Adaptive
    String echo(URL url, String s);
}
