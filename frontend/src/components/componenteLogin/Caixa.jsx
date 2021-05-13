import React, { useState } from 'react';
import './caixa.css';

function Caixa(props){    
    return(
        <input onChange={props.change} className="credinput" type={props.funcao} placeholder={props.texto} value={props.valor}></input>
    );
}
export default Caixa;