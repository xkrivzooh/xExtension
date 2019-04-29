package xyz.xkrivzooh.xextension;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import xyz.xkrivzooh.xextension.compiler.AdaptiveCompiler;

public class ExtensionLoader_Adaptive_UseJdkCompiler_Test extends ExtensionLoader_Adaptive_Test {
    @BeforeAll
    public static void setUp() throws Exception {
        AdaptiveCompiler.setDefaultCompiler("jdk");
    }

    @AfterAll
    public static void tearDown() throws Exception {
        AdaptiveCompiler.setDefaultCompiler("javassist");
    }
}
