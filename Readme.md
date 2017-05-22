#
	To build a runnable jar file for GreeterActivitesWorker to run it on other systems:
	## 2 servers + dev machine (can be 1 server + dev machine)
	* Ensure that AWS_ACCESS_KEY_ID and AWS_SECRET_KEY are setup on all servers
	* Update mainClass in maven-assembly-plugin to helloWorld.HelloWorldWorkflowDistributed.GreeterActivitesWorker
	* mvn clean compile assembly:single
	* scp target/<NAME>.jar to some server
	* java -jar <NAME>.jar on the server
	* Update mainClass in maven-assembly-plugin to helloWorld.HelloWorldWorkflowDistributed.GreeterWorkflowWorker
	* mvn clean compile assembly:single
	* scp target/<NAME>.jar to another server
	* java -jar <NAME>.jar on another server
	* update mainClass in exec-maven-plugin to GreeterMain
	* mvn exec:java -< this will create a task for a workflow
	
