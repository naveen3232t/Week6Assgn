public class PastaFactory {
    public static void main(String args[]){
        PastaMachine p = new PastaMachineBuilder().setBaseflour("null").setPizzatype("null").setShape("null").setSize(0).setPizzacount(0);
        System.out.println(p);


    }
}
