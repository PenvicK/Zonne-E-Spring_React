import React from 'react';
import './Footer.css';
import instagram from '../public/instagram.png';
import facebook from '../public/facebook.png';
import twitter from '../public/twitter.png';


function Redes_sociais(){
    return(
        
        <div className="redes">
            <div className="sociais">
                <img className="icon" src={instagram} alt="instagram" />
                <p className="textoFooter">@Zonne-e</p>
            </div>
            <div className="sociais">
                <img className="icon" src={facebook} alt="facebook"/>
                <p className="textoFooter">@Zonne-e</p>
            </div>
            <div className="sociais">
                <img className="icon" src={twitter} alt="twitter"/>
                <p className="textoFooter">@Zonne-e</p>
            </div>
        </div>
    );
}
export default Redes_sociais;