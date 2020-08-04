package sample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SampleBean implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5307652891294044974L;

	private static final Map<String, String> dropDown = new HashMap<>();
	
	static {
		dropDown.put("K1", "K1");
		dropDown.put("K2", "K2");
		dropDown.put("K3", "K3");
	}

	public Map<String, String> getDropDown() {
		return dropDown;
	}

	private List<TableObject> tableObjects = Arrays.asList(new TableObject[] {new TableObject(), new TableObject()});
	
	public List<TableObject> getTableObjects() {
		return tableObjects;
	}

	public void setTableObjects(List<TableObject> tableObjects) {
		this.tableObjects = tableObjects;
	}

	public static class TableObject 
	{
		private String dd;

		public String getDd() {
			return dd;
		}

		public void setDd(String dd) {
			this.dd = dd;
		}
		
	}
}