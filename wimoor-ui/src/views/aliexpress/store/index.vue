<template>
  <div class="main-sty">
    <el-row gutter="16">
      <el-col :span="6">
        <el-card shadow="never" >
          <el-scrollbar style="height: calc(100vh - 112px);">
            <div class="el-card-head">
              <div><h3>Aliexpress 店铺账号列表</h3>
                <p class="font-extraSmall">用于区分店铺的名称</p></div>
              <div>
                <div class="text-right" style="padding-right:20px">
                  <el-space>
                    <el-link type="danger"  title="新增" @click="addStorename" :underline="false">
                      <plus theme="outline" size="24" :strokeWidth="5"/>

                    </el-link>
                    <el-link type="info" title="排序" size="small" linked @click="dialogRank.visible=true" :underline="false">
                      <el-icon :size="20" color="#409EFC"><Sort /></el-icon>
                    </el-link>
                  </el-space>
                </div>
              </div>
            </div>
            <div class="el-card-body">
              <el-card shadow="hover" v-if="storeList.list.length>0" v-for="item in storeList.list">
                <div>
                  <h4>{{item.name}}</h4>
                  <p class="font-extraSmall">创建于：{{dateFormat(item.createtime)}}</p>
                </div>
                <el-space>
                  <el-link @click="updataStorename(item)" type="info" :underline="false">
                    <el-icon  class="font-medium"> <Edit /> </el-icon>
                  </el-link>
                  <el-link @click="delectStore(item)" type="info" :underline="false">
                    <el-icon  class="font-medium">
                      <Delete/>
                    </el-icon>
                  </el-link>
                </el-space>
              </el-card>
              <el-empty v-else description="请添加要授权的店铺!" />
            </div>
          </el-scrollbar>
        </el-card>
      </el-col>
      <el-col :span="18">
        <StoreTable :storelist="storeList" />
      </el-col>
    </el-row>
  </div>
  <el-dialog v-model="dialogVisible" :title=edittitle width="30%" @close="closedialog">
    <el-input v-model="storename" placeholder="请输入店铺在系统上的名称!" class="input-with-select" />
    <template #footer>
	         <span class="dialog-footer">
	             <el-button @click="dialogVisible = false">取消</el-button>
	             <el-button type="primary" @click="saveStore">确认</el-button>
	         </span>
    </template>
  </el-dialog>
  <el-dialog v-model="dialogRank.visible" title="显示次序设置" width="400px">
    <div class="rank-list-title">
      <span>店铺名称</span>
      <span>显示次序</span>
    </div>
    <draggable class="draggable" :list="state.list" animation="300" @start="dragStart" @end="dragEnd">
      <template #item="{ element }">
        <div class="item">
          <el-card shadow="hover">
            <el-space class="list-title">
              <drag class="ic-cen" theme="outline" size="16" fill="#9a9a9a" :strokeWidth="2" />
              <span>{{element.name}}</span>
            </el-space>
            <div class="font-extraSmall" style="float:right">{{element.findex}}</div>
          </el-card>
        </div>
      </template>
    </draggable>
    <template #footer>
      <el-button @click="dialogRank.visible=false">取消</el-button>
      <el-button type="primary" @click="submitFormIndex">确认</el-button>
    </template>
  </el-dialog>
</template>


<script setup>


import draggable from "vuedraggable";
import {Delete, Edit, Sort} from "@element-plus/icons-vue";
import StoreTable from "@/views/aliexpress/store/components/storeTable.vue";
import {Plus} from "@icon-park/vue-next";
import {reactive, ref} from "vue";
import {ElMessage, ElMessageBox} from "element-plus";
import storeApi from "@/api/aliexpress/storeApi";
import groupApi from "@/api/amazon/group/groupApi";

let state=reactive({list:[]});

let storename = ref();
let storeid=ref();
let edittitle=ref("添加店铺")
let dialogVisible =ref(false)
let dialogRank=reactive({visible:false});
let storeList =reactive({list:[]})

function addStorename(){
  dialogVisible.value =true
  storeid.value="";
  edittitle.value="添加店铺"
}
function updataStorename(item){
  dialogVisible.value =true
  storename.value = item.name
  storeid.value = item.id
  edittitle.value="编辑店铺"
}

function delectStore(item) {
  let id = item.id
  ElMessageBox.confirm(
      '你确定要删除该店铺吗?',
      {
        confirmButtonText: '确认',
        cancelButtonText: '取消',
        type: 'warning',
        callback: (action) => {
          if (action == "confirm") {
            storeApi.delectStore(id).then(() => {
              ElMessage({
                type: 'success',
                message: '删除成功',
              })
              loadStoreList();
            })
          }
        }
      }
  )
}
function loadStoreList(){
  storeApi.getStoreList().then((res)=>{
    storeList.list = res.data
    state.list=JSON.parse(JSON.stringify(res.data));
  })

}
function closedialog(){
  storename.value=""
}

function saveStore(){
  let params ={}
  params.id=storeid.value;
  params.name =storename.value;
  if(!params.name){
    ElMessage({
      type:'error',
      message:'店铺名称不能为空！'
    });
    return;
  }

  storeApi.saveStore(params).then((res)=>{
    if(res.code==201){
      ElMessage({
        type:'success',
        message:'提交成功！'
      })
      dialogVisible.value =false
      loadStoreList()
    }
  })
}

function submitFormIndex(){
  storeApi.updateStore(state.list).then(res=>{
    ElMessage.success('排序成功');
    state.dialogRank.visible=false
    loadStoreList();
  });
}
function dragEnd(){
  state.list.forEach((item,index)=>{
    item.findex = index+1
  })
}

</script>

<style>


</style>