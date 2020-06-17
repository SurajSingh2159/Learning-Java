<html>
<body>
<h1>Scriptlet Tag</h1>
<%
class Employees
{
//following is the declaration of a class Employees
int Emp_Code;
float Basic_Salary,Pf;
int Hra;
Employees(int Emp_Code,float Basic_Salary,float Pf,int Hra)
{
this.Emp_Code=Emp_Code;
this.Basic_Salary=Basic_Salary;
this.Pf=Pf;
this.Hra=Hra;
}
float Calc_NetSalary()
{
float Nsal=Basic_Salary+Hra-Pf;
return Nsal;
}
}//end of the class
%>
<h2>Another Scriptlet Tag</h2>
<%
Employees er=new Employees(1001,10000.99f,100.99f,8000);
out.println("Net Salary="+er.Calc_NetSalary());
%>
</body>
</html>