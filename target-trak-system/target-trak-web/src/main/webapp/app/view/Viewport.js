Ext.define('TGT.view.Viewport', {
    extend : 'Ext.container.Viewport',
    requires : [ 
        'Ext.layout.container.Border',
        'TGT.view.layout.Center',
        'TGT.view.layout.North'
    ],
    layout : {
        type : 'border'
    },
    items : [ 
        { xtype: 'layout.north' },
        { xtype: 'layout.center' }
        
    ]
});