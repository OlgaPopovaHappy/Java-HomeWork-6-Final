import java.util.*;

/* Подумать над структурой класса Ноутбук для магазина техники -
выделить поля и методы. Реализовать в java.
 Создать множество ноутбуков.
 Написать метод, который будет запрашивать у пользователя критерий
 (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
 Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
 соответствующую необходимому критерию:
 1 - ОЗУ
 2 - Объем ЖД
 3 - Операционная система
 4 - Цвет …
 Далее нужно запросить минимальные значения для указанных критериев -
 сохранить параметры фильтрации можно также в Map.
 Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям. */

public class MainLaptop {
    public static void main(String[] args) {

        /* клиентский код / создаем экземпляр класса */
        Laptop nb1 = new Laptop("RedmiBook 15", "черный", "Windows", 8,15);
        Laptop nb2 = new Laptop("HP", "серый", "Windows", 12, 23);
        Laptop nb3 = new Laptop("HUAWEI-Z", "серый", "Windows", 16, 19);
        Laptop nb4 = new Laptop("HUAWEI-V", "красный", "Windows", 8, 27);
        Laptop nb5 = new Laptop("Apple", "черный", "macOS", 16, 13);

        /** множество ноутбуков */
        Set<String> stringSet = new HashSet<>();
        /*stringSet.add(nb1.getDate());
        stringSet.add(nb2.getDate());
        stringSet.add(nb3.getDate());
        stringSet.add(nb4.getDate());
        stringSet.add(nb5.getDate());*/

        int u = surveyUser();
        if (u == 1){
            int r = choosingRam();
            if (r == nb1.getRam()){     stringSet.add(nb1.getDate());    }
            if (r == nb2.getRam()){     stringSet.add(nb2.getDate());    }
            if (r == nb3.getRam()){     stringSet.add(nb3.getDate());    }
            if (r == nb4.getRam()){     stringSet.add(nb4.getDate());    }
            if (r == nb5.getRam()){     stringSet.add(nb5.getDate());    }
            else {  System.out.println(" ! ! ! Ошибка ввода ! ! !");    }


        } else if (u == 2) {
            int d = choosingDiagonal();
            if (d == nb1.getDiagonal()){     stringSet.add(nb1.getDate());    }
            if (d == nb2.getDiagonal()){     stringSet.add(nb2.getDate());    }
            if (d == nb3.getDiagonal()){     stringSet.add(nb3.getDate());    }
            if (d == nb4.getDiagonal()){     stringSet.add(nb4.getDate());    }
            if (d == nb5.getDiagonal()){     stringSet.add(nb5.getDate());    }
            else {
                System.out.println(" ! ! ! Ошибка ввода ! ! !");
            }
        }else if (u == 3) {
            int o = choosingOs();
            String str = "";
            if (o == 1) {   str = "macOS";  }
            else if (o == 2){   str = "Windows";    }

            if (str.equals(nb1.getOs())){     stringSet.add(nb1.getDate());    }
            if (str.equals(nb2.getOs())){     stringSet.add(nb2.getDate());    }
            if (str.equals(nb3.getOs())){     stringSet.add(nb3.getDate());    }
            if (str.equals(nb4.getOs())){     stringSet.add(nb4.getDate());    }
            if (str.equals(nb5.getOs())){     stringSet.add(nb5.getDate());    }
            else {
                System.out.println(" ! ! ! Ошибка ввода ! ! !");
            }
        }else if (u == 4) {
            int c = choosingColor();
            String str = "";
            if (c == 1) {
                str = "черный";
            }else if (c == 2) {
                str = "серный";
            }else if (c == 3){
                str = "красный";
            }else {
                System.out.println(" ! ! ! Ошибка ввода ! ! !");
            }
            if (str.equals(nb1.getColor())){     stringSet.add(nb1.getDate());    }
            if (str.equals(nb2.getColor())){     stringSet.add(nb2.getDate());    }
            if (str.equals(nb3.getColor())){     stringSet.add(nb3.getDate());    }
            if (str.equals(nb4.getColor())){     stringSet.add(nb4.getDate());    }
            if (str.equals(nb5.getColor())){     stringSet.add(nb5.getDate());    }
        }else {
            System.out.println(" ! ! ! Ошибка ввода ! ! !");
        }

        /* вывод на печать множество ноутбуков */
        for (String el : stringSet) {
            System.out.println(el);
        }
    }
    public static int surveyUser(){
        System.out.print(" 1 - ОЗУ\n" +
                " 2 - Диагональ\n" +
                " 3 - Операционная система\n" +
                " 4 - Цвет \n" +
                "Введите цифру,соответствующую необходимому критерию: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static int choosingRam(){
        System.out.print("8 гб \n12 гб \n16 гб\nВыберети объем ОЗУ: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static int choosingDiagonal(){
        System.out.println("13\"\t15\"\t19\"\t23\"\t27\"\nВыберети диагональ: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static int choosingOs(){
        System.out.print("1 - macOS\t2 - Windows\nВыберети Операционную систему: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static int choosingColor(){
        System.out.print("1 - Черный\t2 - Серый\t3 - Красный\nВыберети Операционную систему: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}