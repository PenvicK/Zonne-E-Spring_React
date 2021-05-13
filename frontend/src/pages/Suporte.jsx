import React from 'react';
import'./styles/suporte.css';

function Suporte(){
    return(
        <section className="duvidas">
        <div className="container-suporte">    
            <div className="name">
                <input className="input-name" type="text" name="Nome" placeholder="Nome:" size="50" id="campo"/>
            </div>
            <div className="email">    
                <input className="input-email" type="text" name="E-mail" placeholder="E-mail:" size="50" id="campo"/>
            </div>
            <div className="tire">     
                <textarea className="text-duvida" name="story" rows="5" cols="50" size="60" placeholder="Tire Sua Duvida..."></textarea>
            </div>  
            <div className="container-btn">  
                <button>ENVIAR</button>   
                <h4 className="entre">Entraremos em Contato em 24 Hrs</h4>
            </div>    
        </div>        
            <div className="container-cont-sup">    
                <div className="contatos-sup">
                    <h3>CONTATOS</h3>
                    <h3>zonne-e@suporte.com</h3>
                    <h3>55+ (45)9xxxx-xxxx</h3>
                </div>         
                <div className="horarios">
                    <h3>HORÁRIOS DE ATENDIMENTO</h3>
                        <h3>Segunda á Sexta: 9H ás 18H</h3>
                        <h3>Sábado: 9H ás 14H</h3>
                </div>
            </div>    
     </section>
    );
}
export default Suporte;