package caio.caminha.RegionalServer.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Page;

import caio.caminha.RegionalServer.model.Regional;
import lombok.Data;

public class RegionalDto {
	@NotNull @NotEmpty
	private Long id;
	@NotNull @NotEmpty
	private String bairro;
	@NotNull @NotEmpty
	private String regional;

	public RegionalDto() {}
	
	public RegionalDto(Regional regional) {
		this.id = regional.getId();
		this.bairro = regional.getBairro();
		this.regional = regional.getRegional();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}
	
	
	
	
}
