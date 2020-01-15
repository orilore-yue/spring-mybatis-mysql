import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orilore.biz.IKindBiz;
import com.orilore.model.Good;
import com.orilore.model.Kind;

public class Test {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
		IKindBiz biz = app.getBean(IKindBiz.class);
//		Kind kind = biz.getKind(1);
//		System.out.println(kind.getName());
//		List<Good> list = kind.getGoods();
//		for (Good good : list) {
//			System.out.println(good.getGname());
//		}
		Kind k1 = new Kind("AAAA");
		Kind k2 = new Kind("BBBB");
		Kind k3 = new Kind("CCCC");
		Kind k4 = new Kind("DDDD");
//		Kind k5 = new Kind("EEEEEEE");
		List<Kind> kinds = new ArrayList<>();
		kinds.add(k1);
		kinds.add(k2);
		kinds.add(k3);
		kinds.add(k4);
//		kinds.add(k5);
		
		biz.saveKinds(kinds);
	}

}
