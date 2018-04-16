package oo2;


public class Elevator {

	private ElevatorState state;
	private int curfloor;
	private double e_time;
	private double targetfloor;
	private Boolean[] e_button = new Boolean[10]; 
	
	
	public Elevator() {
		super();
		this.state = ElevatorState.WFS;
		this.curfloor = 1;
		this.e_time = 0;
		for(int i =0 ;i<10;i++)
		{
			this.e_button[i]=false;
		}
	}
	public void goUp(int num){//驱动电梯上num楼
		this.state = ElevatorState.UP;
		this.curfloor += num;
		this.e_time+= 0.5 * num;
	}
	public void goDown(int num){//驱动电梯下num楼
		this.state = ElevatorState.DOWN;
		this.curfloor -= num;
		this.e_time += 0.5 * num;
	}
	public void gowait(double waittime)//驱动电梯等待waittime时间
	{
		this.state = ElevatorState.WFS;
		this.e_time += waittime;
	}
	public void goOpenClose()//驱动电梯开关门
	{
		this.state = ElevatorState.STILL;
		this.e_time += 1;
	}
	
	
	public double getTargetfloor() {
		return targetfloor;
	}
	public void setTargetfloor(double targetfloor) {
		this.targetfloor = targetfloor;
	}
	public ElevatorState getState() {
		return state;
	}
	public void setState(ElevatorState state) {
		this.state = state;
	}
	public void setCurfloor(int curfloor) {
		this.curfloor = curfloor;
	}
	public void setE_time(double e_time) {
		this.e_time = e_time;
	}
	public int getCurfloor() {
		return curfloor;
	}
	public double getE_time()
	{
		return e_time;
	}
	public Boolean pushButton(int no)
	{
		if(this.e_button[no])
		{
			return false;
		}
		else
		{
			this.e_button[no]=true;
			return true;
		}
	}
	public Boolean popButton(int no)
	{
		if(this.e_button[no])
		{
			this.e_button[no]=false;
			return true;
		}
		else
		{
			return false;
		}
	}
}
