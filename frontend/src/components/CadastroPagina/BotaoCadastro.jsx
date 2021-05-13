import React from 'react';
import './BotaoCadastro.css';
import {Link} from 'react-router-dom';

function BotaoCadastro(){
    function handleClick(evento){
     evento.preventDefault();
     console.log("Pagina cadastro em desenvolvimento...");   
    }
    return(
        <button className="cadastro" type="submit" onClick={handleClick}>
            <Link className="linkCadastro" to='/cadastro'>
                <a className="linkCadastro" href="">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                    <strong>CADASTRO</strong>                               
                </a>
            </Link>
        </button>
        
    );
} 
export default BotaoCadastro;