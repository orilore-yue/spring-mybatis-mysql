package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;

public class GoodBiz implements IGoodBiz{
	private GoodMapper mapper;
	public GoodMapper getMapper() {
		return mapper;
	}
	public void setMapper(GoodMapper mapper) {
		this.mapper = mapper;
	}
	@Override
	public void addGood(Good bean) {
		mapper.insert(bean);
	}
	@Override
	public void removeGood(int id) {
		mapper.delete(id);
	}
	@Override
	public void modifyGood(Good bean) {
		mapper.update(bean);
	}
	@Override
	public Good getGood(int id) {
		return mapper.selectOne(id);
	}
	@Override
	public List<Good> findGood() {
		return mapper.select();
	}
}
