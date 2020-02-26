package com.capg;

import java.util.*;
public class UserChoice {
		
		Scanner s =new Scanner(System.in);
		
		String name=s.nextLine();	
		int N=name.length();
		char array[]= new char[N];
		char array1[]=new char[N];
		char array2[]=new char[N];
		int i,j;
		
		void display()
		{
			System.out.println("1.Add to String itself");
			System.out.println("2.Replace odd positions with # ");
			System.out.println("3.Remove duplicate characters in the String ");
			System.out.println("4.Change odd characters to upper case ");
			int q=s.nextInt();
		switch(q)
		{
			case 1: 
			
						String concatedstring=name+name;
						System.out.println("concatedstring="+concatedstring);
						break;
					
			case 2: 
						for(int z=0,j=1,i=0;z<N;z++)
						{
							while(i<N)
							{
									array[i]='#';
									i=i+2;
									break;
							}
							while(j<N)
							{
								array[j]=name.charAt(j);
								j=j+2;
								break;
							}		
						}
						for(int k=0;k<N;k++)
						{
							System.out.print(array[k]);
			
						}		
						break;

			case 3: 
						int m=1;
						array1[0]=name.charAt(0);
						for(i=1;i<N;i++)
						{
							j=0;
							int count=0;
							while(j<i)
							{
								if(name.charAt(i)!=name.charAt(j))
								{
									count++;		
								}
								j++;
							}
							if(count==i)
							{
								array1[m]=name.charAt(i);
								m++;
							}
						}
						for(int k=0;k<N;k++)
						{
							System.out.print(array1[k]);
			
						}	
			
						break;
			case 4: 
						for(i=0;i<N;i++)
						{
							if(i%2==0)
							{
								array2[i]=(char)(name.charAt(i)-32);
							}
							else
							{
								array2[i]=name.charAt(i);
							}
						}
						for(int k=0;k<N;k++)
						{
							System.out.print(array2[k]);
				
						}	
						break;
			default :System.out.println("enter correct number------ ");
			break;
		}
		
		}
		
			

		public static void main(String[] args) {
			
			System.out.println("enter the string");
			UserChoice obj=new UserChoice();
			obj.display();
		}

	}