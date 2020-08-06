package com.jes.restfull.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jes.restfull.model.Fiscalia;
import com.jes.restfull.service.FiscaliaService;

@RestController
@RequestMapping(value = "/api") // Ruta inicial por defecto
@CrossOrigin("*") // aceptamos cualquier peticion
public class FiscaliaController {

	@Autowired
	FiscaliaService fiscaliaService;

	// *** LISTAR (READ) ****
	// http://localhost:8888/api/all (GET)
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Fiscalia>> getAll() {
		List<Fiscalia> obj = fiscaliaService.getAll();
		return new ResponseEntity<List<Fiscalia>>(obj, HttpStatus.OK);
	}

	// *** CREAR Y ACTUALIZAR (CREATE AND UPDATE) ***
	// http://localhost:8888/api/save (POST)
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
	public ResponseEntity<Fiscalia> save(@RequestBody Fiscalia Fiscalia) {
		Fiscalia obj = fiscaliaService.save(Fiscalia);
		return new ResponseEntity<Fiscalia>(obj, HttpStatus.OK);
	}

	// *** ELIMINAR (DELETE) ***
	// http://localhost:8888/api/delete/{id} (GET)
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Fiscalia> delete(@PathVariable Long id) {
		Fiscalia Fiscalia = fiscaliaService.get(id);
		if (Fiscalia != null) {
			fiscaliaService.delete(id);
			return new ResponseEntity<Fiscalia>(Fiscalia, HttpStatus.OK);
		} else {
			return new ResponseEntity<Fiscalia>(Fiscalia, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// http://localhost:8888/api/find/{id} (GET)
	@RequestMapping(value = "/find/{id}", method = RequestMethod.GET, produces = "application/json")
	public Fiscalia showSave(@PathVariable("id") Long id) {
		return fiscaliaService.get(id);
	}

}
