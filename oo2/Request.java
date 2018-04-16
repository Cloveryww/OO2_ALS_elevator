package oo2;

public class Request {
	private ReqType type;
	private int floorNo;
	private Direction FRdir;
	private int time;
	private int status; //  0: 合法    1: 在捎带集合中   2:same   3:invalid
	
	public Request(ReqType type, int floorNo, Direction fRdir, int time) {
		super();
		this.type = type;
		this.floorNo = floorNo;
		FRdir = fRdir;
		this.time = time;
		this.status = 0;
	}
	public Request(ReqType type, int floorNo, int time) {
		super();
		this.type = type;
		this.floorNo = floorNo;
		this.time = time;
		this.status = 0;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public ReqType getType() {
		return type;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public Direction getFRdir() {
		return FRdir;
	}
	public int getTime() {
		return time;
	}
	public void setType(ReqType type) {
		this.type = type;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public void setFRdir(Direction fRdir) {
		FRdir = fRdir;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String toString()
	{
		String str = "";
		if(this.type==ReqType.FR)//(FR,1,UP,0)
		{
			if(this.FRdir==Direction.UP)
			{
				str = "(FR,"+Integer.toString(this.floorNo)+",UP,"+Integer.toString(this.time)+")";
			}
			else
			{
				str = "(FR,"+Integer.toString(this.floorNo)+",DOWN,"+Integer.toString(this.time)+")";
			}
			return str;
		}
		if(this.FRdir==Direction.UP)
		{
			str = "(ER,"+Integer.toString(this.floorNo)+",UP,"+Integer.toString(this.time)+")";
		}
		else
		{
			str = "(ER,"+Integer.toString(this.floorNo)+","+Integer.toString(this.time)+")";
		}
		return str;
	}
	public String toString2()//[request]  such as  :[FR,1,UP,0]
	{
		String str = "";
		if(this.type==ReqType.FR)//(FR,1,UP,0)
		{
			if(this.FRdir==Direction.UP)
			{
				str = "[FR,"+Integer.toString(this.floorNo)+",UP,"+Integer.toString(this.time)+"]";
			}
			else
			{
				str = "[FR,"+Integer.toString(this.floorNo)+",DOWN,"+Integer.toString(this.time)+"]";
			}
			return str;
		}
		if(this.FRdir==Direction.UP)
		{
			str = "[ER,"+Integer.toString(this.floorNo)+",UP,"+Integer.toString(this.time)+"]";
		}
		else
		{
			str = "[ER,"+Integer.toString(this.floorNo)+","+Integer.toString(this.time)+"]";
		}
		return str;
		
	}

}
