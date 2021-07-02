package caio.caminha.RegionalServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import caio.caminha.RegionalServer.dto.RegionalDto;
import caio.caminha.RegionalServer.model.Regional;
import caio.caminha.RegionalServer.repository.RegionalRepository;

@Service
public class RegionalService {
	@Autowired
	private RegionalRepository regionalRepository;
	
	public List<Regional> getAllRegionais() {
		return this.regionalRepository.findAll();
	}
	
	public RegionalDto getRegionalByBairro(String bairro){
		Regional regional = this.regionalRepository.findByBairro(bairro);
		return new RegionalDto(regional);
	}
	
	public List<Regional> getRegionalByRegional(String regional){
		return this.regionalRepository.findByRegional(regional);
	}
}
