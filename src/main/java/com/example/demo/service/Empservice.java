package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Empmodel;
import com.example.demo.repository.Emporepo;

@Service
public class Empservice {
	@Autowired
	Emporepo er;
	public Empmodel saveinfo(Empmodel em)
	{
		return er.save(em);
	}
	public List<Empmodel> showinfo()
	{
		return er.findAll();
	}

}
