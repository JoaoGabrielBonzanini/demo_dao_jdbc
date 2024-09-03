package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("FindByID");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		
		System.out.println("\n FindALL ");
		List<Department> departmentList = departmentDao.findAll();
		for(Department dep1 : departmentList) {
			System.out.println(dep1);
		}
		
//		System.out.println("\n Insert");
//		Department newDepartment = new Department(null, "Shenenigans");
//		departmentDao.insert(newDepartment);
		
		
		System.out.println("\n Update");
		Department updateDepartment = departmentDao.findById(7);
		updateDepartment.setName("Security");
		departmentDao.update(updateDepartment);
		System.out.println("Up to date.");

	}

}
