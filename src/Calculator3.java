public class Calculator3 {
    public double tax = .05;
    public double tip = .15;

    public void findTotal(int personNumber, double price, String name){
        double total = price*(1+tax+tip);
        System.out.println("Person" + personNumber + "(" + name + ")" + " cost:" + "$" +total);

    }
}
