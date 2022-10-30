import java.util.*;
class Main{
	 public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Dimensions[L/B/H] : ");
		 double x = in.nextDouble();
	     double y = in.nextDouble();
	     double z = in.nextDouble();
		System.out.print("Area(1) OR Volume(2) OR Perimeter(3) ? : ");
		int type = in.nextInt();
		if (type == 1){
		System.out.println("Enter the number of sides : ");
		    int sides = in.nextInt();
		    switch (sides){
		        case 0:System.out.println(AC(x));
		        case 1:
		        case 2 :System.out.println("Error");
		        break;
		        case 3: System.out.println("ENter type");
		        int type1 = in.nextInt();
		        switch (type1){
		            case 1 : System.out.println(AT(x,y));
		            break;
		                case 2: System.out.println(AEqT(x));
		                break;
		                    case 3:System.out.println(AIsT(x,y));
		                    break;
		        }
		        case 4 : System.out.println(AR(x,y));
		    }
		}
		else if (type==2){
		    System.out.println("Enter the shape");
		    System.out.println("Cone(1) OR Cylinder(2)");
		    System.out.println("Sphere(3) OR Pyramid(4)");
		    int shape = in.nextInt();
		    switch (shape){
		       case 1 : System.out.println(VC(x,y));
		       break;
		       case 2 : System.out.println(VCyl(x,y));
		       break;
		       case 3 : System.out.println(VS(x));
		       break;
		       case 4 : System.out.println(VPyr(x,y,z));
		       break;
		}
		
	}
	else if (type==3){
	    System.out.println("Enter the number of sides : ");
		    int sides = in.nextInt();
		    switch (sides){
		        case 0:System.out.println(perimeterCircle(x));
		        case 1:
		        case 2 :System.out.println("Error");
		        break;
		    /*    case 3:System.out.println(perimeterTriangle());
		        break;
		        case 4:System.out.println(perimeter4side());
		        break;*/
    	  }
    	}
	 }
	
	static double AR(double a ,double b){   //Area(Rectangle/Rhombus/Square/Paralellogram)
		double area = a * b;
		return area;
	}
	static double AC(double r){     //AreaCircle
	    double area = 3.14159*r*r;
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
		double p = 2*3.14159*a;
		return p;
	}
	static double perimeterTriangle(double a,double b, double c){
	    double p = a+b+c;
	    return p;
	}
	static double perimeter4side(double a ,double b,double c, double d){  //(Square/Rectangle/Rhombus/Paralellogram)
		double p = a + b +c+d;
		return p;
	}
	static double VC(double r ,double h){       //volumeCone
		double v = (3.14159 * r * r * h)/3;
		return v;
	}
	static double VCyl(double r ,double h){   //volumeCylinder
		double v = 3.14159*r *r* h;
		return v;
	}
	static double VS(double r){               //volumeSphere
		double v = 1.33333 * 3.14159*r *r* r;
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
