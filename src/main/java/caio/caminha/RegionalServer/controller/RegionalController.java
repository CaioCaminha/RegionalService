package caio.caminha.RegionalServer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import caio.caminha.RegionalServer.dto.RegionalDto;
import caio.caminha.RegionalServer.model.Regional;
import caio.caminha.RegionalServer.service.RegionalService;

@RestController
@RequestMapping("/info")
public class RegionalController {

	@Autowired
	private RegionalService regionalService;
	
	@GetMapping
	public List<Regional> getAll(){
		return this.regionalService.getAllRegionais();
	}
	
	@GetMapping("/bairro/{bairro}")
	public ResponseEntity<RegionalDto> getRegionalByBairro(@PathVariable("bairro") String bairro){
		return ResponseEntity.ok(this.regionalService.getRegionalByBairro(bairro));
	}
	
	@GetMapping("/regional/{regional}")
	public ResponseEntity<List<Regional>> getRegionalByRegional(@PathVariable("regional") String regional){
		return ResponseEntity.ok(this.regionalService.getRegionalByRegional(regional));
	}
	
}
