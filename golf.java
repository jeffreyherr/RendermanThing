import java.io.*;
public class golf extends Ri {


public static void main (String args[]) { 

  new golf().main();
}


double[] White = {1.0,1.0,1.0};
double[] Blue = {0.0,0.0,1.0};
double[] Red = {1.0,0.0,0.0};
double[] bluh = {0.8, 1.8, 1.9};
double[] beige = {0.8,0.73,0.62};
double[] black = {0.0,0.0,0.0};
   boolean mapping=true; 
	boolean display=false; 
	boolean ship=false; 
	boolean ship2=false; 


//creating constants that dictate colors, angles, sizes
int constant = 1000;
	int ellipsoid = 1001;
	int segment_blob = 1002;
	int repelling_ground_plane = 1003;
	int add = 0;
	int multiply = 1;
	int maximum = 2;
	int minimum = 3;
	int subtract = 4;
	int divide = 5;
	int negate = 6;
	int identity = 7;
	// Define a background polygon
	double[] Background[] = {
			{-20, -10, 10},
			{-20, 10, 10},
			{20, 10, 10},
			{20, -10, 10}
	};
	int codeArray[] = {
			ellipsoid, 0,
			ellipsoid, 16,
			add, 2, 0, 1
	};

	int codeArray2[] = {
			ellipsoid, 0,
			ellipsoid, 16,
			// constant, 5,
			add, 0, 1,  
	};

	int codeArray3[] = {
			segment_blob, 0,
			segment_blob, 23,
			//	divide, 0, 2,
			add, 2, 0, 1
	};

	int codeArray4[] = {
			ellipsoid, 0, //0
			ellipsoid, 16, //1
			constant, 32, //2
			divide, 0, 2, //3
			maximum, 2, 1, 3 
	};

	double blobArray[] = {
			0,0,0,
			1,0,0,
			0.25,
			1,0,0,1,
			0,1,0,0,
			0,0,1,0,
			0,0,0,1,

			0,0,0,
			0,1,0,
			0.25,
			1,0,0,-1,
			0,1,0,0,
			0,0,1,0,
			0,0,0,1

	};

double doubleArray2[] = {
			3, 0, 0, 0,
			0, 3, 0, 0,
			0, 0, 3, 0,
			-1.4, 0, 0, 0,

			3, 0, 0, 0,
			0, 3, 0, 0,
			0, 0, 3, 0,
			1.4, 0, 0, 0, 0.9
	};

