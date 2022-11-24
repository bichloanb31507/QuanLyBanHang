package com.team5.quanlybanhang.service;

import java.util.List;

public interface BaseService<T> {

	public List<T> getAll();

	public void saveOrUpdate(T object);

	public T get(int id);

	public void delete(int id);
}
