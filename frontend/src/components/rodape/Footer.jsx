import React from  'react';
import Contatos from './Contatos';
import RedesSociais from './RedesSociais';
import './Footer.css';
import Lista from '../submit-button/Lista';

function Footer(){
    return(
        <footer className="caixa">
            <div className="feet">
                <div className="zonne">
                    <header className="Cabecalho">
                        <Lista texto1="HOME" />
                        <Lista texto2="PRODUTO" />
                        <Lista texto3="SUPORTE" />
                        <Lista texto4="FAQ" />
                        <Lista texto5="LOGIN" />
                        <Lista texto6="CARRINHO" />
                    </header>
                </div>
                <Contatos />
                <RedesSociais />
            </div>
            <div className="copy">
                <p id="copyRight">© Copyright 2020 Zonne-e. All rights reserved..</p>
            </div>
        </footer>
    );
}

export default Footer;
