package com.shailesh.general;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;

import org.openjdk.jol.info.ClassLayout;

@SuppressWarnings("unused")
public class ZipUtil {
	
	 public static String compress(String str) throws IOException {
	        if (str == null || str.length() == 0) {
	            return str;
	        }

	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	        GZIPOutputStream gzip = new GZIPOutputStream(out);
	        gzip.write(str.getBytes());
	        gzip.close();
	        return out.toString("ISO-8859-1");
	    }

	    public static void main(String[] args) throws IOException {
	        String string = "slkfklkfldkfl";
	        System.out.println("before  compress:" );
//	        printObjectSize(new Date());
	        printObjectSize(string);
	        String printable = ClassLayout.parseInstance(string).toPrintable();
	        System.out.println(printable);
	        String compress2 = ZipUtil.compress(string);
	        String printable2 = ClassLayout.parseInstance(compress2).toPrintable();
			System.out.println(printable2);
//			System.out.println(compress2);
			 printObjectSize(compress2);
	    }
	    
	    public static String compress2(String input) throws IOException {
			
	    	
	    	ByteArrayOutputStream stream = new ByteArrayOutputStream();
	    	Deflater compresser = new Deflater(Deflater.BEST_COMPRESSION, true);
	    	DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(stream, compresser);
	    	deflaterOutputStream.write(input.getBytes());
	    	deflaterOutputStream.close();
	    	byte[] output = stream.toByteArray();
	    	return new String(output);
		}
	    
	    
	    public static void printObjectSize(Object object) {
//	        System.err.println("Object type: " + object.getClass() +
//	          ", size: " + InstrumentationAgent.getObjectSize(object) + " bytes");
	    }

}
