package fr.fms;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ClientRepository;
import fr.fms.dao.TransactionRepository;
import fr.fms.dao.BankAccountRepository;
import fr.fms.entities.BankAccount;
import fr.fms.entities.Client;

@SpringBootApplication
public class MongoBanqueJpaApplication implements CommandLineRunner {
	@Autowired
	private BankAccountRepository bankAccountRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private TransactionRepository transactionRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoBanqueJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		for (Client client : clientRepository.findByLastname("client")) {
			System.out.println(client);
		}
		/*
		 * Find an article by description
		 */
		// for (Client client : clientRepository.findByLastnameAndFirstname("client",
		// "Ipad")) {
		System.out.println(clientRepository.findByLastnameAndFirstname("client", "Ipad"));
		// }
	}

}
