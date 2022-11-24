package com.team5.quanlybanhang.repository;

import java.util.List;

public interface BaseRepository<T> {

	public List<T> getAll();

	public void saveOrUpdate(T object);

	public T getById(int id);

	public void deleteById(int id);
}
