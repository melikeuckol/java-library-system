public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        library.addBook(new Book(1,"Karamozov Kardeşler","Psikolojik","Dostoyevski",1880));
        library.addBook( new Book(2,"Kinyas ve Kayra","Psikolojik","Hakan Günday",2000));
        library.addBook(new Book(3,"Kırlangıç Çığlığı","Polisiye","Ahmet Ümit",2018));
        library.addBook(new Book(4,"Sefiller","Roman","Victor Hugo",1862));
        library.addBook(new Book(5,"Suç ve Ceza","Roman","Dostoyevski",1866));
        System.out.println("Kütüphanedeki kitaplar:");
        library.listBooks();

        System.out.println("Psikolojik kategorisindeki kitaplar:");
        library.searchByCategory("Psikolojik");

        System.out.println("Idsi 3 olan kitap: " + library.getBookById(3));

    }
}
