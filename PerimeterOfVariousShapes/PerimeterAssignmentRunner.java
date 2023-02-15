import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner 
{
   
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        
        int p = getNumPoints(s);
        System.out.println("The Total Number Of Points Are: "+p);
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }
    
    
    public int getNumPoints (Shape s) 
    {
        int totalpoints = 0;
        Point prevpoint = s.getLastPoint();
        
        
        for(Point currPoint: s.getPoints())
        {
            prevpoint = currPoint;
            totalpoints = totalpoints+1;
        }
        if(totalpoints!=0)
            return totalpoints;
        else    
            return 0;
    }

    public double getAverageLength(Shape s) 
    {
        double avglength;
        double lengthofpoints=0.0;
        int count=0;
        
        Point prevpoint = s.getLastPoint();
        
        for(Point currPoint: s.getPoints())
        {
            lengthofpoints = lengthofpoints+prevpoint.distance(currPoint);
            prevpoint = currPoint;
            count=count+1;
        }
        
        avglength=lengthofpoints/count;
        
        if(count!=0)
            return avglength;
        return 0.0;
    }
    
    
    
    public double getLargestSide(Shape s)
    {
        double largestside=0;
        double len=0,max=0;
        Point prevpoint = s.getLastPoint();
        
        for(Point currPoint: s.getPoints())
        {
            len = prevpoint.distance(currPoint);
            
            if(max<len)
                max=len;
            prevpoint = currPoint;
        }
        if(max!=0)
            return max;
        else
            return 0.0;
    }

    public double getLargestX(Shape s) 
    {
        
        double currx=0;
        double larx=0;
        Point prevpoint = s.getLastPoint();
        
        for(Point currPoint: s.getPoints())
        {
            larx = currPoint.getX();
            
            if(currx<larx)
                larx=currx;
            prevpoint = currPoint;
        }
       
        if(larx!=0)
            return larx;
        else
            return 0.0;
    }

    public double getLargestPerimeterMultipleFiles() 
   {
        double maxper=0.0;
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) 
        {
           
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double getper = getPerimeter(s);
            
            if(maxper<getper)
                {
                    maxper=getper;
                }
        }
        if(maxper!=0)
            return maxper;
        else
            return 0.0;
    }

    public String getFileWithLargestPerimeter() 
    {
        DirectoryResource dr = new DirectoryResource();
        String name= null;
        double maxper=0.0;
        for (File f : dr.selectedFiles()) 
        {
           
            FileResource fr = new FileResource(f);
            
            Shape s = new Shape(fr);
            double getper = getPerimeter(s);
            
            if(maxper<getper)
                {
                    maxper=getper;
                    name=f.getName();
                }
        }
          // replace this code
        return name;
    }

    public void testPerimeter () 
    {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        double avlen = getAverageLength(s);
        System.out.println("Average Length Of Each Side: "+avlen);
        double larside = getLargestSide(s);
        System.out.println("Largest Side: "+larside);
        double maxx = getLargestX(s);
        System.out.println("Largest X Value: "+maxx);
        
    }
    
    public void testPerimeterMultipleFiles()
    {
        DirectoryResource dr = new DirectoryResource();
        dr.selectedFiles();
        double g = getLargestPerimeterMultipleFiles();
        System.out.println("Largest Perimeter: "+g);
        // Put code here
    }

    public void testFileWithLargestPerimeter() 
    {
        String hesru = getFileWithLargestPerimeter();
        System.out.println("The File With Largest Permiter Is: "+hesru);
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
