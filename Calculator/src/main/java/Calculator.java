public class Calculator {
    // Add, Subtract, Multiply and Divide
    private int val1;
    private int val2;

    public Calculator(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public int add() {
        return this.val1 + this.val2;
    }

    public int subtract() {
        return this.val1 - this.val2;
    }

    public int multiply() {
        return this.val1 * this.val2;
    }

    public double divide(){
        double new_val1 = this.val1;
        double new_val2 = this.val2;
        return new_val1 / new_val2;
    }

}
