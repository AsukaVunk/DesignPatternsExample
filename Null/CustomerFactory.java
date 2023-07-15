package Null;

public class CustomerFactory {
    public static final String[] names = {"Rob","Joe","Julie"};
    public static AbstractCustomer getCustomer(String name){
        for(String na:names) {
            if(na.equalsIgnoreCase(name)) return new RealCustomer(name);
        }
        return new NullCustomer();
    }
}
