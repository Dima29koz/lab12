package tasks;

public class Telephone {
    String number;

    public Telephone(String number) {
        this.number = number;
    }

    public Telephone() {}

    private static String conversion(String num){
        num = new StringBuilder().append(num.substring(0, 3)).append('_').append(num.substring(3, 6)).append('_').append(num.substring(6, 10)).toString();
        return num;
    }

    public static String convert(String num){
        String tmp2 = new StringBuilder().append(num.substring(num.length()-10)).toString();
        String code;
        if (num.charAt(0) == '+'){
            code = num.substring(1, num.length()-10);
        }
        else if (num.charAt(0) == '8'){
            code = "7";
        }
        else
            return null;
        return new StringBuilder().append('+').append(code).append(conversion(tmp2)).toString();
    }
}
