import java.util.*;
class Main{
	 public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter sides : ");
		 double x = in.nextDouble();
	     double y = in.nextDouble();
		System.out.print("Area OR Volume ? : ");
		int type = in.nextInt();
		if (type == 1){
		System.out.println("Enter Sides : ");
		    int sides = in.nextInt();
		    int type1 = in.nextInt();
		    switch (sides){
		        case 1:
		        case 2 :System.out.println("Error");
		        break;
		        case 3: 
		        switch (type1){
		            case 1 : System.out.println(AT(x,y));
		                case 2: System.out.println(AEqT(x));
		                    case 3:System.out.println(AIsT(x,y));
		        }
		    }
		}
		
	}
	static double AR(double a ,double b){   //AreaRectangle
		double area = a * b;
		return area;
	}
	static double AC(double r){     //AreaCircle
	    double area = 3.14*r*r;
	    return area;
	}
	static double AT(double a ,double b){  //AreaTriangle
		double area = 0.5 * a * b;
		return area;
	}
		static double AEqT(double a){     //AreaEqTriangle
		double area = (1.73/4) * a * a;
		return area;
	}
	static double AIsT(double a ,double b){    //AreaIsoscelesTriangle
		double area = (a * b)/2;
		return area;
	}
	static double perimeterCircle(double a){        //perimeterCircle
		double p = 2*3.14*a;
		return p;
	}
	static double perimeter4side(double a ,double b,double c, double d){  //(Square/Rectangle/Rhombus/Paralellogram)
		double p = a + b +c+d;
		return p;
	}
	static double VC(double r ,double h){       //volumeCone
		double v = (3.14 * r * r * h)/3;
		return v;
	}
	static double VCyl(double r ,double h){   //volumeCylinder
		double v = 3.14*r *r* h;
		return v;
	}
	static double VS(double r){               //volumeSphere
		double v = (4/3)*3.14*r *r* r;
		return v;
	}
	static double VPyr(double l ,double w , double h){     //volumePyramid
		double v = (l*w* h)/3;
		return v;
	}
		static double VPr(double b , double h){     //volumePrism
		double v = b*h;
		return v;
	}
}
