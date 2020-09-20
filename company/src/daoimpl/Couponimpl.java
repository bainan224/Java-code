package daoimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dao.CouponDao;
import dao.JBUtils;

import kit.Unit;
import entity.Coupon;
import entity.User;
import entity.employeeinformation;

public class Couponimpl extends JBUtils implements CouponDao
{
	JBUtils jdbcutil=JBUtils.getInitJDBCUtil();
	
	public int add(Coupon coupon)
	{
		String sql="insert into coupon(id,prices) values(?,?)";
	    Object[] params={coupon.getId(),coupon.getPrices()};
	    int line=0;
	    try {
			line=this.executeUpdate(sql, params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}
	
	public int delete(Coupon coupon)
	{
		String sql="delete from coupon where id=?";
		Object[] params={coupon.getId()};
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
	
	public Coupon getById(String id)
	{
		String sql="select * from coupon where id=?";
		Object[]params={id};
		List<HashMap> listCoupon=new ArrayList<HashMap>();
		listCoupon=this.executeQuery(sql, params);
		if(listCoupon.isEmpty())
		{
			return null;
		}
		else
		{
			if(Unit.Debug)
				System.out.println(listCoupon.get(0));

			Coupon coupon=new Coupon();
			coupon.setId((String)listCoupon.get(0).get("id"));
			coupon.setPrices((float)(listCoupon.get(0).get("prices")));

			return coupon;
		}
	}
	
	public List<HashMap> getAll()
	{
		String sql="select * from coupon";
		List<HashMap> listItem=new ArrayList<HashMap>();
		listItem=this.executeQuery(sql);
		return listItem;
	}

}
