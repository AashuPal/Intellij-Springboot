package in.aashu;

import in.aashu.entity.Account;
import in.aashu.entity.AccountPk;
import in.aashu.repository.AccountRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class DataJpaCompositeKeyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DataJpaCompositeKeyApplication.class, args);
        AccountRepository accountRepository = context.getBean(AccountRepository.class);

        // Create a new AccountPk object
        AccountPk accountPk1 = new AccountPk(1, "Savings", 123456789L);
        AccountPk accountPk2 = new AccountPk(2, "Savings", 123453789L);
        AccountPk accountPk3 = new AccountPk(3, "Finance", 123455789L);
        AccountPk accountPk4 = new AccountPk(4, "Savings", 123452789L);
        AccountPk accountPk5 = new AccountPk(5, "Finance", 123451789L);
        AccountPk accountPk6 = new AccountPk(6, "Savings", 123454789L);

        // Create new Account objects
        Account account1 = new Account("John Doe", "New York", accountPk1);
        Account account2 = new Account("Jane Smith", "Los Angeles", accountPk2);
        Account account3 = new Account("Alice Johnson", "Chicago", accountPk3);
        Account account4 = new Account("Bob Brown", "Houston", accountPk4);
        Account account5 = new Account("Charlie White", "Phoenix", accountPk5);
        Account account6 = new Account("David Green", "Philadelphia", accountPk6);
        // Save the accounts to the database
        List<Account> list = Arrays.asList(account1, account2, account3, account4, account5, account6);
        accountRepository.saveAll(list);

        // Retrieve all accounts from the database

        List<Account> accounts = accountRepository.findAll();
        // Print the accounts
        System.out.println("Accounts with holder name:");
        for (Account account : accounts) {
            System.out.println(account);
        }


    }

}
