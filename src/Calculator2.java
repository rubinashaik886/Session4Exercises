public class Calculator2 {
    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 10;

    public void findTotal(){
        double total = originalPrice*(1+tax+tip);
        System.out.println(total);
    }
}
