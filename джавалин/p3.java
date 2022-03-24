public class p3 {
    public static void main(String[] args) {
        if (args.length == 2) {
            System.out.print("\t"+ args[0] +" + "+ args[1] +" = "+ (Integer.parseInt(args[0])+Integer.parseInt(args[1])));
        }
        else {
            System.out.print("\tÍåâåðíîå êîëè÷åñòâî ïàðàìåòðîâ.");
        }
    }
};