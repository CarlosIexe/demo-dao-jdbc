package model.dao;

import java.util.List;

<<<<<<< HEAD
import model.entities.Department;
=======
>>>>>>> 06f615c7ae6402bf86c995c3b8b1296670f8ee07
import model.entities.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void deleById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
<<<<<<< HEAD
	List<Seller> findByDepartment(Department department);
=======
>>>>>>> 06f615c7ae6402bf86c995c3b8b1296670f8ee07
}
