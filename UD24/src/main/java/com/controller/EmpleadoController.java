/**
 * 
 */
package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Empleado;
import com.service.EmpleadoServiceImp;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class EmpleadoController {
	@Autowired
	EmpleadoServiceImp empleadoServiceImp;

	@GetMapping("/empleado")
	public List<Empleado> listarEmpleados() {
		return empleadoServiceImp.listarEmpleados();
	}

	@GetMapping("/empleado/trabajo/{trabajo}")
	public List<Empleado> listarXtrabajo(@PathVariable(name = "trabajo") String trabajo) {
		return empleadoServiceImp.listarXTrabajo(trabajo);
	}

	@PostMapping("/empleado")
	public Empleado salvarEmpleado(@RequestBody Empleado empleado) {
		Empleado empleados = new Empleado(empleado.getId(), empleado.getNomApels(), empleado.getTrabajo());
		return empleadoServiceImp.guardarEmpleado(empleados);
	}

	@GetMapping("/empleado/{id}")
	public Empleado EmpleadoXID(@PathVariable(name = "id") int id) {
		Empleado emp2 = new Empleado();
		emp2 = empleadoServiceImp.empleadoXID(id);
		return emp2;
	}

	@DeleteMapping("/empleado/{id}")
	public void eliminarEmpleado(@PathVariable(name = "id") int id) {
		empleadoServiceImp.eliminarEmpleado(id);
	}
	
	@PutMapping("/empleado/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name = "id") int id, @RequestBody Empleado empleado) {
		Empleado emp_Selected = new Empleado();
		emp_Selected = empleadoServiceImp.empleadoXID(id);
		emp_Selected.setNomApels(empleado.getNomApels());
		emp_Selected.setTrabajo(empleado.getTrabajo());
		emp_Selected.setSalario(empleado.getSalario());
			
		return empleadoServiceImp.actualizarEmpleado(emp_Selected);
	}

}
