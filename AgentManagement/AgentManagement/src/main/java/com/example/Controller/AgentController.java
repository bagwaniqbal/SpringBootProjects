package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Agent;
import com.example.Service.AgentService;

@RestController
public class AgentController
{
	@Autowired
	AgentService agentService;
	
	@GetMapping(value="/agent")
	public List<Agent> getAllAgents()
	{
		return agentService.getAllAgent();
	}
	
	@PostMapping(value="/agent")
	public Agent addNewAgent(@RequestBody Agent agent) 
	{
		return agentService.addAgent(agent);
	}
	
	@DeleteMapping(value="/agents/{id}")
	public String deleteAgent(@PathVariable int id)
	{
		agentService.deleteAgent(id);
		return "Agent is Deleted";
	}
	
	@RequestMapping(value ="/bbok", produces ="application/jason", method=RequestMethod.PUT)
	public Agent updateagent(@RequestBody Agent agent)
	{
		return agentService.UpdateAgent(agent);
	}

}
