package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.produtos.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	/*Produto findById(long codigo);*/
	Produto findByNomeIgnoreCase(String nome);
	
	/*@Query("UPDATE produto p SET p.coluna=:coluna WHERE p.id=:id")
	public void editarProd(@Param("id")long id, @Param("coluna")String coluna);*/
	
	/*@Modifying
	@Transactional(readOnly = false)
	@Query("delete from produto p where p.id like ?1")
	int deleteById(long id);
	
	@Modifying 
	@Transactional(readOnly = false)
	@Query("update User u set u.age = ?1 where u.id = ?2")
	int updateAge(Integer age, Long id);*/
	

}
