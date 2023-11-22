package TaskNov16;

import java.util.Scanner;

public class ProcessSum {
    int sumOfAll =0;

    public int sumOfCumulatives(int...args) {
    for (int i=0; i < args.length; i++) {
        System.out.println("Element #" + (i+1) + ": " + args[i] + " = " );
        for (int j=1; j <= args[i]; j++) {
            System.out.println(j +" ");
            sumOfAll+= j;
        }
        System.out.println();
    }
    return sumOfAll;

    }
}