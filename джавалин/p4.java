package p4;

public class p4 {
    public static void main(String[] args) {
        String log;
        String pass;

        log = "u1";
        pass = "p1";

        if ((log.equals(args[0])) & (pass.equals(args[1]))) {
            System.out.print("\t\tÂàñ óçíàëè. Äîáðî ïîæàëîâàòü!");
        }
        else {
            System.out.print("\t\tËîãèí è ïàðîëü íå ðàñïîçíàíû. Äîñòóï çàïðåù¸í.");
        }

    }
}