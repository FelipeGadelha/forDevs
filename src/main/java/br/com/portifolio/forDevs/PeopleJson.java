package br.com.portifolio.forDevs;

import java.util.ArrayList;
import java.util.List;

public class PeopleJson {

	private String json;
	private String qttPeoples;

	public PeopleJson(String json, String qttPeoples) {
		this.json = json;
		this.qttPeoples = qttPeoples;
	}

	public String getJson() {
		return json;
	}

	public String getQttPeoples() {
		return qttPeoples;
	}

	public List<People> convert() {
		GsonUtils gsonUtils = new GsonUtils();
		List<People> peoples = new ArrayList<>();
		if (this.getQttPeoples().equals("1")) {
			peoples.add(gsonUtils.convertOnePeopleForClass(getJson()));
		} else {
			peoples = gsonUtils.convertAllPeopleForClass(getJson());
		}
		return peoples;
	}

}
