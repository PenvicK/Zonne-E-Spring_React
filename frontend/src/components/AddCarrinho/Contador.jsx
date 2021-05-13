import React from  'react';
import {useState} from 'react';
import '../../pages/styles/shop.css'

function Contador(){
    const [contador,setContador] = useState(1);
    
    function adicionarContador(){
        setContador(contador + 1);
    }

    function diminuirContador(){
        if(contador > 1){
            setContador(contador - 1);
        }
    }

    return(
        <div >
            <div className="quantShop">
                <div>
                    <button className="menosShop"onClick={diminuirContador}>-</button>
                </div>
                <div className="numShop">
                    {contador}
                </div>
                <div >
                    <button className="maisShop"onClick={adicionarContador}>+</button>
                </div>
            </div>
        </div>
    );
}
export default Contador;