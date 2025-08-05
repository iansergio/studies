// [CRUD]
const toDoList = {
    usuarios: [
        {
            username: 'ianhelf',
        }
    ],
    posts: [
        {
            id: 1,
            owner: 'ianhelf',
            content: 'Conteúdo do post'
        }
    ]
}

// CREATE
function createPost ({owner, content}) {
    toDoList.posts.push({
        id: toDoList.posts.length + 1,
        owner,
        content
    })
}
createPost({owner: 'ianhelf', content: 'Novo post!'})
createPost({owner: 'helfzinho123', content: 'meu deus sou mt bom em jogos!'})

// READ
function pickPost (){
    return toDoList.posts
}
//console.log(pickPost())
// UPDATE
function updatePostContent (id, newContent) {
    const updatedPost = pickPost().find((posts) => {
        return posts.id === id
    })
    //console.log(updatedPost)
    updatedPost.content = newContent
}
updatePostContent(1, 'POST ATUALIZADO!')

// DELETE
function deletePost(id){
    const updatedPostList = pickPost().filter((thisPost) => {
        return thisPost.id !== id
    })
    toDoList.posts = updatedPostList
}
deletePost(2)
deletePost(1)
console.log(pickPost())