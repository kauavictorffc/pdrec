import java.util.HashMap;

public class ViolaoFactory {
    private static HashMap<String, Violao> prototipos = new HashMap<>();

    static {
        prototipos.put("classico", new ViolaClassico());
        prototipos.put("folk", new ViolaFolk());
        prototipos.put("flet", new ViolaFlet());
        prototipos.put("jumbo", new ViolaJumbo());
        prototipos.put("7cordas", new Viola7Cordas());
        prototipos.put("12cordas", new Viola12Cordas());
        prototipos.put("zero", new ViolaParlor("Zero"));
        prototipos.put("00", new ViolaParlor("Duplo Zero"));
        prototipos.put("000", new ViolaParlor("Triplo Zero"));
    }

    public static Violao getViolao(String tipo) {
        Violao prototipo = prototipos.get(tipo.toLowerCase());
        return prototipo != null ? prototipo.clone() : null;
    }
}
