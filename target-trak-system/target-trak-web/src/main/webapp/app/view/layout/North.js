Ext.define('TGT.view.layout.North', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.layout.north',
    requires: [
       'TGT.view.menu.TargetTrakMenu'
    ],
    region: 'north',
    items: [
        {
        	xtype: 'menu.targettrakmenu'
        }
    ]
});