package fi.vamk.tka.tshirt;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Order_itemController {
	@Autowired
	private Order_itemRepository order_itemRepostitory;
	@RequestMapping(value = "/order_items", method = RequestMethod.GET,produces={"application/json","application/xml"})
	Iterable<Order_item> order_items(){
		return order_itemRepostitory.findAll();
	}
	
	@RequestMapping("/order_item/{id}")
	public Optional<Order_item> getOrder_item(@PathVariable("id") int id){
		return order_itemRepostitory.findById(id);
	}
	
    @RequestMapping(value = "/order_item" , method = RequestMethod.POST)
    public @ResponseBody Order_item create(@RequestBody Order_item item) {
    	return order_itemRepostitory.save(item);
    } 
	
    @RequestMapping(value = "/order_item" , method = RequestMethod.PUT)
    public @ResponseBody Order_item update(@RequestBody Order_item item) {
    	return order_itemRepostitory.save(item);
    }
	
    @RequestMapping(value = "/order_item" , method = RequestMethod.DELETE)
    public void delete(@RequestBody Order_item item) {
    	order_itemRepostitory.delete(item);
    }
	
}
