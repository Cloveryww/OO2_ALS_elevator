package oo2;

import java.util.ArrayList;

public class RequestList {
	private ArrayList<Request> ReqList;
	private int nextindex;
	
	RequestList()
	{
		ReqList = new ArrayList<Request>();
		nextindex = 0;
	}
	
	public int getNextindex() {
		return nextindex;
	}

	public void setNextindex(int nextindex) {
		this.nextindex = nextindex;
	}
	public void nextindexadd1() {
		this.nextindex = this.nextindex+1;
	}

	public int getListlen()
	{
		return ReqList.size();
	}
	public Request getReq(int index)
	{
		if(index>=ReqList.size())
		{
			return null;
		}
		else
		{
			return ReqList.get(index);
		}
	}
	public void  addReq(Request newReq)
	{
		ReqList.add(newReq);
	}
	public void deleteReq(int index)
	{
		ReqList.remove(index);
	}
	public void deleteReq(Request rq)
	{
		for (int i=0;i<ReqList.size();i++)
		{
			if(rq == ReqList.get(i))
			{
				ReqList.remove(i);
				return ;
			}
		}
		System.out.println("error2");
	}

}
