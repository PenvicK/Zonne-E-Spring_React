import React, { Component } from "react";
import Chart from "react-apexcharts";
import './char.css'


class MyChar extends Component {
    constructor(props) {
      super(props);
  
      this.state = {
        options: {
          chart: {
            id: "basic-bar"
          },
          xaxis: {
            categories: ['07:00', '08:00', '09:00', '10:00', '11:00', '12:00', '13:00', '14:00', '15:00', '16:00', '17:00', '18:00', '19:00']
          }
        },
        series: [
          {
            name: "series-1",
            data: [0.9, 0.91, 0.92, 0.89, 0.87, 0.9, 0.9, 0.91, 0.89, 0.87, 0.9, 0.9, 0.91]
          }
        ]
      };
    }
  
    render() {
      return (
        <div className="app">
          <div className="row">
            <div className="mixed-chart">
              <Chart
                options={this.state.options}
                series={this.state.series}
                type="bar"
                width="700"
                className="chart-bar"
              />
            </div>
          </div>
        </div>
      );
    }
  }
  
  export default MyChar;