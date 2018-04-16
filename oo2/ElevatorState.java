package oo2;

public enum ElevatorState {
		UP, DOWN, STILL, WFS;
	public String EnumToString() 
	{ 
	    String tmpStr = ""; 
	    switch(this) 
	    { 
	        case UP: 
	        	tmpStr = "UP"; 
	        	break; 
	        case DOWN:
	        	tmpStr = "DOWN"; 
	        	break;
	        case STILL:
	        	tmpStr = "STILL"; 
	        	break;
	        case WFS:
	        	tmpStr = "WFS"; 
	        	break;
	        default:
	        	break;
	    } 
	    return tmpStr; 
	} 
}

