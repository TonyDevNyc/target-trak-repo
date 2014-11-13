Ext.define('TGT.view.layout.Center', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.layout.center',
    requires: [
        'TGT.view.layout.CenterComponent'
    ],
    region: 'center',
    initComponent: function(){
        var me = this;
        Ext.applyIf(me,{
            items: [
                {
                   xtype: 'layout.centercomponent'
                    
                }
            ]
        });
        me.callParent( arguments );
    } 
});