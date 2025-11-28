
public class Produtos {

		String cor;
		float preco;
		
		public Produtos(String c, float p){
			this.cor = c;
			this.preco = p;
		}
		
		public String getCor(){
			return cor;
		}
		
		public float getPreco(){
			return preco;
		}
		
		public void setCor(String color){
			this.cor = color;
		}
		
		public void setPreco(float price){
			this.preco = price;
		}
}
