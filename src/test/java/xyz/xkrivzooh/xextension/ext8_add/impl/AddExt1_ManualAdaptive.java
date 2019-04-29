package xyz.xkrivzooh.xextension.ext8_add.impl;

import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.ExtensionLoader;
import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.ext8_add.AddExt1;

@Adaptive
public class AddExt1_ManualAdaptive implements AddExt1 {
    public String echo(URL url, String s) {
        AddExt1 addExt1 = ExtensionLoader.getExtensionLoader(AddExt1.class).getExtension(url.getParameter("add.ext1"));
        return addExt1.echo(url, s);
    }
}
