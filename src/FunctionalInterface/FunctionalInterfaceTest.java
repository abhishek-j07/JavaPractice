package FunctionalInterface;

import LambdaFunction.FInterface;

public class FunctionalInterfaceTest {

    FInterface fInterface = new FInterface() {
        @Override
        public void speak() {
            System.out.println("speaking");
        }
    };
}
