package lang.reflect;

public class InheritanceCheck {

	/**
	 * Проверка иерархии классов во время выполнения
	 *  
	 * @param clazz1
	 * @param clazz2
	 * @return
	 */
	public boolean classHierarchyCheck(Class<?> clazz1, Class<?> clazz2) {
		return clazz1.isAssignableFrom(clazz2);
	}
	
}
