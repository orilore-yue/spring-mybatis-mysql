package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface GoodMapper{
	public void insert(Good bean);
	public Good selectOne(int id);
	public void delete(int id);
	public List<Good> select();
	public void update(Good bean);
}