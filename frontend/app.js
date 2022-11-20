import express from 'express';

const app = express();

app.set('view engine', 'hbs');
app.set('views', './view');
app.use(express.static('./public'));

app.use((req, res) => {
  const { path } = req;
  res.render('404', { path });
});

app.use((err, req, res, next) => {
  res.status(500);
  res.json({ 'message': 'ERROR' });
});

app.listen(80, err => {
  if(err) throw err;
  console.log("Frontend running on port 80");
});
