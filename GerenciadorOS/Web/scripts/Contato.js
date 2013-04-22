function validarCPF(cpf) {
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
function valida(contato) {
if (contato.nome.value=="") {
alert("Preencha o nome corretamente.");
contato.nome.focus();
return false;
}
var filtro_mail = /^.+@.+\..{2,3}$/
if (!filtro_mail.test(contato.email.value) || contato.email.value=="") {
alert("Preencha o e-mail corretamente.");
contato.email.focus();
return false;
}
if (contato.cpf.value=="") {
alert("Preencha o CPF corretamente.");
contato.cpf.focus();
return false;
}
if (validarCPF(contato.cpf.value)==false) {
alert("Preencha o CPF corretamente.");
contato.cpf.focus();
return false;
}
if (contato.dataNasc.value=="" || contato.dataNasc.value.length != 10) {
alert("Preencha a data de nascimento corretamente. (dd/mm/aaaa)");
contato.dataNasc.focus();
return false;
}
if (contato.assunto.value.length<10) {
alert("Preencha o assunto corretamente.");
contato.assunto.focus();
return false;
}
if (contato.textoArea.value.length<50) {
alert("Preencha a menssagem com pelo menos 50 caracteres.");
contato.textoArea.focus();
return false;
}
alert("Mensagem enviada com sucesso!");
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