
public class car{
String model;
int cost;
int milage;
public car(String mdl,int mlg, int cst )//constructor creation
{
	model=mdl;//constructor intialisation
	milage=mlg;
	cost=cst;
}
	public void startcar() {
System.out.println("car started" +model);

}
public void carstopped() {
	System.out.println("car stopped" +model);
}
public void cardetails()
{
	System.out.println("model of car is" +model);
	System.out.println("cost of car is" +cost);
System.out.println("milage of car is" +milage);
}

		
}
