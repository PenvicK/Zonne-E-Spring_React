import React, {useState} from 'react';
import Avatar from '../components/avatar/Avatar';
import './styles/dadosP.css';
import Person from '../components/public/person3.jpg';
import { Link } from 'react-router-dom';
import MyChar from '../components/MyChar/MyChar';
import MyPizza from '../components/MyChar/MyPizza';

function DadosP(){
    const [browser, setBrowser] = useState(false)

    const showBrowser = () => setBrowser(!browser)
    
    var i = 1

    var produto = "Produto "+i

    const mudarBtn1 = () => i = 1
    const mudarBtn2 = () => i = 2

    return(
        <>
        <div className="box-dados">
            <div className="container-img-dados">
                <ul className="box-ul-dados">
                    <li>
                        <ul className={browser ?"ul-dados-on": "ul-dados-off"} onClick={showBrowser}>
                            <span className={browser ?"iten-produto-on":"iten-produto-off"}>
                                {produto}
                            </span>
                            <li className={browser ?"iten-1-on":"iten-1-off"}onClick={mudarBtn1}>Produto 1</li>
                            <li className={browser ?"iten-2-on":"iten-2-off"}onClick={mudarBtn2}>Produto 2</li>
                        </ul>
                    </li>
                    <Link to='/perfil'>
                        <li><Avatar url={Person} /></li>
                    </Link>
                </ul>
            </div>
            <div className="container-char">
                <MyChar />
                <MyPizza />
            </div>
        </div>
        
        </>
    );

}
export default DadosP;