import java.util.HashMap;
public class Library{
  private HashMap<String,Boolean> lib=new HashMap<String,Boolean>();
  public Library(){
    //This program modifies the books in a hashmap 
  }
 
  public void getFinishedBooks(HashMap<String,Boolean> library){
    if(library.size()<1)
      System.out.println("Error: HashMap is empty!");
    else
    {
      for(String a: library.keySet())
        if(library.get(a)==true)
          System.out.println(a);
    }
  }
  
  public void getStoredBooks(){
    System.out.println("\r");
    if(lib.size()<1)
      System.out.println("Error: HashMap is empty!");
    else
    {
      for(String b: lib.keySet())
          System.out.println(b);
    }
  }
  public void storeBooks(HashMap<String,Boolean> library){
         lib.putAll(library);
  }
  public static void main(String[] args){
     HashMap<String,Boolean> myBooks=new HashMap<String,Boolean>();
    myBooks.put("Road Down The Funnel",true);
    myBooks.put("Rat: A Biology",false);
    myBooks.put("TimeIn",true);
    myBooks.put("3D Food Printing",false);
    Library myLibrary=new Library();
    myLibrary.getFinishedBooks(myBooks);
    myLibrary.getStoredBooks();
    myLibrary.storeBooks(myBooks);
    myLibrary.getStoredBooks();
  }
}