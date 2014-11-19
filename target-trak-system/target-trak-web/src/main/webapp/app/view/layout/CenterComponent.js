Ext.define('TGT.view.layout.CenterComponent', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.layout.centercomponent',
    requires: [
       'TGT.view.landing.Homepage'
    ],
    layout: 'card',
    items: [
        {
           xtype: 'landing.homepage',
           activeItem: 0
        }
    ]
});