	String stringArray[] = {
	};




void main ()
{








  

  

  RiBegin(RI_NULL);
  //camera perspective	
  RiFormat(800,600,1.0);
  RiProjection("perspective",RI_NULL);

  RiPixelSamples(1,1);

  //lighting
  double intensity = 0.3;
  RiLightSource("ambientlight", "intensity", intensity, RI_NULL);
  double otherintensity = 1.2;
  RiLightSource("distantlight", "intensity", otherintensity, RI_NULL);
  double[] from = {0.5, 0.1, 0.0};
  double[] lightSpot = {0.0,0.0,-2.0};
  double intens = 80.0;
  int[] fub = {9,9,9};
  double[] fubpoints[] = {
	{0.0, 0.0, 0.0},
	{0.0, 1.0, 0.0},
	{0.0, 2.0, 0.0},
	{0.0, 3.0, 0.0},
	{0.0, 4.0, 0.0},
	{0.0, 5.0, 0.0},
	{0.0, 6.0, 0.0},
	{0.0, 7.0, 0.0},
	{0.0, 8.0, 0.0},
	{1.0, 0.0, 0.0},
	{1.0, 1.0, 0.0},
	{1.0, 2.0, 0.0},
	{1.0, 3.0, 0.0},
	{1.0, 4.0, 0.0},
	{1.0, 5.0, 0.0},
	{1.0, 6.0, 0.0},
	{1.0, 7.0, 0.0},
	{1.0, 8.0, 0.0},
	{3.0, 0.0, 0.0},
	{3.0, 1.0, 0.0},
	{3.0, 2.0, 0.0},
	{3.0, 3.0, 0.0},
	{3.0, 4.0, 0.0},
	{3.0, 5.0, 0.0},
	{3.0, 6.0, 0.0},
	{3.0, 7.0, 0.0},
	{3.0, 8.0, 0.0},      
 };
double[] blupoints[] = {{0.0, 0.0, 0.0}, {1000.0,0.0,0.0},
			    {0.0,0.0,1000.0}, {10.0,0.0,1000.0}};
  
//RiLightSource("pointlight","from",lightSpot,"intensity",intens,RI_NULL);
    RiDisplay("golf.tiff","file","rgba",RI_NULL);
    RiWorldBegin();
    RiTranslate(0.0,0.0,5.0);  
    RiAttributeBegin();
    double[] Color2 = {0.0,0.8 , 0.1};
	RiColor(Color2);  
	RiTranslate(1.0,0.5,6.0);
	//RiScale(10.0,10.0,10.0);
	RiRotate(45.0,0.0,1.0,0.0);
	//RiSphere(.1, 0.2, 0.4, 360.0, RI_NULL);
	//	RiSurface("myShader",RI_NULL);
	//	new Golfball().UFO(0.2,0.8);
	new tree().callTree();
	RiColor(bluh);
	//	RiPolygon(4, RI_P, blupoints, RI_NULL);
    RiAttributeEnd();
   
    RiAttributeBegin();
    // RiColor(Blue);
    RiTranslate(-50.0, -3.0, 53.0);
    // RiRotate(35.0, 0.0, 1.0, 0.0);
    RiRotate(10.0,-1.0, 0.0, 0.0);
    // RiCurves("cubic", 3,fub, "periodic", "P", fubpoints);
    new grass().callGrass(120,120);
    RiAttributeEnd();

    RiAttributeBegin();
    RiDisplacement("dimple", RI_NULL);
    RiTranslate(-6.0,5.0,6.0);
    RiSphere(0.5, -1.0, 1.0, 360.0, RI_NULL);
    RiAttributeEnd();
    RiAttributeBegin();
    RiColor(Blue);
    RiScale(0.3,0.4,0.4);
  
    RiRotate(180.0, 0.0, 1.0, 0.0);
    RiTranslate(5.0,0.0,0.0);
    try{
	new BSplineSurfaceDrawer().PatchDrawClosed("driver");}
    catch(FileNotFoundException e1) {
    }
    
    RiAttributeEnd();

    RiAttributeBegin();
    RiColor(bluh);
    RiTranslate(-180.0,-140.0,90.0);
    RiRotate(-90.0,1.0,0.0,0.0);
   
    RiPolygon(4, RI_P, blupoints, RI_NULL);
    RiAttributeEnd();
    RiAttributeBegin();
     RiTranslate(-2.8,2.6,0.0);
    RiScale(0.01,0.01,0.01);
    
    RiRotate(50.0, 1.0,0.3,0.0);
    
    RiColor(black);
    example(new String [] {"F+FF-[-FF]-F"},"--F",5,25.7,1.0,1,5);
     RiRotate(50.0, 0.0,1.0,0.5);
    example(new String [] {"F+FF-[-FF]-F"},"--F",5,25.7,1.0,1,5);
    RiAttributeEnd();
    RiAttributeBegin();
    RiColor(beige);
    RiTranslate(3.0,0.0,0.0);
    RiRotate(90.0,0.0,0.0,1.0);
    RiScale(0.5,0.5,0.5);
    RiSurface("gnomeshade", RI_NULL);
     RiBlobby(2, codeArray.length, codeArray,doubleArray2.length, doubleArray2, 0,stringArray, RI_NULL);
    RiAttributeEnd();
    RiAttributeBegin();
    RiColor(black);
    RiTranslate(0.0,0.0,-2.0);
    RiRotate(90.0,1.0,0.5,0.0);
    RiDisk(27.0,1.8,360.0);
    RiAttributeEnd();
    RiWorldEnd();
    RiEnd();

  

  }  
    
public  void example(String[] rules, String axiom, int depth, double angle, 
		double percent, double width, double length) {

	APlant pm = new APlant();
	pm.setAxiom(axiom);
	pm.setRules(rules);
	String sample = new PlantMaker().makePlant(pm,depth,percent);

	System.out.println(sample);
	
	PlantRenderer pr = new PlantRenderer(sample,
			new TurtleBuilder().length(length).width(width).angleX(angle).angleY(angle).angleZ(angle).build());

	pr.startPlantDrawing();
}

}

