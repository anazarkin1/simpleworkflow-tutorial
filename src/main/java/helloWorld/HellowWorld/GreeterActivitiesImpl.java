package helloWorld.HellowWorld;

import helloWorld.HellowWorld.GreeterActivities;
public class GreeterActivitiesImpl implements GreeterActivities{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "World";
	}

	@Override
	public String getGreeting(String name) {
		return "Hello "+ name+ "!";
	}

	@Override
	public void say(String what) {
		System.out.println(what);
		
	}
	
}