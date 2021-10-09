public class PastaFactory {
    public static void main(String args[]){
        PastaMachine p = new PastaMachineBuilder().setBaseflour("").setPizzatype("").setShape("").setSize(0).setPizzacount(0);
        System.out.println(p);


    }
}
