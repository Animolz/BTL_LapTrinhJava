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
    
    var tabLinks = document.querySelectorAll(".tab");
    var tabContent = document.querySelectorAll(".tab-item");

    tabLinks.forEach(function(el) {
       el.addEventListener("click", openTabs);
    });


    function openTabs(el) {
       var btn = el.currentTarget; // lắng nghe sự kiện và hiển thị các element
       var post = btn.dataset.post; // lấy giá trị trong data-electronic

       tabContent.forEach(function(el) {
          el.classList.remove("active");
       }); //lặp qua các tab content để remove class active

       tabLinks.forEach(function(el) {
          el.classList.remove("active");
       }); //lặp qua các tab links để remove class active

       document.querySelector("#" + post).classList.add("active");
       // trả về phần tử đầu tiên có id="" được add class active

       btn.classList.add("active");
       // các button mà chúng ta click vào sẽ được add class active
    }
    
    $('#table-users').DataTable();
});
