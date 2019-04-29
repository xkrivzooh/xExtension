package xyz.xkrivzooh.xextension.ext8_add.impl;


import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.ExtensionLoader;
import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext8_add.AddExt2;

@Adaptive
public class AddExt2_ManualAdaptive implements AddExt2 {
    public String echo(URL url, String s) {
        AddExt2 addExt1 = ExtensionLoader.getExtensionLoader(AddExt2.class).getExtension(url.getParameter("add.ext2"));
        return addExt1.echo(url, s);
    }
}
