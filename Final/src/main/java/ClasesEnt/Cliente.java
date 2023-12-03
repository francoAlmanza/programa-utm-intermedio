package ClasesEnt;
import java.util.ArrayList;
import java.util.List;

import ClasesEnumerados.EspecialidadEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor

//gracias
public class Cliente {
	
	 private int id ;
	
	 private String razonSocial;
	
	 private String cuit;
	
	 private List<EspecialidadEnum> servicios;
	
	 
	 public Cliente( String razonSocial, String cuit,String email) {
		
		this.razonSocial = razonSocial;
		this.cuit = cuit;
	 //   this.email = email;
		this.servicios = new ArrayList<EspecialidadEnum>();
		
	}
    
	public void agregarServ(EspecialidadEnum serv) {
		this.servicios.add(serv);
		
	}
    
	public void verServ() {
		
		System.out.println(this.servicios);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", razonSocial=" + razonSocial + ", cuit=" + cuit + ", servicios=" + servicios
				+ "]";
	}


}
