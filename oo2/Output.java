package oo2;

public class Output {
	
	
	public void output(Request rq, int curFloor,  ElevatorState e_state, double time)//[request]/（n,STILL,t）
	{
			System.out.println(rq.toString2()+"/("+Integer.toString(curFloor)+","+e_state.EnumToString()+","+Double.toString(time)+")");
	}
	public void invalidoutput(String rq)//可能格式有问题
	{
		System.out.println("INVALID ["+rq+"]");
	}
	public void sameoutput(Request rq)
	{
		System.out.println("# SAME "+rq.toString2());
	}
	

}
