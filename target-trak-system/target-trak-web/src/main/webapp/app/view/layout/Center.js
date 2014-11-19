Ext.define('TGT.view.layout.Center', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.layout.center',
    requires: [
         'TGT.view.layout.CenterComponent'
    ],
    region: 'center',
    items: [
        {
           xtype: 'layout.centercomponent'
            
        }
    ]
});