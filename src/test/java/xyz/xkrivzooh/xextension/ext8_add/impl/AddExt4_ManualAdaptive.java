package xyz.xkrivzooh.xextension.ext8_add.impl;


import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.ExtensionLoader;
import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext8_add.AddExt4;

@Adaptive
public class AddExt4_ManualAdaptive implements AddExt4 {
    public String echo(URL url, String s) {
        AddExt4 addExt1 = ExtensionLoader.getExtensionLoader(AddExt4.class).getExtension(url.getParameter("add.ext4"));
        return addExt1.echo(url, s);
    }
}
