package helloWorld.HelloWorldWorkflowAsync;
import com.amazonaws.services.simpleworkflow.flow.annotations.Asynchronous;
import com.amazonaws.services.simpleworkflow.flow.core.Promise;

public class GreeterWorkflowImpl implements GreeterWorkflow {
   private GreeterActivitiesClient operations = new GreeterActivitiesClientImpl();

   @Override
   public void greet() {
      Promise<String> name = operations.getName();
      Promise<String> greeting = getGreeting(name);
      operations.say(greeting);
   }

   @Asynchronous
   private Promise<String> getGreeting(Promise<String> name) {
	   /*
	    For some reason name is not ready here...
	    Workflow execution fails because of that, it seems
	    */
	  String name_str = name.get();
	  System.out.println("GOt name: "+name_str);
      String returnString = "Hello " + name_str + "!";
      return Promise.asPromise(returnString);
   }
}
