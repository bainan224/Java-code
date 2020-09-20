package daoimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dao.DepartmentinformationDao;
import dao.JBUtils;
import entity.*;
import entity.Departmentinformation;

public class departmentinformationimpl extends JBUtils implements DepartmentinformationDao
{
	public int add(Departmentinformation departmentinformation)
	{
		String sql="insert into departmentinformation(id,department,position,firstnum,note) values(?,?,?,?,?)";
		Object[] params={
				//departmentinformation.getId(),departmentinformation.getdepartment(),departmentinformation.getposition(),departmentinformation.getfirstnum(),departmentinformation.getnote()
				};
		int line=0;
		try
		{
			line=this.executeUpdate(sql,params);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return line;
	
	}
	
	public int delete(Departmentinformation item)
	{	
		String sql="delete from Departmentinformation  where id=?";
		Object[] params={item.getId()};
		int line=0;
		try 
		{
			line = this.executeUpdate(sql, params);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return line;
	}
	
	public int update(Departmentinformation departmentinformation)
	{
		String sql="update departmentinformation set department=?,position=?,firstnum=?,note=? where id=?";
		Object[] params={
				//departmentinformation.getId(),departmentinformation.getdepartment(),departmentinformation.getposition(),departmentinformation.getfirstnum(),departmentinformation.getnote()
				};
		int line=0;
		try 
		{
			line = this.executeUpdate(sql, params);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return line;
	}
	
	//根据物品ID查询返回的是一个对象
	public Departmentinformation getById(String id)
	{	
		String sql="select * from Departmentinformation where id=?";
		Object[]params={id};
		List<HashMap> listItem=new ArrayList<HashMap>();
		listItem=this.executeQuery(sql, params);
		if(listItem==null)
		{
			return null;
		}
		else
		{
			Departmentinformation item = new Departmentinformation();
			item.setId((String)listItem.get(0).get("id"));
			item.setDepartment((String)listItem.get(0).get("department"));
			item.setPosition((float)listItem.get(0).get("position"));
			item.setFirstnum((int)(listItem.get(0).get("firstnum")));
			item.setNote((String)listItem.get(0).get("note"));
			return item;
		}
	}
	
	public int subCount(int count,Departmentinformation item)
	{	
		String sql="update item set count=count-? where id=?";
		Object[] params={count,item.getId()};
		int line=0;
		try 
		{
			line = this.executeUpdate(sql, params);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return line;
	}
	
	//根据物品名称查询返回的是一个对象
	public Departmentinformation getByName(String name)
	{	
		String sql="select * from item where name=?";
		Object[]params={name};
		List<HashMap> listItem=new ArrayList<HashMap>();
		listItem=this.executeQuery(sql, params);
		
		if(listItem.isEmpty())
		{
			return null;
		}
		else
		{
			Departmentinformation item = new Departmentinformation();
			item.setId((String)listItem.get(0).get("id"));
			item.setDepartment((String)listItem.get(0).get("department"));
			item.setPosition((float)listItem.get(0).get("position"));
			item.setFirstnum((int)(listItem.get(0).get("firstnum")));
			item.setNote((String)listItem.get(0).get("note"));
			return item;
		}
		
	}

	//返回的是一个表
	public List<HashMap> getAll(){
		String sql="select * from item";
		List<HashMap> listItem=new ArrayList<HashMap>();
		listItem=this.executeQuery(sql);
		return listItem;	
	}
}
