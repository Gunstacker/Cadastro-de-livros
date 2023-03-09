public class Livro {
	private String nome_livro;
	private String desc;
	private String autor;
	private String data;
	
	public Livro(String nome_livro, String desc, String autor, String data) {
		this.nome_livro = nome_livro;
		this.desc = desc;
		this.autor = autor;
		this.data = data;
	}
	
	
	public String getNome_livro() {
		return nome_livro;
	}
	public void setNome_livro(String nome_livro) {
		this.nome_livro = nome_livro;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
