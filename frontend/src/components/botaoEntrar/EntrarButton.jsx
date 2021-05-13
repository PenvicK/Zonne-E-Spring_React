import React from 'react';
import { Link } from 'react-router-dom';
import './EntrarButton.css';


function EntrarButton(){
    function handleClick(acao){
     acao.preventDefault();
     alert('Login Efetuado com sucesso!!'); 
    }
    return(
        <button className="enviar" type="submit" onClick={handleClick}>
            <Link to='/dados' className="link-btn-entrar-login">
                <a className="linkEnviar" href="">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                    <strong>ENTRAR</strong>                               
                </a>
            </Link>
        </button>
    );
} 
export default EntrarButton;
