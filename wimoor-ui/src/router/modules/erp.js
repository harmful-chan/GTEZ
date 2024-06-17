/** When your routing erp is too long, you can split it into small modules **/
export default [{
	path: 'shipment_handing/shipstep',
	name: 'shipstep',
	meta: {
		keepAlive: true
	},
	component: () => import("@/views/erp/ship/shipment_handing/shipstep/index"),
},
	{
		path: 'shipment_handing/pehuo',
		name: 'pehuo',
		component: () => import("@/views/erp/ship/orderblank/index.vue"),
	},
	{
		path: "e/s/p",
		name: 'plan_submit',
		component: () => import("@/views/erp/ship/ship_plan/plan_submit/index")
	},
	{
		path: "e/p/p/s",
		name: 'purchase_plan_submit',
		component:()=>import("@/views/erp/purchase/plan_amz/plan_submit/index")
	},
	{
		path: "e/s/p/e",
		name: 'eu_split',
		component:()=>import("@/views/erp/ship/ship_plan/plan_submit/eu_split")
	},
	{
		path: 'e/s/a',
		name: 'shiptongbu',
		component:()=>import("@/views/erp/ship/shipment_handing/list/components/async.vue"),
	},

	{
		path: "transportation/edit",
		name: 'transportation_edit',
		component:()=>import("@/views/erp/ship/transportation/edit_transportation.vue"),
	},
	{
		path: "transportation/details",
		name: 'transportation_details',
		component:()=>import("@/views/erp/ship/transportation/details_transportation.vue"),
	},
	{
		path: "erp/ship/quota",
		name: 'quota_details',
		component:()=>import("@/views/erp/ship/quota/index.vue"),
	},
	{
		path: 'material/photoupload',
		name: 'photoupload',
		component:()=>import("@/views/erp/baseinfo/material/photoupload/index.vue"),
	},
	{
		path: "localproduct/editinfo",
		name: 'edit',
		meta: {
			keepAlive: true
		},
		component:()=>import("@/views/erp/baseinfo/material/editinfo/index")
	},
	{
		path: "localproduct/addinfo",
		name: 'localproductadd',
		meta: {
			keepAlive: true
		},
		component:()=>import("@/views/erp/baseinfo/material/editinfo/index")
	},
	{
		path: "material/details",
		name: 'details',
		component:()=>import("@/views/erp/baseinfo/material/details/index")
	},
	{
		path: "e/w/o",
		name: 'outbound_add',
		component:()=>import("@/views/erp/warehouse/outbound/components/create")
	},
	{
		path: "e/w/o/d",
		name: 'outbound_add_info',
		component:()=>import("@/views/erp/warehouse/outbound/components/details")
	},
	{
		path: "e/w/i",
		name: 'inbound_add',
		component:()=>import("@/views/erp/warehouse/inbound/components/create")
	},
	{
		path: "e/w/i/d",
		name: 'inbound_add_info',
		component:()=>import("@/views/erp/warehouse/inbound/components/details")
	},
	{
		path: "e/w/s",
		name: 'stocktake_add',
		component:()=>import("@/views/erp/warehouse/stocktake/components/create")
	},
	{
		path: "e/w/s/d",
		name: 'stocktake_details',
		component:()=>import("@/views/erp/warehouse/stocktake/components/details")
	},
	{
		path: "e/p/o",
		name: 'purchase_order_add',
		meta: {
			keepAlive: true
		},
		component:()=>import("@/views/erp/purchase/orders/components/create")
	},
	{
		path: "e/w/os/s",
		name: 'overseas_stock_add',
		component:()=>import("@/views/erp/warehouse/overseas/stock/components/create")
	},
	{
		path: "e/w/os/d",
		name: 'overseas_stock_details',
		component:()=>import("@/views/erp/warehouse/overseas/stock/components/details")
	},
	{
		path: "e/w/t",
		name: 'transfer_order',
		component:()=>import("@/views/erp/warehouse/transfer/components/create")
	},
	{
		path: "e/w/t/d",
		name: 'transfer_order_details',
		component:()=>import("@/views/erp/warehouse/transfer/components/details")
	},
	{
		path: "e/w/e/c",
		name: 'exchange_create',
		component:()=>import("@/views/erp/warehouse/exchange/components/create")
	},
	{
		path: "e/w/e/d",
		name: 'exchange_details',
		component:()=>import("@/views/erp/warehouse/exchange/components/details")
	},
	{
		path: "e/p/p/c",
		name: 'process_create',
		component:()=>import("@/views/erp/purchase/process/components/create")
	},
	{
		path: "e/p/p/d",
		name: 'process_details',
		component:()=>import("@/views/erp/purchase/process/components/details")
	},
	{
		path: "f/p/d",
		name: 'paymentRequest_details',
		component:()=>import("@/views/erp/finance/paymentRequest/components/details")
	},
	{
		path: "e/f/s",
		name: 'alibaba_settlement',
		component:()=>import("@/views/erp/finance/alibabaSettlement/index.vue")
	},
]