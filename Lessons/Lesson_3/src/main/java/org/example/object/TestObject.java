package org.example.object;

import java.util.*;

public class TestObject {
    public static void main(String[] args) {
        List list = new ArrayList(); // Создан лист без указания типа хранимых объектов
        list.add(123); // Помещаем в лист объект Integer
        list.add("456"); // Помещаем в лист объект String
        System.out.println("Лист 1 = " + list);
        System.out.println("Тип данных в листе индекс 0 = " + list.get(0).getClass()); // Выводим тип данных хранящихся в листе под индексом 0
        System.out.println("Тип данных в листе индекс 1 = " + list.get(1).getClass()); // Выводим тип данных хранящихся в листе под индиксом 1

        List <Integer> list2 = new ArrayList<>(); // Создан лист с указанием типа данных Integer
        list2.add(789);
        list2.add(852);
        list2.add(999);
        list2.add(5);
        list2.add(123);
        // list2.add("текст"); // Будет приводить к ошибке т.к. для листа указан тип данных Integer
        System.out.println("Лист 2 = " + list2);
        //list2.retainAll(list); // Удаляет из листа 2 все элементы, кроме тех которые содержатся в list
        //System.out.println("Результат удаления из листа элементов не содержащихся в list = " + list2);
        String text = list2.toString();
        System.out.println("Лист 2 приведен к типу String и присвоен в переменную text = " + text);

        List <Integer> list3 = new ArrayList<>(list2); // Создан лист копированием в него листа2
        list3.set(0, 9); // При внесении изменений в лист 3, лист 2 не затрагивается (т.е создается новый объект)
        System.out.println("Лист 2 после изменений листа 3 = " + list2);
        System.out.println("Лист 3 после изменений = " + list3);

        List <Integer> list4 = new ArrayList<>(list2.subList(1, 3)); // Создан лист 4 из саблист листа 2 (от 1 до 3 НЕ ВКЛЮЧИТЕЛЬНО)
        System.out.println("Саблист листа 2 по индексам от 1 до 3 = " + list4);

        //List <Integer> list5 = List.of(5, 15, 20, 25); // Создан лист 5 через List.of он является не изменяемым
        List <String> list5 = List.of("5", "15", "20", "25"); // Создан лист 5 через List.of он является не изменяемым
        //list5.remove(2); // При попытке его изменить будет исключение UnsupportedOperationException

        // СПРОСИТЬ
        //String [] arr = (String[]) list5.toArray().toString(); // Ошибка CllasCastException
        String [] arr = list5.toArray(String[]::new); // Работает корректно, что означает "::"
        //int [] arr = list5.toArray(new int[0]); // Ошибка: Не удается разрешить метод to.Array
        System.out.println("Маасив arr созданный с использованием функции toArray = " + Arrays.toString(arr));

        List <String> list6 = Arrays.asList("Привет", "мир", "!"); // Создание списка при помощи Arrays.asList
        System.out.println("Список созданный при помощи Arrays.asList = " + list6);

        int [] arr2 = {1, 2, 3, 4, 5};
        List <Integer> list7 = new ArrayList<>();

        // СПРОСИТЬ

        Arrays.asList(arr2); // Ошибка: Не удается разрешить метод add
        System.out.println("ЗДЕСЬ" + Arrays.toString(arr2));
        List <Integer> list8 = List.copyOf(list2); // Создает копию указанного листа, но не позволяет его редактировать.
        list2.set(1, 14); // Изменения в листе с которого снята копия не затрагивают новый лист.
        System.out.println("Лист 8 созданный через copy.of листа 2 = " + list8);

                            // ИТЕРРАТОР
        Iterator <Integer> iter = list2.iterator(); // Итератор для прохождения по листу 2 с начала листа
        System.out.println("Вывод листа 2 через итератор:");
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        ListIterator <Integer> likIter = list2.listIterator(list2.size()); // Лист итератор с указанием на конец листа (в аргументе индекс)
        System.out.println("Вывод листа 2 через ЛистИтератор в обратном порядке: ");
        while(likIter.hasPrevious()){
            System.out.print(likIter.previous() + " ");
        }
    }
}
