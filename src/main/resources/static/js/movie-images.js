$(function() {
  setTimeout(function() {
      $films = $('.owl-item div');
      var time = 1000;
      $films.each(function() {
          var $film = $(this);
          setTimeout(function() {
            $.getJSON('http://www.faroo.com/api?i=true&q=' + escape(/*$film.text()*/'avengers') + '&start=1&length=10&l=en&src=web&i=false&f=json&key=qp1XSHLT@1jP8WX-g@RlXaMhQvA_', function(data) {
              var imageUrl;
              console.log(data);
              data.results.forEach(function(result) {
                if(result.iurl) {
                  imageUrl = result.iurl;
                }
              });
              $film.css('backgroundImage', 'url(' + imageUrl + ')')
            });
          }, time);
          time += 1200;
      });
  }, 100);
});
