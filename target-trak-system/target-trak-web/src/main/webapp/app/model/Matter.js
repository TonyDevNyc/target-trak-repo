Ext.define('TGT.model.Matter', {
    extend: 'Ext.data.Model',
    fields:[
        {name: 'matterId', type: Ext.data.Types.INT},
        {name: 'matterType', type: 'string'},
        {name: 'primaryContact', type: 'string'},
        {name: 'primaryContactCompany', type: 'string'},
        {name: 'matterStatus', type: 'string'},
        {name: 'createdByUserId', type: 'string'},
        {name: 'createDate', type: 'string'},
        {name: 'completionDate', type: 'string'},
        {name: 'serviceLevelAgreementDate', type: 'string'},
        {name: 'lastUpdatedBy', type: 'string'},
        {name: 'lastUpdatedDate', type: 'string'}
    ]
});