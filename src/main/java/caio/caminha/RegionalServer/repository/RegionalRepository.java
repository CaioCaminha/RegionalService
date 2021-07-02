package caio.caminha.RegionalServer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import caio.caminha.RegionalServer.model.Regional;

public interface RegionalRepository extends JpaRepository<Regional, Long>{
	Regional findByBairro(String bairro);
	List<Regional> findByRegional(String regional);
}
