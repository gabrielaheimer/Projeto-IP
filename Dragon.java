
public class Dragon {                                                                                                  
    private String name;                                                                                              
    private int strength;                                                                                              
    private String magic;                                                                                              
                                                                                                                       
    Dragon(String name, String magic) {                                                                                
        this.name = name;                                                                                              
        this.magic = magic;                                                                                            
        this.strength = (int) (Math.random() * 10);                                                                    
    }                                                                                                                  
                                                                                                                       
    public int getStrength() {                                                                                        
        return this.strength;                                                                                          
    }                                                                                                                  
                                                                                                                       
    public String getName() {                                                                                          
        return this.name;                                                                                              
    }                                                                                                                  
                                                                                                                       
    public String getMagic() {                                                                                        
        return this.magic;                                                                                            
    }                                                                                                                  
                                                                                                                       
    public void train(int value) {                                                                                    
        this.strength += value;                                                                                        
    }                                                                                                                  
}