package bridge;

public class Main {
    public static void main(String[] args) {
        HandsetBrand ab;
        ab = new HandsetBrandM();

        ab.SetHandsetSoft(new HandsetGame());
        ab.run();

        ab.SetHandsetSoft(new HandsetAddressList());
        ab.run();
    }
}
