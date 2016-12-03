package com.a.a;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;


public class DbConnection 
{
	SQLiteDatabase db;
	String dbnm="first.db";
	String tblname="stud";
	Context context;
	MyOpenHelper openHelper;
	TextView t1;
	TextView t2;
	ContentValues values;
	public DbConnection(Context context) 
	{
	      this.context = context;
	      try
	      {
	          db= context.openOrCreateDatabase(dbnm,SQLiteDatabase.CREATE_IF_NECESSARY,null);
	          openHelper = new MyOpenHelper(context,dbnm,null,1);
	          db=openHelper.getWritableDatabase();
	      }
	      catch(Exception e)
	      {
		
	      }
	
	   }
	public void newrec(String name,int num)
	{
	
		try
		{
		 values = new ContentValues();
		values.put("name", name);
		values.put("num",num);
		db.insert(tblname, null, values);
		}
		catch(Exception e)
		{
			
		}
		
	}
	public void recupd(String oname, String nname, int num)
	{
		values = new ContentValues();
		values.put("name", nname);
		values.put("num",num);
		db.update("stud", values, "name=?", new String[]{oname.toString()});
	}
	public void recdel(String name)
	{
		db.delete("stud", "name=?", new String[] {name.toString()});
	}
	public List<String> selectAll(Context context) 
	 {
	      List<String> list = new ArrayList<String>();
	     //String sql="select * from stud1";
			//SQLiteStatement stmt=db.compileStatement(sql);
				
	      Cursor cursor=this.db.query("stud", new String[] {"name","num"}, null, null, null, null, "name desc");
	
	      if (cursor.moveToFirst()) 
	      {
	         do 
	         {
		 String val=cursor.getString(0)+" "+cursor.getString(1);
	           /* list.add(cursor.getString(0)); 
	            list.add(cursor.getString(1));*/
		 list.add(val);
		
	         } 
	         while (cursor.moveToNext());
	      }
	      if (cursor != null && !cursor.isClosed()) 
	      {
	         cursor.close();
	      }
	      return list;
	   }
}

