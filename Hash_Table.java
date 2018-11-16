
import java.util.Enumeration;

import java.util.Hashtable;

	public class Hash_Table {
		
		public static void main(String args[]) {

		// Create a hash map

		Hashtable balance = new Hashtable();

		Enumeration names;

		String str;

		double bal;



		balance.put("Ramlah", new Double(560.67));

		balance.put("Rini", new Double(4506.5));

		balance.put("Amin", new Double(-56.70));

		balance.put("Sufri", new Double(123.43));

		balance.put("Ratna", new Double(-456.5));



		// Show all balances in hash table.

		names = balance.keys();

		while(names.hasMoreElements()) {

		str = (String) names.nextElement();

		System.out.println(str + ": " +

		balance.get(str));

		}

		System.out.println();

		// Deposit 1,000 into Zara's account

		bal = ((Double)balance.get("Ramlah")).doubleValue();

		balance.put("Ramlah", new Double(bal+1000));

		System.out.println("Ramlah's new balance: " +

		balance.get("Ramlah"));

		}
	}
