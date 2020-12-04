
public class Funcionarios_Terceirizados extends Funcionarios {

	protected Double add_valu;
	
	public Funcionarios_Terceirizados() {
	
		super();
	
	}
	
	public Funcionarios_Terceirizados(String nome, Integer horas, Double valor_hora, Double add_valu) {
	
		super(nome, horas, valor_hora);
		this.add_valu = add_valu;
	
	}

	public void setAdd_valu(Double add_valu) {
	
		this.add_valu = add_valu;
	
	}
	
	public Double getAdd_valu() {
	
		return add_valu;
	
	}

	@Override
	public Double getPagamento() {
		
		pagamento = (horas * valor_hora) + ((this.add_valu*110)/100);
		return pagamento;
		
	}


	
	



	
	
	
	
	
}
