package com.alga.alga.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alga.alga.domain.model.Carro;
import com.alga.alga.domain.repository.CarroRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/carro")
@AllArgsConstructor
public class CarroController {
	
	private CarroRepository carroRepor;
	
	
	@GetMapping
	public List<Carro> GetList(){
		return carroRepor.findAll();
	};
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Carro> GetById( @PathVariable("id") Long id){
		return carroRepor.findById(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	};
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Carro InsertCar(@Valid @RequestBody Carro carro){
		return carroRepor.save(carro);
	};
	
	@PutMapping("/{id}")
	public ResponseEntity<Carro> Update(@PathVariable Long id, @Valid @RequestBody Carro carro){
		
		if(!carroRepor.existsById(id)) {
			
			return ResponseEntity.notFound().build();
		}
		carro.setId(id);
		carro = carroRepor.save(carro);
		return ResponseEntity.ok(carro);
		
		
	};
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> DeleteCar(@PathVariable Long id){
		
		if(!carroRepor.existsById(id)) {
			ResponseEntity.notFound().build();
		}
		
		carroRepor.deleteById(id);
		return ResponseEntity.noContent().build();
		
	};
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
