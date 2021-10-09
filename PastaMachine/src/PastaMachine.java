public class PastaMachine implements OrderState {
    private OrderState orderstate;
    private String pizzatype;
    private String baseflour;
    private String shape;
    private int size;
    private int pizzacount;


    public PastaMachine(){
        orderstate = new MakeandPreparingState();
    }
    public OrderState getOrderstate(){
        return orderstate;
    }
    public void setOrderstate(OrderState orderstate){
        this.orderstate = orderstate;
    }

    @Override
    public void openOrder() {
        orderstate.openOrder();
        if (orderstate instanceof MakeandPreparingState)
        {
            OrderState openstate = new OpenState();
            setOrderstate(openstate);

        }
    }

    public void cancelOrder() {
        orderstate.cancelOrder();
        if (orderstate instanceof CancelandDiscardState){
            OrderState cancelanddiscardstate = new CancelandDiscardState();
            setOrderstate(cancelanddiscardstate);
        }
    }


    public void DoorDashOpenOrder() {
        orderstate.DoorDashOpenOrder();
        if (orderstate instanceof MakeandPreparingState){
            OrderState doordashopenorder = new MakeandPreparingState();
            setOrderstate(doordashopenorder);
        }
    }


    public void DoorDashCancelOrder() {
        orderstate.DoorDashCancelOrder();
        if (orderstate instanceof CancelandDiscardState){
            OrderState doordashcancelorder = new CancelandDiscardState();
            setOrderstate(doordashcancelorder);

        }
    }

    public PastaMachine(String pizzatype, String baseflour, String shape, int size, int pizzacount) {
        super();
        this.pizzatype = pizzatype;
        this.baseflour = baseflour;
        this.shape = shape;
        this.size = size;
        this.pizzacount = pizzacount;
    }
    @Override
    public String toString(){
        return "PastaMachine [ pizzatype= " + pizzatype + ", baseflour= " +baseflour + ", shape= "+shape +",size= "+size+",pizzacount= " +pizzacount+"]";
    }
}
