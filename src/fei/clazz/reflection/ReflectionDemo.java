package fei.clazz.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * java reflect
 * @author fzh
 *
 */
public class ReflectionDemo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException {
		Class<?> clz = Class.forName("fei.clazz.reflection.RefObj");
		Object obj = clz.newInstance();
		Method setMethod = clz.getMethod("setName", String.class);
		setMethod.invoke(obj, "feizhang");
		Method getMethod = clz.getMethod("getName");
		Object o = getMethod.invoke(obj);
		String res = o.toString();
		
		System.out.println(res);
		
	}

}
