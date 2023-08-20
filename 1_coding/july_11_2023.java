package pk;

public class july_11_2023 {

 class circle{
		private double radius;
		private  int numberOfObjects;
		
		public circle() {
			
		}
		public circle(double radius1) {
			radius = radius;
			numberOfObjects ++;
		}
		public double getradius() {
			return radius;
		}
		public void setradius(double newradius) {
			radius=(newradius >=0) ? newradius :0;
			
		}
		public int getNumberofobject() {
			return numberOfObjects;
		}
		public double getarea() {
			return radius* radius;
		}
		
	}

}
