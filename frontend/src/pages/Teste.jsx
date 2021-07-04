import { Component } from "react";
import React from "react";
import api from "../api";

class Teste extends Component{
    state = {
        federatives: [],
        dealerships: []
    }

    async componentDidMount(){
        const responseFederativeUnit = await api.get('/federative-units');
        const responseDealership = await api.get('/dealerships');
        this.setState({federatives: responseFederativeUnit.data});
        this.setState({dealerships: responseDealership.data});
    }

    render(){
        const { federatives } = this.state;
        const { dealerships } = this.state;
        return(
            <div>
                <h1>
                    Estados:
                </h1>
                <p>
                    {console.log(federatives)}
                    {federatives.map(federative => (
                        <li key = {federative.idFederativeUnit}>
                            {federative.name}-{federative.prefix}
                        </li>
                    ))}
                </p>
                <h1>
                    Distribuidoras:
                </h1>
                <p>
                    {console.log(dealerships)}
                    {dealerships.map(dealership => (
                        <li key = {dealership.idDealership}>
                            {dealership.name} = {dealership.federativeUnitDTO.name}-{dealership.federativeUnitDTO.prefix}
                        </li>
                    ))}
                </p>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
                <br></br>
            </div>   
        );  
    };
}
export default Teste;