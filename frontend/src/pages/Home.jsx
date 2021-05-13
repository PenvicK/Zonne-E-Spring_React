import React from  'react';
import './styles/estilohome.css';
import Banner from '../components/homepage/Banner';
import img1Home from '../components/public/img1home.png';
import img2Home from '../components/public/img2home.png';
import img3Home from '../components/public/img3home.png';
import img4Home from '../components/public/img4home.png';
import img5Home from '../components/public/img5home.png';
import Texto from '../components/homepage/text/Texto'

function Home(){
    return(
        <section className="geral">
            <Banner />
            <div className="caixaHome">
                <div className="info"> 
                    <div className="textoHome">
                        <h2>Zoone-E</h2> 
                        <Texto texto="Um site para facilitar o monitoramento de painéis solares, mostrando o quanto de energia foi gasta, o quanto foi armazenado e acompanhamento da energia, podendo ser utilizado no computador pelo site(link do site) ou aplicativo mobile" />
                    </div>
                    <div className="img1">
                        <img src={img1Home} alt="img1" width="140px" />
                    </div>
                </div>
                <div className="features">
                    <div id="txt">
                        <h2>Features</h2> 
                        <Texto texto="O Zoone-E permite que você acesse seus dados de energia diretamente de seu navegador  web.
                            Você pode ver quanta energia está consumindo e produzindo em tempo real, 
                            visualizar gráficos, seu histórico de consumo, verificar diferentes dispositivos que estão
                            conectados, e muito mais." />
                    </div>
                    <div className="img2">
                    <img src={img2Home} alt="img2" width="140px" />
                    </div>
                </div>
                <div className="beneficios">
                    <div className="textoHome">
                        <h2>Benefícios</h2>
                            <ul className="listaHome">
                                <li>Monitoramento de forma cômoda e rápida. </li>
                                <li>Fácil entendimento e acessibilidade.</li>
                                <li>Gerenciamento de gastos e produção.</li>
                                <li>Informações em qualquer hora e lugar.</li>
                                <li>Melhora na distribuição de energia.</li>
                            </ul> 
                    </div>
                    <div>
                        <img src={img3Home} alt="img3" width="140px" />
                    </div>
                    <div>
                        <img src={img4Home} alt="img4" width="140px" />
                    </div>
                    <div>
                        <img src={img5Home} alt="img5" width="140px" />
                    </div>
                </div>
            </div>  
        </section>     
        );
}
export default Home;