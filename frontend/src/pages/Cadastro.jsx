import React, { useState } from 'react';
import'./styles/cadastro.css';
import '../components/componenteLogin/Caixa';
import Caixa from '../components/componenteLogin/Caixa';
import Checkbox from'../components/checkbox/Checkbox';
// import listPessoas from '../components/exemplojson/login.json';
import axios from 'axios';
import api from "../api";
// import { response } from 'express';


function Cadastro(){
    const [nome, setNome] = useState("");
    const [cpf, setCpf] = useState("");
    const [telefone, setTelefone] = useState("");
    const [dia, setDia] = useState("");
    const [mes, setMes] = useState("");
    const [ano, setAno] = useState("");
    const [email, setEmail] = useState("");
    const [confirmEmail, setConfirmEmail] = useState("");
    const [senha, setSenha] = useState("");
    const [confirmSenha, setConfirmSenha] = useState("");
    const [cep, setCep] = useState("");
    const [estado, setEstado] = useState("");
    const [cidade, setCidade] = useState("");
    const [rua, setRua] = useState("");
    const [numero, setNumero] = useState("");
    const [complemento, setComplemento] = useState("");
    // const [pessoas, setPessoas] = useState(listPessoas);

    const handleSubmit = (e) =>{
        e.preventDefault();
        const postFederativeUnit = {
            name: estado,
            prefix: cidade,
        }
        api.post('/federative-units', postFederativeUnit).then((resp) => {
            console.log(resp);
        });

    }
    const handleChangeNome = (e) =>{
        setNome(e.target.value)
        e.preventDefault();
    }
    const handleChangeCpf = (e) =>{
        setCpf(e.target.value)
        e.preventDefault();
    }
    const handleChangeTelefone = (e) =>{
        setTelefone(e.target.value)
        e.preventDefault();
    }
    const handleChangeDia = (e) =>{
        setDia(e.target.value)
        e.preventDefault();
    }
    const handleChangeMes = (e) =>{
        setMes(e.target.value)
        e.preventDefault();
    }
    const handleChangeAno = (e) =>{
        setAno(e.target.value)
        e.preventDefault();
    }
    const handleChangeEmail = (e) =>{
        setEmail(e.target.value)
        e.preventDefault();
    }
    const handleChangeConfirmEmail = (e) =>{
        setConfirmEmail(e.target.value)
        e.preventDefault();
    }
    const handleChangeSenha = (e) =>{
        setSenha(e.target.value)
        e.preventDefault();
    }
    const handleChangeConfirmSenha = (e) =>{
        setConfirmSenha(e.target.value)
        e.preventDefault();
    }
    const handleChangeCep = (e) =>{
        setCep(e.target.value)
        e.preventDefault();
    }
    const handleChangeEstado = (e) =>{
        setEstado(e.target.value)
        e.preventDefault();
    }
    const handleChangeCidade = (e) =>{
        setCidade(e.target.value)
        e.preventDefault();
    }
    const handleChangeRua = (e) =>{
        setRua(e.target.value)
        e.preventDefault();
    }
    const handleChangeNumero = (e) =>{
        setNumero(e.target.value)
        e.preventDefault();
    }
    const handleChangeComplemento = (e) =>{
        setComplemento(e.target.value)
        e.preventDefault();
    }
    return(
        <section className="formulario">
            <div className="titulo">
                Cadastro
            </div>
            <form onSubmit={handleSubmit}  className="cadastroPage">
                <Caixa change={handleChangeNome} valor={nome} funcao="text" texto="Nome Completo:" size="40" id="campo" /> 
                <Caixa change={handleChangeCpf} valor={cpf} funcao="text" texto="CPF:" size="12" maxlength="11" /> 
                <Caixa change={handleChangeTelefone} valor={telefone} funcao="text" texto="Telefone" size="12" maxlength="14" /> 
                <div className="nascimento">
                    <Caixa change={handleChangeDia} valor={dia} funcao="text" texto="Dia" size="1" maxlength="2" />
                    <Caixa change={handleChangeMes} valor={mes} funcao="text" texto="Mês" size="1" maxlength="2" />
                    <Caixa change={handleChangeAno} valor={ano} funcao="text" texto="Ano" size="1" maxlength="4" /> 
                </div>
                <Caixa change={handleChangeEmail} valor={email} funcao="text" texto="E-Mail" size="40" /> 
                <Caixa change={handleChangeConfirmEmail} valor={confirmEmail} funcao="text" texto="Confirmar E-Mail" size="40" />   
                <Caixa change={handleChangeSenha} valor={senha} funcao="password" texto="Senha" size="12" maxlength="15" /> 
                <Caixa change={handleChangeConfirmSenha} valor={confirmSenha} funcao="password" texto="Confirmar Senha" size="12" maxlength="15" /> 
                <Caixa change={handleChangeCep} valor={cep} funcao="text" texto="CEP:" size="2" maxlength="8" />
                <Caixa change={handleChangeEstado} valor={estado} funcao="text" texto="Estado" size="12" maxlength="40" /> 
                <Caixa change={handleChangeCidade} valor={cidade} funcao="text" texto="UF" size="12" maxlength="40" /> 
                <Caixa change={handleChangeRua} valor={rua} funcao="text" texto="Rua" size="12" maxlength="30" /> 
                <Caixa change={handleChangeNumero} valor={numero} funcao="text" texto="Numero" size="12" maxlength="10" />
                <Caixa change={handleChangeComplemento} valor={complemento} funcao="text" texto="Complemento" size="12" maxlength="40" /> 

                <div className="boxCadastro">
                    <div className="checkCadastro">
                     <Checkbox className="Check"/>
                    </div>
                    <p> Aceita os termos do contrato, ler contrato</p>
                </div>
                <div > 

                        <input className="BotaoCriar" type="submit" value="Criar conta"/>
                </div>
            </form>
        </section>      
    );
    
}
export default Cadastro; 