package com.capg;


	 class Person {
			private String firstName;
			private String lastName;
			
			public Person(String fname, String lname)
			{
				if(fname==null&&lname==null)
				{
					throw new IllegalArgumentException("Both Names Cannot be NULL");
				}
				this.firstName=fname;
				this.lastName=lname;
			}
			public String getFullname()
			{
				String first=(this.firstName!=null)?this.firstName:"?";
				String last=(this.lastName!=null)?this.lastName:"?";
				return first+" "+last;
			}
			public String getFirstName() {
				return firstName;
			}
			
			public String getLastName() {
				return lastName;
			}
		}

