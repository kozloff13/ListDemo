import java.util.ArrayList;
import java.util.List;

public class ArrayListDemoGet {

    ArrayListDemoGet() {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) { //создаем список с 1000000 элементов, который состоит из единиц
            list.add(1);
        }
        long t = System.currentTimeMillis(); //засекаем время работы

        for (int i = 0; i < 10000; i++) { //получаем индекс
            list.get(i);
        }
        System.out.println("Time: " + (System.currentTimeMillis() - t)); //получаем время выполнения операции
    }
}