import java.util.*;
	 class Travel
	{ 
		int n;	
		Scanner sc = new Scanner(System.in);
		int a;
		int q;
		void silver (int x)
		{
			int choice;
			System.out.println("Enter the number of passengers for the trip ");
			a=sc.nextInt();
			System.out.println("ENTER THE REGION TO VISIT:\n1.NORTH   \n2.SOUTH  \n3.EAST \n 4.WEST  \n 5. GO BACK TO MAIN MENU  ");
			choice=sc.nextInt();

			switch(choice)
			{
				case 1:  
					int n1;

					do{
						System.out.println("OPTIONS FOR NORTH ARE:");
						System.out.println("1.JAMMU AND KASHMIR\n2.UTTAR PRADESH\n3.MADHYA PRADESH\n4.DELHI \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");

						n1=sc.nextInt();
						if(n1 == 1)
						{	q=a*35000;
							System.out.println("COST FOR JAMMU AND KASHMIR IS "+q);}
						else if (n1  == 2)
						{q=a*22000;
							System.out.println("COST FOR UTTAR PRADESH IS "+q);}
						else if (n1 == 3)
						{q=a*25000;
							System.out.println("COST FOR MADHYA PRADESH IS "+q);}
						else if (n1 == 4)
						{q=a*27000;
							System.out.println("COST FOR DELHI IS "+q);}
						else if (n1 == 12)
						{q=a*50000;
							System.out.println("COST FOR JAMMU AND KASHMIR ALONG WITH UTTAR PRADESH IS "+q);}
						else if (n1 == 13)
						{	q=a*55000;
							System.out.println("COST FOR JAMMU AND KASHMIR ALONG WITH MADHYA PRADESH IS "+q);}
						else if (n1 == 14)
						{q=a*60000;
							System.out.println("COST FOR JAMMU AND KASHMIR ALONG WITH DELHI  IS "+q);}
						else if (n1 ==23)
						{	q=a*38000;
							System.out.println("COST FOR UTTAR PRADESH ALONG WITH MADHYA PRADESH IS "+q);}
						else if (n1 ==24)
						{q=a*42000;
							System.out.println("COST FOR UTTAR PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 123)
						{	q=a*70000;
							System.out.println("COST FOR JAMMU AND KASHMIR,UTTAR PRADESH ALONG WITH MADHYA PRADESH IS "+q);}
						else if (n1 == 124)
						{	q=a*72000;
							System.out.println("COST FOR JAMMU AND KASHMIR,UTTAR PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 234)
						{q=a*68000;
							System.out.println("COST FOR UTTAR PRADESH,MADHYA PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 34)
						{q=a*50000;
							System.out.println("COST FOR MADHYA PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 134)
						{q=a*75000;
							System.out.println("COST FOR JAMMU AND KASHMIR,MADHYA PRADESH ALONG WITH DELHI  IS "+q);}
						else if (n1 == 1234)
						{q=a*90000;
							System.out.println("COST FOR JAMMU AND KASHMIR,UTTAR PRADESH,MADHYA PRADESH ALONG WITH DELHI IS "+q);}



						else if (n1==5)
						{main1();}
					}

					while(n1 != 5);


					break;

				case 2:
					int n2;
					do{
						System.out.println(" OPTIONS FOR SOUTH ARE:");
						System.out.println("1.KERELA\n 2.KARNATAKA\n 3.TAMIL NADU\n 4.ANDAMAN \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");
						n2=sc.nextInt();
						if(n2 == 1)
						{q=a*20000;
							System.out.println("COST FOR KERELA IS "+q);}
						else if (n2  == 2)
						{	q=a*22000;
							System.out.println("COST FOR KARNATAKA IS "+q);}
						else if (n2 == 3)
						{q=a*25000;
							System.out.println("COST FOR TAMIL NADU IS "+q);}
						else if (n2 == 4)
						{q=a*40000;
							System.out.println("COST FOR ANDAMAN IS "+q);}
						else if (n2 == 12)
						{q=a*35000;
							System.out.println("COST FOR KERELA ALONG WITH KARNATAKA IS "+q);}
						else if (n2 == 13)
						{	q=a*38000;
							System.out.println("COST FOR KERELA ALONG WITH TAMIL NADU IS "+q);}
						else if (n2 == 14)
						{	q=a*53000;
							System.out.println("COST FOR KERELA ALONG WITH ANDAMAN IS "+q);}
						else if (n2 ==23)
						{	q=a*40000;
							System.out.println("COST FOR KARNATAKA ALONG WITH TAMIL NADU IS "+q);}
						else if (n2 ==24)
						{	q=a*50000;
							System.out.println("COST FOR KARNATAKA ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 123)
						{q=a*55000;
							System.out.println("COST FOR KERELA,KARNATAKA ALONG WITH TAMIL NADU IS "+q);}
						else if (n2==124)
						{q=a*70000;
							System.out.println("COST FOR KERELA,KARNATAKA ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 234)
						{	q=a*75000;
							System.out.println("COST FOR KARNATAKA,TAMIL NADU ALONG WITH ANDAMAN IS "+q);}
						else if (n2== 34)
						{q=a*58000;
							System.out.println("COST FOR TAMIL NADU ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 134)
						{q=a*70000;
							System.out.println("COST FOR KERELA,TAMIL NADU ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 1234)
						{q=a*85000;
							System.out.println("COST FOR KERELA,KARNATAKA,TAMIL NADU ALONG WITH ANDAMAN IS "+q);}

						else if (n2==5)
						{main1();}

					} while(n2 != 5); 

					break;
				case 3:
					int n3;
					do{
						System.out.println(" OPTION FOR EAST ARE:");
						System.out.println("1.MANIPUR\n 2.SIKKIM\n 3.WEST BENGAL\n 4.ASSAM \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");
						n3=sc.nextInt();
						if(n3 == 1)
						{q=a*40000;
							System.out.println("COST FOR MANIPUR IS "+q);}
						else if (n3  == 2)
						{q=a*42000;
							System.out.println("COST FOR SIKKIM IS "+q);}
						else if (n3 == 3)
						{	q=a*45000;
							System.out.println("COST FOR WEST BENGAL IS "+q);}
						else if (n3 == 4)
						{q=a*48000;
							System.out.println("COST FOR ASSAM IS "+q);}
						else if (n3 == 12)
						{	q=a*72000;
							System.out.println("COST FOR MANIPUR ALONG WITH SIKKIM IS "+q);}
						else if (n3 == 13)
						{	q=a*75000;
							System.out.println("COST FOR MANIPUR ALONG WITH WEST BENGAL IS "+q);}
						else if (n3 == 14)
						{	q=a*78000;System.out.println("COST FOR MANIPUR ALONG WITH ASSAM IS "+q);}
						else if (n3 ==23)
						{	q=a*80000;System.out.println("COST FOR SIKKIM ALONG WITH WEST BENGAL IS "+q);}
						else if (n3 ==24)
						{	q=a*82000;System.out.println("COST FOR SIKKIM ALONG WITH ASSAM IS "+q);}
						else if (n3 == 123)
						{	q=a*110000;System.out.println("COST FOR MANIPUR,SIKKIM ALONG WITH WEST BENGAL IS "+q);}
						else if (n3 == 124)
						{	q=a*115000;System.out.println("COST FOR MANIPUR,SIKKIM ALONG WITH ASSAM IS "+q);}
						else if (n3 == 234)
						{	q=a*120000;System.out.println("COST FOR SIKKIM,WEST BENGAL ALONG WITH ASSAM IS "+q);}
						else if (n3 == 34)
						{q=a*80000;
							System.out.println("COST FOR WEST BENGAL ALONG WITH ASSAM IS "+q);}
						else if (n3 == 134)
						{q=a*110000;
							System.out.println("COST FOR MANIPUR,WEST BENGAL ALONG WITH ASSAM IS "+q);}
						else if (n3 == 1234)
						{q=a*150000;
							System.out.println("COST FOR MANIPUR,SIKKIM,WEST BENGAL ALONG WITH ASSAM IS "+q);}


						else if (n3==5)
						{main1();}
					} while(n3 != 5);

					break;
				case 4:
					int n4;
					do{

						System.out.println(" OPTION FOR WEST ARE:");		
						System.out.println("1.GUJARAT\n 2.MAHARASHTRA\n 3.GOA\n 4.RAJASTHAN \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");
						n4=sc.nextInt();
						if(n4 == 1)
						{	q=a*22000;
							System.out.println("COST FOR GUJARAT IS "+q);}
						else if (n4  == 2)
						{	q=a*12000;System.out.println("COST FOR MAHARASHTRA IS "+q);}
						else if (n4 == 3)
						{	q=a*20000;System.out.println("COST FOR GOA IS "+q);}
						else if (n4 == 4)
						{	q=a*26000;System.out.println("COST FOR RAJASTHAN IS "+q);}
						else if (n4 == 12)
						{	q=a*30000;System.out.println("COST FOR GUJARAT ALONG WITH MAHARASHTRA IS "+q);}
						else if (n4 == 13)
						{	q=a*35000;System.out.println("COST FOR GUJARAT ALONG WITH GOA IS "+q);}
						else if (n4 == 14)
						{	q=a*40000;System.out.println("COST FOR GUJARAT ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 ==23)
						{	q=a*28000;System.out.println("COST FOR MAHARASHTRA ALONG WITH GOA IS "+q);}
						else if (n4 ==24)
						{	q=a*33000;System.out.println("COST FOR MAHARASHTRA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 123)
						{	q=a*45000;System.out.println("COST FOR GUJARAT,MAHARASHTRA ALONG WITH GOA IS "+q);}
						else if (n4 == 124)
						{	q=a*50000;System.out.println("COST FOR GUJARAT,MAHARASHTRA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 234)
						{	q=a*48000;System.out.println("COST FOR MAHARASHTRA,GOA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 34)
						{q=a*40000;
							System.out.println("COST FOR GOA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 134)
						{q=a*60000;
							System.out.println("COST FOR GUJARAT,GOA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 1234)
						{q=a*80000;
							System.out.println("COST FOR GUJARAT,MAHARASHTRA,GOA ALONG WITH RAJASTHAN IS "+q);}


						else if (n4==5)
						{main1();}
					} while(n4 != 5);

					break;
				case 5: main1();
				default:
					if(choice!=1||choice!=2||choice!=3||choice!=4||choice!=5)
					{System.out.println("\n PLEASE ENTER THE CORRECT CHOICE");
						silver(a);
					}

			}


		}
		void gold (int y)
		{
			int choice;
			System.out.println("Enter the number of passengers for the trip ");
			a=sc.nextInt();
			System.out.println("ENTER THE REGION TO VISIT:\n1.NORTH   \n2.SOUTH  \n3.EAST \n 4.WEST \n 5. ENTER 5 TO GO BACK TO MAIN MENU  ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:   int n1;
					do{System.out.println(" OPTION FOR NORTH ARE:");

						System.out.println("1.JAMMU AND KASHMIR\n 2.UTTAR PRADESH\n 3.MADHYA PRADESH\n4.DELHI \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");

						n1=sc.nextInt();
						if(n1 == 1)

						{	q=a*35000;
							System.out.println("COST FOR JAMMU AND KASHMIR IS "+q);}
						else if (n1  == 2)
						{q=a*22000;
							System.out.println("COST FOR UTTAR PRADESH IS "+q);}
						else if (n1 == 3)
						{q=a*25000;
							System.out.println("COST FOR MADHYA PRADESH IS "+q);}
						else if (n1 == 4)
						{q=a*27000;
							System.out.println("COST FOR DELHI IS "+q);}
						else if (n1 == 12)
						{q=a*50000;
							System.out.println("COST FOR JAMMU AND KASHMIR ALONG WITH UTTAR PRADESH IS "+q);}
						else if (n1 == 13)
						{	q=a*55000;
							System.out.println("COST FOR JAMMU AND KASHMIR ALONG WITH MADHYA PRADESH IS "+q);}
						else if (n1 == 14)
						{q=a*60000;
							System.out.println("COST FOR JAMMU AND KASHMIR ALONG WITH DELHI  IS "+q);}
						else if (n1 ==23)
						{	q=a*38000;
							System.out.println("COST FOR UTTAR PRADESH ALONG WITH MADHYA PRADESH IS "+q);}
						else if (n1 ==24)
						{q=a*42000;
							System.out.println("COST FOR UTTAR PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 123)
						{	q=a*70000;
							System.out.println("COST FOR JAMMU AND KASHMIR,UTTAR PRADESH ALONG WITH MADHYA PRADESH IS "+q);}
						else if (n1 == 124)
						{	q=a*72000;
							System.out.println("COST FOR JAMMU AND KASHMIR,UTTAR PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 234)
						{q=a*68000;
							System.out.println("COST FOR UTTAR PRADESH,MADHYA PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 34)
						{q=a*50000;
							System.out.println("COST FOR MADHYA PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 134)
						{q=a*75000;
							System.out.println("COST FOR JAMMU AND KASHMIR,MADHYA PRADESH ALONG WITH DELHI  IS "+q);}
						else if (n1 == 1234)
						{q=a*90000;
							System.out.println("COST FOR JAMMU AND KASHMIR,UTTAR PRADESH,MADHYA PRADESH ALONG WITH DELHI IS "+q);}



						else if (n1==5)
						{main1();}
					}

					while(n1 != 5);

					break;

				case 2:
					int n2;
					do{System.out.println("OPTION FOR SOUTH ARE:");

						System.out.println("1.KERELA\n2.KARNATAKA\n3.TAMIL NADU\n4.ANDAMAN \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");
						n2=sc.nextInt();
						if(n2 == 1)
						{q=a*20000;
							System.out.println("COST FOR KERELA IS "+q);}
						else if (n2  == 2)
						{	q=a*22000;
							System.out.println("COST FOR KARNATAKA IS "+q);}
						else if (n2 == 3)
						{q=a*25000;
							System.out.println("COST FOR TAMIL NADU IS "+q);}
						else if (n2 == 4)
						{q=a*40000;
							System.out.println("COST FOR ANDAMAN IS "+q);}
						else if (n2 == 12)
						{q=a*35000;
							System.out.println("COST FOR KERELA ALONG WITH KARNATAKA IS "+q);}
						else if (n2 == 13)
						{	q=a*38000;
							System.out.println("COST FOR KERELA ALONG WITH TAMIL NADU IS "+q);}
						else if (n2 == 14)
						{	q=a*53000;
							System.out.println("COST FOR KERELA ALONG WITH ANDAMAN IS "+q);}
						else if (n2 ==23)
						{	q=a*40000;
							System.out.println("COST FOR KARNATAKA ALONG WITH TAMIL NADU IS "+q);}
						else if (n2 ==24)
						{	q=a*50000;
							System.out.println("COST FOR KARNATAKA ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 123)
						{q=a*55000;
							System.out.println("COST FOR KERELA,KARNATAKA ALONG WITH TAMIL NADU IS "+q);}
						else if (n2==124)
						{q=a*70000;
							System.out.println("COST FOR KERELA,KARNATAKA ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 234)
						{	q=a*75000;
							System.out.println("COST FOR KARNATAKA,TAMIL NADU ALONG WITH ANDAMAN IS "+q);}
						else if (n2== 34)
						{q=a*58000;
							System.out.println("COST FOR TAMIL NADU ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 134)
						{q=a*70000;
							System.out.println("COST FOR KERELA,TAMIL NADU ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 1234)
						{q=a*85000;
							System.out.println("COST FOR KERELA,KARNATAKA,TAMIL NADU ALONG WITH ANDAMAN IS "+q);}
						else if(n2==5)
						{ main1();}
					} while(n2 != 0);

					break;
				case 3:
					int n3;
					do{
						System.out.println("OPTION FOR EAST ARE:");
						System.out.println("1.MANIPUR\n 2.SIKKIM\n 3.WEST BENGAL\n 4.ASSAM\n5.ENTER 5 TO GO BACK TO MAIN MENU\n");
						n3=sc.nextInt();
						if(n3 == 1)
						{q=a*40000;
							System.out.println("COST FOR MANIPUR IS "+q);}
						else if (n3  == 2)
						{q=a*42000;
							System.out.println("COST FOR SIKKIM IS "+q);}
						else if (n3 == 3)
						{	q=a*45000;
							System.out.println("COST FOR WEST BENGAL IS "+q);}
						else if (n3 == 4)
						{q=a*48000;
							System.out.println("COST FOR ASSAM IS "+q);}
						else if (n3 == 12)
						{	q=a*72000;
							System.out.println("COST FOR MANIPUR ALONG WITH SIKKIM IS "+q);}
						else if (n3 == 13)
						{	q=a*75000;
							System.out.println("COST FOR MANIPUR ALONG WITH WEST BENGAL IS "+q);}
						else if (n3 == 14)
						{	q=a*78000;System.out.println("COST FOR MANIPUR ALONG WITH ASSAM IS "+q);}
						else if (n3 ==23)
						{	q=a*80000;System.out.println("COST FOR SIKKIM ALONG WITH WEST BENGAL IS "+q);}
						else if (n3 ==24)
						{	q=a*82000;System.out.println("COST FOR SIKKIM ALONG WITH ASSAM IS "+q);}
						else if (n3 == 123)
						{	q=a*110000;System.out.println("COST FOR MANIPUR,SIKKIM ALONG WITH WEST BENGAL IS "+q);}
						else if (n3 == 124)
						{	q=a*115000;System.out.println("COST FOR MANIPUR,SIKKIM ALONG WITH ASSAM IS "+q);}
						else if (n3 == 234)
						{	q=a*120000;System.out.println("COST FOR SIKKIM,WEST BENGAL ALONG WITH ASSAM IS "+q);}
						else if (n3 == 34)
						{q=a*80000;
							System.out.println("COST FOR WEST BENGAL ALONG WITH ASSAM IS "+q);}
						else if (n3 == 134)
						{q=a*110000;
							System.out.println("COST FOR MANIPUR,WEST BENGAL ALONG WITH ASSAM IS "+q);}
						else if (n3 == 1234)
						{q=a*150000;
							System.out.println("COST FOR MANIPUR,SIKKIM,WEST BENGAL ALONG WITH ASSAM IS "+q);}

						else if (n3==5)
						{main1();}
					} while(n3 != 5);

					break;
				case 4:
					int n4;
					do{
						System.out.println("OPTION FOR WEST ARE:");
						System.out.println("1.GUJARAT\n 2.MAHARASHTRA\n 3.GOA\n 4.RAJASTHAN \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");
						n4=sc.nextInt();
						if(n4 == 1)
						{	q=a*22000;
							System.out.println("COST FOR GUJARAT IS "+q);}
						else if (n4  == 2)
						{	q=a*12000;System.out.println("COST FOR MAHARASHTRA IS "+q);}
						else if (n4 == 3)
						{	q=a*20000;System.out.println("COST FOR GOA IS "+q);}
						else if (n4 == 4)
						{	q=a*26000;System.out.println("COST FOR RAJASTHAN IS "+q);}
						else if (n4 == 12)
						{	q=a*30000;System.out.println("COST FOR GUJARAT ALONG WITH MAHARASHTRA IS "+q);}
						else if (n4 == 13)
						{	q=a*35000;System.out.println("COST FOR GUJARAT ALONG WITH GOA IS "+q);}
						else if (n4 == 14)
						{	q=a*40000;System.out.println("COST FOR GUJARAT ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 ==23)
						{	q=a*28000;System.out.println("COST FOR MAHARASHTRA ALONG WITH GOA IS "+q);}
						else if (n4 ==24)
						{	q=a*33000;System.out.println("COST FOR MAHARASHTRA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 123)
						{	q=a*45000;System.out.println("COST FOR GUJARAT,MAHARASHTRA ALONG WITH GOA IS "+q);}
						else if (n4 == 124)
						{	q=a*50000;System.out.println("COST FOR GUJARAT,MAHARASHTRA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 234)
						{	q=a*48000;System.out.println("COST FOR MAHARASHTRA,GOA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 34)
						{q=a*40000;
							System.out.println("COST FOR GOA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 134)
						{q=a*60000;
							System.out.println("COST FOR GUJARAT,GOA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 1234)
						{q=a*80000;
							System.out.println("COST FOR GUJARAT,MAHARASHTRA,GOA ALONG WITH RAJASTHAN IS "+q);}


						else if (n4==5)
						{main1();}
					} while(n4 != 5);

					break;
				case 5: main1();
					break;
				default:
					if(choice!=1||choice!=2||choice!=3||choice!=4||choice!=5)
					{System.out.println("\n PLEASE ENTER THE CORRECT CHOICE");
						gold(a);
					}

			}}  

		void platinuim(int 	z)
		{
			int choice;
			System.out.println("Enter the number of passengers for the trip ");
			a=sc.nextInt();
			System.out.println("ENTER THE REGION TO VISIT:\n1.NORTH   \n2.SOUTH  \n3.EAST \n 4.WEST \n 5.ENTER 5 TO GO BACK TO BACK MENU  ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:   int n1;
					do{
						System.out.println("OPTION FOR NORTH ARE:");
						System.out.println("1.JAMMU AND KASHMIR\n 2.UTTAR PRADESH\n 3.MADHYA PRADESH\n4.DELHI \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");

						n1=sc.nextInt();
						if(n1 == 1)
						{	q=a*35000;
							System.out.println("COST FOR JAMMU AND KASHMIR IS "+q);}
						else if (n1  == 2)
						{q=a*22000;
							System.out.println("COST FOR UTTAR PRADESH IS "+q);}
						else if (n1 == 3)
						{q=a*25000;
							System.out.println("COST FOR MADHYA PRADESH IS "+q);}
						else if (n1 == 4)
						{q=a*27000;
							System.out.println("COST FOR DELHI IS "+q);}
						else if (n1 == 12)
						{q=a*50000;
							System.out.println("COST FOR JAMMU AND KASHMIR ALONG WITH UTTAR PRADESH IS "+q);}
						else if (n1 == 13)
						{	q=a*55000;
							System.out.println("COST FOR JAMMU AND KASHMIR ALONG WITH MADHYA PRADESH IS "+q);}
						else if (n1 == 14)
						{q=a*60000;
							System.out.println("COST FOR JAMMU AND KASHMIR ALONG WITH DELHI  IS "+q);}
						else if (n1 ==23)
						{	q=a*38000;
							System.out.println("COST FOR UTTAR PRADESH ALONG WITH MADHYA PRADESH IS "+q);}
						else if (n1 ==24)
						{q=a*42000;
							System.out.println("COST FOR UTTAR PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 123)
						{	q=a*70000;
							System.out.println("COST FOR JAMMU AND KASHMIR,UTTAR PRADESH ALONG WITH MADHYA PRADESH IS "+q);}
						else if (n1 == 124)
						{	q=a*72000;
							System.out.println("COST FOR JAMMU AND KASHMIR,UTTAR PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 234)
						{q=a*68000;
							System.out.println("COST FOR UTTAR PRADESH,MADHYA PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 34)
						{q=a*50000;
							System.out.println("COST FOR MADHYA PRADESH ALONG WITH DELHI IS "+q);}
						else if (n1 == 134)
						{q=a*75000;
							System.out.println("COST FOR JAMMU AND KASHMIR,MADHYA PRADESH ALONG WITH DELHI  IS "+q);}
						else if (n1 == 1234)
						{q=a*90000;
							System.out.println("COST FOR JAMMU AND KASHMIR,UTTAR PRADESH,MADHYA PRADESH ALONG WITH DELHI IS "+q);}


						else if(n1==5)
						{main1();}
					}

					while(n1 != 0);

					break;

				case 2:
					int n2;
					do{
						System.out.println("OPTION FOR SOUTH ARE:");
						System.out.println("1.KERELA \n 2.KARNATAKA\n 3.TAMIL NADU\n 4.ANDAMAN \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");
						n2=sc.nextInt();
						if(n2 == 1)
						{q=a*20000;
							System.out.println("COST FOR KERELA IS "+q);}
						else if (n2  == 2)
						{	q=a*22000;
							System.out.println("COST FOR KARNATAKA IS "+q);}
						else if (n2 == 3)
						{q=a*25000;
							System.out.println("COST FOR TAMIL NADU IS "+q);}
						else if (n2 == 4)
						{q=a*40000;
							System.out.println("COST FOR ANDAMAN IS "+q);}
						else if (n2 == 12)
						{q=a*35000;
							System.out.println("COST FOR KERELA ALONG WITH KARNATAKA IS "+q);}
						else if (n2 == 13)
						{	q=a*38000;
							System.out.println("COST FOR KERELA ALONG WITH TAMIL NADU IS "+q);}
						else if (n2 == 14)
						{	q=a*53000;
							System.out.println("COST FOR KERELA ALONG WITH ANDAMAN IS "+q);}
						else if (n2 ==23)
						{	q=a*40000;
							System.out.println("COST FOR KARNATAKA ALONG WITH TAMIL NADU IS "+q);}
						else if (n2 ==24)
						{	q=a*50000;
							System.out.println("COST FOR KARNATAKA ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 123)
						{q=a*55000;
							System.out.println("COST FOR KERELA,KARNATAKA ALONG WITH TAMIL NADU IS "+q);}
						else if (n2==124)
						{q=a*70000;
							System.out.println("COST FOR KERELA,KARNATAKA ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 234)
						{	q=a*75000;
							System.out.println("COST FOR KARNATAKA,TAMIL NADU ALONG WITH ANDAMAN IS "+q);}
						else if (n2== 34)
						{q=a*58000;
							System.out.println("COST FOR TAMIL NADU ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 134)
						{q=a*70000;
							System.out.println("COST FOR KERELA,TAMIL NADU ALONG WITH ANDAMAN IS "+q);}
						else if (n2 == 1234)
						{q=a*85000;
							System.out.println("COST FOR KERELA,KARNATAKA,TAMIL NADU ALONG WITH ANDAMAN IS "+q);}

						else if (n2==5)
						{main1();}
					} while(n2 != 5);

					break;
				case 3:
					int n3;
					do{
						System.out.println("OPTION FOR EAST ARE:");
						System.out.println("1.MANIPUR\n 2.SIKKIM\n 3.WEST BENGAL\n 4.ASSAM \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");
						n3=sc.nextInt();
						if(n3 == 1)
						{q=a*40000;
							System.out.println("COST FOR MANIPUR IS "+q);}
						else if (n3  == 2)
						{q=a*42000;
							System.out.println("COST FOR SIKKIM IS "+q);}
						else if (n3 == 3)
						{	q=a*45000;
							System.out.println("COST FOR WEST BENGAL IS "+q);}
						else if (n3 == 4)
						{q=a*48000;
							System.out.println("COST FOR ASSAM IS "+q);}
						else if (n3 == 12)
						{	q=a*72000;
							System.out.println("COST FOR MANIPUR ALONG WITH SIKKIM IS "+q);}
						else if (n3 == 13)
						{	q=a*75000;
							System.out.println("COST FOR MANIPUR ALONG WITH WEST BENGAL IS "+q);}
						else if (n3 == 14)
						{	q=a*78000;System.out.println("COST FOR MANIPUR ALONG WITH ASSAM IS "+q);}
						else if (n3 ==23)
						{	q=a*80000;System.out.println("COST FOR SIKKIM ALONG WITH WEST BENGAL IS "+q);}
						else if (n3 ==24)
						{	q=a*82000;System.out.println("COST FOR SIKKIM ALONG WITH ASSAM IS "+q);}
						else if (n3 == 123)
						{	q=a*110000;System.out.println("COST FOR MANIPUR,SIKKIM ALONG WITH WEST BENGAL IS "+q);}
						else if (n3 == 124)
						{	q=a*115000;System.out.println("COST FOR MANIPUR,SIKKIM ALONG WITH ASSAM IS "+q);}
						else if (n3 == 234)
						{	q=a*120000;System.out.println("COST FOR SIKKIM,WEST BENGAL ALONG WITH ASSAM IS "+q);}
						else if (n3 == 34)
						{q=a*80000;
							System.out.println("COST FOR WEST BENGAL ALONG WITH ASSAM IS "+q);}
						else if (n3 == 134)
						{q=a*110000;
							System.out.println("COST FOR MANIPUR,WEST BENGAL ALONG WITH ASSAM IS "+q);}
						else if (n3 == 1234)
						{q=a*150000;
							System.out.println("COST FOR MANIPUR,SIKKIM,WEST BENGAL ALONG WITH ASSAM IS "+q);}
						else if (n3==5)
						{main1();}
					} while(n3 != 5);

					break;
				case 4:
					int n4;
					do{
						System.out.println("OPTION FOR WEST ARE:");
						System.out.println("1.GUJARAT\n 2.MAHARASHTRA\n 3.GOA\n 4.RAJASTHAN \n5.ENTER 5 TO GO BACK TO MAIN MENU\n");
						n4=sc.nextInt();
						if(n4 == 1)
						{	q=a*22000;
							System.out.println("COST FOR GUJARAT IS "+q);}
						else if (n4  == 2)
						{	q=a*12000;System.out.println("COST FOR MAHARASHTRA IS "+q);}
						else if (n4 == 3)
						{	q=a*20000;System.out.println("COST FOR GOA IS "+q);}
						else if (n4 == 4)
						{	q=a*26000;System.out.println("COST FOR RAJASTHAN IS "+q);}
						else if (n4 == 12)
						{	q=a*30000;System.out.println("COST FOR GUJARAT ALONG WITH MAHARASHTRA IS "+q);}
						else if (n4 == 13)
						{	q=a*35000;System.out.println("COST FOR GUJARAT ALONG WITH GOA IS "+q);}
						else if (n4 == 14)
						{	q=a*40000;System.out.println("COST FOR GUJARAT ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 ==23)
						{	q=a*28000;System.out.println("COST FOR MAHARASHTRA ALONG WITH GOA IS "+q);}
						else if (n4 ==24)
						{	q=a*33000;System.out.println("COST FOR MAHARASHTRA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 123)
						{	q=a*45000;System.out.println("COST FOR GUJARAT,MAHARASHTRA ALONG WITH GOA IS "+q);}
						else if (n4 == 124)
						{	q=a*50000;System.out.println("COST FOR GUJARAT,MAHARASHTRA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 234)
						{	q=a*48000;System.out.println("COST FOR MAHARASHTRA,GOA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 34)
						{q=a*40000;
							System.out.println("COST FOR GOA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 134)
						{q=a*60000;
							System.out.println("COST FOR GUJARAT,GOA ALONG WITH RAJASTHAN IS "+q);}
						else if (n4 == 1234)
						{q=a*80000;
							System.out.println("COST FOR GUJARAT,MAHARASHTRA,GOA ALONG WITH RAJASTHAN IS "+q);}


						else if(n4==5)
						{main1();}
					} while(n4 != 5);

					break;
				case 5: main1();
					break;
				default:
					if(choice!=1||choice!=2||choice!=3||choice!=4||choice!=5)
					{System.out.println("\n PLEASE ENTER THE CORRECT CHOICE");
						platinuim(a);
					}

			}}  
		void main1 ()
		{

			System.out.println("ENTER THE TYPE OF PACKAGE:\n1.SILVER-\nFACILITIES IN SILVER PACKAGE ARE:-\n-6N/7D\n-3 Star hotel accomodation\n-Airport transfer\n-breakfast\n-sight seeing\n   \n2.GOLD-\nFACILITIES IN GOLD PACKAGE ARE:-\n-6N/7D\n-4 Star hotel accomodation\n-Airport transfer\n-breakfast&dinner\n-sight seeing\n \n3.PLATINUIM-\nFACILITIES IN PLATINUM PACKAGE ARE:-\n-6N/7D\n-5 or 7 Star hotel\n-Airport transfer\n-breakfast,lunch&dinner\n-sight seeing \n\nENTER '4' TO EXIT\n");
			n=sc.nextInt();
			switch(n)
			{
				case 1:
					silver(a);
					break;



				case 2:
					gold(a);
					break;


				case 3:

					platinuim(a);
					break;
				case 4:  System.out.println("THANK YOU \nHOPE TO SEE YOU SOON (^_^)");

					break;
				default: if(n!=1||n!=2||n!=3||n!=4){
						System.out.println("WRONG CHOICE PLEASE TRY AGAIN\n");
						main1(); 
					} 
					break;
			}

		}

		public static void main(String[] args)
		{ 

			Scanner sc = new Scanner(System.in);
			Travel t= new Travel();
			t.main1();

		}}
