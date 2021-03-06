package helloWorld.HelloWorldWorkflowDistributed;
import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;

@ActivityRegistrationOptions(defaultTaskScheduleToStartTimeoutSeconds = 300,
                             defaultTaskStartToCloseTimeoutSeconds = 10)
@Activities(version="3.0")

public interface GreeterActivities {
   public String getName();
   public void say(String what);
   public String getGreeting(String name);
}
