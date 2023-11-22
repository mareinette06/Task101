package TaskNov16;

public class AppSum {
    public static void main(String[] args) {
        int [] parameters = {4, 5, 10};

        ProcessSum calcs = new ProcessSum();

        System.out.println("Sum of all: " + calcs.sumOfCumulatives(parameters));
    }
}
