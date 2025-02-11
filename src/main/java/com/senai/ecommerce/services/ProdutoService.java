package com.senai.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.senai.ecommerce.dto.ProdutoDTO;
import com.senai.ecommerce.entities.Produto;
import com.senai.ecommerce.repositories.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repo;

    // Busca todos os produtos
    public List<ProdutoDTO> buscarTodos() {
        List<Produto> list = repo.findAll();
        return list.stream().map(x -> new ProdutoDTO(x)).toList();
    }

    // Busca produtos com pagina
    public Page<ProdutoDTO> buscarPagina(Pageable pagina) {
        Page<Produto> result = repo.findAll(pagina);
        return result.map(x -> new ProdutoDTO(x));
    }

    // Cria um novo produto
    public ProdutoDTO criarProduto(ProdutoDTO produtoDTO) {
        // Converte o DTO para a entidade Produto
        Produto produto = new Produto();
        produto.setNome(produtoDTO.getNome());
        produto.setPreco(produtoDTO.getPreco());

        // Salva o produto no banco
        Produto produtoSalvo = repo.save(produto);

        // Retorna o produto salvo como DTO
        return new ProdutoDTO(produtoSalvo);
    }
}