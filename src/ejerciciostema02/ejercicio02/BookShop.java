package ejerciciostema02.ejercicio02;

class BookShop {
    private Book[] books;
    private int numberOfBooks;  // Cantidad de libros almacenados
    /**
     * Constructor de la clase
     * @param capacity: capacidad en número de libros
     */
    public BookShop(int capacity) {
        books = new Book[capacity];
        numberOfBooks = 0;
    }

    /**
     * Método para agregar un nuevo libro
     * @param book: libro que agregamos
     * @return: 1 si se ha podido agregar, -1 si no hay capacidad
     */
    public int addBook(Book book) {
        if (numberOfBooks < books.length) {
            // Aún hay capacidad
            books[numberOfBooks] = book;    // se agrega el libro
            numberOfBooks++;                // se incrementa el contador de libros guardados
            return 1;
        }
        System.out.println("NO SE HA PODIDO INCLUIR EL LIBRO: " + book);
        return -1;
    }
    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b.toString());
        }
    }
}