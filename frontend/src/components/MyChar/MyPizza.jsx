import React, { Component } from 'react';
import Chart from 'react-apexcharts'

class MyPizza extends Component {

  constructor(props) {
    super(props);

    this.state = {
      options: {},
      series: [27.2, 27.0, 26.7, 27.9, 26.3],
      labels: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai']
    }
  }

  render() {

    return (
      <div className="donut">
        <Chart options={this.state.options} series={this.state.series} type="pie" width="570" />
      </div>
    );
  }
}

export default MyPizza;