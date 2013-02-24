/*
 * HEADER NOTE FOR MAT:
 * 
 * I haven't worked on this recently
 * 
 * critic to-do:
 * 
 *  - How are constants derived?
 *      a. eta
 *      b. tau
 *      c. rho
 *      d. sigma
 *      e. delta
 *      f. gamma
 *      g. baselineEffectiveRewardSignal
 *      h. inititalWeights
 * 
 */
package dopamine.emulation.project;

import java.util.logging.Level;
import java.util.logging.Logger;

/* Notes from Alex:
 *
 * 24/02/13
 *  - Started moving onto the effective reinforcement signal from the rest
 * of the stuff. Sorry for not commiting anything in the past little while, but
 * it looks like no one else has been working on the project, so there shouldn't
 * be any upsets caused by it.
 * 
 * 
 * Things Alex Tends To Forget:
 * 
 * -- if there is an 'l' in the subscript, they're talking about stimulus
 * -- if there's an 'n' in the subscript, they're likely talking about actions
 */
public class Critic {
//   constants
   
    double eta;
    double tau;
    double rho = 0.94;
    double sigma;
    double delta;
    double gamma;
    double baselineERsignal;
    double initialWeights;
    
    double[] e;
/*   e is the form that the stimuli in take, there are four corresponding to 
 * each of the lights that are availible
 * 
 *          [ L ] [ C ] [ R ]
 *                
 *          The final stimulus is the receptor on the tounge
 */ 
    int eBar;
    double [] x;
    /* xlm is the temporal relresentation from a stimulus e
     * this depends on the onset of the stimulus el(t)
     */
    
    public Critic (){
        // Alex
        // Just defining constants
        
        e = new double [4];
        x = new double [e.length*3];
        eBar = 0;
    }
    
    public void updateE (int left, int centre, int right, int tounge) {
        //Alex
        
        if (!(left <= 1 && right <=1 && centre <= 1 && tounge <= 1)){
            try {
                throw new Exception("Input to updateE incorrect");
            } catch (Exception ex) {
                Logger.getLogger(Critic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
//        if the values are correct
        e [0] = left;
        e [1] = centre;
        e [2] = right;
        e [3] = tounge;
        
    }
    
    public void prediction(){
        
        // to be filled
        
    }
    
    public void weight(){
        
        // to be filled
        
    }
    
    public void effectiveReinforcementSignal(){
        
        // to be filled
        
    }
    
    public void updatex (){
        /*
         * Last updated by Alex on 24/02/13
         */
        for (int i = 0; i < 3; i++) {
            
            if () {
//          Case 1: Onset of stimulus el(t) elicited the first representation component
                x[i] = e[i];
                x[(i*3)+1] = 0;
                x[(i*3)+2] = 0;
                x[(i*3)+3] = 0;
            }
            
            if (exp) {
//          Case 2: The slower components followed one time-step (100ms) after the onset of the stimulus el(t)
                x[i] = rho*e[i];
                x[(i*3)+1] = rho*e[i];
                x[(i*3)+2] = rho*e[i];
                x[(i*3)+3] = rho*e[i];
            }
            
            if (exp) {
//          Case 3: More than one time-step after the onset of stumulus el(t), the components
                x[i] = (determineCL()*x[])/gamma;
            }
        }
    }
    
    public double determineCL ( ){
        return 1;
    }
    
    public int eBarCalculation (){
        
        if (eBar == 0){
            return 0;
        }
        return eBar;
    }

    public double deltaXLM (int index){
        return 1;
    }
/*  Effective reinforcement signal
 *   
 */
}
