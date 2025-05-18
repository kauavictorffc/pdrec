
class ViolaClassico extends ViolaoPrototype {
    public ViolaClassico() {
        descricao = "Violão Clássico";
        cordas = "6 cordas de nylon";
        tipoSom = "Macio e suave";
    }
}

class ViolaFolk extends ViolaoPrototype {
    public ViolaFolk() {
        descricao = "Violão Folk";
        cordas = "Cordas de aço";
        tipoSom = "Encorpado, ideal para pop e rock";
    }
}

class ViolaFlet extends ViolaoPrototype {
    public ViolaFlet() {
        descricao = "Violão Flet";
        cordas = "Cordas de nylon";
        tipoSom = "Suave, requer amplificação";
    }
}

class ViolaJumbo extends ViolaoPrototype {
    public ViolaJumbo() {
        descricao = "Violão Jumbo";
        cordas = "Cordas de aço";
        tipoSom = "Grave e encorpado";
    }
}

class Viola7Cordas extends ViolaoPrototype {
    public Viola7Cordas() {
        descricao = "Violão 7 Cordas";
        cordas = "7 cordas (1 grave adicional)";
        tipoSom = "Indicado para choro e samba";
    }
}

class Viola12Cordas extends ViolaoPrototype {
    public Viola12Cordas() {
        descricao = "Violão 12 Cordas";
        cordas = "12 cordas em pares";
        tipoSom = "Ressonância plena";
    }
}

class ViolaParlor extends ViolaoPrototype {
    public ViolaParlor(String tipo) {
        descricao = "Violão " + tipo;
        cordas = "6 cordas";
        tipoSom = "Som casual e confortável";
    }
}
