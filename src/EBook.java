
public class EBook extends Livro
{
	private String marcaDAgua;
	
	public void aplicarDesconto()
	{
		valor = valor * 0.80;
	}

	public String getMarcaDAgua() {
		return marcaDAgua;
	}

	public void setMarcaDAgua(String marcaDAgua) {
		this.marcaDAgua = marcaDAgua;
	}
}
