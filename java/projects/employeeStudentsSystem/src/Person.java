public class Person {
    private String name;
    private String tel;
    private String cardId;

    public Person() {
    }

    public Person(String name, String tel, String cardId) {
        this.name = name;
        this.tel = tel;
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String detail() {
        return "Name: " + name + ", Tel: " + tel + ", CardId: " + cardId;
    }

}
