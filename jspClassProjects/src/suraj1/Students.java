package suraj1;

public class Students {
	int Rno;
	float M1;
	int M2;
	float M3;
	public Students(int Rno,float M1,int M2,float M3)
	{
		this.Rno=Rno;
		this.M1=M1;
		this.M2=M2;
		this.M3=M3;
	}
	public float Per()
	{
		float pc;
		pc=(M1+M2+M3)/300*100;
		return pc;
	}
}//end of the class
