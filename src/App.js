import { Route, Switch } from 'react-router-dom'
import CitiesList from "./components/CitiesList"
import CountryList from './components/CountryList';
import Layout from './components/Layout';


function App() {
  return (
      <Layout>
      <Switch>
        <Route path="/countries" exact><CountryList/></Route>
        <Route exact path="/cities/:countryCode" component={CitiesList} />
        <Route path="/favorites" exact></Route>
      </Switch>
      </Layout>

  );
}

export default App;
