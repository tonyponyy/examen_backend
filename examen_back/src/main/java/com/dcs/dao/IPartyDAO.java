package com.dcs.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcs.dto.Party;

@Repository
public interface IPartyDAO extends JpaRepository<Party,Integer> {


}
