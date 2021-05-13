import React from 'react';
import './styles/shop.css';
import Contador from '../components/AddCarrinho/Contador';
import Fcompra from '../components/finalComp/Fcompra';
import { AiFillCamera as Camera } from "react-icons/ai";
// import DadosPessoais from'../components/exemplojson/DadosPessoais.json'

const valorProduto = 750;
const valorFrete = 150;
const quantidade = 0;

function Shop(){
    return(
        <section className="boxShop">
            <div className="sectioncameraShop">
                <Camera className="cameraShop"/>
                <Contador />
            </div>
            <div className="formShop">
                <div className="txtShop">
                    <div>
                        NOME:
                    </div>
                    <div>
                        CPF:{}
                    </div>
                    <div>
                        ESTADO:{}
                    </div>
                    <div>
                        CIDADE:{}
                    </div>
                    <div>
                        BAIRRO:{}
                    </div>
                    <div>
                        RUA, N°:{}
                    </div>
                </div>
                <div className="caixasShop">
                    <div className="altShop">
                        <button className="alterarShop"><strong>ALTERAR DADOS</strong></button>
                    </div>
                    <div className="cancel">
                        <button className="cancelarShop"><strong>CANCELAR PEDIDO</strong></button>
                    </div>
                </div>
            </div>
            <div className="form2Shop">
                <div className="txtShop">
                    <div>
                        VALOR DO PRODUTO: R${valorProduto},00
                    </div>
                    <div>
                        VALOR DO FRETE: R${valorFrete},00
                    </div>
                    <div>
                        VALOR TOTAL DO PRODUTO: R${valorProduto * quantidade},00
                    </div>
                    <div>
                        VALOR TOTAL: R${valorProduto + valorFrete}
                    </div>
                </div>
                <div className="finalShop">
                    <Fcompra />
                </div>
            </div>
        </section>
    );
}
export default Shop;