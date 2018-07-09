package collections;
import java.util.ArrayList;




public class CollectionArrayList {

	public CollectionArrayList(){
		DataObject d1 = new DataObject();
		DataObject d2 = new DataObject();
		DataObject d3 = new DataObject();
		DataObject d4 = new DataObject();
		DataObject d5 = new DataObject();
		
		d1.setCode("monday");
		d2.setCode("monday");
		d3.setCode("friday");
		d4.setCode("monday");
		d5.setCode("friday");
		
		ArrayList<DataObject> ar = new ArrayList<DataObject>();
		//HashSet<DataObject> ar = new HashSet<DataObject>();
		ar.add(d1);
		ar.add(d2);
		ar.add(d3);
		ar.add(d4);
		ar.add(d3);
		
		int count=0;
		
		for(DataObject a: ar){			
			if (a.getCode().equals("friday")){
				count++;
			}
		}
		System.out.println(count);	
	}
}
