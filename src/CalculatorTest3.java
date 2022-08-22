public class CalculatorTest3 {
    public static void main(String[] args) {

        Calculator3 calc = new Calculator3();
        calc.findTotal(1, 10.0, "John");
        calc.findTotal(2, 12.0, "John");
        calc.findTotal(3,9.0, "John");
        calc.findTotal(4,8.0, "John");
        calc.findTotal(5,7.0, "John");
        calc.findTotal(6,15.0, "John");
        calc.findTotal(7,11.0, "John");
        calc.findTotal(8,30.0, "John");

        //Use the Calculator object and arguments supplied to findTotal()
        //to print the total for each person



       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }
}
