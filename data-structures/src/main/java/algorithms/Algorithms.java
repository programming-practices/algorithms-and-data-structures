package algorithms;

public class Algorithms {
    public static void main(String[] args) {

    }
}
/*
-----------------------------------------------------------------------------------------------------------------------
Списки лучше сортировать, используя алгоритм сортировки слиянием.
-----------------------------------------------------------------------------------------------------------------------
Алгоритм сортировки слиянием, применяемый в библиотеке коллекций, немного медленнее быстрой сортировки, традиционно
выбираемой для алгоритмов сортировки общего назначения. Но у него имеется следующее важное преимущество: он устойчив, т.е.
не меняет местами равнозначные элементы.
Допустим, имеется список работников, который уже отсортирован по их Ф.И .О ., а теперь их нужно отсортировать по зарплате.
Как же будут отсортированы работники с одинаковой зарплатой? При устойчивой сортировке упорядочен ие по Ф.И .О . сохраняется.
Иными словами, в конечном итоге получится список, отсортированный сначала по зарплате, а затем по Ф.И .О . работников.
-----------------------------------------------------------------------------------------------------------------------
В коллекциях не нужно реализовывать все "необязательные" методы, поэтому все методы, принимающие коллекции в качестве
параметров, должны указывать, когда безопасно передавать коллекцию алгоритму. Например, совершенно очевидно, что
вряд ли стоит передавать немодифицируемый список алгоритму сортировки. Какие же списки можно передавать? Согласно документации,
список должен быть модифицируемым, но его размер не должен быть изменяемым. Ниже поясняется, что все это означает.
        • Список является модифицируемым, если он поддерживает метод set() .
        • Список имеет изменяемый размер, если он поддерживает методы add() и remove().
-----------------------------------------------------------------------------------------------------------------------
Ниже перечислены пять разновидностей «О-большого», которые будут встречаться вам особенно часто, в порядке убывания
скорости выполнения:
        O(log n) или логарифмическое время. Пример: бинарный поиск.

        О(n) или линейное время. Пример: простой поиск.

        О(n * log n) Пример: эффективные алгоритмы сортировки (быстрая сортировка)

        О(n kvadrat) Пример: медленные алгоритмы сортировки (сортировка выбором)

        О(n!). Пример: очень медленные алгоритмы (задача о коммивояжере)
-----------------------------------------------------------------------------------------------------------------------
перечислим основные результаты :
        1. Скорость алгоритмов измеряется не в секундах, а в темпе роста количества операций.
        2. По сути формула описывает, насколько быстро возрастает время выполнения алгоритма с увеличением размера
           входных данных.
        3. Время выполнения алгоритмов выражается как «О-большое».
        4. Время выполнения O(log n) быстрее О(n), а с увеличением размера списка, в котором ищется значение, оно
           становится намного быстрее.
-----------------------------------------------------------------------------------------------------------------------
Запомните простое правило: в «О-большое» игнорируются числа, задействованные в операциях сложения, вычитания, умно­
жения или деления. Ни одно из следующих значений не является правильной записью «О-большое»: О(n + 26), О(n - 26),
О(n / 26), О(n * 26). Все они эквивалентны О(n)! Почему? Если вам интересно, найдите раздел «Снова об "О-большом"» в
главе 4 и прочитайте о константах в этой записи (константа - это просто число; в этом вопросе 26 является константой).
-----------------------------------------------------------------------------------------------------------------------
Скорость алгоритмов не измеряется в секундах.
Время выполнения алгоритма описывается ростом количества операций.
Время выполнения алгоритмов выражается как «О-большое~.
-----------------------------------------------------------------------------------------------------------------------
*/