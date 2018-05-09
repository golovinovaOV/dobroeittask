package com.holovinova;

import static spark.Spark.*;
import java.util.List;
import org.eclipse.jetty.http.HttpStatus;
import com.google.gson.*;
import com.holovinova.dao.*;
import com.holovinova.dao.impl.*;
import com.holovinova.entity.*;

public class Application {

	private static AnimalDAO animalDAO = new AnimalDAOImpl();
	private static AnimalTypeDAO animalTypeDAO = new AnimalTypeDAOImpl();

	public static void main(String[] args) {

		// get animal by id
		get("/animal/:id", (request, responce) -> {
			long animalId = Long.valueOf(request.params(":id"));
			if (animalId > 0) {
				return new Gson().toJson(animalDAO.findById(animalId));
			}
			responce.status(HttpStatus.NO_CONTENT_204);
			return "";
		});

		// get animal by type
		get("/animal/type/:type", (request, responce) -> {
			long animalTypeId = Long.valueOf(request.params(":type"));
			if (animalTypeId > 0) {
				AnimalType animalType = animalTypeDAO.findById(animalTypeId);
				return new Gson().toJson(animalDAO.findByType(animalType));
			}
			responce.status(HttpStatus.NO_CONTENT_204);
			return "";
		});

		// get all animals
		get("/animal", (request, responce) -> {
			List<Animal> animals = animalDAO.findAll();
			if (animals != null) {
				responce.status(HttpStatus.OK_200);
				return new Gson().toJson(animals);
			}
			responce.status(HttpStatus.NO_CONTENT_204);
			return "";
		});

		// insert animal
		post("/animal", (request, responce) -> {
			animalDAO.add(new Gson().fromJson(request.body(), Animal.class));
			responce.status(HttpStatus.CREATED_201);
			return request.body();
		});

		// update animal
		put("/animal", (request, responce) -> {
			animalDAO.update(new Gson().fromJson(request.body(), Animal.class));
			responce.status(HttpStatus.OK_200);
			return "";
		});

		// delete animal by id
		delete("animal/:id", (request, responce) -> {
			long animalId = Long.valueOf(request.params(":id"));
			if (animalId > 0) {
				if (animalDAO.remove(animalId)) {
					responce.status(HttpStatus.OK_200);
					return "";
				}
			}
			responce.status(HttpStatus.NO_CONTENT_204);
			return "";
		});
	}

}
