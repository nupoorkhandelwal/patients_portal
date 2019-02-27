import React, { Component } from 'react';
import axios from 'axios';
import './App.css';

class App extends Component {

  constructor(props) {
    super(props);
    this.state = {
      error: null,
      isLoaded: false,
    patients: []
    };
  }

  componentDidMount() {
    axios.get("http://localhost:8585/patients_portal/patients")
        .then(response => response.data.getJSON())
        .then(
            (response) => {
              this.setState({
                isLoaded: true,
                patients: response.get("patients")

              });
            },
            // Note: it's important to handle errors here
            // instead of a catch() block so that we don't swallow
            // exceptions from actual bugs in components.
            (error) => {
              this.setState({
                isLoaded: true,
                error
              });
            }
        )


  }

  render() {
    const { error, isLoaded, patients } = this.state;
    if (error) {
      return <div>Error: {error.message}</div>;
    } else if (!isLoaded) {
      return <div>Loading...</div>;
    } else {
      return (
          <ul>
            {patients.map(patient => (
                <li key={patient.name}>
                  {patient.name}
                </li>
            ))}
          </ul>
      );
    }
  }
}

export default App;
