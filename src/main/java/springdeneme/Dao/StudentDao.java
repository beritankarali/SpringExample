package springdeneme.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import springdeneme.Entity.Student;
@Repository
public class StudentDao {

	private static Map<Integer, Student> students;
	static {
		
		    students = new HashMap<Integer, Student>(){
		    	{ 	
			put(1, new Student(1, "Taner","Bilgisayar"));
			put(2, new Student(2, "Melih", "İnşaat"));
			put(3, new Student(3, "Can","Yazılım"));
			
		}
	};
	
   }
	
	public Collection<Student> getAllStudents(){
		return this.students.values();
	}
	
	public Student getStudentById(int id) {
		return this.students.get(id);
	}
	
}
