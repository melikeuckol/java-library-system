import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> bookList;

    Library(){
        this.bookList=new ArrayList<>();
    }

    public void addBook(Book book){
        bookList.add(book);
    }
    public void removeBook(int id){
        bookList.remove(id);
    }
    public void listBooks(){
        if(bookList.isEmpty()){
            System.out.println("Henüz kitap eklenmedi");
        }
        else {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }
}

    public void searchByCategory(String category){
        List<Book> categoryList=new ArrayList<>();
     for(Book book:bookList){
         if(book.getCategory().equals(category)){
             categoryList.add(book);
         }
     }
     if(categoryList.isEmpty()){
         System.out.println("Eşleşen bir kategori bulunamadı.");
     }
     else{
         for(Book book :categoryList){
             System.out.println(book);
         }
     }
    }

    public Book getBookById(int id){
        for(Book book:bookList){
            if(book.getId()==id){
                return book;
            }
        }
        return null;
    }
}
