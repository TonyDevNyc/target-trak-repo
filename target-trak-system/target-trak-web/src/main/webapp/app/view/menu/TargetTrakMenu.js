Ext.define('TGT.view.menu.TargetTrakMenu', {
	extend : 'Ext.menu.Menu',
	alias : 'widget.menu.traktrakmeu',
	plain : true,
	requires : [

	],
	initComponent : function() {
		var me = this;
		Ext.applyIf(me, {
			items : [ 
	            {
					text : 'Matter',
					menu : {
						xtype : 'menu',
						items : [ 
				            {
				            	text : 'Next Level'
				            }, 
				            {
				            	text : 'Next Level'
				            }, 
				            {
				            	text : 'Next Level'
				            } 
			            ]
					}
	            } 
            ]
		});
		me.callParent(arguments);
	}
});