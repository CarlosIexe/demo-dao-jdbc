package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		// TESTANDO INSERT
		// departmentDao.insert(newDepartment);Department newDepartment = new
		// Department(null, "Movies");

		// TESTANDO UPDATE!
		/*
		 * Department newDepartment = new Department(null, "Grosseries"); newDepartment
		 * = departmentDao.findById(1); newDepartment.setName("Games");
		 * departmentDao.update(newDepartment);
		 * 
		 * System.out.println("Updated");
		 */

	
		List<Department> result = departmentDao.findAll();

		for (Department sel : result) {
			System.out.println(sel.toString());

		}

	}
}