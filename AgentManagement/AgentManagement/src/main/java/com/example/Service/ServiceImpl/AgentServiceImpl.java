package com.example.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Entity.Agent;

import com.example.Repository.AgentRepository;


public class AgentServiceImpl 
{
	@Autowired
	AgentRepository agentRepository;

	public Agent addagent(Agent agent) {
		// TODO Auto-generated method stub
		return agentRepository.save(agent);
	}

	
	public List<Agent> getAllagent() {
		// TODO Auto-generated method stub
		return agentRepository.findAll();
	}

	
	public void deleteagent(int id) {
		// TODO Auto-generated method stub
		agentRepository.deleteById(id);
	}

	
	public Agent Updateagent(Agent agent) {
		// TODO Auto-generated method stub
		Agent _agent = agentRepository.findById(agent.getAid()).get();
		_agent.setAid(agent.getAid());
		_agent.setAname(agent.getAname());
		_agent.setAsalary(agent.getAsalary());
		return null;
	}

}
