package cn.gdcp.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class AccountDaoImpl implements AccountDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int addAccount(Account account) {
		String sql = "insert into account(username,balance) value(?,?)";
		
		Object[] obj = new Object[]{account.getUsername(),account.getBalance()};
		int num = this.jdbcTemplate.update(sql,obj);
		return num;
	}

	@Override
	public int updateAccount(Account account) {
		// TODO Auto-generated method stub
		String sql = "update account set username=? , balance=? where id=?";
		
		Object[] obj = new Object[] {account.getUsername(),account.getBalance(),account.getId()};
		
		int num = this.jdbcTemplate.update(sql,obj);
		
		return num;
	}

	@Override
	public int deleteAccount(int id) {
		String sql = "delete from account where id=?";
		
		int num = this.jdbcTemplate.update(sql,id);
		
		return num;
	}

	@Override
	public Account findAccountbyId(int id) {
		String sql = "select * from account where id=?";
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		Account account = (Account) this.jdbcTemplate.queryForObject(sql,rowMapper,id);
		return account;
	}

	@Override
	public List<Account> findAllAccount() {
		String sql = "select * from account";
		RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
		List<Account> list = this.jdbcTemplate.query(sql,rowMapper);
		return list;
	}

}
