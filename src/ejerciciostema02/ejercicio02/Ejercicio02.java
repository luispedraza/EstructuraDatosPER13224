package ejerciciostema02.ejercicio02;

/**
 * Codificar un programa que gestione una tienda de libros (físicos) que tiene una capacidad limitada de almacenamiento.
 * Cada libro es un objeto de la clase Book con las siguientes funcionalidades:
 * •	Atributos: title (String), author (String), yearOfPublication (int).
 * •	Constructor con tres parámetros (uno por atributo).
 * •	Métodos getters para obtener los valores de cada atributo.
 * •	Método toString() para devolver la información del libro en formato String.
 *
 * La clase BookShop representa la tienda de libros, y tiene las siguientes características:
 * •	Atributos: un array de libros (Book[] books), que almacena los libros disponibles.
 * •	Constructor que inicializa el array con la capacidad de almacenamiento de la librería.
 * •	Método addBook(Book book) que añade un libro a la librería si hay espacio. Si no lo hay muestra un mensaje por consola:
 *          NO SE HA PODIDO INCLUIR EL LIBRO
 * •	Método displayBooks() que muestra todos los libros almacenados en la librería.
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        // Probamos las clases:
        BookShop shop = new BookShop(3);
        // Agregamos libros:
        shop.addBook(new Book("Primera memoria", "Ana María Matute", 1959));
        shop.addBook(new Book("Los niños tontos", "Ana María Matute", 1956));
        shop.addBook(new Book("Olvidad rey Gudú", "Ana María Matute", 1996));
        shop.addBook(new Book("Luciérnagas", "Ana María Matute", 1955));
        // Mostramos los libros almacenados
        shop.displayBooks();
    }
}
