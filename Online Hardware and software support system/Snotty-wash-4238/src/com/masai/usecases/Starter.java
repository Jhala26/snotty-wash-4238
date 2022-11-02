package com.masai.usecases;

import java.util.Scanner;

public class Starter {

	
	public static boolean RunApplication() {
		
		boolean finalRes = true;
		
		SupportCalling sps = new SupportCalling();
		
		System.out.println("\nPlease select an option to continue : \n");
		
		System.out.println("Selcet - 1 : HOD");
		System.out.println("Selcet - 2 : Engineer");
		System.out.println("Selcet - 3 : Employee");
		System.out.println("Selcet - 4 : Exit");
		System.out.println("\nEnter your Choice");
		
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		
		
		switch (key) {
		case 1: {
			
			System.out.println("\nLogin first\n");
			boolean using =  sps.HodUsecase();
			
			if(using) {
			
			boolean res = true;
			
			while(res) {
				
				System.out.println("\nPlease select an option to perform a task : \n");

				System.out.println("Selcet - 1 : Register a new Engineer");
				System.out.println("Selcet - 2 : List of all registered Engineer");
				System.out.println("Selcet - 3 : Delete an engineer from record");
				System.out.println("Selcet - 4 : See Raised Problems");
				System.out.println("Selcet - 5 : Assign complain to an engineer");
				System.out.println("Selcet - 6 : Exit");
				
				System.out.println("\nEnter your Choice");
				int hodKey = sc.nextInt();
				
				switch (hodKey) {
				
				case 1: {
					
					sps.registerEngineerUsecase();
					break;
				}
				case 2: {
					
					sps.getAllRegisterEngineerUsecase();
					break;
				}
				case 3: {
					
					sps.deleteEngineerUsecase();
					break;
				}
				case 4: {
					
					sps.getAllRaisedComplainUsecase();
					break;
				}
				case 5: {
					
					sps.allotingComplainToEngineerUsecase();
					break;
				}
				case 6: {
					
					Starter.RunApplication();
					break;
				}
				
				default:{
					System.out.println("\nInvalid Input");
					}
				
				}
				
				
				System.out.println("\nPress - 1 : To go to main Menue");
				System.out.println("Press - 2 : To close the application");
				System.out.println("Press - 3 : To see these task again");
				System.out.println("\nEnter your Choice");
				int rep = sc.nextInt();
				
				if(rep == 1) {
					Starter.RunApplication();
				}
				else if(rep == 2) {
					res = false;
					
				}
				
			   }
			}	
			else {
				System.out.println("\n******************* Try again ********************************************\n");
				Starter.RunApplication();
			}
			
			break;
			
		}
		
		
		case 2: {
			
			System.out.println("\nLogin first(credentials given by the HOD) \n");
			boolean using2 =  sps.loginEngineerUsecase();
			
			if(using2) {
			
			boolean res2 = true;
			
			while(res2) {
				
				System.out.println("\nPlease select an option to perform a task : \n");

				System.out.println("Selcet - 1 : View list of assigned complaines by HOD");
				System.out.println("Selcet - 2 : Update status of the complaines(whether it solved or any thing)");
				System.out.println("Selcet - 3 : View data of attended complaines");
				System.out.println("Selcet - 4 : Change Password");
				System.out.println("Selcet - 5 : Exit");
				
				
				System.out.println("\nEnter your Choice");
				int hodKey2 = sc.nextInt();
				
				switch (hodKey2) {
				
				case 1: {
					
					sps.EngineerAllotComplainUsecase();
					break;
				}
				case 2: {
					
					sps.engineerUpdateStatusUsecase();
					break;
				}
				case 3: {
					
					sps.complainAttendedUsecase();
					break;
				}
				case 4: {
					
					sps.changeEngineerPasswordUsecase();
					break;
				}
				case 5: {
					
					Starter.RunApplication();
					break;
				}
				default:{
					System.out.println("\nInvalid Input");
					}
				
				}
				
				
				System.out.println("\nPress - 1 : To go to main Menue");
				System.out.println("Press - 2 : To close the application");
				System.out.println("Press - 3 : To see these task again");
			
				System.out.println("\nEnter your Choice");
				int rep2 = sc.nextInt();
				
				if(rep2 == 1) {
					Starter.RunApplication();
				}
				else if(rep2 == 2) {
					res2 = false;
					
				}
				
			   }
			}	
			else {
				System.out.println("\n<------------  If you dont have credentials talk to your HOD / or /  ------------------>");
				System.out.println("\n******************* Try again ********************************************\n");
				Starter.RunApplication();
			}
			
			break;
			
		}
		
		
		case 3: {
			
			System.out.println("\nLogin first\n");
			boolean using3 =  sps.loginEmployeeUsecase();
			
			if(using3) {
			
			boolean res3 = true;
			
			while(res3) {
				
				System.out.println("\nPlease select an option to perform a task : \n");

				System.out.println("Selcet - 1 : Register any complain (hardware / software ) through the system");
				System.out.println("Selcet - 2 : View Status of your complain");
				System.out.println("Selcet - 3 : View record of all complain raised");
				System.out.println("Selcet - 4 : Change Password");
				System.out.println("Selcet - 5 : Exit");
				
				
				System.out.println("\nEnter your Choice");
				int hodKey3 = sc.nextInt();
				
				switch (hodKey3) {
				
				case 1: {
					
					sps.registerComplainUsecase();
					break;
				}
				case 2: {
					
					sps.employeeComplainStatusUsecase();
					break;
				}
				case 3: {
					
					sps.getAllRaisedComplainByEmployeeUsecase();
					break;
				}
				case 4: {
					
					sps.changeEmployeePasswordUsecase();
					break;
				}
				case 5: {
					
					Starter.RunApplication();
					break;
				}

				
				default:{
					System.out.println("\nInvalid Input");
					}
				
				}
				
				
				System.out.println("\nPress - 1 : To go to main Menue");
				System.out.println("Press - 2 : To close the application");
				System.out.println("Press - 3 : To see these task again");
				System.out.println("\nEnter your Choice");
				int rep3 = sc.nextInt();
				
				if(rep3 == 1) {
					Starter.RunApplication();
				}
				else if(rep3 == 2) {
					res3 = false;
					
				}
				
			   }
			}	
			else {
				
				System.out.println("\n******************* Try again ********************************************\n");
				System.out.println("\nPress - 1 : To Register Yourself");
				System.out.println("Press - 2 : To go to main Menue");
				System.out.println("\nEnter your Choice");
				int hep = sc.nextInt();
				
				if(hep == 1) {
					sps.registerEmployeeUsecase();
					Starter.RunApplication();
				}
				
			}
			
			break;
			
		}
		case 4:{
			
			return finalRes;
			
		}

		default:{
			
			System.out.println("<---------------   Invalis Input     --------------------------------------->");
			
			System.out.println("\n--------------------> Try Again");
			
			Starter.RunApplication();
		}
			
				
		}
		
		
		
		
		return finalRes;
		
	}
	
	
	
	
}
