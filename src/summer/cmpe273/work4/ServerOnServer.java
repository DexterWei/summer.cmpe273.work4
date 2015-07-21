package summer.cmpe273.work4;

import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

@Path("/")
public class ServerOnServer{
	//Server on server listens to notifications from clients
	@Path("Report")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response Bootstrap(String objString) throws UnknownHostException {
		MongoDAO dao = new MongoDAO();
		MongoDAO.Connect();
		return Response.status(201).entity("Registration Done").build();
	}
	
}
