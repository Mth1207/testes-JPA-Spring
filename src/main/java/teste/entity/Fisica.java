package teste.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_fisica")
public class Fisica extends Pessoa{
	
	private String cpf;

	public String cpf() {
		return cpf;
	}

	public void cpf(String cpf) {
		this.cpf = cpf;
	}
}