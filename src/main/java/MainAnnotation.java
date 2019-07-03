import annotation.Column;
import annotation.Student;
import annotation.Table;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainAnnotation {
	public static void main(String[] args) throws Exception{
		Student student = new Student();
		student.setId("001");
		student.setName("jack");
		System.out.println(query(student));
	}

	public static String query(Student student) throws Exception{
		StringBuilder sb = new StringBuilder();
		Class<?> clazz = Student.class;
		boolean tableAnnoExits = clazz.isAnnotationPresent(Table.class);
		if(!tableAnnoExits){
			return null;
		}
		Table tableAnno = clazz.getAnnotation(Table.class);
		String tableName = tableAnno.value();
		sb.append("select * from "+ tableName + " where 1 = 1 ");

		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields){
			boolean columnAnnoExits = field.isAnnotationPresent(Column.class);
			if(!columnAnnoExits){
				continue;
			}
			Column column = field.getAnnotation(Column.class);
			String columnName = column.value();
			String fieldName = field.getName();
			String getMethodName = "get" + fieldName.substring(0,1).toUpperCase() + fieldName.substring(1);
			Method method = clazz.getMethod(getMethodName,null);
			Object fieldValue = method.invoke(student);
			if(fieldValue == null || (fieldValue instanceof Integer && (Integer)fieldValue == 0)){
				continue;
			}
			sb.append("and ").append(columnName).append("=");
			if (fieldValue instanceof String) {
				sb.append("'").append(fieldValue).append("'");
			} else if (fieldValue instanceof Integer) {
				sb.append(fieldValue);
			}
		}
		return sb.toString();
	}
}
