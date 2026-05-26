/*
Megaquestion 4: The Silicon Stress Test
Objective: Build a benchmarking utility utilizing Multithreading, Array Algorithms, and strict Encapsulation.

Requirements:
1. Create a thread-based class named Megaquestion4.
2. Data Assets: You need a shared array of thermal readings: {75, 0, 82, 0, 95, 0, 60} (0 represents a failed sensor read). You also need a variable to store the hardware component's name. Both of these assets MUST be strictly encapsulated.
3. Initialization: Use a parameterized constructor to assign the component's name and sync it with the thread's internal name.
4. Execution Logic: 
   - If the active component is "CPU Diagnostic": Clean the shared thermal array in-place by pushing all failed reads (0s) to the end.
   - If the active component is "GPU Render Test": Sort the shared thermal array from lowest to highest.
   - Both tasks must print the array before and after processing, and simulate a 1500ms hardware workload.
5. Main Pipeline:
   - Instantiate two benchmark threads: "CPU Diagnostic" and "GPU Render Test".
   - Force the CPU diagnostic to completely finish before the GPU test is allowed to begin.
   - Guarantee that the program prints "System Benchmark Complete. Hardware is stable." at the very end of the pipeline, regardless of any potential thread interruptions.
*/
package practice.varad.code;

public class MegaQuestion4 extends Thread{
	private String componentName;

	public String getComponentName() {
		return componentName;
	}

	private static int thermals[]= {75,0,82,0,95,0,60};
	
	MegaQuestion4(String componentName){
		this.setName(componentName); //super(componentName); works too
		this.componentName = componentName;
	}
	
	void printInitialArray(int array[]) {
		System.out.println("---Initial Array---");
		for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
		}
	}
	
	void printFinalArray(int array[]) {
		System.out.println("\n---Final Array---");
		for(int i=0;i<array.length;i++) {
				System.out.print(array[i]+" ");
		}
	}
	
	void cleanArray(int array[]) {
		int temp,index=0;
		for(int i=0;i<array.length;i++) {
			if (array[i]!=0) {
				temp = array[i];
				array[i] = array[index];
				array[index] = temp;
				index++;
			}
		}
	}
	
	void sortArray(int array[]) {
		int temp,chotu;
		for(int i=0;i<array.length;i++) {
			chotu=i;
			for(int j=i+1;j<array.length;j++) {
				if (array[j]<array[chotu]) {
					chotu=j;
				}
			}
			if (chotu!=i) {
				temp=array[i];
				array[i]=array[chotu];
				array[chotu]=temp;
			}
		}
	}
	
	public void run() {
		if (getComponentName().equals("CPU Diagnostic")) {
			printInitialArray(thermals);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
			}
			cleanArray(thermals);
			printFinalArray(thermals);
			System.out.println();
		}
		if (getComponentName().equals("GPU Render Test")) {
			printInitialArray(thermals);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
			}
			sortArray(thermals);
			printFinalArray(thermals);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MegaQuestion4 obj1 = new MegaQuestion4("CPU Diagnostic");
		MegaQuestion4 obj2 = new MegaQuestion4("GPU Render Test");
		System.out.println("System Benchmark Started.");
		try {
			System.out.println("\nCPU Diagnostic");
			obj1.start();
			obj1.join();
			System.out.println("\nGPU Render Test");
			obj2.start();
			obj2.join();
		} catch (Exception e) {
			
		}
		finally {
			System.out.println("\nSystem Benchmark Complete. Hardware is stable.");
		}
	}

}
