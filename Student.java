class Student{

    private String name ;
    private double[] grades;
    private int totalNumberOfStudents;
// this is our constractor
    public Student(double [] grades,String name){
    	this.name=name;
    	this.grades=grades;

    }
        //setters and getters for  name since they are private
    public void setName(String name){
    this.name=name;
    }
    public String getName(){
    return name;
    }
      //setters and getters for  grades since they are private
    public void setGrades(double[]grades){
    	this.grades=grades;
    }
    //our method for getting the average grade
    public double [] getGrades(){
	return grades;
    }

    public int getNumberOfStudents(){
	return totalNumberOfStudents++;
	}
	public double getAverageGrades() {
	double sum = 0;
	double average=0;
	for (int i=0; i<grades.length;i++) {
		sum += grades[i];
		average = sum/grades.length;
	}
	return  average;
	
	}
    public String getPrintStudentDetails(){
	 String agatha="Student name is "+getName() + " averageGrade is "
      +getAverageGrades()+ " and the number of curent students is "+
      this.totalNumberOfStudents;
	return agatha;
	}

}