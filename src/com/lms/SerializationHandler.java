package com.lms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationHandler implements SerializationService{
    @Override
    public void serializeLibrary(Library library, String fileName) {
        try
        {
            FileOutputStream out=new FileOutputStream(fileName);
            ObjectOutputStream obj=new ObjectOutputStream(out);
            obj.writeObject(library);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public Library deserializeLibrary(String fileName) {
Library l=null;
try
{
    FileInputStream in=new FileInputStream(fileName);
    ObjectInputStream obj=new ObjectInputStream(in);
   l= (Library)obj.readObject();
}
catch (Exception e)
{
    e.printStackTrace();
}
return l;
    }
}
