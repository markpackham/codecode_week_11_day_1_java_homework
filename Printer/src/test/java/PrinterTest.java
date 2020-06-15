import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canPrintPageCheck(){
        printer.print(3,2);
        assertEquals(94, printer.getSheets());
    }

    @Test
    public void cannotPrintPageCheck(){
        printer.print(3,2000);
        // No change to sheet number since not enough pages so won't print
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canPrintTonerCheck(){
        printer.print(5,2);
        assertEquals(90, printer.getToner());
    }

    @Test
    public void cannotPrintTonerCheck(){
        printer.print(5000,2);
        // No change to sheet number since not enough pages so won't print
        assertEquals(100, printer.getToner());
    }

}
