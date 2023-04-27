public class LoopWorld {

    public static void main(String[] args) {
        LoopWorld loops = new LoopWorld();
    }

    public LoopWorld(){
        pattern1();
        pattern2();
        pattern3();
        pattern5();
        pattern6();
        pattern7();

    }

    public void pattern1(){
        System.out.println("************ pattern 1: ");
        for (int i = 0; i < 26; i = i + 5) {
            System.out.println(i);

        }
    }
    public void pattern2(){
        System.out.println("************ pattern 2: ");
        for (int i = 2; i < 28; i = i + 5) {
            System.out.println(i);

        }

    }

    public void pattern3(){
        System.out.println("************ pattern 3: ");
        for (int i = 21; i > 0; i = i - 4) {
            System.out.print(i + "  ");

        }
        System.out.println();

    }

    public void pattern5() {
        System.out.println("************ pattern 5: ");
        for (int row = 1; row < 5; row++) {
            for (int i = 1; i <= 4; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
    public void pattern6() {
        System.out.println("************ pattern 6: ");
        for (int i = 1; i < 6; i++) {
            for (int s = 0; s < i-1; s++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }

    }
    public void pattern7() {
        System.out.println("************ pattern 7: ");
        for (int row = 1; row < 6; row++) {
            for (int i = 1; i < row; i = i+1) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
