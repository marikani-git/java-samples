package com.marikani.java8;

public class LambdaExpressionDemo {
    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("return bank name using anonymous impl");
        System.out.println("==========================================");
        Bank bank = new Bank() {
            @Override
            public void getBankName(String bankName) {
                System.out.println("return bank name using anonymous impl " + bankName);
            }
        };

        bank.getBankName("SBI");

        System.out.println("==============================================");
        System.out.println("return bank name using Lambda Expression");
        System.out.println("==============================================");
        Bank bank1 = (bankName) -> {
            System.out.println("return bank name using Lambda Expression " + bankName);
        };
        bank1.getBankName("AXIS");

        System.out.println("==============================================");
        System.out.println("return college name using Lambda Expression with return");
        System.out.println("==============================================");
        College college = (name) -> "return college name using Lambda Expression " + name;
        System.out.println(college.getCollegeName("SRM"));
    }
}
