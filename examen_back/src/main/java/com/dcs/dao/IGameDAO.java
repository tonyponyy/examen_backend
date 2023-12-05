package com.dcs.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcs.dto.Game;

@Repository
public interface IGameDAO extends JpaRepository<Game,Integer> {


}
