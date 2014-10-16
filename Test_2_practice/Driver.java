public class Driver {
    public static void main(String[] args){
	System.out.println();
	System.out.println("hello I am working");
	
	Shapes shap = new Shapes();
	System.out.println(shap);
	System.out.println(shap.line("*",9));

	System.out.println();
      	System.out.println(shap.box(4,5));
		
	System.out.println();
	System.out.println(shap.foo());

	System.out.println();
	System.out.println(shap.frame(0,0));
	System.out.println(shap.frame(1,16));

		


    }
}
