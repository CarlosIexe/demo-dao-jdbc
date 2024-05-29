package application;

<<<<<<< HEAD
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
=======
import model.dao.DaoFactory;
import model.dao.SellerDao;
>>>>>>> 06f615c7ae6402bf86c995c3b8b1296670f8ee07
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();

<<<<<<< HEAD
		/*System.out.println("=====>/TESTANDO FIND BY ID/<=====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller.toString());
*/
		System.out.println("=====>/TESTANDO FIND BY DEPARTMENT/<=====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller sel : list) {
			System.out.println(sel.toString());
		}
=======
		Seller seller = sellerDao.findById(8);

		System.out.println(seller.toString());
>>>>>>> 06f615c7ae6402bf86c995c3b8b1296670f8ee07
	}

}
