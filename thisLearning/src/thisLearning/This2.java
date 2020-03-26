package thisLearning;

class Results
{
	Float Marks1,Marks2,Marks3;
	Results(float Marks1, float Marks2,float Marks3)
	{
		this.Marks1=Marks1;
		this.Marks2=Marks2;
		this.Marks3=Marks3;
	}
Results Compare(Results dref)
{
   float First_Percentage,Second_Percentage;
   First_Percentage=(Marks1+Marks2+Marks3)*100/300;
   Second_Percentage=(dref.Marks1+dref.Marks2+dref.Marks3)/300*100;
   if(First_Percentage>Second_Percentage)
	   return this;// returning reference of the current object
   else
	   return dref;// returning reference of the passed object
}
void Show_Marks()
{
	System.out.println("Marks in first subject="+Marks1);
	System.out.println("Marks in second subject="+Marks2);
	System.out.println("Marks in third subject="+Marks3);
}
}

public class This2 {

	public static void main(String[] args) {
		Results sref1=new Results(100,80,95);
		//Results sref2=new Results(90,80,85);
		Results sref2=new Results(100,98,85);
		Results sref3;
		sref3=sref1.Compare(sref2);
		sref3.Show_Marks();
		
	}

}
