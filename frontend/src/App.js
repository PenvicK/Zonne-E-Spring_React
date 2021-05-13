import React from 'react';
import Header from './components/cabecalho/Header';
import Footer from './components/rodape/Footer';
import Home from './pages/Home';
import Login from './pages/Login';
import Shop from './pages/Shop';
import Cadastro from './pages/Cadastro';
import Produto from './pages/Produto';
import Perfil from './pages/Perfil';
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom';
import Suporte from './pages/Suporte';
import Faq from './pages/Faq';
import DadosP from './pages/DadosP';

function App() {
  return (
    <Router>
      <Header />
      <Switch>
        <Route path="/" exact component={Home} />
        <Route path="/produto" component={Produto} />
        <Route path="/login" component={Login} />
        <Route path="/cadastro" component={Cadastro} />
        <Route path="/suporte" component={Suporte} />
        <Route path="/faq" component={Faq} />
        <Route path="/shop" component={Shop} />
        <Route path="/perfil" component={Perfil} />
        <Route path="/dados" component={DadosP} />
      </Switch>
      <Footer />
    </Router>
  );
}

export default App;
