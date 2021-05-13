import React from 'react';
import './styles/produto.css';
import camera from '../components/public/camera.png';

function Produto(){
    return(
        <section id="produtoimagens">
            <div className="container2">
                <div className="imagens">
                    <div className="imagens-p">
                        <div className="imagem-p1">
                            <img src={camera}width="100px" />
                        </div>
                        <div className="imagem-p2">
                            <img src={camera}width="100px" />
                        </div>
                        <div className="imagem-p3">
                            <img src={camera}width="100px" />
                        </div>
                    </div>
                    <div className="imagem-g">
                        <img src={camera} width="250px" />
                    </div>
                </div>
                <div className="texto"> 
                    <h2 className="produto-zonne-e">Zonne-E</h2>
                    <div className="preco">
                        <h1>R$ XXXX,XXXXX</h1>
                    </div> 
                    <div className="container-cep">
                        <h3>CEP</h3>
                        <div className="container-cep-input">
                            <input type="text" name="cep" size="2" maxlength="5" /> - <input type="text" name="cep2" size="" maxlength="3" />
                        </div>
                        <spam className="adicionar-carrinho" type="submit">
                            <a href="">adicionar carrinho</a>
                        </spam>
                    </div>
                </div>
            </div>
        </section>
    );
}
export default Produto;