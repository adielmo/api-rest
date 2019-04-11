package com.produtos.apirest.resources;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;
import com.produtos.apirest.service.ProdutoService;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ProdutoService produtoService;
	
	
	@GetMapping
	public List<?> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPeloCodigo(@PathVariable long id) {

		Optional<Produto> pp = produtoRepository.findById(id);

		return pp.isPresent() ? ResponseEntity.ok(pp) : ResponseEntity.notFound().build();

	}

	@GetMapping("/retorna/{nome}")
	public Produto buscarPeloNome(@PathVariable String nome){
		return produtoRepository.findByNomeIgnoreCase(nome);
	}
	
	@PostMapping
	public ResponseEntity<Produto> salvarProduto(@RequestBody @Valid Produto produto){
		Produto produtoCodigo = produtoRepository.save(produto);
		
		return ResponseEntity.ok(produtoCodigo);
	}
	
	
	@DeleteMapping("/produto")
	public void excluirProduto(@RequestBody Produto produto){
		 produtoRepository.delete(produto);		
		
	}
	
	@DeleteMapping("/{id}")
	public void excluirProduto(@PathVariable Long id){
		 produtoRepository.deleteById(id);
		
	}

/*@PutMapping("/{codigo}")
public ResponseEntity<Produto> editar(@PathVariable long codigo, @Valid @RequestBody Produto produto){
	
	Produto pessoaSalva = produtoService.atualizar(codigo, produto);
	return ResponseEntity.ok(pessoaSalva);
}*/
	
	/*@PutMapping("/{produto}")
	public ResponseEntity<Produto> editarProduto(@Valid @RequestBody Produto produto){
		
		Produto prodAtualizar =produtoRepository.save(produto);
		return ResponseEntity.ok(prodAtualizar);	

	}*/
	
	
/*	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_PESSOA')and #oauth2.hasScope('write')")
	public ResponseEntity<Pessoa> atualizar(@PathVariable Long codigo, @Valid @RequestBody Pessoa pessoa) {

		Pessoa pessoaSalva = pessoaService.atualizar(codigo, pessoa);
		return ResponseEntity.ok(pessoaSalva);

	}*/
	
	
/*@ApiOperation(value="Deleta um produto")
@DeleteMapping("/produto")
public void deletaProduto(@RequestBody @Valid Produto produto) {
	produtoRepository.delete(produto);
}

@ApiOperation(value="Atualiza um produto")
@PutMapping("/produto")
public Produto atualizaProduto(@RequestBody @Valid Produto produto) {
	return produtoRepository.save(produto);
}*/


}
