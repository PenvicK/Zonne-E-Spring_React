import React, {useState} from "react";
import "./anuncio.css";
import { imagemanuncio } from "./image";


class Anuncio extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      showDiv: true,
    };
  }
  hideButtonDiv = () => {
    this.setState({ showDiv: !this.state.showDiv });
  };

  render() {
    return (
      <div className="container-allAnuncio">
        <div className="containerAnuncio">
            <a  id='anun'className={this.state.showDiv ? "anunOn":"anunOff"} onClick={this.state.showDiv === true && this.hideButtonDiv || this.state.showDiv === false && this.hideButtonDiv}>{this.state.showDiv ? '<':'>'}</a>
            <div className={this.state.showDiv ? 'imagenAnunOn':'imagenAnunOff'}>
              <img src={imagemanuncio} />
            </div>            
        </div>
      </div>
    );
  }
}

export default Anuncio;
