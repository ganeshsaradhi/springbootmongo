package com.capgemini.employeemongodb.repository;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.capgemini.employeemongodb.model.Employee;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Repository
public class EmployeeRepository {

	MongoClient client;
	
	MongoClient getClient() {
		
		if(client == null) {
			client = new MongoClient("localhost", 59946);
		}
		return client;
	}
	
	
	public List<Employee> getAll() {
		
		MongoClient mongoClient = getClient();
		MongoDatabase database = mongoClient.getDatabase("test");
		MongoCollection<Document> collection = database.getCollection("employee");
		
		List<Employee> response = new ArrayList<Employee>();
		
		for(Document e : collection.find()) {
			Employee emp =new Employee(e.get("_id").toString(), e.getString("firstName"), e.getString("lastName"), e.getString("emailId")) ;
			
			response.add(emp);
			
		}
		return response;
	}
	
	public String save(Employee emp) {
		MongoClient mongoClient = getClient();
		MongoDatabase database = mongoClient.getDatabase("test");
		MongoCollection<Document> collection = database.getCollection("employee");
		
		Document emp1= new Document();
		
		emp1.append("firstName", emp.getFirstName());
		emp1.append("lastName", emp.getLastName());
		emp1.append("address", emp.getAddress());
		
		String response;
		
		try {
			collection.insertOne(emp1);
			response = "Sucessfully Added";
		}catch (Exception e) {
			response = " Try Again ";
		}
		
		return response;
		
	}
	

}














