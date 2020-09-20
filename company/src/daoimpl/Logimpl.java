package daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kit.Unit;
import dao.*;
import entity.*;

import dao.JBUtils;

public class Logimpl extends JBUtils implements LogDao{
	JBUtils	 jdbcutil=JBUtils.getInitJDBCUtil();
	
	
	public void Login(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"登陆日志", log.getUserId(), "无", 0,"正常登陆"};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void rePassword(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"修改密码", log.getUserId(), "无", 0,"修改后密码:"+Unit.nowUser.getPassword()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void register(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"注册日志", log.getUserId(), "无", 0,"注册账户:"+Unit.nowUser.getUser()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void Item_Add(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"员工添加", log.getUserId(), log.getItemId(), log.getCount(),log.getNote()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void Item_Change(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"员工修改", log.getUserId(), log.getItemId(), log.getCount(),"修改内容:"+log.getNote()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void Item_Sell(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"员工销售额", log.getUserId(), log.getItemId(), log.getCount(),log.getNote()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void Item_Delete(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"员工删除", log.getUserId(), log.getItemId(),0,"危险操作"};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void VIP_Add(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"员工添加", log.getUserId(),"无",0,"员工ID:"+log.getNote()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void VIP_Change(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"员工修改", log.getUserId(),"修改内容:"+log.getItemId(),0,"员工ID:"+log.getNote()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void VIP_Delete(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"员工删除", log.getUserId(),"无",0,"员工ID:"+log.getNote()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void VIP_Count(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"职位积分", log.getUserId(),"积分",log.getCount(),"会员ID:"+log.getNote()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void Coupon_Add(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"工资卡添加", log.getUserId(),"工资卡号:"+log.getItemId(),log.getCount(),log.getNote()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void Coupon_Delete(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"工资卡删除", log.getUserId(),"无",0,"工资卡号:"+log.getNote()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public void Coupon_Used(Log log)
	{
	    String sql = "insert into log (date, type, userId, ItemId, count, note) values(?,?,?,?,?,?)";	    
	    Object obj[]= {log.getDate(),"工资卡使用", log.getUserId(),"工资卡号:"+log.getItemId(),log.getCount(),log.getNote()};
	    try
	    {
			jdbcutil.executeUpdate(sql, obj);
		} catch (Exception e)
	    {
			e.printStackTrace();
		}
	}
	
	public List<HashMap> getAll()
	{
		String sql="select * from log";
		List<HashMap> listItem=new ArrayList<HashMap>();
		listItem=this.executeQuery(sql);
		return listItem;
	}
}
