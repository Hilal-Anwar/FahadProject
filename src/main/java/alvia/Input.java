package alvia;



public class Input {
    void zoya() {
       System.out.println("My name is zoya");
       helal();
    }

    void helal() {
       System.out.println("My name is helal");
    }

    void anusha() {
       System.out.println("My name is Anusha");
    }

   public static void main(String[] args) {
      Input obj=new Input();
      obj.zoya();
      obj.anusha();
      obj.zoya();
      obj.zoya();
   }

}
