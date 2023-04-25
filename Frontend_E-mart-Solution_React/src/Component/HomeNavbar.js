import 'bootstrap/dist/css/bootstrap.min.css';
import { useState } from 'react';
import Nav from 'react-bootstrap/Nav';
import Button from 'react-bootstrap/Button';

function HomeNavbar() {
  const [searchTerm, setSearchTerm] = useState('');
 
  return (
    <div>
      <nav
        id='header'
        className='navbar navbar-expand-lg bg-body-tertiary navbar-light bg-info py-3 shadow-sm '
      >
        <div className='container'>
          <Nav.Link
            href={'/'}
            className='navbar-brand fw-bold fs-4'
            to='/'
          >
            ShopaHolic
          </Nav.Link>
          <Button
            className='navbar-toggler'
            type='button'
            data-bs-toggle='collapse'
            data-bs-target='/navbarSupportedContent'
            aria-controls='navbarSupportedContent'
            aria-expanded='false'
            aria-label='Toggle navigation'
          >
            <span className='navbar-toggler-icon'></span>
          </Button>
          <div className='collapse navbar-collapse' id='navbarSupportedContent'>
            <ul className='navbar-nav mx-auto mb-2 mb-lg-0'>
              <li className='nav-item'>
                <Nav.Link
                  className='nav-link active'
                  aria-current='page'
                  href='/'
                >
                  Home
                </Nav.Link>
              </li>
              <li className='nav-item'>
                <Nav.Link className='nav-link' href='/about'>
                  About
                </Nav.Link>
              </li>
              <li className='nav-item'>
                <Nav.Link className='nav-link' href='/contactus'>
                  Contact us
                </Nav.Link>
              </li>
            </ul>
            <div className='d-flex'>
              <input
                className='form-control me-2'
                type='search'
                placeholder='Search'
                aria-label='Search'
                value={searchTerm}
                onChange={(e) => setSearchTerm(e.target.value)}
              />
              <a className='btn btn-outline-success me-2' href={"/search/"+searchTerm}
>
  Search
</a>
            </div>
            <div className='buttons'>
              <a href='/cart' className='btn btn-outline-dark'>
                <i className='fa fa-shopping-cart me-1'></i> Cart
              </a>
              <a href='/login' className='btn btn-outline-dark ms-2'>
                <i className='fa fa-sign-in me-1'></i> Login
              </a>
              <a href='/register' className='btn btn-outline-dark ms-2'>
                <i className='fa fa-user-plus me-1'></i> Register
              </a>
            </div>
          </div>
        </div>
      </nav>
    </div>
  );
}

export default HomeNavbar;
