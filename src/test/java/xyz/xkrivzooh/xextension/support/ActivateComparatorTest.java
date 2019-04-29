package xyz.xkrivzooh.xextension.support;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xyz.xkrivzooh.xextension.ActivateComparator;

public class ActivateComparatorTest {

    @Test
    public void testActivateComparator() {
        Filter1 f1 = new Filter1();
        Filter2 f2 = new Filter2();
        Filter3 f3 = new Filter3();
        Filter4 f4 = new Filter4();
        List<Filter0> filters = new ArrayList<>();
        filters.add(f1);
        filters.add(f2);
        filters.add(f3);
        filters.add(f4);

        Collections.sort(filters, ActivateComparator.COMPARATOR);

        Assertions.assertEquals(f4, filters.get(0));
        Assertions.assertEquals(f3, filters.get(2));
        Assertions.assertEquals(f2, filters.get(3));
        Assertions.assertEquals(f1, filters.get(4));
    }
}
