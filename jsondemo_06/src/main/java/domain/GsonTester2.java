package domain;

import java.util.Arrays;

import com.google.gson.Gson;

public class GsonTester2 {

	public static void main(String[] args) {
		Gson gson = new Gson();
		int[] marks = { 100, 90, 85 };
		String[] names = { "Maxsu", "Yiibai", "Mohan" };

		// Serialization
		System.out.print("{");
		System.out.print("marks:" + gson.toJson(marks) + ",");
		System.out.print("names:" + gson.toJson(names));

		System.out.println("}");
		// De-serialization
		marks = gson.fromJson("[100,90,85]", int[].class);
		names = gson.fromJson("[\"Maxsu\",\"Yiibai\",\"Mohan\"]", String[].class);
		System.out.println("marks:" + Arrays.toString(marks));
		System.out.println("names:" + Arrays.toString(names));

	}

}
