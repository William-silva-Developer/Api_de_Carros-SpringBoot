package com.alga.alga.api.assembler;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.alga.alga.api.dto.CarroDto;
import com.alga.alga.domain.model.Carro;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class CarroMapper {
	
	
	private ModelMapper modelMapper;
	
	
	public CarroDto toModel( Carro carro) {
		
		return modelMapper.map(carro, CarroDto.class);
	};

}
