import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
Пример ввода:
мама мыла раму.
Пример вывода:
Мама Мыла Раму.
Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать строку с клавиатуры.
3. Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/
public class Main {

    public static void main(String[] args) throws IOException {
//        мама мыла раму.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String[] arr = string.trim().split("\\s+");
        //напишите тут ваш код
        for(int i=0; i< arr.length;i++){
            String one = arr[i];
            char[] arrOne = one.toCharArray();
            char a =Character.toUpperCase(arrOne[0]);
            arrOne[0]=a;
            String arrNew = new String(arrOne);
            arr[i]=arrNew;
        }
        for(String a:arr){
            System.out.print(a + " ");}
    }
    }