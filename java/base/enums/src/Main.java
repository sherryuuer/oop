package enums.src;

public class Main {
    public static void main(String[] args) {
        Size size = Size.SMALL;
        System.out.println(size.toString()); // SMALL
        System.out.println(size.name()); // SMALL

        System.out.println(Size.SMALL == Size.valueOf("SMALL"));
    }

    static void test() {
        for (Size size : Size.values()) {
            System.out.println(size);
        }
    }

    static void onChosen(Size size) {
        switch (size) {
            case SMALL:
                System.out.println("chosen small");
                break;
            case MEDIUM:
                System.out.println("chosen medium");
                break;
            case LARGE:
                System.out.println("chosen large");
                break;
        }
    }
}
