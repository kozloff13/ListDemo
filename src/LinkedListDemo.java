import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    LinkedListDemo() {

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) { //создаем список с 1000000 элементов, который состоит из единиц
            list.add(1);
        }
        long t = System.currentTimeMillis(); //засекаем время работы

        for (int i = 0; i < 10000; i++) { //удаляем из листа элемент с индексом 5 10000 раз
            list.remove(5);
        }
        System.out.println("Time: " + (System.currentTimeMillis() - t)); //получаем время выполнения операции
    }
}
