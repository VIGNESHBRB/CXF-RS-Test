package brb.research.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;


/**
 * 
 * @author VICKY BRB
 *
 */
public class Service {

	/**
	 * 
	 * @return
	 */
	@GET
	@Path("test")
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return "hello";
	}

	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/{name}")
	public void submit(@PathParam(value = "name") final String name, final @Suspended AsyncResponse response) {
		System.out.println(Thread.currentThread().getName());
		new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
				System.out.println("Received input...");
				try {
					Thread.sleep(5000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//response.resume("Hello " + name);
			}
		}.start();
		
		
	}

}
