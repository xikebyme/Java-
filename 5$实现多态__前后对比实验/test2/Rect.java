
public class Rect extends Shape{
	private String _text;
	public Rect(String text){
		_text = text;
	}
	public void draw(){
		System.out.println("Rect:"+_text);
	}
}
