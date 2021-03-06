package com.proyecto.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "tipo_reclamo")
public class TipoReclamo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoReclamo;
	private String descripcion;
	private int estado;
	
	
	
}
