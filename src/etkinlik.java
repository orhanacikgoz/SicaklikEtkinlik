import java.util.Scanner;

public class etkinlik {

    public static void main(String[] args) {

        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava Kac Derece?");
        heat=inp.nextInt();
        if (heat<=5){
            System.out.println("Kayak Yapmak Harika Olabilir");
        }else if (heat<=25){
            if (heat<=15){
                System.out.println("Sinemaya Ne Dersin?");
            }else {
                System.out.println("Piknik Harika olur");
            }

        }else {
            System.out.println("Yuzmeye Ne Dersin?");
        }




















    }

}
