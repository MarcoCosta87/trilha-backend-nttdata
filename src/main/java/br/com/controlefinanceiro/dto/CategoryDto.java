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
public class CategoryDto {

	@NotBlank(message = "Campo nome não pode ser nulo e nem vazio")
    @Min(value = 3) @Max(value = 15)
	private String name;
	@NotBlank(message = "Campo discrição não pode ser nulo e nem vazio")
    @Min(value = 15) @Max(value = 50)
	private String description;

}