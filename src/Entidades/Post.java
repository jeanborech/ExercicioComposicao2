package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    //static para nao criar uma copia do objeto sdf para cada Post, vai ter apenas 1 copia para a aplicação inteira
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private List<Comentarios> comentarios = new ArrayList<>(); //listas não se usa método set, se criar metodos add e remover			
    
	public Post() {
	}

	public Post(Date momento, String titulo, String conteudo, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}
   
	public void addComentarios(Comentarios comments) { //para adicionar um 'Comentarios' recebendo um coments como argumento
    	comentarios.add(comments); //esse metodo vai na 'list comentarios' que chama o metodo add para adiconario o comments que veio como argumento
    }
	public void removerComentarios(Comentarios comments) {
		comentarios.remove(comments);
}

	//usar StringBuilder para consumir menos memoria e deixar menos lento do que com contatenação direta dos strings
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");    //contatenar outros strings com a função append. "\n" para quebra de linha
	    sb.append(likes + " Likes - " + 
		sdf.format(momento) + "\n"); //criar simpleDateFormat para data aparecer no formato correto
		sb.append(conteudo + "\n");
		sb.append("Comentários: \n");
		for (Comentarios c : comentarios) {  //para acrescenta todos os comentários no StringBuilder
			sb.append(c.getTexto() + "\n");
		}
	    
	    return sb.toString(); // retornar e converter StringBuilder para String 
	
	}

	
	

	
}
