package com.alga.alga.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.alga.alga.api.dto.CarroDto;
import com.alga.alga.domain.model.Carro;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class CarroMapper {
	
	
	private ModelMapper modelMapper;
	
	
	public List<CarroDto> toCarroDTO(List<Carro> carros){
		return carros.stream()
				.map(this:: toModel)
				.collect(Collectors.toList());
		
	};
	
	public CarroDto toModel( Carro carro) {
		
		return modelMapper.map(carro, CarroDto.class);
	};
	
	
	

}
