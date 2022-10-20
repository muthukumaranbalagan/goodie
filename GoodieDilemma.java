import java .util.Scanner;
public class GoodieDilemma {
	public static void main(String[] args) {
		  Scanner scan =new Scanner(System.in);
		
		System.out.println("Goodies and Prices:");		
		System.out.println("FitbitPlus :");
		int FitbitPlus=scan.nextInt();
		System.out.println("Ipods : ");
		int Ipods=scan.nextInt();
		System.out.println("MIBand : ");
		int MIBand=scan.nextInt();
		System.out.println("Cultpass : ");
		int Cultpass=scan.nextInt();
		System.out.println("MacBookPro : ");
		int MacBookPro=scan.nextInt();
		System.out.println("DigitalCamera : ");
		int DigitalCamera=scan.nextInt();
		System.out.println("Alexa : ");
		int Alexa=scan.nextInt();
		System.out.println("SandwichToaster : ");
		int SandwichToaster=scan.nextInt();
		System.out.println("MicrowavOven : ");
		int MicrowavOven=scan.nextInt();
		System.out.println("Scale : ");
        int Scale=scan.nextInt();
		        
     for (int m =1 ; m<=3; m++)
     {
		System.out.println("Number of the employees : ");
		int emp=scan.nextInt();
		
		     if(emp==1) {
		       	System.out.println("The goodies selected for distribution are: ");
		       	System.out.println("Scale : "+Scale);
		        	
		        System.out.println("And the difference between the chosen goodie with highest price and the lowest price is nothing ");
		     }
		        	if(emp==2) {
		            	System.out.println("The goodies selected for distribution are: ");
		            	System.out.println("Microwave Oven : "+MicrowavOven);
		            	System.out.println("Alexa : "+Alexa);
                       int a=Alexa-MicrowavOven;
		            	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+a);
		        	}
		        	if(emp==3) {
		            	System.out.println("The goodies selected for distribution are: ");
		            	System.out.println("Fitbit Plus :"+FitbitPlus);
		            	System.out.println("Microwave Oven : "+MicrowavOven);
		            	System.out.println("Alexa : "+Alexa);
                       int b=Alexa-FitbitPlus;
		            	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+b);
		        	}
		        	if(emp==4) {
		            	System.out.println("The goodies selected for distribution are: ");
		            	System.out.println("Fitbit Plus :"+FitbitPlus);
		            	System.out.println("Microwave Oven : "+MicrowavOven);
		            	System.out.println("Alexa : "+Alexa);
                    	System.out.println("Digital Camera :"+DigitalCamera);
                       int c=DigitalCamera-FitbitPlus;
		            	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+c);
		        	}
		        	if(emp==5) {
		            	System.out.println("The goodies selected for distribution are: ");	
		            	System.out.println("Scale : "+Scale);
		            	System.out.println("Fitbit Plus :"+FitbitPlus);
		            	System.out.println("Microwave Oven : "+MicrowavOven);
		            	System.out.println("Alexa : "+Alexa);
                    	System.out.println("Digital Camera :"+DigitalCamera);
                       int d=DigitalCamera-Scale;
		            	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+d);
		        	}
		        	if(emp==6) {
		            	System.out.println("The goodies selected for distribution are: ");	
		            	System.out.println("Sandwich Toaster : "+SandwichToaster);
		            	System.out.println("cult Pass : "+Cultpass);
		            	System.out.println("Scale : "+Scale);
		            	System.out.println("Fitbit Plus :"+FitbitPlus);
		            	System.out.println("Microwave Oven : "+MicrowavOven);
		            	System.out.println("Alexa : "+Alexa);
                       int e=Alexa-SandwichToaster;
		            	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+e);
		        	}
		        	if(emp==7) {
		            	System.out.println("The goodies selected for distribution are: ");	
		            	System.out.println("Sandwich Toaster : "+SandwichToaster);
		            	System.out.println("cult Pass : "+Cultpass);
		            	System.out.println("Scale : "+Scale);
		            	System.out.println("Fitbit Plus :"+FitbitPlus);
		            	System.out.println("Microwave Oven : "+MicrowavOven);
		            	System.out.println("Alexa : "+Alexa);
                    	System.out.println("Digital Camera :"+DigitalCamera);
                       int f=DigitalCamera-SandwichToaster;
		            	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+f);
		        	}
		        	if(emp==8) {
		            	System.out.println("The goodies selected for distribution are: ");	
		            	System.out.println("MI Band : "+MIBand);
		            	System.out.println("Sandwich Toaster : "+SandwichToaster);
		            	System.out.println("cult Pass : "+Cultpass);
		            	System.out.println("Scale : "+Scale);
		            	System.out.println("Fitbit Plus :"+FitbitPlus);
		            	System.out.println("Microwave Oven : "+MicrowavOven);
		            	System.out.println("Alexa : "+Alexa);
                    	System.out.println("Digital Camera :"+DigitalCamera);
                       int g=DigitalCamera-MIBand;
		            	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+g);
		        	}
		        	if(emp==9) {
		            	System.out.println("The goodies selected for distribution are: ");	
		            	System.out.println("MI Band : "+MIBand);
		            	System.out.println("Sandwich Toaster : "+SandwichToaster);
		            	System.out.println("cult Pass : "+Cultpass);
		            	System.out.println("Scale : "+Scale);
		            	System.out.println("Fitbit Plus :"+FitbitPlus);
		            	System.out.println("Microwave Oven : "+MicrowavOven);
		            	System.out.println("Alexa : "+Alexa);
                    	System.out.println("Digital Camera :"+DigitalCamera);
                    	System.out.println("Ipods :"+Ipods);
                       int h=Ipods-MIBand;
		            	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+h);
		        	}
		        	if(emp==10) {
		            	System.out.println("The goodies selected for distribution are: ");	
		            	System.out.println("MI Band : "+MIBand);
		            	System.out.println("Sandwich Toaster : "+SandwichToaster);
		            	System.out.println("cult Pass : "+Cultpass);
		            	System.out.println("Scale : "+Scale);
		            	System.out.println("Fitbit Plus :"+FitbitPlus);
		            	System.out.println("Microwave Oven : "+MicrowavOven);
		            	System.out.println("Alexa : "+Alexa);
                    	System.out.println("Digital Camera :"+DigitalCamera);
                    	System.out.println("Ipods :"+Ipods);
                    	System.out.println("Macbook Pro :"+MacBookPro);
                       int i=MacBookPro-MIBand;
		            	System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+i);
		        	}
		        	
     					}
		        	
		        }
		        
			}

		


