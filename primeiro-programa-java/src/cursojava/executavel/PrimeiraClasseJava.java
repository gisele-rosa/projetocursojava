package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classe.Aluno;

public class PrimeiraClasseJava {
	/* main � um metodo auto executavel em java */
	public static void main(String[] args) {  
		
		
		/*String nome = JOptionPane.showInputDialog("qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("qual a idade do aluno?");
		String nota1 = JOptionPane.showInputDialog("nota 1?");
		String nota2 = JOptionPane.showInputDialog("nota 2?");
		String nota3 = JOptionPane.showInputDialog("nota 3?");
		String nota4 = JOptionPane.showInputDialog("nota 4?");
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno("maria");
		Aluno aluno5 = new Aluno("jose", 50);
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		System.out.println(aluno1);*/
		
		/*System.out.println("media nota = " + aluno1.getMediaNota());
		System.out.println("resultado " + (aluno1.getalunoAprovado() ? "Aprovado" : "reprovado"));
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getIdade());*/
		
		/*String nota1 = JOptionPane.showInputDialog("informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("informe a nota 4");
		
		double dnota1 = Double.parseDouble(nota1);
		double dnota2 = Double.parseDouble(nota2);
		double dnota3 = Double.parseDouble(nota3);
		double dnota4 = Double.parseDouble(nota4);
		double media = (dnota1+dnota2+dnota3+dnota4)/4;
		
		
		if (media>= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "aluno aprovado com media : " + media);
			}else {
				JOptionPane.showMessageDialog(null, "aluno esta em recupera��o com media : " + media);
			} 
		}else {
			JOptionPane.showMessageDialog(null, "aluno esta reprovado com media : " + media);
		}*/
		
		/*String carros = JOptionPane.showInputDialog("infome a quantidade de carros");
		String pessoa = JOptionPane.showInputDialog("infome a quantidade de pessoas");
		double carronumero = Double.parseDouble(carros);
		double pessoanumero = Double.parseDouble(pessoa);
		int divisao = (int)(carronumero / pessoanumero);
		double resto = carronumero % pessoanumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "deseja ver o resultado da divisao");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "divisao deu " + divisao);
		}else {
			System.out.println("nao quiz saber do resultado");
		} 
		resposta = JOptionPane.showConfirmDialog(null,"deseja ver o resto da divisao?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "o resto da divisao � " + resto);
		}else {
			System.out.println("nao quiz saber do resultado");
		}*/
		
		
		
		
		/*modulo :resto da divis�o %*/
		/*double carro = 9;
		double pessoa = 2;
		double resto = carro % pessoa;
		System.out.println("sobraram exatamente" + resto);*/
		
		/*for(int numero = 0; numero<=10; numero++) {
			if(numero==3 || numero==6 || numero==9) {
				System.out.println("encontrei o numero " + numero);
				continue;
			}
		
		}*/
		/*estrutura while*/
		/*int numero = 0;
		while(numero<=10) {
			System.out.println("o numero atual �:" + numero);
			numero ++;
		} 
		int numero2 = 0;
		do {
			System.out.println("o numero atual �:" + numero2);
			numero2 ++;
			
		}while(numero2<=10); */
		
		/*int nota1 = 70;
		int nota2 = 60;
		int nota3 = 10;
		int nota4 = 10;
		int media = 0;
		media = (nota1+nota2+nota3+nota4) /4;
		switch (media) {
		case 70: {
			System.out.println("aluno aprovado");
			break;
		}
		default: System.out.println("outro valor" +media);
		 	break;
		} */
		/*
		if (media>= 50) {
			if (media >= 70) {
				System.out.println("aluno aprovado direto");
			}else {
				System.out.println("aluno esta em recupera��o");
			}
		}
		else {
			System.out.println("aluno reprovado direto");
		} */
		
		/*int mediaAluno = 70;
		String nome= "fabio";
		if (mediaAluno >= 70 && nome.equals("alex")) {
			System.out.println("parabens");
		} else if (mediaAluno < 70) {
			System.out.println("reprovado");
		}else {
			System.out.println("aluno n�o encontrado");
		} */
		
		/* operadores ternarios s�o para micro valida��es
		String saidaResultado;
		
		saidaResultado = mediaAluno >=70? "aluno aprovado": "aluno reprovado";
		System.out.println(saidaResultado); */
		
	}

} 

