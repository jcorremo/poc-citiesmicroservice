package com.terpel.microservicecities.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Cities {

	@Id
	private ObjectId _id;

	private String nombre;
	private String apellido;
	private String ciudad;

	public Cities() {

	}

	public Cities(ObjectId _id, String nombre, String apellido, String ciudad) {
		super();
		this._id = _id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
