package ClasesEnt;
import java.util.List;

import ClasesEnumerados.EspecialidadEnum;
import ControlABM.TecnicoABM;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Incidente {
	
	private int id;
	
	private Cliente cliente;
	
	private EspecialidadEnum servicio;
	
	private String descripcion;
	
	
	private TecnicoABM tecnico;
	
	public Incidente(Cliente cliente, EspecialidadEnum serv,String des) {
		
		this.cliente = cliente;
		this.servicio = serv;
		this.descripcion = des;
	}
	
	public void verTecnicos(List<TecnicoABM> tec) {
		
		tec.stream()
	        .filter((x)-> x.getEspecialidadEnum().stream().anyMatch((l) -> l.equals(this.servicio)))
	        .forEach((k) -> System.out.println(k.toString()));
				
	}
	
	
    public void enviarNotificacion() {
		
		if (this.tecnico.getMedioCom().equals(ComunicarPor.WHATSAPP)) {
			System.out.println("WHATSAPP SE INFORMA NUEVO INCIDENTE N: " 
				+ this.getId() + " CLIENTE: " + this.getCliente().getRazonSocial() +  " Descripcion: " + this.getDescripcion());
		}
		else {
			System.out.println("EMAIL SE INFORMA NUEVO INCIDENTE N: " 
					+ this.getId() + " CLIENTE: " + this.getCliente().getRazonSocial() +  " Descripcion: " + this.getDescripcion());
		}
		
				
	}
	
        
	@Override
	public String toString() {
		return "Incidente [id=" + id + ", cliente=" + cliente.getRazonSocial() + ", servicio=" + servicio + ", descripcion="
				+ descripcion + ", tecnico=" + tecnico.getNombre() + "]";
	}

	
	
	
	
	
	
	
}
