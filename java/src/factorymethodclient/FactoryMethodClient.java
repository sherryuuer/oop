package factorymethodclient;

public class FactoryMethodClient {
    public static void main(String[] args) {
        IFactory factory = new UndergraduateFactory();
        LeiFeng student = factory.createLeiFeng();
        student.sweep();
        student.wash();
        student.buyRice();

        LeiFeng volunteer = new VolunteerFactory().createLeiFeng();
        volunteer.sweep();
        volunteer.wash();
        volunteer.buyRice();
    }
}
