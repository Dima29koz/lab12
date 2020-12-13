package tasks;

import java.util.*;

public class test {

    public static void main(String[] args) {
        //test task 1
        Person p1 = new Person("Dmitriy", "Kozerovskiy", "Nikitich");
        Person p2 = new Person("Kozerovskiy");
        Person p3 = new Person("Dmitriy", "Kozerovskiy");
        System.out.println(p1.fio());
        System.out.println(p2.fio());
        System.out.println(p3.fio());

        //test task 2
        Adress a1 = new Adress();
        a1.getAdress_a("Россия, Московская область, Москва, Лениниский пр-т, 322, 14, 228");
        Adress a2 = new Adress();
        a2.getAdress_b("Россия. Московская область, Москва; Лениниский пр-т,... 322, 14, 228");
        Adress a3 = new Adress();
        a3.getAdress_b("Россия, Московская область, Москва, Лениниский пр-т, 322, 14, 228");
        Adress a4 = new Adress();
        a4.getAdress_b("Россия;Московская область;Москва.Лениниский пр-т...;;; 322,... 14, 228");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        //test task 3
        String[] shirts_in = new String[11];
        shirts_in[0] = "S001,Black Polo Shirt,Black,XL";
        shirts_in[1] = "S002,Black Polo Shirt,Black,L";
        shirts_in[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts_in[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts_in[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts_in[5] = "S006,Black T-Shirt,Black,XL";
        shirts_in[6] = "S007,White T- Shirt,White,XL";
        shirts_in[7] = "S008,White T-Shirt,White,L";
        shirts_in[8] = "S009,Green T-Shirt,Green,S";
        shirts_in[9] = "S010,Orange T-Shirt,Orange,S";
        shirts_in[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts = new Shirt[11];
        for (int i=0;i<11;i++){
            shirts[i] = new Shirt(shirts_in[i]);
            System.out.println(shirts[i]);
        }

        //test task 4
        System.out.println(Telephone.convert( "89261729326"));
        System.out.println(Telephone.convert("+79261729326"));
        System.out.println(Telephone.convert("+12139261729326"));

        //test task 5
        System.out.println(getLine("kebav notdok adomam Vera Meren"));

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String fileName = in.nextLine().trim();

        System.out.println(getLine(fileName));


    }


    public static String getLine(String input){
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");
        if (words == null || words.length == 0) return result.toString();
        if (words.length == 1 || words[0].equals("")) return result.append(words[0]).toString();
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.addAll(Arrays.asList(words));
        while(wordsList.remove(""));//удаление пустых слов

        while (isNotRes(wordsList)){
            Collections.shuffle(wordsList);
        }
        for (String word : wordsList){
            result.append(word).append(" ");
        }
        //System.out.println(wordsList);
        return result.toString().trim();
    }

    private static boolean isNotRes(ArrayList<String> wordsList){
        for (int i=0;i<wordsList.size() -1; i++){
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i+1).toLowerCase();
            if (firstWord.charAt(firstWord.length()-1) != secondWord.charAt(0)) return true;
        }
        return false;
    }
}
