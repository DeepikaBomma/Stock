package com.demo.stc.dao;

import com.demo.stc.domain.Sector;

import java.sql.SQLException;
import java.util.*;

public interface SectorDao {
	public Sector Insert (Sector sector)throws ClassNotFoundException, SQLException;
	public List<Sector> GetAllSector()throws ClassNotFoundException, SQLException;
}
