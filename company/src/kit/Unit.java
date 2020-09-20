package kit;

import Frame.Main;
import daoimpl.*;
import entity.*;


public final class Unit 
{
	public static boolean Debug = true;
	public static User nowUser = new User();
	public static Logimpl logmysql = new Logimpl();
	public static float vip = 0.8f;
	
	public static Log log =  new Log();
	
	public static void putDebug(Object string)
	{
		if(Debug)
		{
			System.out.println(string);
		}
	}
}
