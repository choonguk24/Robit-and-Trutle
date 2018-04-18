package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        String[] road = new String[70];
        int tPosition = 0;
        int hposition = 0;
        System.out.println("开跑");

        while (true){
            for (int i =0; i<road.length;i++){
                road[i]="_";}
            Random random =new Random();
            int num =random.nextInt(10)+1;
            if(num>=1&&num<=5){
                tPosition+=3;
            }
            else if (num>=6&&num<=7){
                tPosition-=6;
                if (tPosition<0){
                    tPosition=0;
                }
            }
            else {
                tPosition+=1;
            }
            if(num>=1&&num<=2){
                hposition+=0;
            }
            else if(num>=3&&num<=4){
                hposition+=9;
            }
            else if(num==5){
                hposition-=12;
                if (hposition<0){
                    hposition=0;
                }
            }
            else if(num>=6&&num<=8){
                hposition+=1;
            }
            else if(num>=9&&num<=10){
                hposition-=2;
                if (hposition<0){
                    hposition=0;
                }
            }


            if (hposition>=70||tPosition>=70){
                break;
            }
            road[hposition]="h";
            road[tPosition]="t";
            if(hposition==tPosition){
                road[tPosition]="OUCH";
            }
            for (int i=0;i<road.length;i++)
            {
                System.out.print(road[i]);
            }
            System.out.println();
            Thread.sleep(300);
        }
        if (tPosition>=70){
            System.out.println("乌龟赢了");
        }
        else {
            System.out.println("兔子赢了");
        }
    }
}
