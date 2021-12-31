package yourpackage;
import java.util.*;
public class HouseRental {
  

    public static void main(String[] args) {
      // TODO Auto-generated method stub
      int choice;
      int choicelocation;
      int choicehouse;
      int addNilai= 100;
      int addBangi= 200;
      int addKL= 300;
      int n;
      Scanner in = new Scanner(System.in); 
      
      
      
      LinkedList<String> Location = new LinkedList<>();
      
      LinkedList<String> housenameNilai = new LinkedList<>();
      housenameNilai.add("<1> Acacia : RM2000");
      housenameNilai.add("<2>Desa Jati: RM1800");
      LinkedList<String> houseownedNilai = new LinkedList<>();
      LinkedList<Integer> bookingIDNilai = new LinkedList<>();
      LinkedList<String> custnameNilai = new LinkedList<>();
      
      LinkedList<String> housenameBangi = new LinkedList<>();
      housenameBangi.add("<1> Melor: RM1750");
      housenameBangi.add("<2> Bandar Baru:RM2300");
      LinkedList<String> houseownedBangi = new LinkedList<>();
      LinkedList<Integer> bookingIDBangi = new LinkedList<>();
      LinkedList<String> custnameBangi = new LinkedList<>();
      
      
      LinkedList<String> housenameKL = new LinkedList<>();
      housenameKL.add("<1> Setia: RM2500");
      housenameKL.add("<2> Pandan Indah: RM1500");
      LinkedList<String> houseownedKL = new LinkedList<>();
      LinkedList<Integer> bookingIDKL = new LinkedList<>();
      LinkedList<String> custnameKL = new LinkedList<>();


      
      
      mainLoop : while (true) {
      System.out.println("--------------------------------------------------------");
      System.out.println("               Welcome to House Rental                  ");
      System.out.println("--------------------------------------------------------");
      System.out.println( );
      System.out.println("If you are customer press 1");
      System.out.println("If you are owner press 2");
      choice = in.nextInt();
      
      if(choice==1) {
        System.out.println("Please choose the Location");
        System.out.println();
        System.out.println("*******The Location*******");
        System.out.println();
        System.out.println("<1> Nilai, Negeri Sembilan");
        System.out.println("<2> Bangi, Selangor");
        System.out.println("<3> Kuala Lumpur");
        System.out.println();
        choicelocation = in.nextInt();
        
        
        if(choicelocation == 1)
        { 
          System.out.println("Please choose your house: ");
          System.out.println();
          System.out.println("****List of Available House****");
          for (n=0; n<housenameNilai.size();n++)
          {
           String str = housenameNilai.get(n);
           System.out.println("" +str);

           
          }
          choicehouse = in.nextInt();
          System.out.println();
          
       
         houseownedNilai.add(housenameNilai.get(choicehouse-1));
         housenameNilai.remove(choicehouse-1);
            System.out.println("Please Register to rent the house");
            System.out.println();
            addNilai++;
            System.out.println("Enter your name");
            in.nextLine(); //scanner
            String name = in.nextLine();
            System.out.println();
            custnameNilai.add(name);
            
            bookingIDNilai.add(addNilai);
            
            
            System.out.println("Your booking is successfull");
            System.out.println("Your id booking is: " + addNilai);
            
            
          

          
          /*else if(choicehouse == 2) 
          {
            System.out.println("Please Register to rent the house");
            System.out.println();
            add++;
            System.out.println("Enter your name");
            in.nextLine(); //scanner
            String name = in.nextLine();
            System.out.println();
            custname.add(name);
            
            bookingID.add(add);
            Location.add("Nilai, Negeri Sembilan");
            housename.add("Desa Jati");
            houseprice.add("RM1800");
            
            
            System.out.println("Your booking is successfull");
            System.out.println("Your id booking is: " + add);
            
            DesaJati.remove(new Integer(choicehouse));  
          }
          */
  
        }
        
        else if(choicelocation == 2) 
        {
         System.out.println("Please choose your house: ");
            System.out.println();
            System.out.println("****List of Available House****");
            for (n=0; n<housenameBangi.size();n++)
            {
             String str = housenameBangi.get(n);
             System.out.println("" +str);

             
            }
            choicehouse = in.nextInt();
            System.out.println();
            
         
           houseownedBangi.add(housenameBangi.get(choicehouse-1));
           housenameBangi.remove(choicehouse-1);
              System.out.println("Please Register to rent the house");
              System.out.println();
              addBangi++;
              System.out.println("Enter your name");
              in.nextLine(); //scanner
              String name = in.nextLine();
              System.out.println();
              custnameBangi.add(name);
              
              bookingIDBangi.add(addBangi);
              
              
              System.out.println("Your booking is successfull");
              System.out.println("Your id booking is: " + addBangi);
        }
        
        else if(choicelocation == 3) 
        {
                   System.out.println("Please choose your house: ");
            System.out.println();
            System.out.println("****List of Available House****");
            for (n=0; n<housenameNilai.size();n++)
            {
             String str = housenameNilai.get(n);
             System.out.println("" +str);

             
            }
            choicehouse = in.nextInt();
            System.out.println();
            
         
           houseownedNilai.add(housenameNilai.get(choicehouse-1));
           String str = housenameNilai.remove(choicehouse-1);
              System.out.println("Please Register to rent the house");
              System.out.println();
              addKL++;
              System.out.println("Enter your name");
              in.nextLine(); //scanner
              String name = in.nextLine();
              System.out.println();
              custnameKL.add(name);
              
              bookingIDKL.add(addBangi);
              
              
              System.out.println("Your booking is successfull");
              System.out.println("Your id booking is: " + addKL);
        
        }  
      }
      
      else 
      {
        System.out.println("Enter your username: ");
        in.nextLine();
        String username = in.nextLine();
        
        System.out.println("Enter your password: ");
        String password = in.nextLine();
        
        if(username == "owner" && password== "1234") 
         {
          System.out.println("Choose: ");
          System.out.println("1.Detail");
          System.out.println("2.Exit");
          int owner = in.nextInt();
          
          if(owner == 1) {
            System.out.println();
            System.out.println("Booking House Information: ");
            System.out.println();
                                    
          
          }
          
        }
        
      }
      
    }
  }    
}
