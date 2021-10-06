package com.onboarding.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "agent_details")
public class Agent_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Agent_Details_id;
	@Column
	private String AgentName;
	@Column
	@JsonIgnore
	private String Email;
	@Column
	private int Phone;

	public long getAgent_Details_id() {
		return Agent_Details_id;
	}

	public void setAgent_Details_id(long agent_Details_id) {
		Agent_Details_id = agent_Details_id;
	}

	public String getAgentName() {
		return AgentName;
	}

	public void setAgentName(String agentName) {
		AgentName = agentName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

}
