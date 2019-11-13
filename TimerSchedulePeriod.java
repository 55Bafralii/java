package HOTEL;

import java.util.TimerTask;

public class TimerSchedulePeriod extends TimerTask 
 
 {
	

		Odalar[] odatipi;
		String Odanumarasi;
     
		public TimerSchedulePeriod(Odalar[] odatipi, String Odanumarasi)
		{
			this.odatipi = odatipi;
			this.Odanumarasi = Odanumarasi;
		
		}
		@Override
		public void run() 
		{
		
				for(int i=0;i<this.odatipi.length;i++)
				{
					if(odatipi[i].odanumarasý == Odanumarasi)
					{
						odatipi[i].status= true;
			
					}
				
				
				 }
			
				
		  }

 } 
