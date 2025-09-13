package LambdaFunction;

import javax.sound.midi.Soundbank;

public class LambdaFunction {

    public static void main(String[] args) {
        LambdaFunction lambdaFunction = new LambdaFunction();
        lambdaFunction.argumentFunctionalInterface.say("Abhi");
    }

    FInterface f = () -> {
        System.out.println("Speaking in Lambda Function");
    };

    ArgumentFunctionalInterface argumentFunctionalInterface =
            (String word) -> {
      System.out.println("Hello " + word);
    };
}
