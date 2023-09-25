import Dashboard from './components/admin/Dashboard/Dashboard';
import Home from './components/Users/Home';
import { BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import Policies from './components/admin/Policies/Policies';
import Document from './components/admin/Documents/Document';
import Claims from './components/admin/Settings/Claims';
import Help from './components/admin/Help/Help';
import Customer from './components/admin/Customer/Customer';
import Login from './components/Login';
import Signup from './components/Signup';
import Terms from './components/Terms';
import Policy from './components/Policy';
import UserHelp from './components/Users/UserHelp';
import Application from './components/Users/Application';
import HomeLog from './components/Users/HomeLog';
import UserPolicy from './components/Users/UserPolicy';
import UserTerms from './components/Users/UserTerms';

function App() {

  return (
    <div className="App">
      <Router>
        <Routes>
          <Route path='/' element={<Login/>}></Route>
          <Route path='/signup' element={<Signup/>}></Route>
          <Route path='/adminPolicies' element={<Policies/>}></Route>
          <Route path='/adminDocument' element={<Document/>}></Route>
          <Route path='/adminClaims' element={<Claims/>}></Route>
          <Route path='/adminHelp' element={<Help/>}></Route>
          <Route path='/adminCustomer' element={<Customer/>}></Route>
          <Route path='/adminDashboard' element={<Dashboard/>}></Route>
          <Route path='/adminTerms' element={<Terms/>}></Route>
          <Route path='/UserTerms' element={<UserTerms/>}></Route>
          <Route path='/adminPolicy' element={<Policy/>}></Route>
          <Route path='/UserPolicy' element={<UserPolicy/>}></Route>
          <Route path='/Home' element={<Home/>}></Route>
          <Route path='/Homelog' element={<HomeLog/>}></Route>
          <Route path='/UserHelp' element={<UserHelp/>}></Route>
          <Route path='/application' element={<Application/>}></Route>


        </Routes>
      </Router>
    </div>
  );
}

export default App;
