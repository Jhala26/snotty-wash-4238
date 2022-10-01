package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Complain;
import com.masai.bean.ComplainStatus;
import com.masai.bean.Employee;
import com.masai.bean.Engineer;
import com.masai.bean.Hod;
import com.masai.dao.SupportDao;
import com.masai.dao.SupportDaoImpl;
import com.masai.exception.ComplainException;
import com.masai.exception.EmployeeException;
import com.masai.exception.EngineerException;
import com.masai.exception.HodException;

public class SupportCalling {
	
	
  
	public static void main(String[] args) {
		
		
//	SupportCalling scal = new SupportCalling();
	
//	scal.HodUsecase();
	
//	scal.registerEngineerUsecase();
	
//	scal.getAllRegisterEngineerUsecase();
	
//	scal.deleteEngineerUsecase();
		
//	scal.registerEmployeeUsecase();

//	scal.loginEmployeeUsecase();
	
//	scal.registerComplainUsecase();
	
//	scal.getAllRaisedComplainUsecase();
	
//	scal.allotingComplainToEngineerUsecase();
	
//	scal.employeeComplainStatusUsecase();
	
//	scal.getAllRaisedComplainByEmployeeUsecase();
	
	
//	scal.changeEmployeePasswordUsecase();
	
	
//	scal.loginEngineerUsecase();
	
//	scal.EngineerAllotComplainUsecase();
	
	
//	scal.engineerUpdateStatusUsecase();
	
	
//	scal.complainAttendedUsecase();
	
	
//	scal.changeEngineerPasswordUsecase();
	
	
	
	System.out.println("--------------------------   Welcome to Online Hardware and software support Application-------------------");
	
	boolean result =   Starter.RunApplication();
	
	if(result) {
		System.out.println("                      Thank You for Using this application (><)                          ");
	}
	
	
	
	
	
	}
	
	
	
	
//	HOD Section
	
//	loginHod Calling
	
	public boolean HodUsecase() {
		
		boolean res = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter HOD username");
		String user = sc.next();
		System.out.println("Enter HOD Password");
		String pass = sc.next();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		
		
		try {
			
			Hod hod = dao.loginHod(user, pass);
			
			System.out.println("\n-------------  Welcome HOD "+ hod.getHodName() + "   --------------------------");
			res = true;
			
		} catch (HodException e) {
			
			System.out.println(e.getMessage());
		}
	
		
		return res;
	}
	
	
	
//	registerEngineer Calling
	
	public void registerEngineerUsecase() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Engineer Name :");
		String engName = sc.nextLine();
		
		System.out.println("Enter Engineer Username(Email) :");
		String engUsername = sc.next();
		
		System.out.println("Enter Engineer Password :");
		String engPassword = sc.next();
		
		System.out.println("Enter Engineer category (Hardware/Software) :");
		String category = sc.next();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		
		Engineer engineer = new Engineer(engName, engUsername, engPassword, category);
		
		
		String res = dao.registerEngineer(engineer);
		
		
		System.out.println(res);
		
	}
	
	
	
