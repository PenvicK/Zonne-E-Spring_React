import React from "react";

function Lista(props){
  return (
    <div>
      <ul class="Cabecalho">
        <a href="" className="linkFooter"><strong>{props.texto1}</strong></a>
        <a href="" className="linkFooter"><strong>{props.texto2}</strong></a>
        <a href="" className="linkFooter"><strong>{props.texto3}</strong></a>
        <a href="" className="linkFooter"><strong>{props.texto4}</strong></a>
        <a href="" className="linkFooter"><strong>{props.texto5}</strong></a>
        <a href="" className="linkFooter"><strong>{props.texto6}</strong></a>
      </ul>
    </div>
  );
};

export default Lista;