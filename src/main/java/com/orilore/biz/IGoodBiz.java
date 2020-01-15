package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IGoodBiz{
	public void addGood(Good good);
	public void removeGood(int id);
	public void modifyGood(Good good);
	public Good getGood(int id);
	public List<Good> findGood();
}