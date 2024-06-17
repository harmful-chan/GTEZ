/** When your routing erp is too long, you can split it into small modules **/
export default [{
	path: "shipmentdetails",
	name: 'shipmentdetails',
	component: () => import("@/views/erp/ship/shipment_add/approve/index")
},
	{
		path: "invoice/addshipment",
		name: 'addshipment',
		meta: {
			keepAlive: true
		},
		component: () => import("@/views/erp/ship/shipment_add/create/index")
	},
	{
		path: "a/p/c",
		name: 'edit_calcuiation_plan',
		component:()=>import("@/views/amazon/profit/config/components/edit_plan")
	},
	{
		path: "amazon/listing/catalog",
		name: 'amz_lst_catalog',
		component:()=>import("@/views/amazon/listing/catalog/index")
	},
	{
		path: "f/c/c",
		name: 'costSharing_create',
		component:()=>import("@/views/amazon/payment/costSharing/components/create")
	},
	{
		path: "f/j/e",
		name: 'jobCosting_edit',
		component:()=>import("@/views/amazon/payment/jobCosting/components/edit")
	},
	{
		path: "a/a/sp",
		name: 'spad_create',
		component:()=>import("@/views/amazon/advertisement/manager/components/sp/create")
	},
	{
		path: "a/a/sd",
		name: 'sdad_create',
		component:()=>import("@/views/amazon/advertisement/manager/components/sd/create")
	},
	{
		path: "a/a/sb",
		name: 'sbad_create',
		component:()=>import("@/views/amazon/advertisement/manager/components/hsa/create")
	},
]