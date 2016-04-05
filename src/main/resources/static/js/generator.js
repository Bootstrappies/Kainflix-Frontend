

 function generator(){

  var NounsNames = ["quack","girl","mouse","boy","banker","talker","cat","baby","giraffe","captain","king","queen","prince","bird","brat","backpacker","hunter","cabinet-maker","hoarder","seeker","fly","pensioner","emperor","thug","skater"];
  var Nouns2 = ["bonnet","cradle","gold","debt","ribbon","day","smog","jumper","paper","cup","pen","beard","train"];
  var Prepositions = ["onto","during","down","a","aboard","about","amid","at"]
  var Places = ["Paris","Toronto","Sweden","Australia","Africa","Town","the country-side","Britain","the city","the town"]
  var Places2 = ["the country-side","the city","the town","room","The farm"]
  var Adjectives = ["slimy","bumpy","red","stinky","sweet","sour","blue","yellow","green","sandy","sleek"]
  var personadj = ["fast","slow","young","silly","stupid","retired","eager","handsome","understandable","lanky","genius","normal","reluctant","naked","forever","shadow","witty","shady"]
  var Verb = ["being","having" , "doing" , "saying" , "seeing" , "making"]
                       var Verbing = ["being","having" , "doing" , "saying" , "getting" , "making" ,]


  var NounsNameslist = parseInt(Math.random() * NounsNames.length);
                       var Nouns2list = parseInt(Math.random() * Nouns2.length);
  var Prepositionslist = parseInt(Math.random() * Prepositions.length);
  var Adjectiveslist = parseInt(Math.random() * Adjectives.length);
  var Verblist = parseInt(Math.random() * Verb.length);
  var Verbinglist = parseInt(Math.random() * Verbing.length);
  var personadjlist = parseInt(Math.random() * personadj.length);
  var Placeslist = parseInt(Math.random() * Places.length);
  var Places2list = parseInt(Math.random() * Places2.length);


  var option1 = "The " + Adjectives[Adjectiveslist] + " " + Nouns2[Nouns2list];
  var option2 = "The " + personadj[personadjlist] + " " + NounsNames[NounsNameslist];
  var option3 = "The " + personadj[personadjlist] + " " + NounsNames[NounsNameslist] + " of " + Places[Placeslist];
  var option4 = Verbing[Verbinglist] + " it like a " + NounsNames[NounsNameslist];
  var option5 = Places2[Places2list] + " of " + Nouns2[Nouns2list]+ "s";






                       var final = [option1,option2,option3,option4,option5];

                       var finallist = parseInt(Math.random() * final.length);
                       var Title = final[finallist];




  return Title;
 }
