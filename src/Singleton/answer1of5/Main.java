package Singleton.answer1of5;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        TicketMaker ticketMaker1 = TicketMaker.getInstance();
        TicketMaker ticketMaker2 = TicketMaker.getInstance();
        if (ticketMaker1 == ticketMaker2){
            System.out.println("两个TicketMaker是相同实例");
        }else {
            System.out.println("两个TicketMaker不是相同实例");
        }
        System.out.println("End.");
    }
}
