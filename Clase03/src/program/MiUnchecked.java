package program;
import java.util.Date;

public class MiUnchecked extends RuntimeException{
	
	private Date hora;
	
	public MiUnchecked(String s) {
		super(s); //El mensaje va sobre el constructor
	}

}
