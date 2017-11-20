//Ввести с клавиатуры строку, вывести ее на экран.
//Далее ввести еще одну строку и вывести на экран
//содержит ли первая строка в себе вторую, если не содержит,
//то вывести на экран какие символы из второй строки содержатся в первой.

package Prog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = in.nextLine();
        System.out.println("Первая строка: "+str1);
        System.out.println("Введите ещё одну строку");
        String str2 = in.nextLine();
        System.out.println("Вторая строка: "+str2);
        String result="";
        if (str1.contains(str2) == true) {// я так понял тут нужен contains
            System.out.println("Первая строка содержит в себе вторую");
        } else {
            for(int i = 0; i < str1.length(); i++)
            {
                char c1 = str1.charAt(i);
                for(int j = 0; j<str2.length(); j++)
                {

                    char c2 = str2.charAt(j);
                    //char control[]=
                    if (result.contains(Character.toString(c2))==true){

                    }else{
                        if (c1 == c2) {
                            result = result + c2;
                        }

                    }
                }
            }
            System.out.println("Символы второй строки, содержащиеся в первой: "+result);
        }
        }
    }
