Ext.define('TGT.view.menu.TargetTrakMenu', {
	extend : 'Ext.toolbar.Toolbar',
	alias : 'widget.menu.targettrakmenu',
	plain : true,
	requires : [
	    'Ext.toolbar.Toolbar',
	    'Ext.button.Split'
	],
	initComponent : function() {
		var me = this;
		Ext.applyIf(me, {
			items : [ 
				{
				    xtype:'splitbutton',
				    text: 'Matter',
				    //iconCls: 'add16',
				    menu: [
			           {
			        	   text: 'Search Matter'
	        		   }
		           ]
				},
            ]
		});
		me.callParent(arguments);
	}
});