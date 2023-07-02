package Aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entidades.Comentarios;
import Entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios c1 = new Comentarios("Boa viagem");
		Comentarios c2 = new Comentarios("Uau, isso é incrível!");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),  //.parse nos permitem converter uma string para um outro tipo
				"Viajar para a Nova Zelândia",
				"Vou visitar este país maravilhoso!",
				12);
		
		p1.addComentarios(c1);
		p1.addComentarios(c2);
		
		Comentarios c3 = new Comentarios("Bom passeio");
		Comentarios c4 = new Comentarios("Que a força esteja com você!");
		
		Post p2 = new Post(
				sdf.parse(" 28/07/2018 23:14:19"),  //.parse nos permitem converter uma string para um outro tipo
				"Boa noite, galera",
				"Vejo vocês amanhã!",
				5);
		
		p2.addComentarios(c3);
		p2.addComentarios(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
