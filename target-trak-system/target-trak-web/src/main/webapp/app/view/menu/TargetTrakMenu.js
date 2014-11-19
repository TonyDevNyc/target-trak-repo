Ext.define('TGT.view.menu.TargetTrakMenu', {
	extend : 'Ext.toolbar.Toolbar',
	alias : 'widget.menu.targettrakmenu',
	plain : true,
	requires : [
	    'Ext.toolbar.Toolbar',
	    'Ext.button.Split',
	    'Ext.button.Button'
	],
	initComponent : function() {
		var me = this;
		Ext.applyIf(me, {
			items : [ 
				{
				    xtype:'button',
				    text: 'Home',
				    menu: [
			           {
			        	   text: 'Homepage'
	        		   },
	        		   {
			        	   text: 'User Profile'
	        		   }
		           ]
				},
				{
				    xtype:'button',
				    text: 'Matter',
				    //iconCls: 'add16',
				    menu: [
			           {
			        	   
			        	   text: 'Search Matter'
	        		   },
	        		   {
			        	   text: 'Create Matter'
	        		   }
		           ]
				},
				{
				    xtype:'button',
				    text: 'Services',
				    //iconCls: 'add16',
				    menu: [
			           {
			        	   text: 'Search Services'
	        		   },
	        		   {
			        	   text: 'Create Service'
	        		   },
	        		   {
			        	   text: 'Generate Affadavit'
	        		   }
		           ]
				},
				{
				    xtype:'button',
				    text: 'Administration',
				    //iconCls: 'add16',
				    menu: [
			           {
			        	   text: 'Reference Data'
	        		   },
	        		   {
			        	   text: 'Courts'
	        		   },
	        		   {
			        	   text: 'Companies'
	        		   },
	        		   {
			        	   text: 'Contacts'
	        		   }
		           ]
				},
				{
				    xtype:'button',
				    text: 'Billing',
				    //iconCls: 'add16',
				    menu: [
			           {
			        	   text: 'View Billing'
	        		   },
	        		   {
			        	   text: 'Generate Billing Reports'
	        		   },
	        		   {
			        	   text: 'Generate Billing Extract'
	        		   }
		           ]
				},
				{
				    xtype:'button',
				    text: 'Security',
				    //iconCls: 'add16',
				    menu: [
			           {
			        	   
			        	   text: 'User Administration'
	        		   },
	        		   {
			        	   text: 'Role Administration'
	        		   },
	        		   {
			        	   text: 'Audit Log'
	        		   },
	        		   {
			        	   text: 'Generate Security Reports'
	        		   }
		           ]
				},
				{
				    xtype:'button',
				    text: 'Logout'
				}
            ]
		});
		me.callParent(arguments);
	}
});