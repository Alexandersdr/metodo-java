public class Emprestimo {
    public static int getDuasParcelas(){
        return 2;
    } 
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    } 
    
    public static Void calcular(double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("valor final do emprestimo para 2 parcelas: R$ "  + valorFinal);
        
        }else if (parcelas == 3){
            double valorFinal = + (valor * getTaxaTresParcelas());
            System.out.println("valor final do emprestimo para 3 parcelas: R$ "  + valorFinal);

        }else{

            System.out.println("quantidade de parcelas não aceita.");
            
        }
        return null;
    }
    public Emprestimo() {
    }    
}
