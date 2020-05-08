package combinator;

import java.time.LocalDate;

import static combinator.CustomerRegistrationValidator.isEmailValid;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Arun",
                "arunjena@gmail.com",
                "+917682068818",
                LocalDate.of(2000,1,1)
        );
//        System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid We can store customer in db

        // Using combinator pattern
        CustomerRegistrationValidator.ValidationResult result = isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer);
        System.out.println(result);
        if (result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }



    }
}
