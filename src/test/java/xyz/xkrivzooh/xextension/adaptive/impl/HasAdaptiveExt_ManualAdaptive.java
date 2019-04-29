package xyz.xkrivzooh.xextension.adaptive.impl;

import xyz.xkrivzooh.xextension.Adaptive;
import xyz.xkrivzooh.xextension.ExtensionLoader;
import xyz.xkrivzooh.xextension.URL;
import xyz.xkrivzooh.xextension.adaptive.HasAdaptiveExt;

@Adaptive
public class HasAdaptiveExt_ManualAdaptive implements HasAdaptiveExt {
    public String echo(URL url, String s) {
        HasAdaptiveExt addExt1 = ExtensionLoader.getExtensionLoader(HasAdaptiveExt.class).getExtension(url.getParameter("key"));
        return addExt1.echo(url, s);
    }
}
