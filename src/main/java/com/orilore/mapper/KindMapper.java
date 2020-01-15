package com.orilore.mapper;
import java.util.List;
import com.orilore.model.*;
public interface KindMapper{
	public void insert(Kind bean);
	public Kind selectOne(int id);
	public void delete(int id);
	public List<Kind> select();
	public void update(Kind bean);
}