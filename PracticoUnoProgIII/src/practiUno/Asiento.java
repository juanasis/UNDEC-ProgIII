package practiUno;

public class Asiento {
		
		private int idAsiento;
		private String numeroAsiento;
		private boolean estadoAsiento;
		public Asiento(int idAsiento, String numeroAsiento) {
			super();
			this.idAsiento = idAsiento;
			this.numeroAsiento = numeroAsiento;
			this.estadoAsiento = true;
		}
		public int getIdAsiento() {
			return idAsiento;
		}
		public void setIdAsiento(int idAsiento) {
			this.idAsiento = idAsiento;
		}
		public String getNumeroAsiento() {
			return numeroAsiento;
		}
		public void setNumeroAsiento(String numeroAsiento) {
			this.numeroAsiento = numeroAsiento;
		}
		@Override
		public String toString() {
			return "Asiento [idAsiento=" + idAsiento + ", numeroAsiento=" + numeroAsiento + "]";
		}
		public boolean isEstadoAsiento() {
			return estadoAsiento;
		}
		public void setEstadoAsiento(boolean estadoAsiento) {
			this.estadoAsiento = estadoAsiento;
		}
		
		
		
}
