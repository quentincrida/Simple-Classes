import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(100);
    }

    @Test
    public void sheetsLeft() {
        assertEquals(100, printer.getsheetsLeft());
    }

    @Test
    public void getpageCount() {
        assertEquals(15,15, printer.pageCount());
    }
}
//
//

//    @Test
//    public void pageCount()
//    assertEquals((2,2), printer.pageCount(2,2))
//}
