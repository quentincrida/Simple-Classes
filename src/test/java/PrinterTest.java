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
    public void getPrinterPaper() {
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void printerCanPrint__enoughPaper() {
        printer.print(25, 2);
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void printerCanPrint__notEnoughPaper() {
        printer.print(50,3);
        assertEquals(100, printer.getPaper());
    }

}
//
//

//    @Test
//    public void pageCount()
//    assertEquals((2,2), printer.pageCount(2,2))
//}
