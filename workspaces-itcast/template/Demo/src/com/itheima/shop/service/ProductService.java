package com.itheima.shop.service;

import java.util.List;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
import com.itheima.shop.dao.ProductDao;
import com.itheima.shop.entity.Category;
import com.itheima.shop.entity.PageBean;
import com.itheima.shop.entity.Product;

public class ProductService {
	private ProductDao productDao = new ProductDao();

	/*
	 * 查询热门商品
	 */
	public List<Product> findHotProduct() throws Exception {
		return productDao.findHotProduct();
	}

	/*
	 * 查询最新商品
	 */
	public List<Product> findNewProduct() throws Exception {
		return productDao.findNewProduct();
	}

	/*
	 * 根据类别分页查询所有的商品
	 */
	public PageBean<Product> findAllProductByCid(int cid, int currPageNO) throws Exception {
		PageBean<Product> pageBean = new PageBean<Product>();

		pageBean.setCurrPageNO(currPageNO);

		pageBean.setPerPageNO(6);

		int allRecordNO = productDao.getAllRecordNOByCid(cid);
		pageBean.setAllRecordNO(allRecordNO);

		int allPageNO = 0;
		if (pageBean.getAllRecordNO() % pageBean.getPerPageNO() == 0) {
			allPageNO = pageBean.getAllRecordNO() / pageBean.getPerPageNO();
		} else {
			allPageNO = pageBean.getAllRecordNO() / pageBean.getPerPageNO() + 1;
		}
		pageBean.setAllPageNO(allPageNO);

		int size = pageBean.getPerPageNO();
		int start = (pageBean.getCurrPageNO() - 1) * size;
		List<Product> productList = productDao.findAllProductByCid(cid, start, size);
		pageBean.setList(productList);

		return pageBean;
	}

	/*
	 * 根据商品编号查询商品详细信息
	 */
	public Product findProductByPid(int pid) throws Exception {
		Map<String, Object> map = productDao.findProductByPid(pid);
		Product product = new Product();
		Category category = new Category();
		BeanUtils.populate(product, map);
		BeanUtils.populate(category, map);
		product.setCategory(category);
		return product;
	}
}
