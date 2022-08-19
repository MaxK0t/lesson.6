package by.academy.lesson6;

public class Main {
    public static void main(String[] args) {
        robotDo();

    }
    public static void robotDo() {
        Robot robot1 = new Robot("Bob");
        Robot robot2 = new Robot("Dob");
        Robot robot3 = new Robot("Gob");

        Robot robot4 = new Robot("lob");
        Robot robot5 = new Robot("hob");
        Robot robot6 = new Robot("pob");

        Robot robot7 = new Robot("qob");
        Robot robot8 = new Robot("rob");
        Robot robot9 = new Robot("xob");

        Head head1 = Head.HEAD1;
        Head head2 = Head.HEAD2;
        Head head3 = Head.HEAD3;

        String headR1 = head1.getTypeHead();
        String headR2 = head2.getTypeHead();
        String headR3 = head3.getTypeHead();

        Body body1 = Body.BODY1;
        Body body2 = Body.BODY2;
        Body body3 = Body.BODY3;

        String bodyR1 = body1.getType();
        String bodyR2 = body2.getType();
        String bodyR3 = body3.getType();


        System.out.println(headR1 + " " + bodyR1 +  " " + robot1.name);
        System.out.println(headR2 + " " + bodyR2 +  " " + robot2.name);
        System.out.println(headR3 + " " + bodyR3 +  " " + robot3.name);

        System.out.println(headR1 + " " + bodyR2 +  " " + robot4.name);
        System.out.println(headR2 + " " + bodyR3 +  " " + robot5.name);
        System.out.println(headR3 + " " + bodyR1 +  " " + robot6.name);

        System.out.println(headR1 + " " + bodyR3 +  " " + robot7.name);
        System.out.println(headR2 + " " + bodyR1 +  " " + robot8.name);
        System.out.println(headR3 + " " + bodyR2 +  " " + robot9.name);
    }
}
