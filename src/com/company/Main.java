package com.company;

public class Main {

    public static void main(String[] args) {
//        try {
//            int x=10;
//            System.out.println(x/0);
//        }
//        catch (ArithmeticException e) {
//            //hibakezelés itt történik
//            System.out.println("Ne ossz 0-val!!");
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }

//        try {
//            divide(10,0);
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Ne ossz 0-val!!");
//        }
//        catch (Exception e) {
//
//        }

        MotoricVehicle motoricVehicle = new MotoricVehicle();
        try {
            motoricVehicle.go();
        } catch (NotImplementedException e){
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        Car mazda = new Car();
        mazda.setSpeed(150);
        mazda.setEngineType(EngineType.GAS);

        Car opel = new Car();
        opel.setSpeed(110);
        opel.setEngineType(EngineType.DIESEL);

//        try { mazda.go();
//            opel.go();
//        } catch (SpeedingException e) {
//            System.out.println("Your speed is too high!");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        System.out.println(Recursion.factorial(3));
//
//        System.out.println(Recursion.sum(3));
//
//        System.out.println(Recursion.fibonacci(3));


        Node root = new Node(1);

        Node node1 = new Node(0);
        Node node2 = new Node(2);
        root.setLeft(node1);
        root.setRight(node2);

        Node node3 = new Node(5);
        Node node4 = new Node(10);
        node1.setLeft(node3);
        node1.setRight(node4);

        Node node5 = new Node(6);
        Node node6 = new Node(7);
        node3.setLeft(node5);
        node3.setRight(node6);

        Recursion.preOrder(root);
        System.out.println("---------------------------");
        Recursion.inOrder(root);
        System.out.println("---------------------------");
        Recursion.postOrder(root);
    }



    private static void divide(int a, int b) throws ArithmeticException{
        System.out.println(a/b);
    }
}
