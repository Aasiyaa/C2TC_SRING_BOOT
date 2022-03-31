package c2tc.batch.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
   
	@Autowired
	private ProductService service;
	
	
	//to display all rows from postman//retreive all the rows from db 
	@GetMapping("/products")
	public List<Product> list()
	{
		return service.listAll();
		
	}
	
	
	//retrieve specific record from db
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> get (@PathVariable Integer id){
		Product product=service.get(id);
		return new  ResponseEntity<Product>(product,HttpStatus.OK);//
	}
	
	
	//create a row in db
	@PostMapping("/products")//inserts
	public void add(@RequestBody Product product){//ad details into database
		service.save(product);
	}
	
	
	//update
	@PutMapping("/products/{id}")//if the data(which we are updating) is not present in table hence we use try catch
	public ResponseEntity<?> update (@RequestBody Product product,@PathVariable Integer id){//to get input we put question mark
		try {
		Product existProduct=service.get(id);//existproduct will check whether the numer is there or no to update
		service.save(product);
		return new  ResponseEntity<Product>(product,HttpStatus.OK);//
	}
		catch(Exception e)
		{
			return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	//delete operation using id
	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
	
	

