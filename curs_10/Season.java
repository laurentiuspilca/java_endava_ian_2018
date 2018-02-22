public enum Season { // final
    SPRING{
        
        public String weather() {
            return "Not so good!";
        }
    }, 
    SUMMER{
        
        public String weather() {
            return "Not so good!";
        }
    }, 
    FALL {
        
        public String weather() {
            return "Not so good!";
        }
        
    }, 
    WINTER{
        
        public String weather() {
            return "Not so good!";
        };
    };
    
    public String weather() {
        return "Good";
    }
}