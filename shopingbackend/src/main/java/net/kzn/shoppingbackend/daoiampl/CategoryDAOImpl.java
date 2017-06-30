package net.kzn.shoppingbackend.daoiampl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	//@Autowired
	//private SessionFactory sessionFactory;
	
	
	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// add first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("Description for television");
		category.setImageURL("CAT_1.png");
		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Description for Mobile");
		category.setImageURL("CAT_2.png");
		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Description for laptop");
		category.setImageURL("CAT_3.png");
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
			
		//enhance for loop
		for(Category category:categories){
			if(category.getId()==id) return category;		
			
		}
		return null;
		
	}

	@Override
	@Transactional
	public boolean add(Category category) {
		try{
			//add the category to the database table
		//	sessionFactory.getCurrentSession().persist(category);
			return true;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
		
	}

}
