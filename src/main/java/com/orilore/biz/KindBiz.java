package com.orilore.biz;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;

public class KindBiz implements IKindBiz{
	private KindMapper mapper;
	public KindMapper getMapper() {
		return mapper;
	}
	public void setMapper(KindMapper mapper) {
		this.mapper = mapper;
	}
	@Override
	public void addKind(Kind bean) {
		mapper.insert(bean);
	}
	@Override
	public void removeKind(int id) {
		mapper.delete(id);
	}
	@Override
	public void modifyKind(Kind bean) {
		mapper.update(bean);
	}
	@Override
	public Kind getKind(int id) {
		return mapper.selectOne(id);
	}
	@Override
	public List<Kind> findKind() {
		return mapper.select();
	}
	@Override
	public void saveKinds(List<Kind> kinds) {
		for (Kind kind : kinds) {
			mapper.insert(kind);
		}
	}
}
