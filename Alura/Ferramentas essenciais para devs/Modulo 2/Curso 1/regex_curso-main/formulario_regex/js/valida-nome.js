export default function ehUmNome(campo) {
  const nome = campo.value;
  const patternNome = /^(?!(.)\1\1)[A-za-zÀ-ÿ -]{3,30}$/i.test(nome);
  console.log(patternNome);

  if (!patternNome) {
    campo.setCustomValidity("Não é um nome válido");
    console.log(`"${nome}" não é um nome válido`);
  }

  return nome;
}
