public class constructor {
    Integer year;
    String name;
    Integer price;
    public constructor(Integer year,String name,Integer price)
    {
      this.year=year;
      this.name=name;
      this.price=price;
    }
    public void displaycardetails()
    {
        System.out.printf("Year:"+ year,"Name:"+ name,"Price:"+price);
    }
    public static void main(String [] args)
    {
     constructor car=new constructor(2024,"Hyundai",500000);
     car.displaycardetails();
    }
    }

   

