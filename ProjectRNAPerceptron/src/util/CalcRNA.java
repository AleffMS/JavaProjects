package util;

/**
 *
 * @author aleff
 */
public class CalcRNA {

    public int CalcV(int e1, int e2, int e3, int p1, int p2, int p3) {
        int v = 0;

        v = (e1 * p1) + (e2 * p2) + (e3 * p3);
        //System.out.println("(" + e1 + "*" + p1 + ") + (" + e2 + "*" + p1 + ") + (" + e3 + "*" + p3 + ")");

        return v;
    }

    public int FuncaoTransferencia(int v) {
        int ft = 0;
       

        if (v > 0) {
            ft = 1;
        } else {
            ft = 0;
        }

        
        return ft;

    }
    
    public int CalcE (int ft, int vd){
        int e = 0;
        
        e = vd - ft;
        
        return e;
    }
    
    
    public boolean verifica(int ft, int vd){
        boolean indicador = false;
        
        if(ft == vd){
            indicador = true;
        }
        
        return indicador;
    }

}
