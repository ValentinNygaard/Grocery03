package grocery;// Record-objects for Reservations
// Record-objects for users

public class UserO
{
   private int userID;
   private int userPwd;
   private String userName;
   
      
   public UserO(int userID,int userPwd,String userName)
   {
      this.userID = userID;
      this.userPwd = userPwd;
      this.userName = userName;
  }

   // Methods for accessing object variables

   public int getUserID()
   {
      return userID;
   }
   
   public int getUserPwd()
   {
      return userPwd;
   }
   
   public String getUserName()
   {
      return userName;
   }

   public void setUserID(int userID)
   {
      this.userID = userID;
   }
   
   public void setUserPwd(int userPwd)
   {
      this.userPwd = userPwd;
   }
   
   public void setUserName(String userName)
   {
      this.userName = userName;
   }
   
   
}