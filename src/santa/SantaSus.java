package santa;

public class SantaSus {
	
		
		String[] suspects;
		
		int nextIndex = 0;
		int arraySize = 0;
		
		public SantaSus(int size) {
			this.arraySize = size;
			this.suspects = new String[size];
		}
		
		public void addSuspect(String suspect) {
			this.suspects[this.nextIndex] = suspect;
			this.nextIndex++;
			if (this.nextIndex > this.arraySize) {
				
			}
		}
	}



