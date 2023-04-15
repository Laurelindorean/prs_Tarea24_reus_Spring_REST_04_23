/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IEmpleadoDao;
import com.dto.Empleado;

/**
 * @author Palmira
 *
 */
//Sin esto no funciona
@Service 
public class EmpleadoServiceImp implements IEmpleadoService {

	@Autowired
	IEmpleadoDao iEmpleadoDao;

	@Override
	public List<Empleado> listarEmpleados() {

		return iEmpleadoDao.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {

		return iEmpleadoDao.save(empleado);
	}

	@Override
	public void eliminarEmpleado(int id) {
		iEmpleadoDao.deleteById(id);
	}

	@Override
	public Empleado empleadoXID(int id) {

		return iEmpleadoDao.findById(id).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {

		return iEmpleadoDao.save(empleado);
	}

	@Override
	public List<Empleado> listarXTrabajo(String trabajo) {

		return iEmpleadoDao.findByTrabajo(trabajo);
	}

}
