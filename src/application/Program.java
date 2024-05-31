package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();

		/*
		 * System.out.println("=====>/TESTANDO FIND BY ID/<====="); Seller seller =
		 * sellerDao.findById(3); System.out.println(seller.toString());
		 */
		/*
		 * System.out.println("=====>/TESTANDO FIND BY DEPARTMENT/<====="); Department
		 * department = new Department(2, null); List<Seller> list =
		 * sellerDao.findByDepartment(department);
		 * 
		 * for (Seller sel : list) { System.out.println(sel.toString()); }
		 */

		/*
		 * System.out.println("=====>/TESTANDO FIND ALL/<====="); List<Seller> list =
		 * sellerDao.findAll(); for (Seller obj : list) {
		 * System.out.println(obj.toString()); }
		 */

		/*System.out.println("=====>/TESTANDO INSERT/<=====");
		Department department = new Department(2, null);
		Seller newSeller = new Seller(null, "Antônio", "antonio@gmail.com", new Date(), 3000.0, department);

		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+newSeller.getId());*/
		
		/*System.out.println("=====>/TESTANDO UPDATE/<=====");
		Department department = new Department(2, null);
		Seller newSeller = new Seller(null, "Antônio", "antonio@gmail.com", new Date(), 3000.0, department);
		
		newSeller = sellerDao.findById(1);
		newSeller.setName("Maria Gonzaga");
		sellerDao.update(newSeller);
		System.out.println("Update completed!");*/
		
		System.out.println("=====>/TESTANDO DELETE/<=====");
		int id = 15;
		
		sellerDao.deleById(id);
		List<Seller> result = sellerDao.findAll();
		
		for(Seller sel : result) {
			System.out.println(sel.toString());
		}
	}

}
