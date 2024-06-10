package ejercicioDiscos;

public class AppDisco {
  public static void main(String[] args) {
    final int N = 100;

    Disco[] disco = new Disco[N];

    for (int i = 0; i < N; i++) {
      disco[i] = new Disco();
    }

    disco[0] = new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
    disco[1] = new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46);
    disco[2] = new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

    
  }
}
