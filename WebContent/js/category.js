const categories = document.querySelector(".categories");
const category = document.querySelectorAll(".category");
const addBtn = document.querySelector(".add-category");

const CLASSNAME_HIDDEN = "hidden";

category.forEach(category =>{
    btnview(category);
});

addBtn.addEventListener("click",function(){
    createCategory();
})

$(".sort").sortable({
    cursor: "move",
    handle: "img"
});
$(".sort").disableSelection();

function createCategory(){
    const li = document.createElement("li");
    li.classList.add("main-category");
    li.innerHTML = 
    `<input type="text">
    <div class="buttons">
    <button class="cancelBtn" type="button">취소</button>
    <button class="confirmBtn" type="button" disabled ="true">확인</button>
    </div>`;
    categories.append(li);
    const cancelBtn = li.querySelector(".cancelBtn");
    const confirmBtn = li.querySelector(".confirmBtn");
    const text = li.querySelector("input");
    
    text.addEventListener("keyup",function(){
        if(text.value===""){
            confirmBtn.disabled="true";
        }else{
            confirmBtn.removeAttribute("disabled");
        }
    });
    cancelBtn.addEventListener("click",function(){
        li.remove();
    });
    confirmBtn.addEventListener("click",function(){
        li.classList.add("category");
        li.innerHTML = 
        `<img src="../img/drag.jpg">
        <span>${text.value}</span>
        <div class="buttons hidden">
            <button class="addBtn" type="button">추가</button>
            <button class="updateBtn" type="button">수정</button>
            <button class="removeBtn" type="button">삭제</button>
        </div>`;
        btnview(li);
    });
}
    
function btnview(category){
    const buttons = category.querySelector(".buttons");
    category.addEventListener("mouseover",function(){
        buttons.classList.remove(CLASSNAME_HIDDEN);
    });
    category.addEventListener("mouseout",function(){
        buttons.classList.add(CLASSNAME_HIDDEN);
    });
}