//	getAllRegisterEngineer Calling
	
	
	public void getAllRegisterEngineerUsecase() {
		
		SupportDao dao = new SupportDaoImpl();
		
		try {
			
			List<Engineer> engineer = dao.getAllRegisterEngineer();
			
			engineer.forEach(s ->{
				
				System.out.println("\nEngineer Id : "+ s.getEngId());
				System.out.println("Engineer Name : "+ s.getEngName());
				System.out.println("Engineer Username : "+ s.getEngUsername());
				System.out.println("Engineer Password : "+ s.getEngPassword());
				System.out.println("Engineer Category : "+ s.getCategory());
				
				System.out.println("\n----------------------------------------------------------------------------------------");
				
			});
			
		} catch (EngineerException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	
	
//	deleteEngineer() calling
	
	
	public void deleteEngineerUsecase() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Engineer ID :");
		int engId = sc.nextInt();
		
		SupportDao dao = new SupportDaoImpl();
		
		String message = dao.deleteEngineer(engId);
		
		System.out.println( engId+ " " +message);
		
		
	}
	
	
//	getAllRaisedComplainUsecase() calling
	
	
	public void getAllRaisedComplainUsecase() {
		
			SupportDao dao = new SupportDaoImpl();
		
		try {
			
			List<Complain> complain = dao.getAllRaisedComplain();
			
			complain.forEach(s ->{
				
				System.out.println("\nComplain Id : "+ s.getCompId());
				System.out.println("Complain Type : "+ s.getComType());
				System.out.println("Employee Id : "+ s.getEmplId());
				System.out.println("Complain Status : "+ s.getCompStatus());
				System.out.println("Complain Description : "+ s.getDescription());
				
				System.out.println("\n----------------------------------------------------------------------------------------");
				
			});
			
		} catch (ComplainException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	
	
//	allotingComplainToEngineerUsecase() Calling
	
	
	public void allotingComplainToEngineerUsecase() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Complain Id");
		int compId= sc.nextInt();

		System.out.println("Enter the Engineer Id");
		int engId= sc.nextInt();
		
		System.out.println("Enter type of complain(hardware / software ) :");
		String type = sc.next();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		
		try {
			
			String res = dao.allotingComplainToEngineer(compId, engId, type);
			
			System.out.println(res);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
	
	
	
//	Employee Section
	
//	registerEmployeeUsecase() calling
	
	
	
	public void registerEmployeeUsecase() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID :");
		int empId = sc.nextInt();

		sc.nextLine();
		System.out.println("Enter Employee Name :");
		String empName = sc.nextLine();
		
		System.out.println("Enter Employee Username(Email) :");
		String empUsername = sc.next();
		
		System.out.println("Enter Employee Password :");
		String empPassword = sc.next();
		
		
		
		SupportDao dao = new SupportDaoImpl();
		
		
		Employee employee = new Employee(empId, empName, empUsername, empPassword);
		
		
		String res = dao.registerEmployee(employee);
		
		
		System.out.println(res);
		
		
		
		
	}
	
	
	
//	loginEmployeeUsecase Calling
	
	public boolean loginEmployeeUsecase() {
		
		boolean res = false;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee username");
		String user = sc.next();
		System.out.println("Enter Employee Password");
		String pass = sc.next();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		
		
		try {
			
			Employee employee = dao.loginEmployee(user, pass); 
			
			System.out.println("\n<-----------------  Welcome Employee "+ employee.getEmpName() + "  --------------------------->");
			
			res = true;
			
		} catch (EmployeeException e) {
			
			System.out.println("\n---------------------> "+e.getMessage());
		
		}
	
		return res;
		
	}
	
	
//	registerComplainUsecase Calling
	
	public void registerComplainUsecase() {
		
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Enter Complain Type(hardware / software) :");
		String compType = sc.next();
		
		System.out.println("Enter Your Employee Id :");
		int empId = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Complain Description :");
		String Desc = sc.nextLine();
		
		
		
		SupportDao dao = new SupportDaoImpl();
		
		
		Complain complain = new Complain(compType, empId, Desc);
		
		
		Complain comp = dao.registerComplain(complain);
		
		
		System.out.println("\nYour Complain Id is : "+ comp.getCompId());
		
		
	}
	
	
	
//	employeeComplainStatusUsecase calling
	
	public void employeeComplainStatusUsecase() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Complained Id :");
		int compId = sc.nextInt();
		
		SupportDao dao = new SupportDaoImpl();
		
		try {
			
			ComplainStatus compSt =  dao.employeeComplainStatus(compId);
			
			System.out.println("\nComplained Id : "+ compSt.getCompId());
			System.out.println("Engineer Id : "+ compSt.getEngId());
			System.out.println("Engineer Name : "+ compSt.getEngName());
			System.out.println("Engineer Email : "+ compSt.getEngEmail());
			System.out.println("Complained Type : "+ compSt.getComType());
			System.out.println("Complained Status : "+ compSt.getComStatus());
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	
	
//	getAllRaisedComplainByEmployeeUsecase Calling
	
	
	public void getAllRaisedComplainByEmployeeUsecase() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Id :");
		int empId = sc.nextInt();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		try {
			
			List<Complain> complain = dao.getAllRaisedComplainByEmployee(empId);
			
			complain.forEach(s ->{
				
				System.out.println("\nComplain Id : "+ s.getCompId());
				System.out.println("Complain Type : "+ s.getComType());
				System.out.println("Employee Id : "+ s.getEmplId());
				System.out.println("Complain Status : "+ s.getCompStatus());
				System.out.println("Complain Description : "+ s.getDescription());
				
				System.out.println("\n----------------------------------------------------------------------------------------");
				
			});
			
		} catch (ComplainException e) {
			
			System.out.println(e.getMessage());
			
		}

		
	}
	
	
	
//	changeEmployeePasswordUsecase Calling
	
	
	public void changeEmployeePasswordUsecase() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		int empId= sc.nextInt();

		System.out.println("Enter the Old Password");
		String oldPass = sc.next();
		
		System.out.println("Enter New Password :");
		String newPass = sc.next();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		
		try {
			
			String res = dao.changeEmployeePassword(empId, oldPass, newPass);
			
			System.out.println(res);
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	
// Engineer Section-----------------------------------
	
//	loginEngineerUsecase Calling
	
	public boolean loginEngineerUsecase() {
		
		boolean res = false;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Engineer username");
		String user = sc.next();
		System.out.println("Enter Engineer Password");
		String pass = sc.next();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		
		
		try {
			
			Engineer engineer = dao.loginEngineer(user, pass);
			
			System.out.println("\n-------------------  Welcome Employee "+ engineer.getEngName() + "   --------------------------");
			
			res = true;
			
		} catch (EngineerException e) {
			
			System.out.println("\n<-------------  " + e.getMessage() + "  ---------------------->");
		}
		
		
		return res;
		
	}
	
	
	
//	EngineerAllotComplainUsecase Calling
	
	public void EngineerAllotComplainUsecase() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Engineer Id :");
		int engId = sc.nextInt();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		try {
			
			List<ComplainStatus> compSt = dao.EngineerAllotComplain(engId);
			
			compSt.forEach(s ->{
				
				System.out.println("\nComplained Id : "+ s.getCompId());
				System.out.println("Engineer Id : "+ s.getEngId());
				System.out.println("Engineer Name : "+ s.getEngName());
				System.out.println("Engineer Email : "+ s.getEngEmail());
				System.out.println("Complained Type : "+ s.getComType());
				System.out.println("Complained Status : "+ s.getComStatus());
				
				System.out.println("\n----------------------------------------------------------------------------------------");
				
			});
			
		} catch (EngineerException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	
	
//	engineerUpdateStatusUsecase Calling
	
	
	public void engineerUpdateStatusUsecase() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the COmplain Id");
		int comId= sc.nextInt();
		
		System.out.println("Enter New Status :");
		String newSta = sc.next();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		
		try {
			
			String res = dao.engineerUpdateStatus(comId, newSta);
			
			System.out.println(res);
			
		} catch (ComplainException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
	
	
	
//	complainAttendedUsecase Calling
	
	public void complainAttendedUsecase() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Engineer Id :");
		int engId = sc.nextInt();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		try {
			
			List<ComplainStatus> compSt = dao.complainAttended(engId);
			
			compSt.forEach(s ->{
				
				System.out.println("\nComplained Id : "+ s.getCompId());
				System.out.println("Engineer Id : "+ s.getEngId());
				System.out.println("Engineer Name : "+ s.getEngName());
				System.out.println("Engineer Email : "+ s.getEngEmail());
				System.out.println("Complained Type : "+ s.getComType());
				System.out.println("Complained Status : "+ s.getComStatus());
				
				System.out.println("\n----------------------------------------------------------------------------------------");
				
			});
			
		} catch (EngineerException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	
	
	
//	changeEngineerPasswordUsecase Calling
	
	
	public void changeEngineerPasswordUsecase() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Engineer Id");
		int engId= sc.nextInt();

		System.out.println("Enter the Old Password");
		String oldPass = sc.next();
		
		System.out.println("Enter New Password :");
		String newPass = sc.next();
		
		
		SupportDao dao = new SupportDaoImpl();
		
		
		try {
			
			String res = dao.changeEngineerPassword(engId, oldPass, newPass);
			
			System.out.println(res);
			
		} catch (EngineerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
	

}
	
	
