
public class Funcionarios {

	private String nome;
	protected Integer horas;
	protected Double valor_hora;
	protected Double pagamento;
	
	
	public Funcionarios() {
			
	}
	
	public Funcionarios(String nome, Integer horas, Double valor_hora) {
	
		this.nome = nome;
		this.horas = horas;
		this.valor_hora = valor_hora;
	
	}

	public void setNome(String nome) {
	
		this.nome = nome;
	
	}
	
	public String getNome() {
		
		return nome;
	
	}

	public void setHoras(Integer horas) {
	
		this.horas = horas;
	
	}
	
	public void setValor_hora(Double valor_hora) {
	
		this.valor_hora = valor_hora;
	
	}	
	
	public Double getPagamento() {
		
		pagamento = horas * valor_hora;
		return pagamento;
		
	}


	
	
	
}
