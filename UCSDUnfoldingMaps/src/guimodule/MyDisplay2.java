package guimodule;


import java.util.ArrayList;
import java.util.List;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.OpenStreetMap;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class MyDisplay2 extends PApplet
{
	
	public UnfoldingMap map;
	
	public void setup()
	{
		List <PointFeature> bigEq = new ArrayList<PointFeature>();
		/*bigEq.add(valEq);
		bigEq.add(alaskaEq);
		bigEq.add(sumatraEq);
		bigEq.add(japanEq);
		bigEq.add(kamchatkaEq);
		*/
	
		background(250,250,250);
		size(1000,500,OPENGL);		//OPENGL is graphics library // new Google.GoogleMapProvider()
		
		map = new UnfoldingMap(this,new Google.GoogleMapProvider()); //OpenStreetMap.OpenStreetMapProvider()
		
		map.zoomToLevel(2);
		
		MapUtils.createDefaultEventDispatcher(this, map);
		
		/*List<Marker> markers = new ArrayList<Marker>();
		for(PointFeature eq: bigEarthquakes)
		{
			markers.add(new SimplePointMarker(eq.getLocation(),eq.getProperties()));
		}
		map.addMarkers(markers);
		*/
	}
	
	public void draw()
	{
		map.draw();
	
	}
}

