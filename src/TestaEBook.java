
public class TestaEBook 
{
	public static void main(String[] args) 
	{
		EBook ebook = new EBook();
		
		ebook.titulo = "A Volta dos Que Não Se Foram";
		ebook.autor = "Junin Du Grau";
		ebook.categoria = "Drama";
		ebook.valor = 200;
		ebook.aplicarDesconto();		
		
		System.out.println("Livro: " + ebook.titulo + "\nAutor: " + ebook.autor + "\nCategoria: " + ebook.categoria + "\nPreço: " + ebook.valor);
	}
}
