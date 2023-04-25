import { useState, useEffect } from "react";
import CardCat from "./CardCat";
import Carousel from 'react-bootstrap/Carousel';
import { Container } from "react-bootstrap";
import Promotions from "./Promotions";



export default function Home() {



  const [Categories, setCategory] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/Categories")
      .then((res) => res.json())
      .then((result) => {
        setCategory(result);
      });
  }, []);


  return (
    <div className="hero">

      <Carousel slide={true} className="carousel">
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="images/bg11.jpg"
            alt="First slide"
           
          />
          <Carousel.Caption>
            <h3>GET START</h3>
            <p>YOUR FAVRIOT SHOPPING</p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="images/bg6.jpg"
            alt="Second slide"
          />

          <Carousel.Caption>
            <h3>FASHION COLLECTION</h3>
            <p>Men's - Women's - Kid's </p>
          </Carousel.Caption>
        </Carousel.Item>
        <Carousel.Item>
          <img
            className="d-block w-100"
            src="images/bg7.jpg"
            alt="Third slide"
          />

          <Carousel.Caption>
            <h3>EXPLORE YOUR</h3>
            <p>
              FAVRIOT FASHION - SPORT COLLECTION
            </p>
          </Carousel.Caption>
        </Carousel.Item>

      </Carousel>
      <Promotions/>
      
      <Container className="Homecard-cont" >
        <div className="Cardhead">
          <h1 >Shopping <span>Categories</span></h1>
          <h3>DEAL Home</h3>
        </div>
        <div className="container-fluid mb-5">
          <div className="row-4">
            <div className="col-12 m-5 mx-auto">

              <div className="row gt-4 Shocard">
                {Categories.map((val, ind) => {
                  return (

                    <CardCat
                      imgsrc={val.category_Img_Path}
                      catname={val.category_Name}
                      id={val.category_Id}
                     
                      subcategory={val.parentcategory_Id}
                      flag={val.flag}
                    />


                      

                  );
                })}
              </div>
            </div>
          </div>
        </div>
      </Container>

     
    </div>
     
  );
};