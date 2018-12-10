package io.altar.repository;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import io.altar.model.Entity;
import io.altar.model.Product;
import io.altar.model.Shelf;

public class EntityRepository <T extends Entity> {
private Map <Long,T> mapa = new LinkedHashMap<Long, T>();
	

	//criar novo id		
	long novoId=0;	
	
	public void saveId(T newId) {
		newId.setId(novoId);
		mapa.put(newId.getId(), newId);
		novoId++;
	}
	
	
//consultar todas as entidades	
	public  Collection<T> consultAll() {
		return mapa.values();
		
	}
	
	
//consultar atraves do ID	
	public  T consultById(long id) {
	
		return mapa.get(id);
	}
	
// editar entidade
	public void editById(T prodOrShel) {
		mapa.replace(prodOrShel.getId(), prodOrShel);
	}
	
//remover entidades
	public  T removeById (long id) {
		return mapa.remove(id);
		
	}
	
	public Map<Long, T> getMap() {
		return mapa;
	}
	
	
}
