package fi.vamk.tka.tshirt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Order_lineController {
	@Autowired
	private Order_lineRepository order_lineRepostitory;
	@RequestMapping(value = "/order_lines", method = RequestMethod.GET,produces={"application/json","application/xml"})
	Iterable<Order_line> order_lines(){
		return order_lineRepostitory.findAll();
	}
	
	@RequestMapping("/order_line/{id}")
	public Optional<Order_line> getOrder_line(@PathVariable("id") int id){
		return order_lineRepostitory.findById(id);
	}
	
    @RequestMapping(value = "/order_line" , method = RequestMethod.POST)
    public @ResponseBody Order_line create(@RequestBody Order_line line) {
    	return order_lineRepostitory.save(line);
    } 
	
    @RequestMapping(value = "/order_line" , method = RequestMethod.PUT)
    public @ResponseBody Order_line update(@RequestBody Order_line line) {
    	return order_lineRepostitory.save(line);
    }
	
    @RequestMapping(value = "/order_line" , method = RequestMethod.DELETE)
    public void delete(@RequestBody Order_line line) {
    	order_lineRepostitory.delete(line);
    }
	
}
