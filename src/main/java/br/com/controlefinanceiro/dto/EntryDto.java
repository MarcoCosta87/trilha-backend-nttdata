package br.com.controlefinanceiro.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntryDto {
	@NotBlank(message = "Campo nome não informado")
    @Min(value = 3) @Max(value = 45)
	private String name;
	
	@NotBlank(message = "Campo description não informado")
    @Min(value = 15) @Max(value = 150)
	private String description;
	
	@NotBlank(message = "Campo type não informado")
    @Min(value = 3) @Max(value = 10)
	private String type;
	
	@NotBlank(message = "Campo amount não informado")
	private double amount;
	
	@NotBlank(message = "Campo date não informado")
	private String date;
	
	@NotBlank(message = "Campo paid não informado")
	private boolean paid;

	

}
