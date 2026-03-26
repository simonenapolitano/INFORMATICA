public class Paziente {
    private String nome;
    private String cognome;
    private String codiceSanitario;

    public Paziente(String nome, String cognome, String codiceSanitario) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceSanitario = codiceSanitario;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceSanitario() {
		return codiceSanitario;
	}

	public void setCodiceSanitario(String codiceSanitario) {
		this.codiceSanitario = codiceSanitario;
	}

    @Override
    public String toString() {
        return "Nome " + nome + " Cognome " + cognome + " Codice Sanitario " + codiceSanitario;
    }
}
