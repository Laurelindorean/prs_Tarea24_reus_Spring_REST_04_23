/**
 * 
 */
package com.service;

import java.util.List;

import com.dto.Empleado;

/**
 * @author Palmira
 *
 */
public interface IEmpleadoService {

	// Metodos del CRUD
	public List<Empleado> listarEmpleados(); // Para listar todos los empleados

	public Empleado guardarEmpleado(Empleado empleado); // Para guardar un Empleado nuevo

	public void eliminarEmpleado(int id); // Para eliminar a un Empleado

	public Empleado empleadoXID(int id); // Para leer datos de un solo registro

	public Empleado actualizarEmpleado(Empleado empleado); // Para actualizar un empleado

	public List<Empleado> listarXTrabajo(String trabajo); // Para sacar un listado por trabajo

}
