package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Producto;

public interface AgregarAlCArroDao {
	
	List<Producto> consultarProductoPorId(Long id);

}
