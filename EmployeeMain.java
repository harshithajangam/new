package com.capg;


	import java.io.*;

	public class EmployeeMain {

		public static void main(String[] args)  throws Exception{
			
			EmployeeMain object = new EmployeeMain();
			       Employee e = new Employee();
			       e.setId(1);
			       e.setName("karthik");
			       e.setSal(25000);
			       e.setDesignation("manager");
			       e.setInsurancescheme("A");
			       object.WriteObjectToFile(e);
			      // System.out.println(e.toString());
			       object.file1();
			      
			    }
			 
			    public  void WriteObjectToFile(Object emp) {
			 
			        try {
			 
			            FileOutputStream fileOut = new FileOutputStream("E://objectfile.txt");
			            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			            objectOut.writeObject(emp);
			            objectOut.close();
			          
			            System.out.println("The Object  was succesfully written to a file");
			 
			        } catch (Exception ex) {
			            ex.printStackTrace();
			        }
			    }
			    
			    public void file1() throws Exception
			    {
			    	File f=new File("E://objectfile.txt");
			    	FileInputStream fr =new FileInputStream(f);
			    	@SuppressWarnings("resource")
					ObjectInputStream ois=new ObjectInputStream(fr);
			    	//Employee emp= (Employee) new Employee();
			    	System.out.println(ois.readObject());
			    	
			    	
			    
			    }
		}


