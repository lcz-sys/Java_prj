package cn.gdcp.jdbc;

import java.util.List;

public interface AccountDao {
	
	public int addAccount(Account account);
	public int updateAccount(Account account);
	public int deleteAccount(int id);
	public Account findAccountbyId(int id);
	public List<Account> findAllAccount();
	

}
