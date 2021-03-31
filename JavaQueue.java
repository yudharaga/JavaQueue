package javaqueue;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Arzan-PC
 * Nama     : Yudha Raga Putra
 * Prodi    : TI20E
 * NIM      : 20200040082
 */
public class JavaQueue {
private static int[]queue=new int[10];
    private static int counters=0;
    
    private static boolean PenyimpananQueue(){
        if(counters<queue.length){
            return true;
        }
        else{
            return false;
        }
    }
    private static void addQueue(){
        int loopX =0;
        int alpha =0;
        while(loopX==0){
            System.out.print("Masukan Data (numbers only): ");
            Scanner alphaX= new Scanner(System.in);
            try{
                alpha= alphaX.nextInt();
                loopX= 1;
            }
            catch(InputMismatchException e){
                System.out.println("Data Salah, silahkan ulangi(numbers only) !");
                loopX= 0;
            }
        }
        queue[counters]=alpha;
        counters++;
    }
    private static void HapusQueue(){
        counters--;
        for(int i=0; i<counters; i++){
            queue[i]=queue[i+1];
        }
        System.out.println("data telah di hapus");
    }
    private static void ListQueue(){
        String List = null;
        
        System.out.println("One of the first data has been out\t:"+List);
    }
    private static void DataQueue(){
        System.out.print("Data in Queue : ");
        for(int i=0; i<counters; i++){
            System.out.print("["+i+"=>"+queue[i]+"]");
        }
        System.out.println("");
    }
    private static void clean() {
    counters = 0;
}
    
    private static void exit(){
        String quitss ="Of Course";
        System.out.print("Exit from this program?(Of Course/maybe later)");
        quitss=new Scanner(System.in).nextLine();
        if(quitss.equalsIgnoreCase("Of Course")){
            System.exit(0);
        }
        else{
            menuProgram();
        }
    }
    private static void menuChooser(int choosenMenu){
        switch(choosenMenu){
            case 1:
                boolean insert = PenyimpananQueue();
                if(insert){
                    addQueue();
                }
                 insert = PenyimpananQueue();
                if(insert){
                    addQueue();
                }
                else{
                    System.out.println("Data penuh, silahkan hapus dan coba lagi");
                }
                break;
            case 2:
                HapusQueue();
                break;
            case 3:
                ListQueue();
                break;
            case 4:
               clean () ;
                break;
            case 5:
                DataQueue();
                break;
            case 6:
                exit();
                break;
        }
        menuProgram();
    }
    private static void menuProgram(){
        int loopX = 0;
        int choosenMenu = 0;
        while(loopX==0){
            System.out.println("Program Queue Java: ");
            System.out.println("1. Tambahkan Queue");
            System.out.println("2. hapus 1 data dari Queue");
            System.out.println("3. hapus 1 yang ada di dalam Queue");
            System.out.println("4. Format all");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Exit ");
            System.out.println("Pilih Menu (1-6)");
            Scanner menuOption = new Scanner(System.in);
            try{
                choosenMenu= menuOption.nextInt();
                loopX =1;
            }catch(InputMismatchException e){
                System.out.println("Input must be number!");
            }
        }
        System.out.println("");
        menuChooser(choosenMenu);
    }
    public static void main(String[]args){
        menuProgram();
    }

    private static void pollQueue() {
        throw new UnsupportedOperationException("Not supported yet."); 
  
}

    private static void alistQueue() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void insertQueue() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
