function validarCPF(cpf){
cpf = cpf.replace(/[^\d]+/g,'');
if(cpf == '') return false;
// Elimina CPFs invalidos conhecidos
if (cpf.length != 11 ||
cpf == "00000000000" ||
cpf == "11111111111" ||
cpf == "22222222222" ||
cpf == "33333333333" ||
cpf == "44444444444" ||
cpf == "55555555555" ||
cpf == "66666666666" ||              
cpf == "77777777777" ||
cpf == "88888888888" ||
cpf == "99999999999")
return false;
// Valida 1o digito
add = 0;
for (i=0; i < 9; i ++)
add += parseInt(cpf.charAt(i)) * (10 - i);
rev = 11 - (add % 11);
if (rev == 10 || rev == 11)
rev = 0;
if (rev != parseInt(cpf.charAt(9)))
return false;
// Valida 2o digito
add = 0;
for (i = 0; i < 10; i ++)
add += parseInt(cpf.charAt(i)) * (11 - i);
rev = 11 - (add % 11);
if (rev == 10 || rev == 11)
rev = 0;
if (rev != parseInt(cpf.charAt(10)))
return false;
return true;
}
function valida(contato){
if(!confereNomeDois()){
alert("Caracteres invalidos.");
contato.nome.focus();
return false;
}
if (contato.nome.value==""){
alert("Preencha o nome corretamente.");
contato.nome.focus();
return false;
}
confereNome();
var filtro_mail = /^.+@.+\..{2,3}$/
if (!testeEmail()) {
alert("Preencha o e-mail corretamente.");
contato.email.focus();
return false;
}
if (!filtro_mail.test(contato.email.value) || contato.email.value=="") {
alert("Preencha o e-mail corretamente.");
contato.email.focus();
return false;
}
if (contato.cpf.value==""){
alert("Preencha o CPF corretamente.");
contato.cpf.focus();
return false;
}
if (validarCPF(contato.cpf.value)==false){
alert("Preencha o CPF corretamente.");
contato.cpf.focus();
return false;
}
if (contato.dataNasc.value=="" || contato.dataNasc.value.length != 10) {
alert("Preencha a data de nascimento corretamente. (dd/mm/aaaa)");
contato.dataNasc.focus();
return false;
}
if(!confereDataTres()){
alert("Preencha a data desdadsassda nascFodeoamente. (dd/mm/aaaa)");
contato.dataNasc.focus();
return false;
}
confereDataDois();
if (contato.assunto.value.length<10){
alert("Preencha o assunto corretamente.");
contato.assunto.focus();
return false;
}
if (contato.textoArea.value.length<50){
alert("Preencha a menssagem com pelo menos 50 caracteres.");
contato.textoArea.focus();
return false;
}
alert("Mensagem enviada com sucesso!");
limpa();
}
function confa(){
var r=confirm("Limpar campos?");
if (r==true)
{
document.getElementById('nomez').value = "";
document.getElementById('emailz').value = "";
document.getElementById('cpfz').value = "";
document.getElementById('nascz').value = "";
document.getElementById('assuntoz').value = "";
document.getElementById('msgz').value = "";
}
}
function limpa(){
document.getElementById('nomez').value = "";
document.getElementById('emailz').value = "";
document.getElementById('cpfz').value = "";
document.getElementById('nascz').value = "";
document.getElementById('assuntoz').value = "";
document.getElementById('msgz').value = "";
}
function testeEmail() {
var exemplo = RegExp(/^([0-9a-z]+([_.-]?[0-9a-z]+){2,}@[0-9a-z]+[0-9,a-z,.,-]*(.){1}[a-z]{2,4})+$/);
var email = document.getElementById("emailz").value;
if (!exemplo.test(email)) {
return false;
}
return true;
}
function confereNome(){
var frase = new Array;
var nome = document.getElementById("nomez").value;
var corrigido = "";
frase = nome.split(" ");
for (var i=0;i<frase.length;i++){
var posicao = frase[i].substring(0,1).toUpperCase();
corrigido += posicao + frase[i].substring(1,frase[i].length)+" ";
}
document.getElementById("nomez").value = corrigido;
}
function confereNomeDois(){
var nomes = document.getElementById("nomez").value;
var exemplo = new RegExp(/^([A-Z,a-z, ,À-ú]){0,50}$/);
if (!exemplo.test(nomes)) {
return false;
}else {
return true;
}    
}
function confereDataDois(){
var erro=0;
hoje = new Date();
anoAtual = hoje.getFullYear();
barras = contato.dataNasc.value.split("/");
if (barras.length == 3){
dia = barras[0];
mes = barras[1];
ano = barras[2];
resultado = (!isNaN(dia) && (dia > 0) && (dia < 32)) && (!isNaN(mes) && (mes > 0) && (mes < 13)) && (!isNaN(ano) && (ano.length == 4) && (ano <= anoAtual && ano >= 1900));
if (!resultado) {
alert("Formato de data invalido!");
contato.dataNasc.focus();
return false;
}
} else {
alert("Formato de data invalido!");
contato.dataNasc.focus();
return false;
}
}
function confereDataTres(){
var flag = false;
var vetoTeste = new Array;
var exemplo = new RegExp("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}");
var dataN = document.getElementById("nascz").value;
vetoTeste = dataN.split("/");
if (dataN.search(exemplo) == -1) {
flag = true;
} else if (((vetoTeste[1] == 4) || (vetoTeste[1] == 6) || (vetoTeste[1] == 9) || (vetoTeste[1] == 11))&& (vetoTeste[0] > 30))
flag = true;
else if (vetoTeste[1] == 2) {
if ((vetoTeste[0] > 28) && ((vetoTeste[2] % 4) != 0))
flag = true;
if ((vetoTeste[0] > 29) && ((vetoTeste[2] % 4) == 0))
flag = true;
}
if (flag) {
return false;        
}
return true;
}