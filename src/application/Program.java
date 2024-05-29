package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();

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
	}

}