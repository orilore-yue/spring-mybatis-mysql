package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IKindBiz{
	public void addKind(Kind kind);
	public void removeKind(int id);
	public void modifyKind(Kind kind);
	public Kind getKind(int id);
	public List<Kind> findKind();
	public void saveKinds(List<Kind> kinds);
}