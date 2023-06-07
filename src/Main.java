// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(temp(23,23));
        System.out.println(temp(18,50));
        System.out.println(temp(33,60));
        System.out.println(temp(50,0));
        System.out.println(temp(17,80));

        System.out.println(temp(generateRandomAge(),10));
    }
    public static String temp(int age, int each){
        if (age > 20 && age < 45 && each > -20 && each < 30){
            return "Можно идти гулять.";
        } else if (age < 20 && each > 0 && each < 28) {
            return"Можно иидти гулять.";

        } else if (age > 45 && each > -10 && each < 25 ) {
            return"Можно иидти гулять.";
        }else {
            return"Оставайтесь дома";
        }
    }
    public static int generateRandomAge(){
        int alt = (int) (Math.random() * 100);
        return alt;
    }
}