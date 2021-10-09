import java.util.*;
public class PastaMachineBuilder extends PastaMachine {
    private String pizzatype;
    private String baseflour;
    private String shape;
    private int size;
    private int pizzacount;

    public PastaMachineBuilder setPizzatype(String pizzatype) {
        this.pizzatype = pizzatype;
        return this;
    }

    public PastaMachineBuilder setBaseflour(String baseflour) {
        this.baseflour = baseflour;
        return this;
    }

    public PastaMachineBuilder setShape(String shape) {
        this.shape = shape;
        return this;
    }

    public PastaMachineBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public PastaMachineBuilder setPizzacount(int pizzacount) {
        this.pizzacount = pizzacount;
        return this;
    }
    public PastaMachine getPastaMachine(){
        return new PastaMachine(pizzatype, baseflour, shape,size,pizzacount );
    }
}
