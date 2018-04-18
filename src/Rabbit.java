import java.util.Random;

/**
 * Created by ttc on 18-1-4.
 */
public class Rabbit {
    public static void main(String[] args) throws InterruptedException {
        String[] rabbit = new String[70];
        String[] turtle = new String[70];
        int rabbitPosition =0;
        int turtlePosition =0;
        while (true){
            for (int i=0;i<rabbit.length;i++){
                rabbit[i]=" ";
            }
            for (int i =0;i<turtle.length;i++){
                turtle[i]=" ";
            }
            Random random =new Random();
            int num = random.nextInt(10)+1;
            if(num>=1&&num<=5){
                turtlePosition+=3;
            }
            else if (num>=6&&num<=7){
                turtlePosition-=6;
                if (turtlePosition<0){
                    turtlePosition=0;
                }
            }
            else {
                turtlePosition+=1;
            }
            if(num>=1&&num<=2){
                rabbitPosition+=0;
            }
            else if(num>=3&&num<=4){
                rabbitPosition+=9;
            }
            else if(num==5){
                rabbitPosition-=12;
                if ( rabbitPosition<0){
                    rabbitPosition=0;
                }
            }
            else if(num>=6&&num<=8){
                rabbitPosition+=1;
            }
            else if(num>=9&&num<=10){
                rabbitPosition-=2;
                if ( rabbitPosition<0){
                    rabbitPosition=0;
                }
            }
            if (turtlePosition>=70||rabbitPosition>=70){
                break;
            }
            rabbit[rabbitPosition]="R";
            turtle[turtlePosition]="T";
            Thread.sleep(1000);
            for (int i=0;i<rabbit.length;i++){
                System.out.print(rabbit[i]);
            }
            System.out.println();
            for (int i=0;i<turtle.length;i++){
                System.out.print(turtle[i]);
            }
            System.out.println();
        }
    }
}
