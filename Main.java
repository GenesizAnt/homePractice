package exerciseExamclouds.lessonOOP;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1,"Samsung", 123);
        Phone phone2 = new Phone(2,"Iphone", 155);
        Phone phone3 = new Phone(3,"Xiaomi", 136);

        System.out.println(phone1);

        String caller = phone2.receiveCall("Anna");
        String caller1 = phone2.receiveCall("Anna", 56465494);
        phone1.sendMessage(6516191,16165161,848,1651,32184,21318,16321,13);
        int number = phone3.getNumber(116161);

    }
}
