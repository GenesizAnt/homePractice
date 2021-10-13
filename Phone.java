package exerciseExamclouds.lessonOOP;

public class Phone {

    private int number;
    private String model;
    private int weight;
    private String callerName;
    private int callerNumber;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone: " +
                "number = " + number +
                ", model = " + model +
                ", weight = " + weight;
    }

    public String receiveCall (String callerName) {
         return "Звонит " + callerName;
    }

    public String receiveCall (String callerName, int callerNumber) {
        return "Звонит " + callerName + ", по номеру " + callerNumber;
    }

    public int getNumber (int callerNumber) {
         return callerNumber;
    }

    public static void sendMessage (int callerNumber, int...vars) {
        for (int i : vars) {
            System.out.println("Номер для отправки сообщения - " + i);
        }
    }

}
