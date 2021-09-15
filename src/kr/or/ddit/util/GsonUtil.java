package kr.or.ddit.util;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GsonUtil {
	private static Gson gson;
	private static GsonUtil gsonUtil;
	public static Gson getGson() {
		if(gson == null) gson = new Gson();
		return gson;
	}
	public static GsonUtil getInstance() {
		if(gsonUtil == null) gsonUtil = new GsonUtil();
		return gsonUtil;
	}
	
	private GsonUtil() {
		gson = GsonUtil.getGson();
	}
	
	public String SwOK() {
		JsonObject json = new JsonObject();
		json.addProperty("sw", "ok");
		return gson.toJson(json);
	}

	public String SwNO() {
		JsonObject json = new JsonObject();
		json.addProperty("sw", "no");
		return gson.toJson(json);
	}
}
