package recursion;

// Sources:
//      1. https://www.youtube.com/watch?v=3YbRUfhIf0g
//      2. http://www.toves.org/books/java/ch18-recurex/
//      3. https://www.youtube.com/watch?v=_YazUOOZ9cE
//      4. https://www.youtube.com/watch?v=1XII2PWAYgE&list=PLoij6udfBncifDy8AjaU5wcG_UDPjDSSb    Golovach

import java.util.Arrays;

public class RecursionMethod {

    public static void main(String[] args) {
//======================================================================================================================
//======================================================================================================================
//======================================================================================================================

        int[] arg = new int[]{2, 0, 4, -1, 6};
        int[] argNull = null;
        int[] argIsEmpty = new int[0];
//        for (int i = 0; i < arg.length; i++) {
//            tmp += arg[i];
//        }
//        System.out.println(tmp);

//        System.out.println(recursiveArrayCounting(arg));
//        System.out.println(recursiveArrayCounting(argNull));
//        System.out.println(recursiveArrayCounting(argIsEmpty));

//        System.out.println(recursiveSearchMaxValue(arg));
//        System.out.println(recursiveSearchMaxValue(argNull));
//        System.out.println(recursiveSearchMaxValue(argIsEmpty));

//        System.out.println(recursiveSearchMinValue(arg));
//        System.out.println(recursiveSearchMinValue(argNull));
//        System.out.println(recursiveSearchMinValue(argIsEmpty));
        
//======================================================================================================================
//======================================================================================================================
//======================================================================================================================

//        methodRecursion_A(1);
//        System.out.println("\n--------------------------");
//        methodRecursion_B(1);
        
//======================================================================================================================
//======================================================================================================================
//======================================================================================================================

//        f3(1);
        
//======================================================================================================================
//======================================================================================================================
//======================================================================================================================


//        methodRecursion_A(1);
//        System.out.println("\n=========================");

//        methodRecursion_B(1);
//        System.out.println("\n=========================");

//        methodRecursion_C(1);
//        System.out.println("\n=========================");

        fibonacci_recursionA(5);
        System.out.println("\n===========================");

        fibonacci_recursionB(5);
        System.out.println("\n===========================");

        fibonacci_recursion(5);
        System.out.println("\n===========================");

//======================================================================================================================
//======================================================================================================================
//======================================================================================================================
        
    }

//======================================================================================================================
//============= https://www.youtube.com/watch?v=1XII2PWAYgE&list=PLoij6udfBncifDy8AjaU5wcG_UDPjDSSb  Golovach ==========
//======================================================================================================================
    
    public static void methodRecursion_A(int value){
        System.out.print(" " + value);
        if (value < 15) {
            methodRecursion_A(2 * value);
        }
    }
    public static void methodRecursion_B(int value){
        if (value < 15) {
            methodRecursion_B(2 * value);
        }
        System.out.print(" " + value);
    }
    public static void methodRecursion_C(int value){
        System.out.print(" " + value);      // pechat na vxode.  priamaia recursia
        if (value < 15) {
            methodRecursion_C(2 * value);
        }
        System.out.print(" " + value);      //  pechat na vuxode.  obratnaia recursia
    }
    
    /**
     * Etot method kotorui schiitaet chisla fibonachi, no zdes mu smotrim kak rabotaet recursia.
     * Dlya vichislenia chisel fibonachi vukorustovuetsa recursia s vetvleniem
     * Chto bydet napechatano.
     * */
    public static int fibonacci_recursionA(int arg) {
        System.out.print(" " + arg);
        return arg < 2 ? 1 : fibonacci_recursionA(arg - 2) + fibonacci_recursionA(arg - 1);
    }
    public static int fibonacci_recursionB(int arg) {
        int reuslt = arg < 2 ? 1 : fibonacci_recursionB(arg - 2) + fibonacci_recursionB(arg - 1);
        System.out.print(" " + arg);
        return reuslt;
    }
    public static int fibonacci_recursion(int arg){
        return arg < 2 ? 1 : fibonacci_recursion(arg - 2) + print(arg) + fibonacci_recursion(arg - 1);
    }

    public static int print(int arg){
        System.out.print(" " + arg);
        return 0;
    }
    
//======================================================================================================================
//======================================================================================================================
//======================================================================================================================

    public static void f3(int value) {
        if (value < 17_400){  // na 18_000 vuxodut error
            f3(value +1);
        }
    }

//======================================================================================================================
//======================================================================================================================
//======================================================================================================================

    /**
     * Minimal value of an array by a recursive search
     * If the parameter is null or IsEmpty return Integer.MAX_VALUE.
     * */
    public static int recursiveSearchMinValue(int[] values) {

        if (values != null){
            int minValue = Integer.MAX_VALUE;
            if (values.length != 0) {
                minValue = values[values.length - 1];
                int minValueM = recursiveSearchMinValue(Arrays.copyOfRange(values, 0, values.length - 1));
                return minValue > minValueM ? minValueM : minValue;
            } else {
                return minValue;
            }
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /**
     * Maximum value of an array by a recursive search
     * If the parameter is null or IsEmpty return 0 zero.
     *
     * */
    public static int recursiveSearchMaxValue(int[] values) {
        if (values != null){
            int maxValue = 0;
            if (values.length != 0) {
                maxValue = values[values.length - 1];
                int maxValueM = recursiveSearchMaxValue(Arrays.copyOfRange(values, 0, values.length - 1));
                return maxValue > maxValueM ? maxValue : maxValueM;
            } else {
                return maxValue;
            }
        } else {
            return 0;
        }
    }

    /**
     * recursive sum of values by array
     * рекурсивный подсчет суммы значений массив
     * If the parameter is null or is empty return 0 zero.
     *
     * */
    public static int recursiveArrayCounting(int[] values) {
        if (values != null) {
            if (values.length != 0) {
                int valueArg = values[values.length - 1];
                int resultMthod = recursiveArrayCounting(Arrays.copyOfRange(values, 0, values.length - 1));
                return valueArg += resultMthod;
//            return values[values.length - 1] += recursiveArrayCounting(Arrays.copyOfRange(values, 0, values.length - 1));
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

//======================================================================================================================
//======================================================================================================================
//======================================================================================================================

}


/*
------------------------------------------------------------------------------------------------------------------------
Когда функция вызывает саму себя, это называется рекурсией.
В каждой рекурсивной функции должно быть два случая: базовый и рекурсивный .
Стек поддерживает две операции: занесение и извлечение элементов.
Все вызовы функций сохраняются в стеке вызовов.
Если стек вызовов станет очень большим, он займет слишком много памяти.
------------------------------------------------------------------------------------------------------------------------
СОВЕТ:
    Когда вы пишете рекурсивную функцию, в которой задействован массив, базовым случаем часто оказывается пустой массив
    или массив из одного элемента. Если вы не знаете, с чего начать, начните с этого.
------------------------------------------------------------------------------------------------------------------------
Esli proxodit derevo s pomowchy recursii to recursia idot tolko v hlybiny. V wirinu rekyrsia ne idot.
------------------------------------------------------------------------------------------------------------------------

Recursion buvaet: priamoi,  kostvennoi, s vetvleniem, i bez vetvlenia
Kostvennaya recursia eto kohda methodA vizevaet methodB y methodB vuzuvaet methodA. Etot priclad mozet bit namnoho dolwe.
Recursion s vetvleniem eto fibonacci zdelanui s recursieei

*/