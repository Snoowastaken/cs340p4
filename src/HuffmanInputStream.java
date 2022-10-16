import java.io.*;
public class HuffmanInputStream {
    private String tree;
    private int totalChars;
    private DataInputStream d;


    public HuffmanInputStream(String filename){
        try{
            d = new DataInputStream(new FileInputStream(filename));
            tree = d.readUTF();
            totalChars = d.readInt();
        } catch(IOException e){
        }
    }

    public int readBit(){
        //returns the next bit is the file
        //the value returned will be either a 0 or a 1
        //you will need to read each byte from the file (use readUnsignedByte)
        //after 8 calls to readBit you will need to read another byte
        try{

        }catch (IOException e){

        }
        return bit;

    }

    public String getTree(){
        return tree;
    }

    public int getTotalChars(){
        //return the character count read from the file
        return totalChars;
    }

    public void close() throws IOException {
        //close the DataInputStream
        d.close();
    }

}
