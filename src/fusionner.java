import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


public void fusionner (String f1, String f2)
throws IOException, EOFException{
    DataInputStream f = new DataInputStream(new FileInputStream(f1));
    DataInputStream g = new DataInputStream(new FileInputStream(f2));
    DataOutputStream h = new DataOutputStream(new FileOutputStream(nomFichier));
    int x;
    int y;
    try{
        x=f.readInt();
    }
    catch (EOFException e ){
        recopier(g,h);
        return;
    }
    try{
        y=g.readInt();}
        catch(EOFException e) {
            h.writeInt(x);
            recopier(f,h);
            return;
        }
        while(true)
        if (x<=y){
            h.writeInt(x);
            try{
                x=f.readInt();}
                catch(EOFException e){
                    h.writeInt(y);
                    recopier(g,h);
                    return;
                }
            }
            else{
                h.writeInt(y);
            try{
                y=g.readInt();
            }
            catch(EOFException e){
                h.writeInt(x);
                recopier(f,h);
                return;
            }}}}




        
    







