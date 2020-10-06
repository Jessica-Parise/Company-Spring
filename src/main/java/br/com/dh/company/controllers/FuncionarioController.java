package br.com.dh.company.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.company.model.entities.Funcionario;
import br.com.dh.company.model.repositories.FuncionarioRepository;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping()
	public Iterable<Funcionario> getFuncionarios(){ 
		return funcionarioRepository.findAll();
	}
	
	@GetMapping("/{id}") 
	public Optional <Funcionario> getById(@PathVariable int id) { 
		return funcionarioRepository.findById(id); 
	}
	
	@PostMapping("/admit")
	public Funcionario addFuncionario(@RequestBody Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
		return funcionario;
	} 
	
	@PutMapping("dismiss/{idFunc}")
	public Funcionario updateHabilitado(@PathVariable int idFunc, @RequestBody Funcionario dadosFunc) throws Exception{
		
		Funcionario funcDB = funcionarioRepository.findById(idFunc)
				.orElseThrow(() -> new IllegalAccessException());
		
		if(funcDB.getPermissao()!= 0)funcDB.setPermissao(dadosFunc.getPermissao());
		
		funcionarioRepository.save(funcDB); 
		
		return funcDB;
	}
	
	@PutMapping("salary/{idFunc}")
	public Funcionario updateSalario(@PathVariable int idFunc, @RequestBody Funcionario dadosFunc) throws Exception{
		
		Funcionario funcDB = funcionarioRepository.findById(idFunc)
				.orElseThrow(() -> new IllegalAccessException());
		if(dadosFunc.getSalario()>funcDB.getSalario())funcDB.setSalario(dadosFunc.getSalario());
		
		funcionarioRepository.save(funcDB); 
		
		return funcDB;
	}
	
}
