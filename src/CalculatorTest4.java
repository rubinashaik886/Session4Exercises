public class CalculatorTest4 {
    public static void main(String[] args) {

        Calculator4 calc = new Calculator4();

        //Name your friends
        calc.findTotal(10, null);
        calc.findTotal(12, null);
        calc.findTotal(9,  null);
        calc.findTotal(8,  null);
        calc.findTotal(7,  null);
        calc.findTotal(15, "Alex");
        calc.findTotal(11, null);
        calc.findTotal(30, "Forgetful");

        System.out.println("Total = " + (calc.findTotal(10, null)+calc.findTotal(12, null)+calc.findTotal(9,  null)+calc.findTotal(7,  null)+calc.findTotal(15,  null)+calc.findTotal(11,  null) + calc.findTotal(30,  null)));

    }
}
