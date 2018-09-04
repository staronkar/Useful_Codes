package SuperCodes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Future;

public class LargeExcel {

	public static final int BLOCKSIZE=20;
	static String FILENAME="C://Users//ASUS//Desktop//Automation Folder//Test Script//TestScript.xlsx" ;	

	public static void main(String[] args) throws Exception {
		ByteBuffer buffer=ByteBuffer.allocate(BLOCKSIZE);
		Path path =Paths.get(FILENAME);

		AsynchronousFileChannel asynChannel = AsynchronousFileChannel.open(path);
		int pos=0;
		do {
			Future<Integer> fileResult = asynChannel.read(buffer, pos);
			int blockRead = fileResult.get();
			if(blockRead <0) {
				break;
			}
			
			pos+= blockRead;
			buffer.flip();
			System.out.println(Charset.defaultCharset().decode(buffer));
			buffer.clear();

		}while(true);


	}

}
