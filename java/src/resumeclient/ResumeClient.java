package resumeclient;

public class ResumeClient {
    public static void main(String[] args) {
        Resume a = new Resume("Sally");
        a.setPersonalInfo("Female", "29");
        a.setWorkExperience("2013-2024", "Google");
        a.display();
    }
}
