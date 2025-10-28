package com.sparta.jpaadvance.repository;

import com.sparta.jpaadvance.entity.Food;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<Food, Long> {

}
