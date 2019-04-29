package xyz.xkrivzooh.xextension.activate;


import xyz.xkrivzooh.xextension.SPI;

@SPI("impl1")
public interface ActivateExt1 {
    String echo(String msg);
}
