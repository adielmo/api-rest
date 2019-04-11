package com.produtos.apirest.service;

import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	/*public Produto atualizar(long codigo, Produto produto){		
		 Produto prodSalva = buscarPessoaPeloCodigo(codigo);
		
		 
		 BeanUtils.copyProperties(produto, prodSalva, "codigo");
	
		 return produtoRepository.save(prodSalva);
	}
	
	public Produto buscarPessoaPeloCodigo(long codigo) {
		Produto prodSalva = produtoRepository.findById(codigo);
		 
		 if (prodSalva == null) {
			 throw new EmptyResultDataAccessException(1);
			 
			
		}
		return prodSalva;
	}*/

}
