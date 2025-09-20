package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(1000));
        }

        System.out.println(list);

        List<Integer> streamList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(streamList);
    }
}
