public class Loops {
    public static void main(String[] args) {
        //for-loop
        /*
        for (int counter = 0; counter < 10; counter = counter + 1) {
            System.out.println("Hello World");
        }
        */

        /*
        for (int counter = 0; counter < 11; counter++) {
            //counter++ => counter = counter + 1
            System.out.print(counter + " ");
        }
        */

        /*
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        */

        //while-loop
        /*
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i = i + 1;
            //i = i++;
        }
        */

        //do-while-loop
        int i = 0;
        do {
            System.out.println(i);
            i = i + 1;
        } while (i < 11);
    }

}
