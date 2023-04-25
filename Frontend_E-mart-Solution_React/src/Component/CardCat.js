import { Container } from 'react-bootstrap';
import Button from 'react-bootstrap/Button';
import Card from 'react-bootstrap/Card';

function CardCat(props) {
  if (props.flag == true) {
    return (
      
      <Card className='Card' style={{ width: '18rem' ,marginLeft: '75px' }} >
        <div className='card-img'><Card.Img variant="top" style={{ objectFit: "contain" }} src={props.imgsrc} /></div>
        <Card.Body>
          <Card.Title className='Carttitle'>{props.catname}</Card.Title>
          <Card.Text>
            {props.catname}
            <br/> starting from ₹2,000
          </Card.Text>
          <Button className='Button' variant="info" href={"/subcategories/" + props.id}>Subcategories</Button>
        </Card.Body>
      </Card>
      


    );
  }

  else {
    return (
      <Card style={{ width: '18rem' }}>
        <Card.Img variant="top" style={{ objectFit: "contain" }} src={props.imgsrc} />
        <Card.Body>
          <Card.Title className='Carttitle'>{props.catname}</Card.Title>
          <Card.Text>   
            {props.catname} starting from ₹2,000
          </Card.Text>
          <option></option>
          <Button className='Button' variant="info" href={"/productsByCat/" + props.id}>Products</Button>
        </Card.Body>
      </Card>
    );
  }
}

export default CardCat;