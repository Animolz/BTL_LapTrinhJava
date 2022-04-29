/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/javascript.js to edit this template
 */
$(document).ready(function (){
    $('#story-pic').change(function(){
        const file = this.files[0];
        console.log(file);
        if (file){
          let reader = new FileReader();
          reader.onload = function(event){
            console.log(event.target.result);
            $('#output').attr('src', event.target.result);
          };
          reader.readAsDataURL(file);
        }
      });
      
    $('#item-pic').change(function(){
      const file = this.files[0];
      console.log(file);
      if (file){
        let reader = new FileReader();
        reader.onload = function(event){
          console.log(event.target.result);
          $('#output1').attr('src', event.target.result);
        };
        reader.readAsDataURL(file);
      }
    });
    
    $('input[name="avatar"]').change(function(){
      const file = this.files[0];
      console.log(file);
      if (file){
        let reader = new FileReader();
        reader.onload = function(event){
          console.log(event.target.result);
          $('#output2').attr('src', event.target.result);
        };
        reader.readAsDataURL(file);
      }
    });
});
