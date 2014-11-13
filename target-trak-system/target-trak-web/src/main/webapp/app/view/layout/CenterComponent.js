Ext.define('TGT.view.layout.CenterComponent', {
    extend: 'Ext.panel.Panel',
    alias: 'widget.layout.centercomponent',
    requires: [
       
    ],
    layout: 'card',
    initComponent: function(){
        var me = this;
        Ext.applyIf(me,{
            items: [
                {
                   html:'<P>Hi its the center</P>'
                    
                }
            ]
        });
        me.callParent( arguments );
    } 
});