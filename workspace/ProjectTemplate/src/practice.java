import components.queue.*;
import components.queue.Queue1L;
import components.set.*;
import components.stack.*;
import components.sequence.*;
public class practice {

	public static void multiFlip(Sequence<Integer> s) {
		if(s.length()>=2){
			s.flip();
			Sequence<Integer> substr = new Sequence1L<>();
			s.extract(1, s.length()-1, substr);
			multiFlip(substr);
			s.insert(1, substr);
		}
			
		
	}
	public static void main(String[] args) {
		Sequence<Integer> num = new Sequence1L<>();
		num.add(0, 6);
		num.add(0, 5);
		num.add(0, 4);
		num.add(0, 3);
		num.add(0, 2);
		num.add(0, 1);
		multiFlip(num);
		while(num.length()>0) {
			System.out.println(num.remove(0));
		}
	}

}
