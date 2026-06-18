package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
	public List<Client> findByLastname(String lastname);

	public List<Client> findByFirstname(String firstname);

	public List<Client> findByLastnameAndFirstname(String lastname, String firstname);
}
