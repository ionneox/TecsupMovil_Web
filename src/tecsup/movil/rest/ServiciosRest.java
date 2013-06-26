package tecsup.movil.rest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DialogosRest
 */
@WebServlet("/ServiciosRest")
public class ServiciosRest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiciosRest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");		
		String modulo = request.getParameter("modulo");
		String accion = request.getParameter("accion");
		

		// \"\":\"\",
		
		/*
		 * Módulo 1
		 */
		if ("login".equals(modulo) ){			
			if (  "102030".equals(usuario) && "tecsup00".equals(clave) ) {
				out.println("{\"tipo\":\"1\"}");	
			} else { 
				out.println("{\"tipo\":\"0\"}");
			}
			return;
		}
		
		
		/*
		 * Validación previa para todos los servicios
		 */
		if ( ! ( "102030".equals(usuario) && "tecsup00".equals(clave) ) ){			
			out.println("{ \"tipo\": \"0\"}");			
			return;
		}		
		
		/*
		 * Módulo 2
		 */
		if ("dialogo".equals(modulo) && "listar".equals(accion)){
			out.println("[");

			out.println("{\"codDialogo\":\"501\",\"titulo\":\"Revisión de trabajo\",\"autor\":\"David Rodriguez\",\"fecha\":\"2012-05-26\"},");
			out.println("{\"codDialogo\":\"533\",\"titulo\":\"Autoevaluación\",\"autor\":\"Javier Berrospi\",\"fecha\":\"2012-05-28\"}");
			
			out.println("]");
			return;
		}
		
		if ("dialogo".equals(modulo) && "obtener".equals(accion)){
			
			String codDialogo = request.getParameter("codDialogo");
			out.println("{\"codDialogo\":\""+codDialogo+"\",\"curso\":\"Programación de App I\",\"unidad\":\"Unidad 13: Android\",\"titulo\":\"Revisión de trabajo\", \"autor\":\"David Rodriguez\",\"fecha\":\"2012-05-26\", \"contenido\":\"Este lunes será la revisión\" }");
			return;
		}
		
		if ("dialogo".equals(modulo) && "responder".equals(accion)){
			
			String codDialogo = request.getParameter("codDialogo");
			String contenido = request.getParameter("contenido");
			
			out.println("{\"grabado\": \"OK\" }");
			return;
		}
		
		/*
		 * Módulo 3
		 */
		if ("avisos".equals(modulo) && "listar".equals(accion)){
			out.println("[");

			out.println("{\"codAviso\":\"231\",\"profesor\":\"Javier De La Cruz\",\"curso\":\"Redes II\",\"fecha\":\"2012-05-26\"},");
			out.println("{\"codAviso\":\"289\",\"profesor\":\"Adolfo Cáceres\",\"curso\":\"Telecomunicaciones I\",\"fecha\":\"2012-05-28\"}");
			
			out.println("]");
			return;
		}
		
		if ("avisos".equals(modulo) && "obtener".equals(accion)){
			
			String codAviso = request.getParameter("codAviso");
			out.println("{\"codAviso\":\""+codAviso+"\",\"profesor\":\"Adolfo Cáceres\",\"curso\":\"Telecomunicaciones I\",\"fecha\":\"2012-05-28\", \"texto\":\"<b>Estimados alumnos</b> Acercarse a mi oficina.\" }");
			return;
		}
		

		
		/*
		 * Módulo 4
		 */
		if ("notas".equals(modulo) && "listar_cursos".equals(accion)){
			
			out.println("[");
			
			out.println("{\"codCurso\": \"1\", \"nombre\":\"Programación de Aplicaciones. II\"},");
			out.println("{\"codCurso\": \"2\", \"nombre\":\"Redes de Computadoras III\"},");
			out.println("{\"codCurso\": \"3\", \"nombre\":\"Comunicaciones de Datos II\"},");
			out.println("{\"codCurso\": \"4\", \"nombre\":\"Seguridad Informatica I\"},");
			out.println("{\"codCurso\": \"5\", \"nombre\":\"Gestión de Recursos Humanos\"},");
			out.println("{\"codCurso\": \"6\", \"nombre\":\"Gestión de empresas\"},");
			out.println("{\"codCurso\": \"7\", \"nombre\":\"Arquitectura de Computadoras\"},");
			out.println("{\"codCurso\": \"8\", \"nombre\":\"Ingles\"}");

			out.println("]");	
			return;
		}
		
		if ("notas".equals(modulo) && "obtener".equals(accion)){
			
			String codCurso = request.getParameter("codCurso");	
			
			int icodCurso = Integer.parseInt(codCurso);
			
			if (icodCurso == 1) {
			
				out.println("[");			
				
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"12\" },");
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"08\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"16\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"20\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"09\" },");
				out.println("{\"tipoevaluacion\": \"TA\", \"nota\":\"11\" },");
				out.println("{\"tipoevaluacion\": \"TA\", \"nota\":\"01\" },");
				out.println("{\"tipoevaluacion\": \"F\", \"nota\":\"07\" }");
				
				out.println("]");
				return;
			
			}
			if (icodCurso == 2) {
				
				out.println("[");			
				
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"16\" },");
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"18\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"20\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"20\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"01\" }");
				
				out.println("]");
				return;
				
				}
			
			if (icodCurso == 3) {
				
				out.println("[");			
				
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"08\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"01\" }");
				
				out.println("]");
				return;
				
				}
			if (icodCurso == 4) {
				
				out.println("[");			
				
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"08\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"01\" }");
				
				out.println("]");
				return;
				
				}
			if (icodCurso == 5) {
	
				out.println("[");			
				
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"08\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"01\" }");
				
				out.println("]");
				return;
	
	}
			if (icodCurso == 6) {
	
				out.println("[");			
				
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"08\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"01\" }");
				
				out.println("]");
				return;
				
	}
			if (icodCurso == 7) {
				
				out.println("[");			
				
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"08\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"01\" }");
				
				out.println("]");
				return;
				
	}
			if (icodCurso == 8) {
				
				out.println("[");			
				
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"L\", \"nota\":\"08\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"02\" },");
				out.println("{\"tipoevaluacion\": \"T\", \"nota\":\"01\" }");
				
				out.println("]");
				return;
				
	}
		}
		
		/*
		 * Módulo 5
		 */
		if ("noticias".equals(modulo) && "listar_categorias".equals(accion)){
			
			out.println("[");
			
			out.println("{\"codCategoria\": \"1\", \"nombre\":\"Cultura\"},");
			out.println("{\"codCategoria\": \"2\", \"nombre\":\"Actualidad\"},");
			out.println("{\"codCategoria\": \"3\", \"nombre\":\"Biblioteca\"},");
			out.println("{\"codCategoria\": \"4\", \"nombre\":\"Servicios\"},");
			out.println("{\"codCategoria\": \"5\", \"nombre\":\"Diversos\"}");
	
			out.println("]");	
			return;
		}
		
		if ("noticias".equals(modulo) && "listar_noticias".equals(accion)){
			
			String codCategoria = request.getParameter("codCategoria");		
			
			int iCodCategoria = Integer.parseInt(codCategoria);
			
			if ( iCodCategoria == 1 ){ 
			
				out.println("[");
				
				out.println("{\"codNoticia\": \"10\", \"titulo\":\"Semana cultural en Tecsup\"},");
				out.println("{\"codNoticia\": \"11\", \"titulo\":\"Muere actor drámatico\"},");
				out.println("{\"codNoticia\": \"12\", \"titulo\":\"Publican Norma Tecnica\"},");
						
				out.println("]");	
				return;
			}
			if ( iCodCategoria == 2 ){ 
				
				out.println("[");
				
				out.println("{\"codNoticia\": \"20\", \"titulo\":\"Renuncian congresistas\"},");
				out.println("{\"codNoticia\": \"21\", \"titulo\":\"Marcha de Conga\"},");
				out.println("{\"codNoticia\": \"22\", \"titulo\":\"Inaguran sesión de talleres\"},");
		
				out.println("]");	
				return;
			}
			if ( iCodCategoria == 3 ){ 
				
				out.println("[");
				
				out.println("{\"codNoticia\": \"30\", \"titulo\":\"Sorteo de revistas Condorito\"},");
				out.println("{\"codNoticia\": \"31\", \"titulo\":\"2 x 1 los martes\"},");
				out.println("{\"codNoticia\": \"32\", \"titulo\":\"Condene sus multas\"},");
					
				out.println("]");	
				return;
			}
			
			if ( iCodCategoria == 4 ){ 
				
				out.println("[");
				
				out.println("{\"codNoticia\": \"40\", \"titulo\":\"El servicio de buses\"},");
				out.println("{\"codNoticia\": \"41\", \"titulo\":\"Mobilidad gratis\"},");
				out.println("{\"codNoticia\": \"42\", \"titulo\":\"El comedor lunes de 2x1\"},");
										
				out.println("]");	
				return;
			}
			if ( iCodCategoria == 5 ){ 
				
				out.println("[");
				
				out.println("{\"codNoticia\": \"10\", \"titulo\":\"Semana cultural en Tecsup \"},");
				out.println("{\"codNoticia\": \"11\", \"titulo\":\"Muere actor drámatico \"},");
				out.println("{\"codNoticia\": \"12\", \"titulo\":\"Publican Norma Tecnica \"},");
				out.println("{\"codNoticia\": \"20\", \"titulo\":\"Renuncian congresistas\"},");
				out.println("{\"codNoticia\": \"21\", \"titulo\":\"Marcha de Conga\"},");
				out.println("{\"codNoticia\": \"22\", \"titulo\":\"Inaguran sesión de talleres\"},");
				out.println("{\"codNoticia\": \"30\", \"titulo\":\"Sorteo de revistas Condorito\"},");
				out.println("{\"codNoticia\": \"31\", \"titulo\":\"2 x 1 los martes\"},");
				out.println("{\"codNoticia\": \"32\", \"titulo\":\"Condene sus multas\"},");
				out.println("{\"codNoticia\": \"40\", \"titulo\":\"El servicio de buses\"},");
				out.println("{\"codNoticia\": \"41\", \"titulo\":\"Mobilidad gratis\"},");
				out.println("{\"codNoticia\": \"42\", \"titulo\":\"El comedor lunes de 2x1\"},");
					
				out.println("]");	
				return;
			}
		}
		
		if ("noticias".equals(modulo) && "obtener".equals(accion)){
			
			String codNoticia = request.getParameter("codNoticia");
			
			int iCodNoticia = Integer.parseInt(codNoticia);
			
			if ( iCodNoticia == 10 ){ 
				
				
				
				out.println("{\"codNoticia\": \"10\", \"titulo\":\"Semana cultural en Tecsup\", \"texto\":\"Gran semana cultural para los jovenes de Lima\"}");
					
				
				return;
			}
			if ( iCodNoticia == 11 ){ 
				
				out.println("{\"codNoticia\": \"11\", \"titulo\":\"Muere actor drámatico\", \"texto\":\"Este viernes será el <b>simulacro</b> de sismo\"}");
					
				
				return;
			}
			if ( iCodNoticia == 12 ){ 
				
				
				
				out.println("{\"codNoticia\": \"12\", \"titulo\":\"Publican Norma Tecnica\", \"texto\":\"Estas normas tecnias entraran en vigor a partir del mes de enero del 2012\"}");
					
				
				return;
			}
			if ( iCodNoticia == 20 ){ 
				
				
				
				out.println("{\"codNoticia\": \"20\", \"titulo\":\"Renuncian congresistas\", \"texto\":\"Los congresitas renuncian a la bancada opositora, esto debido a las nuevas leyes.\"}");
					
					
				return;
			}
			if ( iCodNoticia == 21 ){ 
				
				
				
				out.println("{\"codNoticia\": \"21\", \"titulo\":\"Marcha de Conga\", \"texto\":\"Este mes se inicio la marcha en protesta por polemica ley del conga.\"}");
					
				
				return;
			}
			if ( iCodNoticia == 22 ){ 
				
				
				
				out.println("{\"codNoticia\": \"22\", \"titulo\":\"Inaguran sesión de talleres\", \"texto\":\"Los talleres tienen la finalidad de desarrollar las habilidades comunicativas de los estudiantes.\"}");
					
				
				return;
			}
			if ( iCodNoticia == 30 ){ 
				
				
				
				out.println("{\"codNoticia\": \"30\", \"titulo\":\"Sorteo de revistas Condorito\", \"texto\":\"El sorteo de las revistas condorito se realizara el dia de hoy.\"}");
					
				
				return;
			}
			if ( iCodNoticia == 31 ){ 
				
				
				
				out.println("{\"codNoticia\": \"31\", \"titulo\":\"2 x 1 los martes\", \"texto\":\"Todos los martes 2 x 1 aprovecha.\"}");
					
				
				return;
			}
			if ( iCodNoticia == 32 ){ 
				
				
				
				out.println("{\"codNoticia\": \"32\", \"titulo\":\"Condene sus multas\", \"texto\":\"Evite las suspensione y las multas con su puntualidad.\"}");
					
				
				return;
			}
			if ( iCodNoticia == 40 ){ 
				
				
				
				out.println("{\"codNoticia\": \"40\", \"titulo\":\"El servicio de buses\", \"texto\":\"El servicio de buses quedara suspendido hasta nuevo aviso por fallas mecanicas.\"}");
					
				
				return;
			}
			if ( iCodNoticia == 41 ){ 
				
				
				
				out.println("{\"codNoticia\": \"41\", \"titulo\":\"Mobilidad gratis\", \"texto\":\"Se comunica a los estudiantes de PFR que el uso de la mobilidad es gratutita.\"}");
					
				
				return;
			}
			if ( iCodNoticia == 42 ){ 
				
				
				
				out.println("{\"codNoticia\": \"42\", \"titulo\":\"El comedor lunes de 2x1\", \"texto\":\"Por ordenes genrenciales el comedor servira 2 x 1 a todos los estudiantes de Tecsup.\"}");
					
				
				return;
			}
			
			
		}
		
		/*
		 * Módulo 6
		 */		
		if ("horarios".equals(modulo) && "listar".equals(accion)){
			
			String dia = request.getParameter("dia");	
			System.out.println("____"+ dia);
			
			if (  "".equals(dia)  ) { 
			
				out.println("[");			
				
				out.println("{\"curso\": \"Programación de App. I\", \"seccion\":\"A\", \"aula\":\"707\", \"horainicio\":\"8:05\", \"horafin\":\"10:05\", \"tipo\":\"L\", \"dia\":\"2012-5-15\", \"profesor\":\"Javier de la Cruz\"},");
				out.println("{\"curso\": \"Redes II\", \"seccion\":\"A\", \"aula\":\"702\", \"horainicio\":\"10:10\", \"horafin\":\"11:30\", \"tipo\":\"T\", \"dia\":\"2012-5-15\", \"profesor\":\"Cesar Arce\"},");
				out.println("{\"curso\": \"Gestión de Empresas\", \"seccion\":\"A\", \"aula\":\"812\", \"horainicio\":\"11:35\", \"horafin\":\"12:50\", \"tipo\":\"L\", \"dia\":\"2012-5-15\", \"profesor\":\"Adolfo Caceres\"}");
				
				out.println("]");
				return;
			} else if (  "2012-5-15".equals(dia)  ) { 
					
					out.println("[");			
					
					out.println("{\"curso\": \"Programación de App. I\", \"seccion\":\"A\", \"aula\":\"707\", \"horainicio\":\"8:05\", \"horafin\":\"10:05\", \"tipo\":\"L\", \"dia\":\"2012-5-15\", \"profesor\":\"Javier de la Cruz\"},");
					out.println("{\"curso\": \"Redes II\", \"seccion\":\"A\", \"aula\":\"702\", \"horainicio\":\"10:10\", \"horafin\":\"11:30\", \"tipo\":\"T\", \"dia\":\"2012-5-15\", \"profesor\":\"Cesar Arce\"},");
					out.println("{\"curso\": \"Gestión de Empresas\", \"seccion\":\"A\", \"aula\":\"812\", \"horainicio\":\"11:35\", \"horafin\":\"12:50\", \"tipo\":\"L\", \"dia\":\"2012-5-15\", \"profesor\":\"Adolfo Caceres\"}");
					
					out.println("]");
					return;
					
			} else if ( "2012-5-18".equals(dia) ) {
				out.println("[");				
				
				out.println("{\"curso\": \"Presentaciones exitosas\", \"seccion\":\"A\", \"aula\":\"812\", \"horainicio\":\"8:05\", \"horafin\":\"10:05\", \"tipo\":\"L\", \"dia\":\"2012-5-18\", \"profesor\":\"Javier de la Cruz\"},");
				out.println("{\"curso\": \"Progra\", \"seccion\":\"A\", \"aula\":\"703\", \"horainicio\":\"10:10\", \"horafin\":\"11:30\", \"tipo\":\"T\", \"dia\":\"2012-5-18\", \"profesor\":\"Adolfo Caceres\"},");
				out.println("{\"curso\": \"Tele\", \"seccion\":\"A\", \"aula\":\"701\", \"horainicio\":\"11:35\", \"horafin\":\"12:50\", \"tipo\":\"L\", \"dia\":\"2012-5-18\", \"profesor\":\"David Rodriguez\"}");
				
				out.println("]");
				return;
				
			} else if ( "2012-5-19".equals(dia) ) {
				out.println("[");				
				
				out.println("{\"curso\": \"Gestión\", \"seccion\":\"A\", \"aula\":\"703\", \"horainicio\":\"8:05\", \"horafin\":\"10:05\", \"tipo\":\"L\", \"dia\":\"2012-5-19\", \"profesor\":\"Javier de la Cruz\"},");
				out.println("{\"curso\": \"Sistemas operativos\", \"seccion\":\"A\", \"aula\":\"812\", \"horainicio\":\"10:10\", \"horafin\":\"11:30\", \"tipo\":\"T\", \"dia\":\"2012-5-19\", \"profesor\":\"Alfredo Rodriguez\"},");
				out.println("{\"curso\": \"Algoritmos\", \"seccion\":\"A\", \"aula\":\"708\", \"horainicio\":\"11:35\", \"horafin\":\"12:50\", \"tipo\":\"L\", \"dia\":\"2012-5-19\", \"profesor\":\"Rosa Trujillo\"}");
				
				out.println("]");
				return;
				
			}
			
			
		}
		
		/*
		 * Módulo 7
		 */
		if ("buzon".equals(modulo) && "listar".equals(accion)){
			
			out.println("[");
			
			out.println("{\"id\": \"676\", \"asunto\":\"Consulta de trabajo\", \"fecha\":\"2012-05-20\", \"estado\":\"N\", \"remitente\":\"Juan Perez\"},");
			out.println("{\"id\": \"701\", \"asunto\":\"Informe final del curso\", \"fecha\":\"2012-05-22\", \"estado\":\"N\", \"remitente\":\"Gong Roca\"},");
			out.println("{\"id\": \"735\", \"asunto\":\"Trabajo parcial\", \"fecha\":\"2012-05-24\", \"estado\":\"N\", \"remitente\":\"Manuel Garcia\"}");
	
			out.println("]");	
			return;
		}
		
		if ("buzon".equals(modulo) && "obtener".equals(accion)){
			
			String idMensaje = request.getParameter("idMensaje");
			
			out.println("{\"id\": \"676\", \"asunto\":\"Consulta de trabajo\", \"cuerpo\":\" <b>Profesor</b>, quisiera <font color=\\\"red\\\">saber</font> sobre el trabajo PhoneGap has been accepted into the Apache Software Foundation for incubation as Apache Cordova, where it will remain free and open source. This will ensure open, independent stewardship of the project over the long term. Android es un sistema operativo móvil basado en Linux, que junto con aplicaciones middleware7 está enfocado para ser utilizado en dispositivos móviles como teléfonos inteligentes, tabletas, Google TV y otros dispositivos.8 Es desarrollado por la Open Handset Alliance, la cual es liderada por Google. Este sistema por lo general maneja aplicaciones como Market (Marketing) o su actualización, Google Play Store. Fue desarrollado inicialmente por Android Inc., una firma comprada por Google en 2005.9 Es el principal producto de la Open Handset Alliance, un conglomerado de fabricantes y desarrolladores de hardware, software y operadores de servicio.10 Las unidades vendidas de teléfonos inteligentes con Android se ubican en el primer puesto en los Estados Unidos, en el segundo y tercer trimestres de 2010,11 12 13 con una cuota de mercado de 43,6% en el tercer trimestre.14 A nivel mundial alcanzó una cuota de mercado del 50,9% durante el cuarto trimestre de 2011, más del doble que el segundo sistema operativo (iOS de iPhone) con más cuota.15 Tiene una gran comunidad de desarrolladores escribiendo aplicaciones para extender la funcionalidad de los dispositivos. A la fecha, se han sobrepasado las 400.000 aplicaciones (de las cuales, dos tercios son gratuitas) disponibles para la tienda de aplicaciones oficial de Android: Google Play, sin tener en cuenta aplicaciones de otras tiendas no oficiales para Android, como pueden ser la App Store de Amazon o la tienda de aplicaciones Samsung Apps de Samsung.16 17 Google Play es la tienda de aplicaciones en línea administrada por Google, aunque existe la posibilidad de obtener software externamente. Los programas están escritos en el lenguaje de programación Java.18 No obstante, no es un sistema operativo libre de malware, aunque la mayoría de ello es descargado de sitios de terceros.19 El anuncio del sistema Android se realizó el 5 de noviembre de 2007 junto con la creación de la Open Handset Alliance, un consorcio de 78 compañías de hardware, software y telecomunicaciones dedicadas al desarrollo de estándares abiertos para dispositivos móviles.20 21 Google liberó la mayoría del código de Android bajo la licencia Apache, una licencia libre y de código abierto.22 La estructura del sistema operativo Android se compone de aplicaciones que se ejecutan en un framework Java de aplicaciones orientadas a objetos sobre el núcleo de las bibliotecas de Java en una máquina virtual Dalvik con compilación en tiempo de ejecución. Las bibliotecas escritas en lenguaje C incluyen un administrador de interfaz gráfica (surface manager), un framework OpenCore, una base de datos relacional SQLite, una Interfaz de programación de API gráfica OpenGL ES 2.0 3D, un motor de renderizado WebKit, un motor gráfico SGL, SSL y una biblioteca estándar de C Bionic. El sistema operativo está compuesto por 12 millones de líneas de código, incluyendo 3 millones de líneas de XML, 2,8 millones de líneas de lenguaje C, 2,1 millones de líneas de Java y 1,75 millones de líneas de C++.\", \"fecha\":\"2012-05-20\", \"estado\":\"N\", \"remitente\":\"Juan Perez\"}");		
			return;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
