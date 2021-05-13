import React from  'react';
import './Footer.css';
import email from '../public/email.png';
import telefone from '../public/telefone.png';


function Contatos(){
    return(
        
        <div className="contatos">
            <div className="contacto">
                <img className="icon" src={email} alt="email"/>
                <p className="textoFooter" id= "textoEmail">zonne-e@support.com</p>
            </div>
            <div className="contacto">
                <img className="icon" src={telefone} alt="telefone"/>
                <p className="textoFooter">+55 (45)4022-8922</p>
            </div>
            <div className="contacto">
                <img className="icon" src={telefone} alt="telefone"/>
                <p className="textoFooter">+55 (45)3028-3424</p>
            </div>
        </div>
    );
}
export default Contatos;