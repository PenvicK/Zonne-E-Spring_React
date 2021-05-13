import React from 'react';
import'./styles/faq.css';

function Faq(){
    return(
        <section className="frequentes">
            <div className="divs">
                <div className="quem">
                    <div className="um">
                        <h3> Quem somos ?</h3>
                    </div>
                        <div className="branco">
                            <p className="paragrafo-faq">Uma equipe de empreendedores do ramo de computação e 
                            software, empenhados em facilitar a vida de nossos clientes. </p>
                        </div>
                </div>
                <div className="comp">        
                    <div className="dois">    
                        <h3>O Zonne-E é compatível com meu 
                        sistema de Painéis Solares ?</h3>
                    </div>
                        <div className="branco">
                            <p className="paragrafo-faq">Sim, o Zonne-E é compatível com todas as versões 
                            de sistemas fotovoltaicos presentes no mercado.</p>
                        </div>
                </div>
                <div className="uti">          
                    <div className="tres">   
                        <h3>Já adquiriu o Zonne-E. Como faço para utiliza-lo ?</h3>
                    </div>    
                        <div className="branco">
                            <p className="paragrafo-faq">Após se cadastrar no site, basta acessar a aba 
                            de "Dispositivios Instalados" e clicar na opção de 
                            adicionar um dispositivo, em seguida podera ver 
                            todas as informções sobre sua geração de energia.</p>
                        </div>
                </div>
                <div className="geren">        
                    <div className="quatro">    
                        <h3>Posso gerenciar mais de um dispositivo utilizando 
                        a mesma conta ?</h3>
                    </div>
                        <div className="branco">    
                            <p className="paragrafo-faq">Sim, caso adquira mais de um produto, basta  
                            adicionar o novo dispositivo a sua lista de adquiridos 
                            e seleciona-lo na aba de "dispositivos instalados" 
                            para gerenciar suas informações. </p>
                        </div>
                </div>     
            </div>
        </section>
    )
}
export default Faq;