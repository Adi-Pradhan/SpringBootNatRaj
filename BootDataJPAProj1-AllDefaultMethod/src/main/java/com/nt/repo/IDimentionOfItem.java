package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Item_Dim;
@Repository
public interface IDimentionOfItem extends JpaRepository<Item_Dim,Integer	> {

	
}
