package springdeneme.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springdeneme.Dao.StudentDao;
import springdeneme.Entity.Student;


@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;

	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}
	
}
