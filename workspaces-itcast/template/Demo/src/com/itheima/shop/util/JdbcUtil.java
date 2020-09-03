package com.itheima.shop.util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

/*
 * C3P0工具类
 */
public final class JdbcUtil {

	/*
	 * 不允许new出工具类
	 */
	private JdbcUtil() {
	}

	/*
	 * 创建C3P0连接池
	 */
	private static DataSource dataSource = new ComboPooledDataSource();

	/*
	 * 创建线程局部对象，确保线程与Connection对象绑定在一起
	 */
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

	/*
	 * 获取数据源
	 */
	public static DataSource getDataSource() {
		return dataSource;
	}

	/*
	 * 获取连接
	 */
	public static Connection getConnection() throws SQLException {
		Connection con = tl.get();
		if (con == null) {
			con = dataSource.getConnection();
			tl.set(con);
		}
		return con;
	}

	/*
	 * 关闭Connection
	 */
	public static void closeConnection() throws SQLException {
		Connection con = getConnection();
		if (con != null) {
			con.close();
		}
	}

	/*
	 * 事务开始
	 */
	public static void startTransaction() throws SQLException {
		Connection con = getConnection();
		if (con != null) {
			con.setAutoCommit(false);
		}
	}

	/*
	 * 事务回滚和释放资源
	 */
	public static void rollbackAndReleas() throws SQLException {
		Connection con = getConnection();
		if (con != null) {
			con.rollback();
			con.close();
			tl.remove();
		}
	}

	/*
	 * 事务提交和释放资源
	 */
	public static void commitAndRelease() throws SQLException {
		Connection con = getConnection();
		if (con != null) {
			con.commit();
			con.close();
			tl.remove();
		}
	}

}
