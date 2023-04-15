/**
 * 
 */
package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Empleado;

/**
 * @author Palmira
 *
 */
public interface IEmpleadoDao extends JpaRepository<Empleado, Integer> {

	public List<Empleado> findByTrabajo(String trabajo);

}
