

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainLaptop {
    public static void main(String[] args) {
        // Создание множества ноутбуков
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Dell", 16, 512, "Windows", "Black"));
        laptops.add(new Laptop("Apple", 8, 256, "MacOS", "Silver"));
        laptops.add(new Laptop("Lenovo", 32, 1024, "Linux", "Gray"));
        laptops.add(new Laptop("HP", 8, 256, "Windows", "Blue"));
        laptops.add(new Laptop("Xiomi", 16, 512, "Linux", "White"));

        Map<Integer, Object> filters = new HashMap<>();  // словарь для хранения критериев пользователя
        // запрос критериев поиска у пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("0 - Завершить выбор");
        int choice;
        while (true) {
            choice = scanner.nextInt();
            if (choice == 0) 
                break;

            switch (choice) {
                case 1:
                    System.out.print("Минимальный объем ОЗУ: ");
                    filters.put( 1, scanner.nextInt());
                    break;
                case 2:
                    System.out.print("Минимальный объем ЖД: ");
                    filters.put( 2, scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Операционная система: ");

                    filters.put( 3, scanner.next());
                    break;
                case 4:
                    System.out.print("Цвет: ");
                    filters.put( 4, scanner.next());
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
        // фильтрация ноутбуков по критериям пользователя и вывод списка
        for (Laptop lap : laptops) {
            if (lap.getRam() >= (int) filters.getOrDefault(1, 8) && 
                lap.getHdd()>= (int) filters.getOrDefault(2, 256) && 
                lap.getOs().equals(filters.getOrDefault(3, lap.getOs())) &&
                lap.getColor().equals(filters.getOrDefault(4, lap.getColor()))){
                System.out.println(lap);
            }
                
        }
        scanner.close();
    }
}
    

