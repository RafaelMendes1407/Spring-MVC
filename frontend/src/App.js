import React, { useState, useEffect } from 'react';
import './App.css';

import api from './services/api';

function App() {

  const [listametas, setList] = useState([]);
  const [priority, setPriority] = useState("");
  const [description, setDescription] = useState("");
  const [situation, setSituation] = useState("");

  useEffect(() => {
    getList();
  }, [])

  function getList() {
    api.get("getmetas")
      .then(res => setList(res.data));
  }

  let data = {
    priority: priority,
    description: description,
    situation: situation,
  }

  function newMeta() {
    api.post("/", { ... data})
      .then(res => getList())
  }

  return (
    <div className="App">
      <h1>Metas de Vida</h1>
      <div className="form">
        <label htmlFor="input">Meta:</label><input type="text" onChange={e => setDescription(e.target.value)} /><br />
        <label htmlFor="input">Prioridade:</label><input type="text" onChange={e => setPriority(e.target.value)}/><br />
        <label htmlFor="input">Situação:</label><input type="text" onChange={e => setSituation(e.target.value)}/><br />
        <button onClick={ () => newMeta() }>Adionar nova Meta</button>
      </div>
      <div className="list">
        {<table>
          <thead>
            <tr>
              <th>Descrição</th>
              <th>Prioridade</th>
              <th>Situação</th>
            </tr>
          </thead>
          <tbody>
            {listametas.map(data => (
              <tr key={data.description}>
                <td>{data.description}</td>
                <td>{data.priority}</td>
                <td>{data.situation ? "Alcançado" : "A Fazer"}</td>
              </tr>))}
          </tbody>
        </table>}
      </div>
    </div>
  );
}

export default App;
