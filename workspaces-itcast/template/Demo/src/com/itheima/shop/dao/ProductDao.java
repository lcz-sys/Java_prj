package com.itheima.shop.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import com.itheima.shop.entity.Category;
import com.itheima.shop.entity.Product;
import com.itheima.shop.util.JdbcUtil;

public class ProductDao {
	private QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
	/**
	 * 查询前12条所有热门商品
	 */
	public List<Product> findHotProduct() throws SQLException {
		String sql = "select * from tab_product where is_hot=1 and pflag=1 order by pid asc limit 0,12";
		Object[] params = null;
		return runner.query(sql,new BeanListHandler<>(Product.class),params);
	}
	/**
	 * 查询前12条所有最新商品
	 */
	public List<Product> findNewProduct() throws SQLException {
		String sql = "select * from tab_product where pflag=1 order by pdate desc limit 0,12";
		Object[] params = null;
		return runner.query(sql,new BeanListHandler<>(Product.class),params);
	}
	/**
	 * 根据类别获取商品总记录数
	 */
	public int getAllRecordNOByCid(int cid) throws SQLException {
		String sql = "select count(pid) from tab_product where cid=?";
		Object[] params = {cid};
		Long temp = (Long) runner.query(sql,new ScalarHandler(),params);
		return temp.intValue();
	}
	/**
	 * 根据类别获取页面内容
	 */
	public List<Product> findAllProductByCid(int cid, int start, int size) throws SQLException {
		String sql = "select * from tab_product where cid=? order by pid asc limit ?,?";
		Object[] params = {cid,start,size};
		return runner.query(sql,new BeanListHandler<>(Product.class),params);
	}
	/**
	 * 根据商品编号查询商品详细信息
	 */
	public Map<String,Object> findProductByPid(int pid) throws SQLException {
		String sql = "select * from tab_product p , tab_category c where p.cid = c.cid and pid = ?";
		Object[] params = {pid};
		return runner.query(sql,new MapHandler(),params);
	}
}
