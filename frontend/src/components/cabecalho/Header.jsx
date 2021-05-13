import React from  'react';
import './menu.css';
import Menu from './Menu';
import logo from '../public/logo.png';
import MenuHbr from './MenuHbr';

function Header(){
    return(
        <div>
            <header id="header">
                <nav id="container">
                    <div id="logo">  
                        <img src={logo} alt="Logo" width="287,496" height="86,2488" />
                    </div>
                    <Menu />
                </nav>
            </header>
            <MenuHbr />
        </div>
    );
}

export default Header;