package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idCategoria;
	private String nome;

	private List<Produto> produtos = new ArrayList<Produto>();

	public Categoria() {

	}

	public Categoria(Integer idCategoria, String nome) {
		super();
		this.idCategoria = idCategoria;
		this.nome = nome;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCategoria;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (idCategoria != other.idCategoria)
			return false;
		return true;
	}
}
