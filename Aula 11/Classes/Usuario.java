package classes;

public class Usuario {

	String nome;
	String gmail;

	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean gmailIgual = outro.gmail.equals(this.gmail);

			return nomeIgual && gmailIgual;

		} else {
			return false;
		}
	}

//	                        ***Forma completa e melhorada*** 
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((gmail == null) ? 0 : gmail.hashCode());
//		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
//		return result;
//	}
//	                                 ***Equals***
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Usuario other = (Usuario) obj;
//		if (gmail == null) {
//			if (other.gmail != null)
//				return false;
//		} else if (!gmail.equals(other.gmail))
//			return false;
//		if (nome == null) {
//			if (other.nome != null)
//				return false;
//		} else if (!nome.equals(other.nome))
//			return false;
//		return true;
//	}
}
