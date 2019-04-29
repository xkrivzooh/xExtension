package xyz.xkrivzooh.xextension.ext8_add.impl;


import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.ExtensionLoader;
import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext8_add.AddExt3;

@Adaptive
public class AddExt3_ManualAdaptive implements AddExt3 {
    public String echo(URL url, String s) {
        AddExt3 addExt1 = ExtensionLoader.getExtensionLoader(AddExt3.class).getExtension(url.getParameter("add.ext3"));
        return addExt1.echo(url, s);
    }
}
