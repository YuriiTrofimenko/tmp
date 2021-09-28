package org.tyaa.demo.java.testing.gradle;

import org.tyaa.demo.java.testing.gradle.delegates.ICustomComparator;

import java.util.List;

public class CustomSorters {
    public static void sort(List<Integer> integers) {
        boolean sorted;
        do {
            // Может быть, сейчас список отсортирован?
            sorted = true;
            // Проверка всех пар - так ли это?
            for (int i = 0; i < integers.size() - 1; i++) {
                // Правило сортировки: от меньших чисел к большим,
                // то есть каждое текущее число должно быть меньше следующего.
                // Если текущее число больше следующего -
                // переключаем флаг sorted в значение true.
                if (integers.get(i) - integers.get(i + 1) > 0) {
                    // перестановка местами
                    Integer tmp = integers.get(i);
                    integers.set(i, integers.get(i + 1));
                    integers.set(i + 1, tmp);
                    // Переключение флага в состояние "не отсортировано"
                    sorted = false;
                }
            }
        } while (!sorted);
    }
    public static <T> void sort(List<T> items, ICustomComparator<T> comparator) {
        boolean sorted;
        do {
            // Может быть, сейчас список отсортирован?
            sorted = true;
            // Проверка всех пар - так ли это?
            for (int i = 0; i < items.size() - 1; i++) {
                // Правило сортировки: от меньших чисел к большим,
                // то есть каждое текущее число должно быть меньше следующего.
                // Если текущее число больше следующего -
                // переключаем флаг sorted в значение true.
                if (comparator.compare(items.get(i), items.get(i + 1)) > 0) {
                    // перестановка местами
                    T tmp = items.get(i);
                    items.set(i, items.get(i + 1));
                    items.set(i + 1, tmp);
                    // Переключение флага в состояние "не отсортировано"
                    sorted = false;
                }
            }
        } while (!sorted);
    }
}
