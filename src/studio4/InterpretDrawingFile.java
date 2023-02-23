package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		StdDraw.setPenColor(r,g,b);
		String isFilled = in.next();
		
		
		if (shape.equals("ellipse")) {
		double xx = in.nextDouble();	
		double yy = in.nextDouble();
		double sma = in.nextDouble();
		double sima = in.nextDouble();
			if (isFilled.equals("false")) {
				StdDraw.ellipse(xx, yy, sma, sima);
				
			}
			else {
				StdDraw.filledEllipse(xx, yy, sma, sima);
			}
		}
		if (shape.equals("rectangle")) {
		double xx = in.nextDouble();	
		double yy = in.nextDouble();
		double sma = in.nextDouble();
		double sima = in.nextDouble();
				if (isFilled.equals("false")) {
					StdDraw.rectangle(xx, yy, sma, sima);
					
				}
				else {
					StdDraw.filledRectangle(xx, yy, sma, sima);	
				}
		}
		if (shape.equals("triangle")) {
		double a = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double ff = in.nextDouble();
		double gg = in.nextDouble();
		double [] name = {a,d,ff};
		double [] peepee = {c,e,gg};
			if (isFilled.equals("false")) {
				StdDraw.polygon(name,peepee);
			}
			else {
				StdDraw.filledPolygon(name,peepee);
			}
		
		
		}
	}
}
