const categories = document.querySelector(".categories");
const mainCategory = document.querySelectorAll(".main-category");
const subCategory = document.querySelectorAll(".sub-category");
const addBtn = document.querySelector(".add-category");

const CLASSNAME_HIDDEN = "hidden";

mainCategory.forEach(category =>{
    btnview(category);
    mainBtn(category);
});

subCategory.forEach(category =>{
    btnview(category);
    subBtn(category);
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
    li.classList.add("bundle-group");
    li.innerHTML = 
    `<div class="category main-category">
        <input type="text">
        <div class="buttons">
        <button class="cancelBtn" type="button">취소</button>
        <button class="confirmBtn" type="button" disabled ="true">확인</button>
        </div>
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
        li.innerHTML = 
        `<div class="category main-category">
            <img class="list-img" src="../img/list.jpg">
            <img class="drag-img" src="../img/drag.jpg">
            <span>${text.value}</span>
            <div class="buttons hidden">
                <button class="addBtn" type="button">추가</button>
                <button class="updateBtn" type="button">수정</button>
                <button class="removeBtn" type="button">삭제</button>
            </div>
        </div>
        <ul class="sort">
        </ul>`;
        const category = li.querySelector(".category");
        btnview(category);
        mainBtn(category);
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

function mainBtn(category){
    const listImg = category.querySelector(".list-img");
    const addSubBtn = category.querySelector(".addBtn");
    const updateBtn = category.querySelector(".updateBtn");
    const removeBtn = category.querySelector(".removeBtn");
    const parent = category.parentNode;
    const subList = parent.querySelector("ul");

    listImg.addEventListener("click",function(){
        category.classList.toggle("sub-hidden");
        listImg.classList.toggle("rotateimg90");
        $(subList).slideToggle();
    });
    addSubBtn.addEventListener("click",function(event){
        const ul = event.target.parentNode.parentNode.parentNode.querySelector("ul");
        const li = document.createElement("li");
        li.classList.add("category");
        li.classList.add("sub-category");
        li.innerHTML = `
        <input type="text">
        <div class="buttons">
            <button class="cancelBtn" type="button">취소</button>
            <button class="confirmBtn" type="button" disabled ="true">확인</button>
        </div>
        `;
        ul.append(li);
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
            li.innerHTML = `
            <img class="drag-img" src="../img/drag.jpg">
            <span>${text.value}</span>
            <div class="buttons hidden">
                <button class="updateBtn" type="button">수정</button>
                <button class="removeBtn" type="button">삭제</button>
            </div>`;
            const category = li.querySelector(".category");
            btnview(category);
            subBtn(category);
        });
    });
    removeBtn.addEventListener("click",function(event){
        event.target.parentNode.parentNode.parentNode.remove();
    });
}

function subBtn(category){
    const updateBtn = category.querySelector(".updateBtn");
    const removeBtn = category.querySelector(".removeBtn");

    //updateBtn.addEventListener("",);
}