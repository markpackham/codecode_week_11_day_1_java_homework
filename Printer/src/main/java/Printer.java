public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }

    public void print(int pages, int copies) {
        int result = this.sheets - (pages * copies);
        int tonerResult = this.toner - (pages * copies);
        if(result > 0 && tonerResult > 0){
            this.sheets = result;
            this.toner = tonerResult;
        }
    }
}
