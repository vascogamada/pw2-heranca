
public class TestaLivroFisico 
{
	public static void main(String[] args) 
	{
		LivroFisico livro = new LivroFisico();
		
		livro.titulo = "A Voz Que N�o Fala";
		livro.autor = "Cleitin da ZN";
		livro.categoria = "Suspense";
		livro.valor = 150;
		livro.aplicarDesconto();
		livro.getTaxaImpressao();
		
		System.out.println("Livro: " + livro.titulo + "\nAutor: " + livro.autor + "\nCategoria: " + livro.categoria + "\nPre�o: " + livro.valor);
	}
}
