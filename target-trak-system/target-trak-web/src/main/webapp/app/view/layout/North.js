Ext.define('TGT.view.layout.North', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.layout.north',
    requires: [
       'TGT.view.menu.TargetTrakMenu'
    ],
    region: 'north',
    initComponent: function(){
        var me = this;
        Ext.applyIf(me,{
            items: [
                {
                	xtype: 'menu.targettrakmenu'
                }
            ]
        });
        me.callParent( arguments );
    } 
});