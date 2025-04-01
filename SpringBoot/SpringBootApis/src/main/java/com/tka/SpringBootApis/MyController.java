package com.tka.SpringBootApis;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geeksforgeeks")
public class MyController {
	
	@RequestMapping(value = "/dsa" ,method = RequestMethod.GET)
	public String dsaApi() {
		return "Data Structures and Algorithms";
	}
	
	@RequestMapping(value = "/python" ,method = RequestMethod.POST)
	public String pythonApi() {
		return " Python is one of the most popular programming languages today";
	}
	
	@RequestMapping(value = "/bootstrap" ,method = RequestMethod.DELETE)
	public String bootstrapApi() {
		return "Bootstrap is a free and open-source collection of CSS";
	}
	
	@RequestMapping(value = "/react" ,method = RequestMethod.PUT)
	public String reactApi() {
		return "React is a JavaScript Library known for front-end development";
	}
	
	@GetMapping("/notejs")
	public String nodejsApi() {
		return "Node.js is a powerful, open-source, and cross-platform JavaScript runtime environment built on Chrome's V8 engine.";
	}
	
	@GetMapping("/puzzels")
	public String puzzlesApi() {
		return "Puzzles are commonly asked in exams and interviews to test logical and analytical thinking.";
	}
	
	@GetMapping("/deeplern")
	public String deepLerApi() {
		return "Deep Learning tutorial covers the basics and more advanced topics, making it perfect for beginners and those with experience.";
	}
	
	@GetMapping("/ede")
	public String edeApi() {
		return "Exploratory Data Analysis (EDA) serves as the foundation of any data science project.";
	}
	
	@PostMapping("/html")
	public String gtmlApi() {
		return "HTML stands for HyperText Markup Language. It is the standard language used to create and structure content on the web.";
	}
	@PostMapping("/js")
	public String javascriptAis() {
		return "JavaScript is a programming language used to create dynamic content for websites.";
	}
	
	@PostMapping("/devops")
	public String devOpsApi() {
		return "DevOps is a collection of two words, “Development” and “Operations.";
	}
	
	@PostMapping("/css")
	public String cssApi() {
		return "CSS stands for Cascading Style Sheets. It is a stylesheet language used to style and enhance website presentation.";
	}
	
	@DeleteMapping("/projects")
	public String projectsApi() {
		return "Computer science is a popular topic of study today, with numerous applications spanning a wide range.";
	}
	
	@DeleteMapping("/webtechno")
	public String webtechnoApi() {
		return "Web Technology refers to the various tools and techniques that are utilized in the process of communication";
	}
	
	@DeleteMapping("/sql")
	public String sqlApi() {
		return "SQL is a Structured query language used to access and manipulate data in databases.";
	}
	
	@DeleteMapping("/php")
	public String phpApi() {
		return "PHP (Hypertext Preprocessor) is a versatile and widely used server-side scripting language for creating dynamic and interactive web applications";
	}
	
	@PutMapping("/c")
	public String cApi(){
		return "C is a general-purpose programming language referred as the \"mother of all programming languages\"";
	}
	
	@PutMapping("/mechinelern")
	public String machinelernApi() {
		return "Machine learning is a subset of Artificial Intelligence (AI) that enables computers to learn from data and make predictions without being explicitly programmed.";
	}
	
	@PutMapping("/systemdesign")
	public String systemDApi() {
		return "System Design is the process of designing the architecture, components, and interfaces for a system so that it meets the end-user requirements.";
	}
	
	@PutMapping("/swtesting")
	public String softtestDApi() {
		return "The Software Testing Tutorial serves as a comprehensive guide for learning Software Testing.";
	}
	
}
