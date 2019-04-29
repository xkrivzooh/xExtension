package xyz.xkrivzooh.xextension;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import xyz.xkrivzooh.xextension.compatible.CompatibleExt;
import xyz.xkrivzooh.xextension.compatible.impl.CompatibleExtImpl1;
import xyz.xkrivzooh.xextension.compatible.impl.CompatibleExtImpl2;

public class ExtensionLoader_Compatible_Test {

    @Test
    public void test_getExtension() throws Exception {
        assertTrue(ExtensionLoader.getExtensionLoader(CompatibleExt.class).getExtension("impl1") instanceof CompatibleExtImpl1);
        assertTrue(ExtensionLoader.getExtensionLoader(CompatibleExt.class).getExtension("impl2") instanceof CompatibleExtImpl2);
    }
}
