import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DZ3 {
    public static void main(String[] args) {
        task_01();
        task_02();
    }

    static void task_01() {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        List<Integer> list = createRandList();
        list = delEven(list);
        System.out.println("Список не четных чисел: " + list);
    }

    static List<Integer> createRandList() {
    Scanner scan = new Scanner(System.in);
    System.out.printf("Размер списка: ");
    int value = scan.nextInt();
    scan.close();
    List<Integer> list = new ArrayList<>();
    Random rand = new Random();
    for (int i = 0; i < value; i++) {
        list.add(rand.nextInt(100));
    }
    return list;
    }
    
    static List<Integer> delEven(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    static void task_02() {
        //Задан целочисленный список ArrayList. 
        //Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите размер массива: ");
        int valueArray = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> arrList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < valueArray; i++) {
            arrList.add(random.nextInt(100));
        }
        System.out.println("Минимальное значение: " + Collections.min(arrList));
        System.err.printf("Среднее арифметическое: %.2f\n", getAverege(arrList));
        System.out.println("Максимальное значение: " + Collections.max(arrList));
    }

    static double getAverege(ArrayList<Integer> list) {
        double averege = 0;
        for (int i = 0; i < list.size(); i++) {
            averege += list.get(i);
        }
        averege /= list.size();
        return averege;
    }


}