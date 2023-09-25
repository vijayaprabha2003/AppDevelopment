import React from 'react'
import { Link, useNavigate} from 'react-router-dom'
import './Home.css'
import home_back from "../../assets/home-back.jpg"
import { BsFacebook, BsInstagram, BsTwitter,BsWhatsapp } from "react-icons/bs";


const Home = () => {
  const navigate = useNavigate() ;
  const  handleApplication = () => {
    alert("Please Login")
    navigate("/")
  }

  return (
    <div>
      <div className="main-home">
        <div className="navbar">
          <label className='logo'>ONLINE INSURANCE PORTAL</label>
          <ul>
            <li>
              <Link className='nav-links'>HOME</Link>
              <Link className='nav-links' onClick={handleApplication} to="/">Apply</Link>
              <Link className='nav-links'>ABOUT US</Link>
              <Link className='nav-links' onClick={handleApplication} to="/">CONTACT US</Link>
              <div className="nav-btn">
                <Link className='nav-links-btn-login' to="/">LOGIN</Link>
                <Link className='nav-links-btn-register' to='/signup'>REGISTER</Link>
              </div>
            </li>
          </ul>
        </div>
        <div className="content-mainbar">
          <div className="content-welcome">
            <h1>Welcome to Online Insurance Portal!</h1>
            <span className="main-page-content">
            We are dedicated to making your insurance experience simple,
            convenient, and accessible. Our online insurance portal is designed
            with you in mind, putting the power of managing your insurance needs
            right at your fingertips.
          </span><br />
          <span>
          Welcome to a better way of managing your insurance!
        </span>
        <button className='btn-apply' onClick={handleApplication }>
          APPLY NOW
        </button>
          </div>
          <div className="content-image">
            <img src={home_back} alt='home'/>
          </div>
        </div>
        <div className="navbar-footer">
          <div className="footer-icon">
            <span><BsFacebook/></span>
            <span><BsInstagram/></span>
            <span><BsTwitter/></span>
            <span><BsWhatsapp/></span>
          </div>
          <h1>@CopyRight by OnlineInsurance</h1>
        </div>
      </div>
    </div>
  )
}

export default Home