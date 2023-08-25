import User from "./User.js";

export default class Docente extends User {
  constructor(nome, email, nascimento, role = "admin", ativo = true) {
    super(nome, email, nascimento, role);
  }

  aprovaEstudante(estudante,curso){
    return `Estudante ${estudante} passou no curso de ${curso}`;
  }
}

