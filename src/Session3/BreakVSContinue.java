package Session3;

import java.util.Scanner;

public class BreakVSContinue {
    public  static void main(String args[]){
        for (int i=0;i<10;i++){
            if(i==5||i==7){
                System.out.println(i);
                // continue;
                break;
            }
        }
    }
}

