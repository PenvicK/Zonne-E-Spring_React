import React from 'react';
import '../menu.css';

function PropsTexto(props){
    return(
        <li>
            <a href="" className= "linkHeader">
                <span></span>
                <strong>{props.texto}</strong>
            </a>
        </li>
    );
}
export default PropsTexto;