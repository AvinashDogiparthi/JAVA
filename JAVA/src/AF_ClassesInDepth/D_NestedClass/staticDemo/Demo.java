package AF_ClassesInDepth.D_NestedClass.staticDemo;

public class Demo {
    public static void main(String[] args) {
        Dinner dinner = new Dinner.DinnerBuilder()
                .setAvinash("Avinash")
                .setAdithya("Adithya")
                .setHarikiran("Harikiran")
                .setVinay("Vinay")
                .setDeepak("Deepak")
                .setDhanush("Dhanush")
                .build();

        System.out.println(dinner);
    }
}
