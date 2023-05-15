package Aula14;

public class ProjetoYoutube {
	public static void main(String[] args) {
		
		Video v[] = new Video[5];
		
		
		v[0] = new Video("Aula 1 de POO", 0, 0, 0, false);
		v[1] = new Video("Aula 2 de PHP", 0, 0, 0, false);
		v[2] = new Video("Aula 3 de HTML", 0, 0, 0, false);
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", 2, "Juba");
		g[1] = new Gafanhoto("Juliana", 33, "F", 3, "Juju");
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar(87f);
		System.out.println(vis.toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[0].avaliar(35);
		System.out.println(vis.toString());
		
		
		
		System.out.println(v[1].toString());
		System.out.println(g[0].toString());
	}
}
