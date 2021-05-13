import React from'react';
import PropsTexto from './TextoProps/PropsTexto';
import './menu.css';
import { Link } from 'react-router-dom';

function Menu(){
    return(
        <div id="menu">
            <ul className="cabecalho">
                <Link to='/' className= "linkHeader">
                    <PropsTexto texto= "HOME" />
                </Link>
                <Link to='/produto' className= "linkHeader">
                    <PropsTexto texto= "PRODUTO" />
                </Link>
                <Link to='/suporte' className= "linkHeader">
                    <PropsTexto texto= "SUPORTE" />
                </Link>
                <Link to='/faq' className= "linkHeader">
                    <PropsTexto texto= "FAQ" />
                </Link>
                <Link to='/login' className= "linkHeader">
                    <PropsTexto texto= "LOGIN" />
                </Link>
                <Link to='/shop' className= "linkHeader">
                    <PropsTexto texto= "CARRINHO" />
                </Link>
            </ul>
        </div>
    );
}
export default Menu;