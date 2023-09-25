import React from 'react'
import './admin/Dashboard/Dashboard.css'
import {Link} from 'react-router-dom'

const Footer = () => {
      return( 
            <div className='footer'>
                  <Link className='f'>Terms and Policies</Link>
                  <Link className='f'>Privacy Policies</Link>
                  <Link className='f'>CopyRight by Vijayaprabha V</Link>
            </div>
      )
}

export default Footer
