public class Main {

    /*
    В Java есть 3 класса для работы со строками: String, StringBuilder, StringBuffer;
    String хотя является ссылочным типом, но с ним можно работать как с примитивным типом, т.е. для него перегружен
    операторы +, =:
    String str = " ";
    str + "Hello, World!";
    String хранит неизменяемые значения, т.е. при изменении значения объекта, создает новый объект с новым значение, но с
    тем же названием
    Классы StringBuilder и StringBuffer имеют дублирующий друг друга набор методов, но StringBuffer потокобезопасный, т.е.
    если в программе со строками работает несколько потоков, нужно использовать StringBuffer, также эти классы в отличие
    от String изменяемые, т.е. при изменении значения объекта, в объект погружается новое значение, а новый объект при
    этом не создается.

     */

    public static void main(String[] args) {
	StringBuilder stringBuilder = new StringBuilder();
    StringBuffer stringBuffer = new StringBuffer();
    String str = new String();


    }

    /*
    Задачи
    Выполнить при помощи каждого класса
    Работа с методами:
    delete(int start, int end) — удаляет подстроку символов начиная с позиции start, заканчивая end
deleteCharAt(int index) — удаляет символ в позиции index
insert(int offset, String str) — вставляет строку str в позицию offset. Метод insert также перегружен и может принимать различные аргументы
replace(int start, int end, String str) — заменит все символы начиная с позиции start до позиции end на str
reverse() — меняет порядок всех символов на противоположный
substring(int start) — вернет подстроку, начиная с позиции start
substring(int start, int end) — вернет подстроку, начиная с позиции start до позиции end

Задачи со звездочкой:
Рекомендация: Старайтесь делать решения максимально универсальными.
1) Проверка на паллиндром(слово, которые читается одинаково в обоих направлениях, без метода reverse)
2) Сделать реверс вручную по символьно( не используя метод reverse)
3) Для произвольной строки реализовать метод для поиска подстроки, если ее нет, вывести сообщение
4) Обратить внимание на игру RSP
5) Дан массив чисел. Проверить есть ли в числе цифра, которая является делителем числа
6) Создать метод для нахождения суммы чисел символов строки
Подсказка
char можно преобразовать в число.
7) Сделать метод для конкатенации строк.
    */
}
