import request from "@/utils/request";

function getStoreList(){
    return request.get('/aliexpress/api/v1/store/list');
}

function delectStore(id){
    return request.delete('/aliexpress/api/v1/store/delete/'+id);
}

function saveStore(data){
    return request.put('/aliexpress/api/v1/store/save',data);
}

function updateStore(data){
    return request.post('/amazon/api/v1/amzgroup/update',data);
}

export default{
    delectStore,getStoreList,saveStore,updateStore,
}