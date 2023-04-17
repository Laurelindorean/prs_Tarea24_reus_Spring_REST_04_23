/**
 * 
 */
package com.dto;



import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import jakarta.persistence.*;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "empleado")
public class Empleado {
	// Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name ="nomapels")
	private String nomApels;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "sueldo")
	private double salario;

	// Constructores
	/**
	 * @param id
	 * @param nomApels
	 * @param trabajo
	 */
	public Empleado(int id, String nomApels, String trabajo) {
		this.id = id;
		this.nomApels = nomApels;
		this.trabajo = trabajo;
		this.salario = Trabajo.salarioPorTrabajo(trabajo);
	}

	public Empleado() {

	}

	// Creamos nuestro enum
	enum Trabajo {
		FULLSTACK(2000), ANALYST(2500), DEVELOPER(1500), HELPDESK(1200);

		// Que tendrá como atributo el salario
		private double salario;

		Trabajo(double salario) {
			this.salario = salario;
		}

		public double getSalario() {
			return this.salario;
		}
		static Double salarioPorTrabajo(String trabajo) {
			boolean found = false;
			double sueldo = 0.0;
			List<Trabajo> lista = Arrays.asList(Trabajo.values());
			Iterator<Trabajo> it = lista.iterator();

			while (!found && it.hasNext()) {
				Trabajo job = it.next();
				if (job.toString().compareToIgnoreCase(trabajo) == 0) {
					found = true;
					sueldo = job.getSalario();
				}
			}
			return sueldo;
		}

	}

	// SETTERS Y GETTERS
	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// Y generamos el metodo toString
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nomApels=" + nomApels + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}

}
