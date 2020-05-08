package revisionall;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
       Customer maria =  new Customer("Biki",  "7682068818");

        // Normal Method Calling
        greetCustomer(maria);

        greetCustomerConsumer.accept(maria);

        // Calling ByConsumerFunction
        greetCustomerConsumerV2.accept(maria,false);

        // Calling normal function
        setGreetCustomerConsumerV2(maria,true);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) ->
                    System.out.println("Hello" +
                            customer.customerName +
                            ", thanks for registering "
                            + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));

    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello" +
                    customer.customerName +
                    ", thanks for registering "
                    + customer.customerPhoneNumber);


    static void greetCustomer(Customer customer){
        System.out.println("Hello" +
                customer.customerName +
                ", thanks for registering "
                + customer.customerPhoneNumber);
    }
    static void setGreetCustomerConsumerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello" +
                customer.customerName +
                ", thanks for registering "
                + (showPhoneNumber ? customer.customerPhoneNumber : "**********"));
    }


    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                    '}';
        }
    }
}
