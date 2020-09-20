package daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import dao.JBUtils;
import dao.EmployeeinformationDao;
import entity.*;


public class employeeinformationimpl extends JBUtils implements EmployeeinformationDao
{
	//会员的信息
	public int add(employeeinformation employeeinformation)
	{
		String sql="insert into vip(id,user,name,count,telephone,date) values(?,?,?,?,?,?)";
	    Object[] params={employeeinformation.getId(),employeeinformation.getUser(),employeeinformation.getName(),0,employeeinformation.getTelephone(),employeeinformation.getDate()};
	    int line=0;
	    try
	    {
			line=this.executeUpdate(sql, params);
		}
	    catch (Exception e) 
	    {
			e.printStackTrace();
		}
		return line;
	}
	
	public int delete(employeeinformation employeeinformation) throws Exception
	{
		String sql = "DELETE FROM employeeinformation WHERE id = ?;";
		Object params[]={employeeinformation.getId()};
		int line = this.executeUpdate(sql,params);
		return line;
	}
	
	public int update(employeeinformation employeeinformation) throws Exception
	{
		String sql = "update vip set USER=?,NAME=?,COUNT=?,TELEPHONE=? where id=?";
		Object params[]={employeeinformation.getUser(),employeeinformation.getName(),employeeinformation.getCount(),employeeinformation.getTelephone(),employeeinformation.getId()};
		int line = this.executeUpdate(sql,params);
		return line;
	}
	
	public employeeinformation getById(String id)
	{
	    String sql="select * from vip where id=?";
	    List<HashMap> listVip=new ArrayList<HashMap>();
	    Object params[]={id};
	    listVip=this.executeQuery(sql,params);
		
		if(listVip.isEmpty())
		{
			return null;
		}
		else
		{
			employeeinformation vip = new employeeinformation();
		    vip.setId((String)listVip.get(0).get("ID"));
		    vip.setUser((String)listVip.get(0).get("USER"));
		    vip.setName((String)listVip.get(0).get("NAME"));
		    vip.setCount((int)listVip.get(0).get("COUNT"));
		    vip.setTelephone((String)listVip.get(0).get("TELEPHONE"));
		    vip.setDate((Date)listVip.get(0).get("DATE"));
			return vip;
		}
	}
	
	public  List<HashMap> getAll()
	{
	    String sql="select * from vip";
	    List<HashMap> listVip=new ArrayList<HashMap>();
	    listVip=this.executeQuery(sql);
		return  listVip;
	}
	
	public int addCount(employeeinformation employeeinformation,int count)
	{
		String sql = "update vip set COUNT=COUNT+? where id=?";
		Object params[]={count,employeeinformation.getId()};
		int line=0;
		try 
		{
			line = this.executeUpdate(sql,params);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return line;
	}
}

