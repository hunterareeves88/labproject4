import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        double len;
        int sub;
        sub = 0;
        double finalNum;
        double power;
        double powered;
        double nearfin;
        String semifin;
        finalNum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = s.nextLine();
        hex = hex.toUpperCase();
        hex = hex.replace("0X","");
        double hexLength = hex.length();
        power = hexLength - 1;

        len = hexLength;

        while(len > 0)
        {
            semifin = (hex.substring(sub, (sub+1)));
            semifin = semifin.replace("A","10");
            semifin = semifin.replace("B","11");
            semifin = semifin.replace("C","12");
            semifin = semifin.replace("D","13");
            semifin = semifin.replace("E","14");
            semifin = semifin.replace("F","15");
            nearfin = Integer.parseInt(semifin);


            powered = nearfin * (Math.pow(16, (double)power));
            power -= 1;

            if (powered < 0)
            {
                powered = powered* -1;
                System.out.println("why");
            }
            finalNum += powered;
            if (finalNum < 0)
            {
                finalNum = finalNum* -1;
                System.out.println("why");
            }
            len --;
            sub++;
        }
        //format the double with no decimal i guess so it can hold the value

        System.out.println("Your number is " + finalNum + " in decimal");
    }














    }

