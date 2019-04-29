package xyz.xkrivzooh.xextension.ext4;

import java.util.List;

import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.SPI;

@SPI("impl1")
public interface NoUrlParamExt {
    // method has no URL parameter
    @Adaptive
    String bark(String name, List<Object> list);
}
