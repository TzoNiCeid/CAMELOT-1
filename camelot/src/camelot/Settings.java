public class Settings {

	public int Volume;  //Metavlhth gia thn entash afhghshs.
	public boolean Is_on_hx;// Metavlhth gia ton Hxo polumeswn.
	public boolean Is_on_n; // Metavlhth gia ta Notifications.
	public String Lang_Chosen;//Metavlhth gia thn epilogh glwssas.Thn arxikopoihoume se Greek.
	
	public Settings (){
		this.Volume = 50;
		this.Is_on_hx = true;
		this.Lang_Chosen = "Greek";
		this.Is_on_n = true;   /* Prosthesa allh mia boolean metavlhth etsi wste kathe fora 
		                        pou dhmiourgeitai ena antikeimo tupou settings, na mhn ephreazetai
		                        h timh gia tis metavlhtes hxos_polumeswn kai Notifications  */
	}
	
	public boolean getIs_On_hx(){
		return this.Is_on_hx;
	}

	public String getLang(){
		return this.Lang_Chosen;
	}

    public boolean getIs_on_n() {
		return this.Is_on_n;
	}


	public void storevolume( int Volume){
    	this.Volume = Volume ;
    	System.out.println("H entash afhghshs einai :" + this.Volume);
    }
    
    public void storeaudio(boolean Is_on_hx){
    	this.Is_on_hx = Is_on_hx;
    	if (Is_on_hx == true){
    	System.out.println("O hxos polumeswn einai energopoihmenos ");
    	}else {
    		System.out.println("O hxos polumeswn einai apenergopoihmenos");
    	}
    }
    
    public void storeLang(String Lang_Chosen){
    	this.Lang_Chosen =Lang_Chosen ;
    	System.out.println("H Glwssa pou xrhsimopoieitai einai :" + this.Lang_Chosen);
    	
    }
    
    public void storeNotific(boolean Is_on_n){
    	this.Is_on_n =Is_on_n;
    	if (Is_on_n == true){
    	System.out.println("H leitourgia notifications einai energh ");
    	}else {
    		System.out.println("H leitourgia notifications einai anenergh");
    	}
    	
    }
}