package com.kd.springdatabase.dto.mapper;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kd.springdatabase.dto.Cloth;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class ClothMapper {
	private final SqlSessionTemplate sql;
	
	public List<Cloth> selectAll() {
		return sql.selectList("Clothes.selectAll");
	}
	
	public Cloth get(Integer cloth_id) {
		return sql.selectOne("Clothes.get", cloth_id);
	}
	
	public int delete(Integer cloth_id) {
		return sql.delete("Clothes.delete", cloth_id);
	}
	
	public int update(Cloth cloth) {
		return sql.update("Clothes.update", cloth);
	}
	
	// HashMap으로 하는방법 (xml확인하기)
	public int insert(Cloth cloth) {
		return sql.insert("Clothes.insert", cloth);
	}
	
	// 등록한 모델로 하는방법 (xml확인하기)
	// 여기선 가장 최근에 추가한 행의 id를 확인할수 있음
	public Cloth insert2(Cloth cloth) {
		Integer result = sql.insert("Clothes.insert2", cloth);
		
		if (result > 0) {
			// selectKey를 성공하고 나면 전달했던 dto에 pk를 채워넣는다
			return cloth;
		} else {
			return null;
		}
	}
}
