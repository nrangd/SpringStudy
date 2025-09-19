package com.kd.templatetest.vo.part;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Section {
	private String title;
	private String[] intexts;
	private String[] infos;
}
