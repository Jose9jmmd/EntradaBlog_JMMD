package com.EntradaBlog;

/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó el (13/03/2021 ) por (José Manuel Martínez Deltell).
 * @since 13/03/2021
 * @author José Manuel Martínez Deltell
 * @version 2.3
 */

public class EntradaBlog_JMMD {

	/** 
	 * Separador es el ccarácter que separa ENTRADA DE del
	 * nombre del autor
	 */

	public static char separador = ':';
	private int id;
	private String texto;
	private String autor;

	/** 
	 * Constructor de la clase. Recibe una serie de parametros. 
	 * 
	 * @param id Es el número de entrada.
	 * @param autor Es el nombre del autor de la entrada.
	 * @param texto Es el texto que contiene la entrada.
	 * @throws IllegalArgumentException Si el número de entrada es negativo, lanza una excepción.
	 */
	public EntradaBlog_JMMD(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}

	@Override
	public String toString() {
		String cad = "";
		cad += "\nENTRADA DE" + separador + autor;
		cad += "\n " + texto;
		return cad;
	}

	/**
	 * @return Devuelve el número de la entrada.
	 */
	public int getId() {
		return this.id;
	}

	/** 
	 * @return Devuelve el texto completo de la entrada.
	 */
	public String getTexto() {
		return this.texto;
	}

	/**
	 * @return Devuelve el nombre del autor de la entrada en mayúsculas.
	 */
	public String getAutor() {
		return this.autor.toUpperCase();
	}

	/**
	 * @return Devuelve el nombre del autor. Ya no se usa. @see getAutor.
	 */
	public String devuelveAutor() {
		return this.autor;
	}

	/**
	 * @param args No tiene porqué tener argumentos.
	 */
	public static void main(String[] args) {
		//Modificar.
		EntradaBlog_JMMD e1=new EntradaBlog_JMMD(3 ,"José Manuel Martínez Deltell","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}

}
