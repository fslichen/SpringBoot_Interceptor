package evolution.controller.dto;

import lombok.Data;

@Data
public class AnyDto {
	@Override
	public String toString() {
		return "AnyDto [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
}
