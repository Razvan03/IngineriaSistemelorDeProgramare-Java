package isp.lab2;

public class Exercise7 {

    /**
     * This method should generate a random number which
     * represent the position in the given arrays,so
     * the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        return (int)(Math.random()*(7 - 0 + 1) + 0);
    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};      // ############ Nu am inteles cerinta.... cine ii ucl si cine ii answers? ############
                                                             // ############ Si ce fac cu nr. random?                                  ############
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times, k=0;
        boolean semn = true;
        int count = 0;
        
        do
        {
            times = generateARandom();
            ucl[k++] = times;
            
            if(times != answers[k-1])
            {
                if(k<=1 || ucl[k-1] != ucl[k])
                    count++;
                if(ucl[k-1] < answers[k-1])
                {
                    System.out.println("Raspunsul utilizatorului: " + ucl[k-1]);
                    System.out.println("Raspunsul corect: " + answers[k-1]);
                    System.out.println("The nr. was too small");
                }
                else
                {
                    System.out.println("Raspunsul utilizatorului: " + ucl[k-1]);
                    System.out.println("Raspunsul corect: " + answers[k-1]);
                    System.out.println("The nr. was too large");
                }
                    
            }
            else
            {
                System.out.println("Raspunsul utilizatorului: " + ucl[k-1]);
                System.out.println("Raspunsul corect: " + answers[k-1]);
                break;
            }   
            if(count == answers.length)
                semn = false;
        }while(semn);
        
        if(semn)
            System.out.print("Nr. incercari: " + count);
        else
            System.out.print("Utilizatorul nu a reusit sa ghiceasca!");
        
    }
}
