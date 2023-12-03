package ClasesEnt;
import java.util.ArrayList;
import java.util.List;

import ClasesEnumerados.ComunicarPor.MedioComEnum;
import ClasesEnumerados.EspecialidadEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "tecnicos")
public class Tecnico {
	private static final long serialVersionUID = 1L;
	
	
    private int id;
	
	
	private String apellido;
	
	private String fn;
	
	private String telefono;
	String email;
	
	private ComunicarPor.medioCOm;
	
	private List<EspecialidadEnum> especialidades;


	private String nombre;
	
	
	
	// private EstadoTec estado;

	
	
	public Tecnico(int id, String nombre, String apellido, String fn, MedioComEnum medioCOm) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fn = fn;
		this.medioCOm = medioCOm;
		this.especialidades = new ArrayList<>();
		// this.estado = new EstadoTecLibre();
	}
	
	public Tecnico(String nombre, String apellido, String fn, MedioComEnum medioCOm) {

		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fn = fn;
		this.medioCOm = medioCOm;
		this.especialidades = new ArrayList<>();
		// this.estado = new EstadoTecLibre();
	}
	

	public void cargarEsp(EspecialidadEnum esp) {

		this.especialidades.add(esp);

	}

	public void verEsp() {

		System.out.println(this.especialidades);
	}

	/*
	 * @Override public String toString() { return "Tecnico [Especialidades=" +
	 * especialidades + ", medioCOm=" + medioCOm + ", estado=" + estado.verEstado()
	 * + "]"; }
	 * 
	 */
	@Override
	public String toString() {
		return "Tecnico [ Id = " + id + " Apellido y Nombre="+ apellido + " " + nombre +" Especialidades=" + especialidades + ", medioCOm=" + medioCOm + "]";
	}

	
}
