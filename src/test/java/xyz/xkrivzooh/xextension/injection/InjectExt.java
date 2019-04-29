package xyz.xkrivzooh.xextension.injection;


import xyz.xkrivzooh.xextension.SPI;

/**
 *
 */
@SPI("injection")
public interface InjectExt {
    String echo(String msg);
}
