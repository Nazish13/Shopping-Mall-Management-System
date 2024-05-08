package com.shopping;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ShoppingMallService 
{
@Autowired
private ShoppingMallRepository repo;

public List<ShoppingMallEntity> listAll() {
return repo.findAll();
	}

public ShoppingMallEntity get(Integer id) {
return repo.findById(id).get();
}
public void save(ShoppingMallEntity shop) { 
repo.save(shop);	
}
public void delete(Integer id) {
repo.deleteById(id);
}
}
