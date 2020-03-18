package br.com.portifolio.forDevs;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonUtils {

	public List<People> convertAllPeopleForClass(String json) {

		Type type = new TypeToken<List<People>>() {}.getType();
		Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
		List<People> peoples = gson.fromJson(json, type);
		return peoples;
	}

	public People convertOnePeopleForClass(String json) {

		Gson gson = new Gson();
		People people = gson.fromJson(json, People.class);
		return people;
	}

}
