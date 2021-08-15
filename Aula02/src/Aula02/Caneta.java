package Aula02;
public class Caneta {
	     private String modelo;
	     private String cor;
	     private float ponta;
	     private int carga;
	     private boolean tampada;
	     //teste
  
	     public Caneta(String modelo, String cor, float ponta) {
			super();
			this.modelo = modelo;
			this.cor = cor;
			this.ponta = ponta;
		}

		public void status() {
	    	 System.out.println("SOBRE A CANETA:");
	    	 System.out.println("Modelo: " + this.getModelo());
	    	 System.out.println("Cor: " + this.cor);
	    	 System.out.println("Ponta: " + this.getPonta());
	    	 //System.out.println("Carga: " + this.carga);
	    	 System.out.println("Tampada: " + this.tampada);
	    	 System.out.println("\n");
	    	 
	     }
	     
	     public void rabiscar(){
	         if(this.tampada == true) {
	        	 System.out.println("ERRO! Não posso rabiscar, está tampada.");
	         }
	         else {
	        	 System.out.println("Estou Rabiscando.");
	         }
	     }
	     
	     
	     public void tampar(){
	         this.tampada = true;
	     }
	     
	     public void destampar(){
	         this.tampada = false;
	     }
	    
		public String getModelo() {
			return this.modelo;
		}

		public void setModelo(String m) {
			this.modelo = m;
		}

		public float getPonta() {
			return this.ponta;
		}
		
		public void setPonta(float p) {
			this.ponta = p;
		}

		public int getCarga() {
			return carga;
		}

		public void setCarga(int carga) {
			this.carga = carga;
		}
	    
	}
