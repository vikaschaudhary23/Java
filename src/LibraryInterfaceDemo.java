interface LibraryUser{
    public abstract void registerAccount();
    public abstract  void requestBook();
}
class KidUser implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(){
        if(age<12){
            System.out.println("you have successfully registered under a Kids account");
        }
        else
            System.out.println("sorry, age must be less than 12 to register as a kid");
    }
    public void requestBook(){
        if(bookType.equals("Kids"))
            System.out.println("book issued successfully, please return the book within 10 days");
        else
            System.out.println("oops, you are allowed to take only kids book");
    }
}
class AdultUser implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(){
        if(age>12)
            System.out.println("you have successfully registered under an Adult content");
        else
            System.out.println("sorry, age must be greater than 12 to register as an adult");
    }
    public void requestBook(){
        if(bookType.equals("Fiction"))
            System.out.println("book issued successfully, please return the book within 7 days");
        else
            System.out.println("oops, you are allowed to take only adult fiction books");
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser obj1 = new KidUser();
        obj1.age = 10;
        obj1.bookType = "Kids";
        obj1.registerAccount();
        obj1.requestBook();
        AdultUser obj2 = new AdultUser();
        obj2.age = 5;
        obj2.bookType = "Fiction";
        obj2.registerAccount();
        obj2.requestBook();
    }
}
