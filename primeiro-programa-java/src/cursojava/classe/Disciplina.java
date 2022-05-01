package cursojava.classe;

import java.util.Objects;

public class Disciplina {
	private double nota;
	private String disciplina;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	/*
	 * @Override public int hashCode() { return Objects.hash(disciplina1,
	 * disciplina2, disciplina3, disciplina4, nota1, nota2, nota3, nota4); }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Disciplina other = (Disciplina) obj; return
	 * Objects.equals(disciplina1, other.disciplina1) && Objects.equals(disciplina2,
	 * other.disciplina2) && Objects.equals(disciplina3, other.disciplina3) &&
	 * Objects.equals(disciplina4, other.disciplina4) &&
	 * Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1) &&
	 * Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2) &&
	 * Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3) &&
	 * Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4); }
	 */

}
