package grocery;// Record-objects for Reservations

import java.util.*;

// Handling Users incl. login

public class SysUser
{
   InputHandler userIO = new InputHandler();

   
   // Making pointer ArrayList for objects

   static ArrayList<UserO> userA = new ArrayList<UserO>(); 
   
   // Initialising - Reading from file and generating user objects
   
   public static void initData()
   {
       FileHandler fileIO = new FileHandler();

       Scanner input = new Scanner(fileIO.readFile("dataUser.txt"));
               
      while (input.hasNextLine())
      {
         String fileLine = input.nextLine();
         Scanner item = new Scanner(fileLine);
         int userID = item.nextInt();
         int userPwd = item.nextInt();
         String userName = item.nextLine();
         userName = userName.substring(1,userName.length());
         userA.add(new UserO(userID,userPwd,userName));
      }
   }
 

   // Show list of users
   
   public static void showUserList()
   {
      System.out.println("LIST OF SYSTEM USERS: ");
      System.out.println();
      for (int i=0; i<3; i++)
      {
         System.out.println(userA.get(i).getUserID() + " - " + userA.get(i).getUserPwd() + " - " + userA.get(i).getUserName());
      }
      System.out.println();
   }
  
   // Validation of password is not implemented yet

   public boolean validateUser(int userID, int userPwd)
   {
      return true;
   }
   
}