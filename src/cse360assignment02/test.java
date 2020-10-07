package cse360assignment02;

public class test{
    public static void main(String[] args){
        AddingMachine calculator = new AddingMachine();
        calculator.add(200);
        calculator.subtract(142);
        System.out.println(calculator.toString());
        System.out.println(calculator.getTotal());
        calculator.clear();
        System.out.println(calculator.toString());
    }
}